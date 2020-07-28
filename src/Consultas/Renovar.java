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
public class Renovar {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    public static void main(String[] args) {
        insertarmensualidad("2020/05/12","2020/06/12", "8");
    }

    public static boolean insertarmensualidad(String fecha_ini, String fecha_termi, String sesiones) {
        try {
            conn = con.conectar();
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");
            s = conn.prepareStatement("INSERT INTO mensualidad(fecha_ini,fecha_fin,sesiones) VALUES (?,?,?)");

            s.setString(1, fecha_ini);
            s.setString(2, fecha_termi);
            s.setString(3, sesiones);

            s.executeUpdate();

            JOptionPane.showMessageDialog(null, "Datos de fecha guardados con éxito.");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

}
