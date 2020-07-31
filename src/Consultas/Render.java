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
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, hasFocus, hasFocus, row, row);
        setBackground(Color.red);
//        setForeground(Color.red);

//        int numero = (Integer) table.getValueAt(row, 1);
//
//        if (numero >= 10) {
//            setBackground(Color.GREEN);
//            setForeground(Color.BLACK);
//        } else if (numero >= 5 && numero < 10) {
//            setBackground(Color.YELLOW);
//            setForeground(Color.BLACK);
//        } else {
//            setBackground(Color.RED);
//            setForeground(Color.BLACK);
//        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }

}
