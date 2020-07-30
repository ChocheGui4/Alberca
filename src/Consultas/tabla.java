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
public class tabla {
    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    private String sSQL = "";
    public Integer totalregistros;
    
    //Método para mostrar usuarios totales del centro acuático
    public DefaultTableModel mostrar(String buscar) {
        conn=con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"ID","Clave", "Nombre", "Apellidos", "Fecha de nacimiento", "localidad", "calle", 
                "no_interno", "no_externo", "telefono", "celular", "nombre del tutor",
                "fecha de inicio", "fecha de termino", "id mes"};

        String[] registro = new String[15];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from usuario join mensualidad on mensualidad.id_mensualidad ="
                + "usuario.mensualidad_id where clave like '%" + buscar + "%' order by id_usuario";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_usuario");
                registro[1] = rs.getString("clave");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("apellidos");
                registro[4] = rs.getString("fecha_nacimiento");
                registro[5] = rs.getString("localidad");
                registro[6] = rs.getString("calle");
                registro[7] = rs.getString("numero_e");
                registro[8] = rs.getString("numero_i");
                registro[9] = rs.getString("telefono_1");
                registro[10] = rs.getString("celular_1");
                registro[11] = rs.getString("nombre_tutor");
                registro[12] = rs.getString("fecha_ini");
                registro[13] = rs.getString("fecha_fin");
                registro[14] = rs.getString("mensualidad_id");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    //Método para mostrar usuarios eliminados del centro acuático
    public DefaultTableModel mostrareliminados(String buscar) {
        conn=con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"ID","Clave", "Nombre","Nombre completo", "Apellidos", "Fecha de nacimiento",
            "localidad","Dirección", "calle", "N. interior", "No. exterior",
            "telefono", "celular", "nombre del tutor"};

        String[] registro = new String[14];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        sSQL = "select * from usuarios_eliminados where nombre like '%" + buscar + "%' order by id_usuario";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_usuario");
                registro[1] = rs.getString("clave");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("nombre");
                registro[3] += rs.getString("apellidos");
                registro[4] = rs.getString("apellidos");
                registro[5] = rs.getString("fecha_nacimiento");
                registro[6] = rs.getString("localidad");
                registro[7] = rs.getString("localidad")+" ";
                registro[7] += rs.getString("calle")+" ";
                registro[7] += rs.getString("numero_e")+" ";
                registro[7] += rs.getString("numero_i");
                registro[8] = rs.getString("calle");
                registro[9] = rs.getString("numero_e");
                registro[10] = rs.getString("numero_i");
                registro[11] = rs.getString("telefono_1");
                registro[12] = rs.getString("celular_1");
                registro[13] = rs.getString("nombre_tutor");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}
