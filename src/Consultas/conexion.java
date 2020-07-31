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
        
    }

    public static Connection conectar() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                conn.createStatement();
                return conn;
            }
        } catch (SQLException e) {
            return conn = null;
        } catch (ClassNotFoundException e) {
            return conn = null;
        }
        return conn;

    }


}
