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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Choche
 */
public class tablausuariosaldia {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    private String sSQL = "";
    public Integer totalregistros;

    //Mostrar los usuarios al día
    public DefaultTableModel usuariosaldia(String mes, String dia, int hora) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"Nombre", "Edad", "Fecha de inicio", "Fecha de termino", "Día", "Horario"};

        String[] registro = new String[6];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;

            }

        };
//        String g = " select * from usuario join mensualidad on usuario.mensualidad_id = mensualidad.id_mensualidad"
//                + " join dias on dias.mensualidad_id = mensualidad.id_mensualidad where mes_num =7 and dias_num=30"
//                + " and horario = \"9:00 - 10:00"+"";
        sSQL = "select * from usuario join mensualidad on usuario.mensualidad_id = mensualidad.id_mensualidad "
                + "join dias on dias.mensualidad_id = mensualidad.id_mensualidad join horario on dias.horario_id = "
                + "horario.id_horario where mes_num= '" + mes + "' and dias_num = '" + dia + "'"
                + " and hora_num>='" + hora + "' order by hora_num";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("nombre") + " ";
                registro[0] += rs.getString("apellidos");
                registro[1] = rs.getString("edad");
                registro[2] = rs.getString("fecha_ini");
                registro[3] = rs.getString("fecha_fin");
                registro[4] = rs.getString("dias_nombre") + " ";
                registro[4] += rs.getString("dias_num");
                registro[5] = rs.getString("horario");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            System.out.println(e);
//            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Mostrar a usuarios por cada maestro
    //Mostrar los usuarios al día
    public DefaultTableModel usuariosporamestroaldia(String mes, String dia, int hora) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"Maestro", "Nombre", "Horario"};

        String[] registro = new String[3];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;

            }

        };
//        String g = " select * from usuario join mensualidad on usuario.mensualidad_id = mensualidad.id_mensualidad"
//                + " join dias on dias.mensualidad_id = mensualidad.id_mensualidad where mes_num =7 and dias_num=30"
//                + " and horario = \"9:00 - 10:00"+"";
        sSQL = "select * from usuario join mensualidad on usuario.mensualidad_id = mensualidad.id_mensualidad "
                + "join dias on dias.mensualidad_id = mensualidad.id_mensualidad join horario on dias.horario_id = "
                + "horario.id_horario join maestros on dias.maestros_id = maestros.id_maestros"
                + " where mes_num= '" + mes + "' and dias_num = '" + dia + "'"
                + " and hora_num>='" + hora + "' order by maestros.nombre, horario";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("maestros.nombre")+" ";
                registro[0] += rs.getString("maestros.apellidos");
                registro[1] = rs.getString("usuario.nombre")+" ";
                registro[1] += rs.getString("usuario.apellidos");
                registro[2] = rs.getString("horario.horario");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            System.out.println(e);
//            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}
