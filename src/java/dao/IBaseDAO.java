/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.List;
public interface IBaseDAO<T> {
    boolean create(T obj);
    T read(int id);
    List<T> readAll();
    boolean update(T obj);
    boolean delete(int id);
}