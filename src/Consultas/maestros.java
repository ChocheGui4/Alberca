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
public class maestros {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static String sSQL = "";
    public static Connection conn = null;
    public static int res = 0;

    public static boolean insermaestros(String nombre, String apellidos) {
        try {
            conn = con.conectar();
            s = conn.prepareStatement("INSERT INTO maestros(nombre,apellidos)"
                    + " VALUES (?,?)");
            s.setString(1, nombre);
            s.setString(2, apellidos);
            int n = s.executeUpdate();
            if (n != 0) {
                JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Se agregó con éxito</span></html>",
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                return false;
            }
//            JOptionPane.showMessageDialog(null, "Datos guardados con éxito.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

    public static boolean cambiarCoordinador(String nombre, String apellidos) {
        try {
            conn = con.conectar();
            s = conn.prepareStatement("UPDATE coordinador SET nombre=?,apellidos=? "
                    + "WHERE id_coordinador=" + 1);
            s.setString(1, nombre);
            s.setString(2, apellidos);
            int n = s.executeUpdate();
            if (n != 0) {
                JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Se Modificó el coordinador"
                        + " con éxito</span></html>",
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                return false;
            }
//            JOptionPane.showMessageDialog(null, "Datos guardados con éxito.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

    public static String mostrarcoordinador() {
        conn = con.conectar();
        String coordinador="";
        sSQL = "select * from coordinador";
       
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
//                System.out.println(rs.getString("nombre"));
                coordinador = rs.getString("nombre")+" "+rs.getString("apellidos");

            }
//            System.out.println("antes del return");
//            JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Se agregó con éxito</span></html>",
//                    "Éxito", JOptionPane.INFORMATION_MESSAGE);
            return coordinador;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            System.out.println("error: "+e);
            return "rrr";
        }

    }

}
