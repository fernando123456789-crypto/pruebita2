/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;
import be.Usuario;
import dao.UsuarioDAO;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
public class RegisterServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Usuario usuario = new Usuario();
        usuario.setNombre(req.getParameter("nombre"));
        usuario.setApellido(req.getParameter("apellido"));
        usuario.setCorreo(req.getParameter("correo"));
        usuario.setPassword(req.getParameter("password"));

        UsuarioDAO dao = new UsuarioDAO();
        if (dao.create(usuario)) {
            res.sendRedirect("login.jsp");
        } else {
            res.sendRedirect("index.html");
        }
    }
}