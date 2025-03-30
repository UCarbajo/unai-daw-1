package com.testweb.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.testweb.model.Categoria;
import com.testweb.model.Libro;
import com.testweb.service.CategoriaService;
import com.testweb.service.LibroService;

@WebServlet("/anadirlibro")
@MultipartConfig
public class AnadirLibroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String RUTA_SUBIDA = "webapp/imagenes";
	LibroService libroService;
	CategoriaService categoriaService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		libroService = new LibroService();
		categoriaService = new CategoriaService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Categoria> listaCategoria = categoriaService.getCategoria();
		request.setAttribute("listaCategoria", listaCategoria);
		request.getRequestDispatcher("anadirLibro.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String autor = request.getParameter("autor");
		String fecha = request.getParameter("fecha");
		String categoria = request.getParameter("categoria");

		
		Part filePart = request.getPart("portada");
		
		if (filePart != null && filePart.getSize() > 0) {
			// Obtener el nombre original del archivo
			String nombreArchivo = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
			// Ruta donde se guardará
			String uploadPath = getServletContext().getRealPath("/") + "imagenes";

			// Crear la carpeta si no existe
			File uploadDir = new File(uploadPath);
			if (!uploadDir.exists()) {
				uploadDir.mkdir();
			}
			
			// Guardar el archivo en el servidor
			String filePath = uploadPath + File.separator + nombreArchivo;
            filePart.write(filePath);
            
            // Ruta relativa de la imagen
            String rutaImagen = request.getContextPath() + "/imagenes/" + nombreArchivo;
            
            if(anadirLibro(autor, titulo, fecha, categoria, rutaImagen)) {
            	response.sendRedirect("anadirlibro");
            }else {
            	response.sendRedirect("anadirlibro?error=1");
            }
		} else {
			response.sendRedirect("anadirlibro?error=1");
		}

	}

	private boolean anadirLibro(String autor, String titulo, String fecha, String categoria, String rutaImagen) {
		Libro libro = new Libro();
		
		libro.setAutor(autor);
		libro.setTitulo(titulo);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate anioPublicacion = LocalDate.parse(fecha, formatter);
		libro.setAnioPublicacion(anioPublicacion);
		
		Categoria c = new Categoria();
		c.setId(Integer.parseInt(categoria));
		libro.setCategoria(c);
		libro.setRutaImg(rutaImagen);
		
		return libroService.addOrUpdateLibro(libro);
	}

}
