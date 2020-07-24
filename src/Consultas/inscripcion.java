/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Choche
 */
public class inscripcion {
    conexion con = new conexion();
    public PreparedStatement s;
    public boolean  insertarDatosInscripcion(String clave,String nombre,String apellidos, String fecha, int domicilio,
            int tel, int tutor, int mensualidad, String fotos) {
        
        
        try {
            System.out.println("Hola entró al metodo");
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");

            s = con.conn.prepareStatement("INSERT INTO usuario(id_usuario,nombre,apellidos,fecha_nacimiento,domicilio_id,telefono_id,"
                    + "tutor_id,mensualidad_id,foto) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)");
            System.out.println("Hola entró a la mitad del metodo");
            s.setString(1, clave);
            s.setString(2, nombre);
            s.setString(3, apellidos);
            s.setString(4, fecha);
            s.setInt(5, domicilio);
            s.setInt(6, tel);
            s.setInt(7, tutor);
            s.setInt(8, mensualidad);
            s.setString(9, fotos);
            s.executeUpdate();
            System.out.println("Hola actualizó datos");

            JOptionPane.showMessageDialog(null, "Datos guardados con éxito.");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }
    
}
