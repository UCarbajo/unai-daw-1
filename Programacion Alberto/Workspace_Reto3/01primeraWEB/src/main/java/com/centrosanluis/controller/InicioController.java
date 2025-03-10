package com.centrosanluis.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Inicio
 */
<<<<<<< HEAD:Programacion Alberto/Workspace_Reto3/01primeraWEB/src/main/java/com/centrosanluis/controller/Inicio.java
@WebServlet("/inicio")
public class Inicio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Inicio() {
=======
@WebServlet(name = "inicio", urlPatterns = { "/inicio" })
public class InicioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InicioController() {
>>>>>>> 00e4e0ae15845b234043eadb7250b96d0bb5c519:Programacion Alberto/Workspace_Reto3/01primeraWEB/src/main/java/com/centrosanluis/controller/InicioController.java
        super();
        // TODO Auto-generated constructor stub
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("Estoy por aqui!!");
	}

<<<<<<< HEAD:Programacion Alberto/Workspace_Reto3/01primeraWEB/src/main/java/com/centrosanluis/controller/Inicio.java

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("private/index.jsp").forward(request, response);
	}


=======
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("private/index.jsp").forward(request, response);
		
	}

>>>>>>> 00e4e0ae15845b234043eadb7250b96d0bb5c519:Programacion Alberto/Workspace_Reto3/01primeraWEB/src/main/java/com/centrosanluis/controller/InicioController.java
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
