/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;
//

import Consultas.Render;
import Consultas.tabla;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Choche
 */
public class Informacion extends javax.swing.JFrame  {

    /**
     * Creates new form Informacion
     */
    FondoPanel fondo = new FondoPanel();
//    Render re=new Render();

    public Informacion() {
//        this.setContentPane(fondo);

        initComponents();
        this.setLocationRelativeTo(null);
        mostrar("");
//        tdatos.setDefaultRenderer(tdatos.getColumnClass(0), re);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            tabla tab = new tabla();
            modelo = tab.mostrardatoscompletos(buscar);

            tdatos.setModel(modelo);
            ocultar_columnas();
//            lblregistros.setText("Registros: " + Integer.toString(tab.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

    }
    

    void ocultar_columnas() {
        
        tdatos.getColumnModel().getColumn(0).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(0).setMinWidth(0);
        tdatos.getColumnModel().getColumn(0).setPreferredWidth(0);
        tdatos.getColumnModel().getColumn(1).setMaxWidth(80);
        tdatos.getColumnModel().getColumn(1).setMinWidth(80);
        tdatos.getColumnModel().getColumn(1).setPreferredWidth(80);
        
        tdatos.getColumnModel().getColumn(2).setMaxWidth(250);
        tdatos.getColumnModel().getColumn(2).setMinWidth(250);
        tdatos.getColumnModel().getColumn(2).setPreferredWidth(250);
        
        tdatos.getColumnModel().getColumn(3).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(3).setMinWidth(0);
        tdatos.getColumnModel().getColumn(3).setPreferredWidth(0);
        tdatos.getColumnModel().getColumn(4).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(4).setMinWidth(0);
        tdatos.getColumnModel().getColumn(4).setPreferredWidth(0);
        
        tdatos.getColumnModel().getColumn(5).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(5).setMinWidth(0);
        tdatos.getColumnModel().getColumn(5).setPreferredWidth(0);
        
        tdatos.getColumnModel().getColumn(6).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(6).setMinWidth(0);
        tdatos.getColumnModel().getColumn(6).setPreferredWidth(0);
        tdatos.getColumnModel().getColumn(7).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(7).setMinWidth(0);
        tdatos.getColumnModel().getColumn(7).setPreferredWidth(0);
        tdatos.getColumnModel().getColumn(8).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(8).setMinWidth(0);
        tdatos.getColumnModel().getColumn(8).setPreferredWidth(0);
        tdatos.getColumnModel().getColumn(10).setMaxWidth(90);
        tdatos.getColumnModel().getColumn(10).setMinWidth(90);
        tdatos.getColumnModel().getColumn(10).setPreferredWidth(90);
        tdatos.getColumnModel().getColumn(12).setMaxWidth(110);
        tdatos.getColumnModel().getColumn(12).setMinWidth(110);
        tdatos.getColumnModel().getColumn(12).setPreferredWidth(110);
        tdatos.getColumnModel().getColumn(13).setMaxWidth(110);
        tdatos.getColumnModel().getColumn(13).setMinWidth(110);
        tdatos.getColumnModel().getColumn(13).setPreferredWidth(90);
        
        tdatos.getColumnModel().getColumn(14).setMaxWidth(85);
        tdatos.getColumnModel().getColumn(14).setMinWidth(85);
        tdatos.getColumnModel().getColumn(14).setPreferredWidth(85);
        
        tdatos.getColumnModel().getColumn(1).setResizable(false);
        tdatos.getColumnModel().getColumn(2).setResizable(false);
        tdatos.getColumnModel().getColumn(3).setResizable(false);
        tdatos.getColumnModel().getColumn(4).setResizable(false);
        tdatos.getColumnModel().getColumn(5).setResizable(false);
        tdatos.getColumnModel().getColumn(6).setResizable(false);
        tdatos.getColumnModel().getColumn(7).setResizable(false);
        tdatos.getColumnModel().getColumn(8).setResizable(false);
        tdatos.getColumnModel().getColumn(9).setResizable(false);
        tdatos.getColumnModel().getColumn(10).setResizable(false);
        tdatos.getColumnModel().getColumn(11).setResizable(false);
        tdatos.getColumnModel().getColumn(12).setResizable(false);
        tdatos.getColumnModel().getColumn(13).setResizable(false);
        tdatos.getColumnModel().getColumn(14).setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1117, 613));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Información de usuarios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 90, 220, 40);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Buscar: AYO00");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(790, 100, 140, 31);

        tdatos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tdatos.setRowHeight(40);
        tdatos.setSelectionBackground(new java.awt.Color(102, 255, 102));
        tdatos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tdatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 142, 1050, 390);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 0, 819, 50);

        jButton1.setBackground(new java.awt.Color(102, 51, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(22, 12, 122, 34);

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(930, 100, 150, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(990, 0, 100, 100);

        lblimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/azul claro 1.jpg"))); // NOI18N
        getContentPane().add(lblimagen);
        lblimagen.setBounds(0, 0, 1270, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        if (txtbuscar.getText().equals("")) {
            mostrar("AYO00" + txtbuscar.getText());
        } else {
            if (txtbuscar.getText().charAt(0) == '0'
                    | txtbuscar.getText().charAt(0) == '1'
                    | txtbuscar.getText().charAt(0) == '2'
                    | txtbuscar.getText().charAt(0) == '3'
                    | txtbuscar.getText().charAt(0) == '4'
                    | txtbuscar.getText().charAt(0) == '5'
                    | txtbuscar.getText().charAt(0) == '6'
                    | txtbuscar.getText().charAt(0) == '7'
                    | txtbuscar.getText().charAt(0) == '8'
                    | txtbuscar.getText().charAt(0) == '9') {
                mostrar("AYO00" + txtbuscar.getText());
            } else {
                mostrar(txtbuscar.getText());
            }
        }
    }//GEN-LAST:event_txtbuscarKeyReleased

    /**
     * @param args the command line arguments
     */
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imágenes/azul claro 1.jpg/")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);

        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTable tdatos;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}

