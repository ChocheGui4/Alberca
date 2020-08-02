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
    
    public void Actualizar(String localidad, String calle, String numero_e, String numero_i,
            String telefono, String celular, int id) {
        try {
            
            conn =con.conectar();
            s = conn.prepareStatement("UPDATE usuario SET localidad=?,calle=?,numero_e=?,"
                    + "numero_i=?,telefono_1=?,celular_1=? WHERE id_usuario=" + id);
            s.setString(1, localidad);
            s.setString(2, calle);
            s.setString(3, numero_e);
            s.setString(4, numero_i);
            s.setString(5, telefono);
            s.setString(6, celular);

            s.executeUpdate();

            JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Datos actualizados</span></html>");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());

        }
    }

}
