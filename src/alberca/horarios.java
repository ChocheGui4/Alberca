/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.Eliminarusuarios;
import Consultas.tabla;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Choche
 */
public class horarios extends javax.swing.JFrame {

    /**
     * Creates new form horarios
     */
    tabla tab = new tabla();

    public horarios() {
        initComponents();
        //Maestros
//        tab.mostrarmaestros(cbmaestros);
//        tab.mostraridmaestros(cbidmaestros);
        mostrar("Lunes");

        //Adultos
        this.setLocationRelativeTo(null);

    }

    void mostrar(String dia) {
        try {
            DefaultTableModel modelo;

            modelo = tab.mostraralumnos(dia);

            tdatos.setModel(modelo);
            ocultar_columnas();
//            lblregistros.setText("Registros: " + Integer.toString(tab.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

    }

    public void ocultar_columnas() {
        tdatos.getColumnModel().getColumn(0).setMaxWidth(200);
        tdatos.getColumnModel().getColumn(0).setMinWidth(200);
        tdatos.getColumnModel().getColumn(0).setPreferredWidth(200);

        tdatos.getColumnModel().getColumn(2).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(2).setMinWidth(0);
        tdatos.getColumnModel().getColumn(2).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(3).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(3).setMinWidth(0);
        tdatos.getColumnModel().getColumn(3).setPreferredWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btninscripicion = new javax.swing.JButton();
        cbseleccionar = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(928, 595));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(119, 0, 660, 50);

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel43);
        jLabel43.setBounds(780, 0, 100, 100);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Horarios disponibles");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(60, 520, 310, 30);

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Atrás azul.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(22, 12, 50, 40);

        btninscripicion.setBackground(new java.awt.Color(0, 153, 204));
        btninscripicion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btninscripicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Agregar.png"))); // NOI18N
        btninscripicion.setText("Ir a inscripción");
        btninscripicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscripicionActionPerformed(evt);
            }
        });
        getContentPane().add(btninscripicion);
        btninscripicion.setBounds(650, 520, 210, 50);

        cbseleccionar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cbseleccionar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar día", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" }));
        cbseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbseleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(cbseleccionar);
        cbseleccionar.setBounds(620, 110, 230, 40);

        tdatos.setBackground(new java.awt.Color(0, 255, 153));
        tdatos.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
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
        jScrollPane1.setBounds(50, 162, 810, 340);

        lblimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/azul claro 1.jpg"))); // NOI18N
        getContentPane().add(lblimagen);
        lblimagen.setBounds(0, 0, 1280, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninscripicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscripicionActionPerformed
        Inscripciones ins = new Inscripciones();
        ins.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btninscripicionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbseleccionarActionPerformed

        if (cbseleccionar.getSelectedIndex() != 0) {
            mostrar(cbseleccionar.getSelectedItem().toString());
        }

    }//GEN-LAST:event_cbseleccionarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new horarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninscripicion;
    private javax.swing.JComboBox<String> cbseleccionar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTable tdatos;
    // End of variables declaration//GEN-END:variables
}
