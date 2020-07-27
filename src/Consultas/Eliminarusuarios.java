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
        respaldardatoselimiados(2);
    }
    public static boolean eliminarusuario(int id) {
        conn = con.conectar();
        sSQL = "delete from usuario where id_usuario=?";
        try {
            respaldardatoselimiados(id);
            
            PreparedStatement pst = conn.prepareStatement(sSQL);

            pst.setInt(1, id);

            int n = pst.executeUpdate();

            if (n != 0) {
                System.out.println("se eliminó");
                return true;
            } else {
                System.out.println("No se pudo eliminar");
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }

    }
    public static String [] respaldardatoselimiados(int id){
        sSQL = "select * from usuario where id_usuario ='" + id + "'";
        
        conn = con.conectar();
        System.out.println("se consultó el que se va a eliminar");
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
            System.out.println("se consultó el que se va a eliminar");
//            System.out.println("antes del return");
            return registro;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
}
