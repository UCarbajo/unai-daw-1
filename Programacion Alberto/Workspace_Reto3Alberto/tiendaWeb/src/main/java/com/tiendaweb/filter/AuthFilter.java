package com.tiendaweb.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiendaweb.model.Usuario;
import com.tiendaweb.service.UsuarioService;


@WebFilter(urlPatterns = {"/private/*"}, dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD})

public class AuthFilter implements Filter {
	UsuarioService usuarioService;
	
    public AuthFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		usuarioService = new UsuarioService();
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
		Cookie[] cookies = req.getCookies();
		Usuario u = null;
		
		if(cookies != null) {
			for(Cookie c:cookies) {
				if("usuario".equals(c.getName())) {
					int id = Integer.parseInt(c.getValue());
					u = new Usuario();
					u = usuarioService.getUsuarioById(id);
				}
			}
		}
		if(u != null && u.getRol().getId() == 1) {
			System.out.println("he pasado por el filtro");
			chain.doFilter(request, response);
		}else {
			resp.sendRedirect("inicio");
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
