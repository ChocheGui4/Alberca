/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Choche
 */
public class Guardarmodificaciones {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    
    public void Actualizar(String nombre, String apellidos, String edad, String nombretutor,
            String localidad, String calle, String numero_e, String numero_i,
            String telefono, String celular, int id) {
        try {
            
            conn =con.conectar();
            s = conn.prepareStatement("UPDATE usuario SET nombre=?, apellidos=?, edad=?, localidad=?,calle=?,numero_e=?,"
                    + "numero_i=?,telefono_1=?,celular_1=?, nombre_tutor=? WHERE id_usuario=" + id);
            s.setString(1, nombre);
            s.setString(2, apellidos);
            s.setString(3, edad);
            s.setString(4, localidad);
            s.setString(5, calle);
            s.setString(6, numero_e);
            s.setString(7, numero_i);
            s.setString(8, telefono);
            s.setString(9, celular);
            s.setString(10, nombretutor);

            s.executeUpdate();

            JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Datos actualizados</span></html>",
                    "Cambios realizados",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }

}
