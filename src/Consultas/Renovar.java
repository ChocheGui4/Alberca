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
    public static int v[] = {2, 23, 12};
    public static int ve[] = {0, 1};

    public static void main(String[] args) {
//        insertarmensualidad("2020/05/12", "2020/06/12", "8");
        insertardiasmes(v, 2, 2);
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

    public static boolean insertardiasmes(int[] dias, int numero, int n) {
        try {
            conn = con.conectar();
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");

            if (numero == 0) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mensualidad_id) VALUES (?,?,?)");
                    s.setString(1, "Lunes");
                    s.setString(2, "" + dias[i]);
                    s.setInt(3, n);
                    s.executeUpdate();
                }

            } else if (numero == 1) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mensualidad_id) VALUES (?,?,?)");
                    s.setString(1, "Martes");
                    s.setString(2, "" + dias[i]);
                    s.setInt(3, n);

                    s.executeUpdate();
                }

            } else if (numero == 2) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mensualidad_id) VALUES (?,?,?)");
                    s.setString(1, "Miercoles");
                    s.setString(2, "" + dias[i]);
                    s.setInt(3, n);

                    s.executeUpdate();
                }

            } else if (numero == 3) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mensualidad_id) VALUES (?,?,?)");
                    s.setString(1, "Jueves");
                    s.setString(2, "" + dias[i]);
                    s.setInt(3, n);

                    s.executeUpdate();
                }

            } else if (numero == 4) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mensualidad_id) VALUES (?,?,?)");
                    s.setString(1, "Viernes");
                    s.setString(2, "" + dias[i]);
                    s.setInt(3, n);

                    s.executeUpdate();
                }

            } else if (numero == 5) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mensualidad_id) VALUES (?,?,?)");
                    s.setString(1, "Sabado");
                    s.setString(2, "" + dias[i]);
                    s.setInt(3, n);

                    s.executeUpdate();
                }

            }

//            s = conn.prepareStatement("INSERT INTO dias(dias_num) VALUES (?)");
//
//            s.setString(1, fecha_ini);
//            s.setString(2, fecha_termi);
//            s.setString(3, sesiones);
//
//            s.executeUpdate();
            JOptionPane.showMessageDialog(null, "Días insertados con exito");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

}
