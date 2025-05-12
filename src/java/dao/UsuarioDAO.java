/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import be.Usuario;
import model.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class UsuarioDAO implements IBaseDAO<Usuario>{

    @Override
    public boolean create(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, apellido, correo, password) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getCorreo());
            ps.setString(4, usuario.getPassword());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método de login corregido
    public boolean login(String correo, String password) {
        String sql = "SELECT * FROM usuarios WHERE correo = ? AND password = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, correo);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Usuario read(int id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<Usuario> readAll() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean update(Usuario usuario) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}