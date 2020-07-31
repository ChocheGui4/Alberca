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
public class Renovar {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    public static int v[] = {2, 23, 12};
    public static int ve[] = {0, 1};
    private static String sSQL = "";
    public static int res = 0;

    public static void main(String[] args) {
//        insertarmensualidad("2020/05/12", "2020/06/12", "8");
//        insertardiasmes(v, 2, 2);
        idmensualidad();
    }

    //Métodos para insertar mensualidad
    public static boolean insertarmensualidad(String fecha_ini, String fecha_termi, String sesiones) {
        try {
            conn = con.conectar();
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");
            s = conn.prepareStatement("INSERT INTO mensualidad(fecha_ini,fecha_fin,sesiones) VALUES (?,?,?)");

            s.setString(1, fecha_ini);
            s.setString(2, fecha_termi);
            s.setString(3, sesiones);

            s.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

    public static int idmensualidad() {
        conn = con.conectar();

//        System.out.println("Se metió al método");
        sSQL = "select * from mensualidad order by id_mensualidad desc limit 1";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                res = rs.getInt("id_mensualidad");
            }
//            System.out.println("antes del return");
//            System.out.println("retorna: " + res);
            return res;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return 0;
        }
    }

    public static boolean insertardiasmes(int[] dias, int[] mes, int numero, int n, String horario, int hora) {
        try {
            conn = con.conectar();
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");

            if (numero == 0) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mes_num,horario,hora_num,mensualidad_id)"
                            + " VALUES (?,?,?,?,?,?)");
                    s.setString(1, "Lunes");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, "" + mes[i]);
                    s.setString(4, horario);
                    s.setInt(5, hora);
                    s.setInt(6, n);
                    s.executeUpdate();
                }

            } else if (numero == 1) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mes_num,horario,hora_num,mensualidad_id)"
                            + " VALUES (?,?,?,?,?,?)");
                    s.setString(1, "Martes");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, "" + mes[i]);
                    s.setString(4, horario);
                    s.setInt(5, hora);
                    s.setInt(6, n);

                    s.executeUpdate();
                }

            } else if (numero == 2) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mes_num,horario,hora_num,mensualidad_id)"
                            + " VALUES (?,?,?,?,?,?)");
                    s.setString(1, "Miercoles");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, "" + mes[i]);
                    s.setString(4, horario);
                    s.setInt(5, hora);
                    s.setInt(6, n);
                    s.executeUpdate();
                }

            } else if (numero == 3) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mes_num,horario,hora_num,mensualidad_id)"
                            + " VALUES (?,?,?,?,?,?)");
                    s.setString(1, "Jueves");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, "" + mes[i]);
                    s.setString(4, horario);
                    s.setInt(5, hora);
                    s.setInt(6, n);
                    s.executeUpdate();
                }

            } else if (numero == 4) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mes_num,horario,hora_num,mensualidad_id)"
                            + " VALUES (?,?,?,?,?,?)");
                    s.setString(1, "Viernes");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, "" + mes[i]);
                    s.setString(4, horario);
                    s.setInt(5, hora);
                    s.setInt(6, n);
                    s.executeUpdate();
                }

            } else if (numero == 5) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,mes_num,horario,hora_num,mensualidad_id)"
                            + " VALUES (?,?,?,?,?,?)");
                    s.setString(1, "Sabado");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, "" + mes[i]);
                    s.setString(4, horario);
                    s.setInt(5, hora);
                    s.setInt(6, n);
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
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

    //Métodos para renovar mensualidad
    public static boolean renovarrmensualidad(int mensualidad, String fecha_ini,
            String fecha_termi, String sesiones) {
        try {
            conn = con.conectar();
            //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");
            s = conn.prepareStatement("UPDATE mensualidad SET fecha_ini=?,fecha_fin=?,sesiones=?,"
                    + "renovar=? WHERE id_mensualidad=" + mensualidad);

            s.setString(1, fecha_ini);
            s.setString(2, fecha_termi);
            s.setString(3, sesiones);
            s.setString(4, "si");

            s.executeUpdate();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            return false;

        }

    }

    public static boolean eliminardiasmes(int mensualidad) {
        conn = con.conectar();
        try {
            sSQL = "delete from dias where mensualidad_id=?";
            PreparedStatement pst = conn.prepareStatement(sSQL);

            pst.setInt(1, mensualidad);

            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        //s = conn.prepareStatement("insert into Registrar_Usuario values (?,?,?,?,?)");

    }

    public static boolean renovardiasmes(int mensualidad, int[] dias, int numero, String horario) {
        try {
            conn = con.conectar();

            if (numero == 0) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,horario,mensualidad_id) VALUES (?,?,?,?)");
                    s.setString(1, "Lunes");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, horario);
                    s.setInt(4, mensualidad);
                    s.executeUpdate();
                }

            } else if (numero == 1) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,horario,mensualidad_id) VALUES (?,?,?,?)");
                    s.setString(1, "Martes");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, horario);
                    s.setInt(4, mensualidad);
                    s.executeUpdate();
                }

            } else if (numero == 2) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,horario,mensualidad_id) VALUES (?,?,?,?)");
                    s.setString(1, "Miercoles");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, horario);
                    s.setInt(4, mensualidad);
                    s.executeUpdate();
                }

            } else if (numero == 3) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,horario,mensualidad_id) VALUES (?,?,?,?)");
                    s.setString(1, "Jueves");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, horario);
                    s.setInt(4, mensualidad);
                    s.executeUpdate();
                }

            } else if (numero == 4) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,horario,mensualidad_id) VALUES (?,?,?,?)");
                    s.setString(1, "Viernes");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, horario);
                    s.setInt(4, mensualidad);
                    s.executeUpdate();
                }

            } else if (numero == 5) {
                for (int i = 0; i < dias.length; i++) {
                    s = conn.prepareStatement("INSERT INTO dias(dias_nombre,dias_num,horario,mensualidad_id) VALUES (?,?,?,?)");
                    s.setString(1, "Sabado");
                    s.setString(2, "" + dias[i]);
                    s.setString(3, horario);
                    s.setInt(4, mensualidad);
                    s.executeUpdate();
                }

            }
            JOptionPane.showMessageDialog(null, "Se renovó la mensualidad");

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
