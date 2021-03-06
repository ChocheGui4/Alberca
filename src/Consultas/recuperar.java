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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Choche
 */
public class recuperar {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    private String sSQL = "";
    public Integer totalregistros;

    //Manda a traer los días y los id's de la persona selccionada
    public JComboBox traerdiasarecuperar(JComboBox combo1, int idusuario) {
        conn = con.conectar();
//        System.out.println("Se metió al método");

        sSQL = "select * from usuario join mensualidad on usuario.mensualidad_id = mensualidad.id_mensualidad "
                + "join dias on dias.mensualidad_id = mensualidad.id_mensualidad where "
                + "id_usuario= '" + idusuario + "'";
//        System.out.println("Después de la consulta");

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            int cont = 0;
            while (rs.next()) {
                cont += 1;
                combo1.addItem(cont + ". " + rs.getString("dias_nombre") + " " + rs.getString("dias_num"));

            }
//            System.out.println("antes del return");
            return combo1;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public JComboBox traerdiasarecuperarid(JComboBox combo1, int idusuario) {
        conn = con.conectar();
//        System.out.println("Se metió al método");

        sSQL = "select * from usuario join mensualidad on usuario.mensualidad_id = mensualidad.id_mensualidad "
                + "join dias on dias.mensualidad_id = mensualidad.id_mensualidad where "
                + "id_usuario= '" + idusuario + "'";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                combo1.addItem(rs.getString("id_dias"));

            }
//            System.out.println("antes del return");
            return combo1;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Inserta el día nuevo que se repondrá y elimina al anterior
    public static boolean recuperardia(int dia, int mes, int horario, int numero, int id) {
        try {
            conn = con.conectar();
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");

            if (numero == 0) {
                s = conn.prepareStatement("UPDATE dias set dias_nombre=?, dias_num=?,mes_num=?,horario_id=? "
                        + "WHERE id_dias='" + id + "'");
                s.setString(1, "Lunes");
                s.setString(2, "" + dia);
                s.setString(3, "" + mes);
                s.setInt(4, horario);
                s.executeUpdate();

            } else if (numero == 1) {
                s = conn.prepareStatement("UPDATE dias set dias_nombre=?, dias_num=?,mes_num=?,horario_id=? "
                        + "WHERE id_dias='" + id + "'");
                s.setString(1, "Martes");
                s.setString(2, "" + dia);
                s.setString(3, "" + mes);
                s.setInt(4, horario);
                s.executeUpdate();

            } else if (numero == 2) {
                s = conn.prepareStatement("UPDATE dias set dias_nombre=?, dias_num=?,mes_num=?,horario_id=? "
                        + "WHERE id_dias='" + id + "'");
                s.setString(1, "Miercoles");
                s.setString(2, "" + dia);
                s.setString(3, "" + mes);
                s.setInt(4, horario);
                s.executeUpdate();

            } else if (numero == 3) {
                s = conn.prepareStatement("UPDATE dias set dias_nombre=?, dias_num=?,mes_num=?,horario_id=? "
                        + "WHERE id_dias='" + id + "'");
                s.setString(1, "Jueves");
                s.setString(2, "" + dia);
                s.setString(3, "" + mes);
                s.setInt(4, horario);
                s.executeUpdate();

            } else if (numero == 4) {
                s = conn.prepareStatement("UPDATE dias set dias_nombre=?, dias_num=?,mes_num=?,horario_id=? "
                        + "WHERE id_dias='" + id + "'");
                s.setString(1, "Viernes");
                s.setString(2, "" + dia);
                s.setString(3, "" + mes);
                s.setInt(4, horario);
                s.executeUpdate();

            } else if (numero == 5) {
                s = conn.prepareStatement("UPDATE dias set dias_nombre=?, dias_num=?,mes_num=?,horario_id=? "
                        + "WHERE id_dias='" + id + "'");
                s.setString(1, "Sabado");
                s.setString(2, "" + dia);
                s.setString(3, "" + mes);
                s.setInt(4, horario);
                s.executeUpdate();

            }
            JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Se actualizó el día <br>"
                    + " correctamente</span></html>",
                    "Día recuperado", JOptionPane.INFORMATION_MESSAGE);
//            s = conn.prepareStatement("INSERT INTO dias(dias_num) VALUES (?)");
//
//            s.setString(1, fecha_ini);
//            s.setString(2, fecha_termi);
//            s.setString(3, sesiones);
//
//            s.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

    //Cambiar profesor
    public static boolean cambiarprofe(int id_dia, int id_maestro) {
        try {
            conn = con.conectar();
            System.out.println("id maestro---> "+id_maestro);
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");

            s = conn.prepareStatement("UPDATE dias set maestros_id=? WHERE mensualidad_id='" + id_dia + "'");
            s.setString(1, "" + id_maestro);
            int n = s.executeUpdate();
            if (n != 0) {
                JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Se actualizó el maestro <br>"
                        + " correctamente</span></html>",
                        "Día recuperado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("No se cambió el profesor");
            }

//            s = conn.prepareStatement("INSERT INTO dias(dias_num) VALUES (?)");
//
//            s.setString(1, fecha_ini);
//            s.setString(2, fecha_termi);
//            s.setString(3, sesiones);
//
//            s.executeUpdate();
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

}
