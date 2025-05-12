/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    private static final String URL = "jdbc:mysql://turntable.proxy.rlwy.net:27444/railway";
    private static final String USER = "root";
    private static final String PASSWORD = "fe8dJpHXtqNCDwAzLmlyuFXNDLrNWRE";

    public static Connection getConnection() {
        try {
            // Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ Driver JDBC cargado correctamente.");

            // Intentar conectarse a la base de datos
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión exitosa a la base de datos.");
            return conn;

        } catch (ClassNotFoundException e) {
            System.out.println("❌ ERROR: No se encontró el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ ERROR: Falló la conexión con la base de datos.");
            System.out.println("Mensaje: " + e.getMessage());
            e.printStackTrace();
        }

        // Si hubo algún error, retornamos null
        return null;
    }
}