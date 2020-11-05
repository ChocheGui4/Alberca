/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Choche
 */
public class inscripcion {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static String sSQL = "";
    public static Connection conn = null;
    public static int res = 0;

    public static void main(String[] args) {
//        insertardias("Raul", "Lopez", "1997-01-05", "San Vicente Xiloxochitla", "Abasolo", "4", "", "2461973931", "2461414585",
//                "", 1);
    }

    public static boolean insertardias(String id, String clave, String nombre, String apellidos, String edad, String localidad,
            String celular, String nombre_tutor, int mensualidad, String foto) {
        try {
            conn = con.conectar();
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");
            if (clave == null) {
//                System.out.println("miraaaaaaa id anterior vacio");
                s = conn.prepareStatement("INSERT INTO usuario(nombre,apellidos,edad,localidad,"
                        + "celular_1,nombre_tutor,mensualidad_id,foto)"
                        + " VALUES (?,?,?,?,?,?,?,?)");
                s.setString(1, nombre);
                s.setString(2, apellidos);
                s.setString(3, edad);
                s.setString(4, localidad);
                s.setString(5, celular);
                s.setString(6, nombre_tutor);
                s.setInt(7, mensualidad);
                s.setString(8, foto);
                s.executeUpdate();
                sSQL = "select * from usuario order by id_usuario desc limit 1";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                while (rs.next()) {
                    res = rs.getInt("id_usuario");
                }
                s = conn.prepareStatement("UPDATE usuario SET clave=? WHERE id_usuario=" + res);
                s.setString(1, "AYO00" + res);

                s.executeUpdate();
            } else {
                
//                System.out.println("No miraaaaaaa id anterior No vacio");
//                System.out.println("Claveeeeee: "+clave);
                s = conn.prepareStatement("UPDATE usuario SET nombre=?,apellidos=?,edad=?"
                        + ",localidad=?,celular_1=?,nombre_tutor=?,"
                        + "mensualidad_id=? WHERE id_usuario=" + id);
                s.setString(1, nombre);
                s.setString(2, apellidos);
                s.setString(3, edad);
                s.setString(4, localidad);
                s.setString(5, celular);
                s.setString(6, nombre_tutor);
                s.setInt(7, mensualidad);
                s.executeUpdate();
            }
            
            

//            JOptionPane.showMessageDialog(null, "Datos guardados con éxito.");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

}
