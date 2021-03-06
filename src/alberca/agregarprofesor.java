/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.Eliminarusuarios;
import Consultas.maestros;
import Consultas.tabla;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Choche
 */
public class agregarprofesor extends javax.swing.JFrame {

    /**
     * Creates new form agregarprofesor
     */
    tabla tab = new tabla();
    int id = 0;

    public agregarprofesor() {
        initComponents();
        mostrar("");
        btneliminar.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;

            modelo = tab.mostrarmaestros(buscar);

//            tab.mostrarhorarios(cbhoralunes,"Lunes",1);
//            tab.mostrarhorarios(cbhoramartes,"Martes",1);
//            tab.mostrarhorarios(cbhoramiercoles,"Miercoles",1);
//            tab.mostrarhorarios(cbhorajueves,"Jueves",1);
//            tab.mostrarhorarios(cbhoraviernes,"Viernes",1);
//            tab.mostrarhorarios(cbhorasabado,"Sabado",1);
//            tab.mostrarhorarios(cbhoramartes);
//            tab.mostrarhorarios(cbhoramiercoles);
//            tab.mostrarhorarios(cbhorajueves);
//            tab.mostrarhorarios(cbhoraviernes);
//            tab.mostrarhorarios(cbhorasabado);
            tdatos.setModel(modelo);
            ocultar_columnas();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

    }

    void ocultar_columnas() {
        tdatos.getColumnModel().getColumn(0).setMaxWidth(70);
        tdatos.getColumnModel().getColumn(0).setMinWidth(70);
        tdatos.getColumnModel().getColumn(0).setPreferredWidth(70);
        
        tdatos.getColumnModel().getColumn(1).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(1).setMinWidth(0);
        tdatos.getColumnModel().getColumn(1).setPreferredWidth(0);

//        tdatos.getColumnModel().getColumn(1).setMaxWidth(200);
//        tdatos.getColumnModel().getColumn(1).setMinWidth(200);
//        tdatos.getColumnModel().getColumn(1).setPreferredWidth(200);
        tdatos.getColumnModel().getColumn(0).setResizable(false);
        tdatos.getColumnModel().getColumn(1).setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblnombre1 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        txtapellidos = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1073, 430));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        lblnombre1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblnombre1.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre1.setText("Apellidos:");
        getContentPane().add(lblnombre1);
        lblnombre1.setBounds(40, 230, 140, 31);

        btneliminar.setBackground(new java.awt.Color(255, 0, 0));
        btneliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(880, 370, 140, 50);

        txtapellidos.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txtapellidos);
        txtapellidos.setBounds(170, 220, 290, 40);

        lblnombre.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre.setText("Nombre:");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(40, 180, 120, 31);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar profesor");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 50, 220, 50);

        txtnombre.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre);
        txtnombre.setBounds(170, 170, 290, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(980, 0, 90, 130);

        btncancelar.setBackground(new java.awt.Color(255, 0, 0));
        btncancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancelar 1.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar);
        btncancelar.setBounds(310, 320, 150, 50);

        btnguardar.setBackground(new java.awt.Color(51, 255, 0));
        btnguardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Agregar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(100, 320, 150, 50);

        tdatos.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
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
        tdatos.setFocusCycleRoot(true);
        tdatos.setGridColor(new java.awt.Color(204, 255, 255));
        tdatos.setRowHeight(24);
        tdatos.setSelectionBackground(new java.awt.Color(102, 255, 102));
        tdatos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 130, 520, 240);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 10, 730, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/azul claro 1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (txtnombre.getText().equals("") | txtapellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">Ingresa los campos correspondientes</span></html>",
                    "Éxito", JOptionPane.WARNING_MESSAGE);
        } else {
            maestros ma = new maestros();
            ma.insermaestros(txtnombre.getText(), txtapellidos.getText());
            mostrar("");
            txtnombre.setText("");
            txtapellidos.setText("");

        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        if (txtnombre.getText().length() == 34) {
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar())
                & !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                & !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
//      lblErrorLetra.setText("Escribe solo letras");
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        if (txtapellidos.getText().length() == 34) {
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar())
                & !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                & !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
//      lblErrorLetra.setText("Escribe solo letras");
        }
    }//GEN-LAST:event_txtapellidosKeyTyped

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked
        int fila = tdatos.rowAtPoint(evt.getPoint());
        id = Integer.parseInt(tdatos.getValueAt(fila, 1).toString());
        btneliminar.setEnabled(true);
    }//GEN-LAST:event_tdatosMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Eliminarusuarios elus = new Eliminarusuarios();
        int res = elus.consultarmaestro(id);
        if (res == 1) {
            JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">No se puede eliminar al instructor "
                    + "ya que tiene estudiantes inscritos con él (ella)</span></html>",
                    "Cambios realizados",JOptionPane.INFORMATION_MESSAGE);
        } else {
            elus.eliminarmaestro(id);
            mostrar("");
            btneliminar.setEnabled(false);
        }

    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(agregarprofesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarprofesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarprofesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarprofesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarprofesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JTable tdatos;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

}
