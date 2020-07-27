/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Choche
 */
public class conexion {

    private final static String login = "root";
    private final static String password = "";
    private final static String url = "jdbc:mysql://localhost:3306/alfayomega";
    public static Connection conn = null;
    public static PreparedStatement s;

    public static void main(String[] args) {
        conectar();
        insertardias("Raul", "Lopez", "1997-01-05", "San Vicente Xiloxochitla", "Abasolo", "4", "", "2461973931", "2461414585",
                "");
    }

    public static Connection conectar() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                System.out.println("se conectó");
                conn.createStatement();
                return conn;
            }
        } catch (SQLException e) {
            System.out.println(e);
            return conn = null;
        } catch (ClassNotFoundException e) {
            System.out.println(e);
            return conn = null;
        }
        return conn;

    }

    public static boolean insertardias(String nombre, String apellidos, String fecha_naci, String localidad,
            String calle, String numero_e, String numero_i, String telefono, String celular, String nombre_tutor) {
        try {

            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");
            s = conn.prepareStatement("INSERT INTO usuario(nombre,apellidos,fecha_nacimiento,localidad,calle,"
                    + "numero_e,numero_i,telefono_1,celular_1,nombre_tutor) VALUES (?,?,?,?,?,?,?,?,?,?)");

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
