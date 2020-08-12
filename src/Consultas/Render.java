/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

/**
 *
 * @author Choche
 */
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer {

    public static void main(String[] args) {
        Render rn = new Render();
        Date f = rn.StringaDate("2020-08-17");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(f);
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        Calendar calendarhoy = Calendar.getInstance();
        calendarhoy.setTime(new Date());
        int aniohoy = calendarhoy.get(Calendar.YEAR);
        int meshoy = calendarhoy.get(Calendar.MONTH);
        int diahoy = calendarhoy.get(Calendar.DAY_OF_MONTH);

        if (anio == aniohoy & mes == meshoy & dia == diahoy) {
            System.out.println("Es la misma fecha");
        } else {
            System.out.println("No es la misma fecha");
            System.out.println(new Date());
        }
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, hasFocus, hasFocus, row, row);
        setBackground(Color.red);
//        setForeground(Color.red);
//        System.out.println("Fecha fin: "+table.getValueAt(row, 13).toString());
        Date f = StringaDate(table.getValueAt(row, 13).toString());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(f);
        int anio = calendar.get(Calendar.YEAR);
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.add(Calendar.DAY_OF_MONTH, -7);
        int diamenos7 = calendar.get(Calendar.DAY_OF_MONTH);

        Calendar calendarhoy = Calendar.getInstance();
        calendarhoy.setTime(new Date());
        int aniohoy = calendarhoy.get(Calendar.YEAR);
        int meshoy = calendarhoy.get(Calendar.MONTH);
        int diahoy = calendarhoy.get(Calendar.DAY_OF_MONTH);
//        calendarhoy.add(Calendar.DAY_OF_MONTH, -7);
//        int diahoymenos7 = calendarhoy.get(Calendar.DAY_OF_MONTH);

        if (anio == aniohoy & mes == meshoy & (diahoy >= diamenos7 & diahoy <= dia)) {
//        if (anio == aniohoy & mes == meshoy & dia == diahoy) {

            setBackground(Color.RED);
            setForeground(Color.BLACK);
//            System.out.println("Misma fecha");
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
//            System.out.println("Fecha diferente");
        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }

    public java.util.Date StringaDate(String fecha) {
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaE = null;
        try {
            fechaE = formatotexto.parse(fecha);
            return fechaE;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

}
