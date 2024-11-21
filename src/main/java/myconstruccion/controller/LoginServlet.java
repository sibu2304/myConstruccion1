package myconstruccion.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String contrase�a = request.getParameter("contrase�a");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "sibo2304");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE email = ? AND contrase�a = ?");
            ps.setString(1, email);
            ps.setString(2, contrase�a);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                response.getWriter().println("Bienvenido, " + rs.getString("nombre"));
            } else {
                response.getWriter().println("Credenciales incorrectas.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
