package com.tiendaweb.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.tiendaweb.model.Categoria;
import com.tiendaweb.model.Producto;
import com.tiendaweb.service.CategoriaService;
import com.tiendaweb.service.ProductoService;


@WebServlet("/anadirProducto")
@MultipartConfig
public class AnadirProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DIR_IMGAGENES = "webapp/imagenes";
    CategoriaService categoriaService;
    ProductoService productoService;
    
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		categoriaService = new CategoriaService();
		productoService = new ProductoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//TODO enviar categoria
		ArrayList<Categoria> listaCategoria = categoriaService.getCategoria();
		request.setAttribute("listaCategoria", listaCategoria);
		request.getRequestDispatcher("private/AnadirProducto.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // TODO EL GUARDADO DE LA IMAGEN SE ALMACENA EN
		// .METADATA Y SE BORRARA AL REDESPLEGAR LA APP
		
		// 1. Recuperar parámetros del formulario
	    String nombre = request.getParameter("nombre");
	    String precio = request.getParameter("precio");
	    String descripcionCorta = request.getParameter("descripcionCorta");
	    String descripcionLarga = request.getParameter("descripcionLarga");
	    String stock = request.getParameter("stock");
	    String categoria = request.getParameter("categoria");

	    // 2. Definir la ruta dinámica donde se guardarán las imágenes:
	    // getRealPath("/") obtiene la ruta física del directorio raíz del despliegue
	    // y se concatena con "imagenes", que es el nombre de la carpeta donde se almacenarán los archivos.
	    String rutaCarpetaDestino = getServletContext().getRealPath("/") + "imagenes";
	    File carpetaDestino = new File(rutaCarpetaDestino);
	    if (!carpetaDestino.exists()) {
	        carpetaDestino.mkdirs();
	    }

	    // 3. Procesar el archivo subido
	    Part archivoImagen = request.getPart("rutaImagen"); // "rutaImagen" es el nombre del input del formulario
	    String nombreImagen = archivoImagen.getSubmittedFileName();

	    // 4. Validar que se haya recibido un archivo válido
	    if (nombreImagen == null || nombreImagen.isEmpty()) {
	        response.sendRedirect("error.jsp?msg=Archivo no válido");
	        return;
	    }

	    // 5. Validar que el archivo sea de tipo imagen
	    String contentType = archivoImagen.getContentType();
	    if (!contentType.startsWith("image/")) {
	        response.sendRedirect("error.jsp?msg=Formato de imagen no válido");
	        return;
	    }

	    // 6. Construir la ruta completa para guardar la imagen
	    Path rutaImagen = Paths.get(rutaCarpetaDestino, nombreImagen);

	    // 7. Guardar el archivo en la carpeta destino
	    try (InputStream input = archivoImagen.getInputStream()) {
	        Files.copy(input, rutaImagen, StandardCopyOption.REPLACE_EXISTING);
	    } catch (IOException e) {
	        e.printStackTrace();
	        response.sendRedirect("error.jsp?msg=Error al guardar la imagen");
	        return;
	    }

	    // 8. Construir la URL accesible desde el navegador
	    // Se utiliza el contexto de la aplicación y se concatena la carpeta y el nombre de la imagen
	    String rutaWeb = request.getContextPath() + "/imagenes/" + nombreImagen;

	    // 9. Crear y configurar el objeto Producto
	    Producto p = new Producto();
	    p.setNombre(nombre);
	    // Reemplaza la coma por el punto para asegurar el formato correcto del double
	    p.setPrecio(Double.parseDouble(precio.replace(",", ".")));
	    p.setStock(Integer.parseInt(stock));
	    p.setDescripcionLarga(descripcionLarga);
	    p.setDescripcionCorta(descripcionCorta);
	    p.setRutaImagen(rutaWeb);

	    // 10. Crear y asociar la categoría al producto
	    Categoria c = new Categoria();
	    c.setId(Integer.parseInt(categoria));
	    p.setCategoria(c);

	    // 11. Guardar el producto en la base de datos
	    if (productoService.addOrUpdateProducto(p)) {
	        response.sendRedirect("anadirProducto");
	    } else {
	        response.sendRedirect("error.jsp?msg=Error al guardar el producto");
	    }
	}


}
