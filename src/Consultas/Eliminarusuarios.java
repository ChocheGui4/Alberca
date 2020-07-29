/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Choche
 */
public class Eliminarusuarios {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    private static String sSQL = "";
    public static String[] registro = new String[13];

    public static void main(String[] args) {
        eliminarusuario(3,2);
    }

    public static boolean eliminarusuario(int id, int mes) {
        conn = con.conectar();

        try {
            respaldardatoselimiados(id);

            s = conn.prepareStatement("INSERT INTO usuarios_eliminados(clave,nombre,apellidos,fecha_nacimiento,localidad,calle,"
                    + "numero_e,numero_i,telefono_1,celular_1,nombre_tutor,foto) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            System.out.println("yacasi");
            s.setString(1, registro[1]);
            s.setString(2, registro[2]);
            s.setString(3, registro[3]);
            s.setString(4, registro[4]);
            s.setString(5, registro[5]);
            s.setString(6, registro[6]);
            s.setString(7, registro[7]);
            s.setString(8, registro[8]);
            s.setString(9, registro[9]);
            s.setString(10, registro[10]);
            s.setString(11, registro[11]);
            s.setString(12, registro[12]);
            s.executeUpdate();

            sSQL = "delete from mensualidad where id_mensualidad=?";
            PreparedStatement pst = conn.prepareStatement(sSQL);

            pst.setInt(1, mes);

            int n = pst.executeUpdate();

            if (n != 0) {
                JOptionPane.showMessageDialog(null, "Se eliminó con éxito");
                return true;
            } else {
                return false;
            }

            

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public static void respaldardatoselimiados(int id) {
        sSQL = "select * from usuario where id_usuario ='" + id + "'";

        conn = con.conectar();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_usuario");
                registro[1] = rs.getString("clave");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("apellidos");
                registro[4] = rs.getString("fecha_nacimiento");
                registro[5] = rs.getString("localidad");
                registro[6] = rs.getString("calle");
                registro[7] = rs.getString("numero_e");
                registro[8] = rs.getString("numero_i");
                registro[9] = rs.getString("telefono_1");
                registro[10] = rs.getString("celular_1");
                registro[11] = rs.getString("nombre_tutor");
                registro[12] = rs.getString("foto");
            }
//            System.out.println("antes del return");

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }
    }

}
