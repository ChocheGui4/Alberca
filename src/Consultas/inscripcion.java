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

public class inscripcion {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    public static void main(String[] args) {
        insertardias("Raul", "Lopez", "1997-01-05", "San Vicente Xiloxochitla", "Abasolo", "4", "", "2461973931", "2461414585",
                "",1);
    }
    public static boolean insertardias(String nombre, String apellidos, String fecha_naci, String localidad,
            String calle, String numero_e, String numero_i, 
            String telefono, String celular, String nombre_tutor, int mensualidad) {
        try {
            conn=con.conectar();
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");
            s = conn.prepareStatement("INSERT INTO usuario(nombre,apellidos,fecha_nacimiento,localidad,calle,"
                    + "numero_e,numero_i,telefono_1,celular_1,nombre_tutor,mensualidad_id) VALUES (?,?,?,?,?,?,?,?,?,?,?)");

            s.setString(1, nombre);
            s.setString(2, apellidos);
            s.setString(3, fecha_naci);
            s.setString(4, localidad);
            s.setString(5, calle);
            s.setString(6, numero_e);
            s.setString(7, numero_i);
            s.setString(8, telefono);
            s.setString(9, celular);
            s.setString(10, nombre_tutor);
            s.setInt(11, mensualidad);

            s.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos guardados con éxito.");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

}
