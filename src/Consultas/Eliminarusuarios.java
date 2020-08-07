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
import java.util.Stack;
import javax.swing.JLabel;
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
//        eliminarusuario(3, 2);
        Eliminarusuarios elus = new Eliminarusuarios();
        System.out.println(elus.contarusuariosinfantes(11, "Miercoles"));
    }

    //Traer datos de usuarios a eliminar para posteriormente hacerlo
    public static boolean eliminarusuario(int id, int mes) {
        conn = con.conectar();

        try {
            respaldardatoselimiados(id);

            s = conn.prepareStatement("INSERT INTO usuarios_eliminados(nombre,apellidos,"
                    + "edad,localidad,calle,numero_e,numero_i,telefono_1,celular_1,"
                    + "nombre_tutor,foto) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            s.setString(1, registro[0]);
            s.setString(2, registro[1]);
            s.setString(3, registro[2]);
            s.setString(4, registro[3]);
            s.setString(5, registro[4]);
            s.setString(6, registro[5]);
            s.setString(7, registro[6]);
            s.setString(8, registro[7]);
            s.setString(9, registro[8]);
            s.setString(10, registro[9]);
            s.setString(11, registro[10]);

            s.executeUpdate();
            s = conn.prepareStatement("UPDATE usuario SET nombre='',apellidos='',edad=''"
                    + ",localidad='',calle='',numero_e='',numero_i='',telefono_1='',celular_1='',nombre_tutor='',"
                    + "mensualidad_id=null,foto='' WHERE id_usuario=" + id);
            s.executeUpdate();

            sSQL = "delete from mensualidad where id_mensualidad=?";
            PreparedStatement pst = conn.prepareStatement(sSQL);

            pst.setInt(1, mes);

            int n = pst.executeUpdate();

            if (n != 0) {
                JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Se eliminó con éxito</span></html>",
                        "Eliminación", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    //Respaldamos los datos en otra tabla
    public static void respaldardatoselimiados(int id) {
        sSQL = "select * from usuario where id_usuario ='" + id + "'";

        conn = con.conectar();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("nombre");
                registro[1] = rs.getString("apellidos");
                registro[2] = rs.getString("edad");
                registro[3] = rs.getString("localidad");
                registro[4] = rs.getString("calle");
                registro[5] = rs.getString("numero_e");
                registro[6] = rs.getString("numero_i");
                registro[7] = rs.getString("telefono_1");
                registro[8] = rs.getString("celular_1");
                registro[9] = rs.getString("nombre_tutor");
                registro[10] = rs.getString("foto");
            }
//            System.out.println("antes del return");

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);

        }
    }

    public static boolean cambiardatosdetabla(int eliminar) {
        conn = con.conectar();
        try {
            sSQL = "delete from usuarios_eliminados where id_usuario=?";
            PreparedStatement pst = conn.prepareStatement(sSQL);

            pst.setInt(1, eliminar);

            int n = pst.executeUpdate();

            if (n != 0) {
                System.out.println("Se eliminó al usuario");
                return true;
            } else {
                System.out.println("No Se eliminó al usuario");
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

    public JLabel contarusuariosadultos(JLabel label, int hora, String dianombre, int idmaestros) {
        conn = con.conectar();
        sSQL = "select count(*) as dato from usuario join mensualidad on mensualidad.id_mensualidad = usuario.mensualidad_id"
                + " join dias on dias.mensualidad_id = mensualidad.id_mensualidad where edad>9 "
                + "and horario_id='" + hora + "' and dias_nombre='" + dianombre + "' group by nombre";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            Stack pila = new Stack();
            while (rs.next()) {
                pila.push(rs.getString("dato"));
            }
            label.setText(pila.size() + " de 12");
//            System.out.println("antes del return");
            return label;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return label;
        }
    }

    public JLabel contarusuariosinfantes(JLabel label, int hora, String dianombre, int idmaestros) {
        conn = con.conectar();
        sSQL = "select count(*) as dato from usuario join mensualidad on mensualidad.id_mensualidad = usuario.mensualidad_id"
                + " join dias on dias.mensualidad_id = mensualidad.id_mensualidad where edad<=9 "
                + "and horario_id='" + hora + "' and dias_nombre='" + dianombre + "' and maestros_id='"+idmaestros+"' group by nombre";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            Stack pila = new Stack();
            while (rs.next()) {

                pila.push(rs.getString("dato"));

            }
            label.setText(pila.size() + " de 5");
//            System.out.println("antes del return");
            return label;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return label;
        }
    }

    public String contarusuariosinfantes(int hora, String dianombre) {
        conn = con.conectar();
        sSQL = "select count(*) as dato from usuario join mensualidad on mensualidad.id_mensualidad = usuario.mensualidad_id"
                + " join dias on dias.mensualidad_id = mensualidad.id_mensualidad where edad>12 "
                + "and horario_id='" + hora + "' and dias_nombre='" + dianombre + "' group by nombre";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            String h = "";
            int c = 0;
            Stack pila = new Stack();
            while (rs.next()) {

                h += rs.getString("dato") + " de 12";
                c = rs.getInt("dato");
                pila.push(rs.getString("dato") + " de 12");
//                rs.getArray("dato").getArray();

            }

//            System.out.println("antes del return");
            return "" + pila.size() + "\nString: " + h;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return "null";
        }
    }
     public static boolean eliminarmaestro(int id) {
        conn = con.conectar();
        try {
            sSQL = "delete from maestros where id_maestros=?";
            PreparedStatement pst = conn.prepareStatement(sSQL);
            pst.setInt(1, id);
            int n = pst.executeUpdate();

            if (n != 0) {
                JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Se eliminó con éxito</span></html>",
                        "Eliminación", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }

    }

}
