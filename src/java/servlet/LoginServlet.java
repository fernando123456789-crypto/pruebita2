/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlet;
import dao.UsuarioDAO;
import be.Usuario;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
public class LoginServlet extends HttpServlet{
   protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String correo = req.getParameter("correo");
        String password = req.getParameter("password");

        UsuarioDAO dao = new UsuarioDAO();
        if (dao.login(correo, password)) {
            res.sendRedirect("admin.jsp");
        } else {
            res.sendRedirect("login.jsp");
        }
    }
}
