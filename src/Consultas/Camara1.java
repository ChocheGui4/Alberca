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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Choche
 */
public class Camara1 {
    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    private String sSQL = "";
    public Integer totalregistros;

    public int ultimoregistro() {
        conn = con.conectar();
        

        sSQL = "select id_usuario from usuario where nombre!='' order by id_usuario desc limit 1";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            int id=0;
            while (rs.next()) {
                
                id = rs.getInt("id_usuario");

            }
//            System.out.println("antes del return");
            return id;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return 0;
        }
    }
    
    //Capturar foto de usuario
    public static boolean ponerfoto(int idusuario, String foto) {
        try {
            conn = con.conectar();
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");
            s = conn.prepareStatement("UPDATE usuario SET foto=? WHERE id_usuario=" + idusuario);

            s.setString(1, foto);
            s.executeUpdate();
            JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Se guardó la foto exitosamente"
                        + "</span></html>",
                        "Foto guardada", JOptionPane.WARNING_MESSAGE);
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }
    
}
