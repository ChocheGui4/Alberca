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
public class insertardias {
    conexion con = new conexion();
    public PreparedStatement s;
    public boolean  insertarDias(int numerodias,int horarioini, int horariofin) {
        
        
        try {
            System.out.println("Hola entró al metodo día");
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");
            System.out.println(numerodias+" "+horarioini+" "+horariofin+" ");
            s = con.conn.prepareStatement("INSERT INTO dias(dias_num,horario_inicio,horario_fin) VALUES (?,?,?)");
            System.out.println("Hola entró a la mitad del metodo");
            
            s.setInt(2, numerodias);
            s.setInt(3, horarioini);
            s.setInt(4, horariofin);
            
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
