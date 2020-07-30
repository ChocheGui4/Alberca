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

    public DefaultTableModel usuariosaldia(String mes, String dia, String hora) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"Nombre", "Fecha de inicio", "Fecha de termino", "Día", "Horario"};

        String[] registro = new String[5];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
//        String g = " select * from usuario join mensualidad on usuario.mensualidad_id = mensualidad.id_mensualidad"
//                + " join dias on dias.mensualidad_id = mensualidad.id_mensualidad where mes_num =7 and dias_num=30"
//                + " and horario = \"9:00 - 10:00"+"";
        sSQL = "select * from usuario join mensualidad on usuario.mensualidad_id = mensualidad.id_mensualidad "
                + "join dias on dias.mensualidad_id = mensualidad.id_mensualidad where "
                + "mes_num= '"+mes+"' and dias_num = '"+dia+"' and horario='"+hora+"'order by id_usuario";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("nombre")+" ";
                registro[0] += rs.getString("apellidos");
                registro[1] = rs.getString("fecha_ini");
                registro[2] = rs.getString("fecha_fin");
                registro[3] = rs.getString("dias_nombre")+" ";
                registro[3] += rs.getString("dias_num");
                registro[4] = rs.getString("horario");
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
