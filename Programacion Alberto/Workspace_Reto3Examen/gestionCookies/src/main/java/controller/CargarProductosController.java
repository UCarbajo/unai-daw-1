package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Producto;
import service.ProductoService;

@WebServlet("/cargarProductos")
public class CargarProductosController extends HttpServlet {

    @Override
    public void init() throws ServletException {
    	
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Producto> productos = ProductoService.productos;

        request.setAttribute("productos", productos);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
