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
    private final static String url = "jdbc:mysql://localhost:3306/alberca";
    public static Connection conn = null;
    public PreparedStatement s;
    
    
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
     public boolean  insertarDias(int numerodias,int horarioini, int horariofin) {
        
        
        try {
            conectar();
            System.out.println("Hola entró al metodo día");
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");
            System.out.println(numerodias+" "+horarioini+" "+horariofin+" "+conn);
            s = conn.prepareStatement("INSERT INTO dias(dias_num,horario_inicio,horario_fin) VALUES (?,?,?)");
            System.out.println("Hola entró a la mitad del metodo");
            
            s.setInt(1, numerodias);
            s.setInt(2, horarioini);
            s.setInt(3, horariofin);
            
            s.executeUpdate();
            System.out.println("Hola inserto datos");

            JOptionPane.showMessageDialog(null, "Datos guardados con éxito.");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }
    
    
}
