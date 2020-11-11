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
    
    public void Actualizar(String clave, String nombre, String apellidos, String edad, String nombretutor,
            String localidad, String celular, int id) {
        try {
            
            conn =con.conectar();
            s = conn.prepareStatement("UPDATE usuario SET clave=?, nombre=?, apellidos=?, edad=?, localidad=?, "
                    + "celular_1=?, nombre_tutor=? WHERE id_usuario=" + id);
            s.setString(1, clave);
            s.setString(2, nombre);
            s.setString(3, apellidos);
            s.setString(4, edad);
            s.setString(5, localidad);
            s.setString(6, celular);
            s.setString(7, nombretutor);

            s.executeUpdate();

            JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Datos y mensualidad actualizados</span></html>",
                    "Cambios realizados",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }

}
