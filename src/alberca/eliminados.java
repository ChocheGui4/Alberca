/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.tabla;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Choche
 */
public class eliminados extends javax.swing.JFrame {

    /**
     * Creates new form eliminados
     */
    FondoPanel fondo = new FondoPanel();

    public eliminados() {
//        this.setContentPane(fondo);

        initComponents();
        this.setLocationRelativeTo(null);
        btnreinscribir.setEnabled(false);
        mostrar("");
    }
    String id="";
    String idanterior="";
    String nombre = "";
    String apellidos = "";
    String fecha_nacimiento = "";
    String nombre_tutor = "";

    String localidad = "";
    String calle = "";
    String numero_e = "";
    String numero_i = "";
    String telefono = "";
    String celular = "";

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            tabla tab = new tabla();
            modelo = tab.mostrareliminados(buscar);
//            ocultar_columnas();
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

        tdatos.getColumnModel().getColumn(1).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(1).setMinWidth(0);
        tdatos.getColumnModel().getColumn(1).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(2).setMaxWidth(230);
        tdatos.getColumnModel().getColumn(2).setMinWidth(230);
        tdatos.getColumnModel().getColumn(2).setPreferredWidth(230);

        tdatos.getColumnModel().getColumn(3).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(3).setMinWidth(0);
        tdatos.getColumnModel().getColumn(3).setPreferredWidth(0);
        
        tdatos.getColumnModel().getColumn(4).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(4).setMinWidth(0);
        tdatos.getColumnModel().getColumn(4).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(5).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(5).setMinWidth(0);
        tdatos.getColumnModel().getColumn(5).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(6).setMaxWidth(300);
        tdatos.getColumnModel().getColumn(6).setMinWidth(300);
        tdatos.getColumnModel().getColumn(6).setPreferredWidth(300);

        tdatos.getColumnModel().getColumn(7).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(7).setMinWidth(0);
        tdatos.getColumnModel().getColumn(7).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(8).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(8).setMinWidth(0);
        tdatos.getColumnModel().getColumn(8).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(9).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(9).setMinWidth(0);
        tdatos.getColumnModel().getColumn(9).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(10).setMaxWidth(100);
        tdatos.getColumnModel().getColumn(10).setMinWidth(100);
        tdatos.getColumnModel().getColumn(10).setPreferredWidth(100);

        tdatos.getColumnModel().getColumn(11).setMaxWidth(100);
        tdatos.getColumnModel().getColumn(11).setMinWidth(100);
        tdatos.getColumnModel().getColumn(11).setPreferredWidth(100);
        
        tdatos.getColumnModel().getColumn(0).setResizable(false);
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

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnreinscribir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1117, 613));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

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
        tdatos.setFocusCycleRoot(true);
        tdatos.setGridColor(new java.awt.Color(204, 255, 255));
        tdatos.setRowHeight(30);
        tdatos.setSelectionBackground(new java.awt.Color(102, 255, 102));
        tdatos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 160, 1010, 340);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuarios eliminados");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 120, 220, 40);

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

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 0, 819, 50);

        btnreinscribir.setBackground(new java.awt.Color(51, 255, 0));
        btnreinscribir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnreinscribir.setText("Reinscribir");
        btnreinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreinscribirActionPerformed(evt);
            }
        });
        getContentPane().add(btnreinscribir);
        btnreinscribir.setBounds(60, 520, 120, 40);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(990, 0, 100, 100);

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(920, 120, 150, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Buscar: AYO00");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(780, 120, 140, 31);

        lblimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/azul claro 1.jpg"))); // NOI18N
        getContentPane().add(lblimagen);
        lblimagen.setBounds(0, 0, 1270, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked
        btnreinscribir.setEnabled(true);
        int fila = tdatos.rowAtPoint(evt.getPoint());
        id = tdatos.getValueAt(fila, 0).toString();
        
        nombre = tdatos.getValueAt(fila, 1).toString();
        apellidos = tdatos.getValueAt(fila, 3).toString();
        fecha_nacimiento = tdatos.getValueAt(fila, 4).toString();
        nombre_tutor = tdatos.getValueAt(fila, 12).toString();

        localidad = tdatos.getValueAt(fila, 5).toString();
        calle = tdatos.getValueAt(fila, 7).toString();
        numero_e = tdatos.getValueAt(fila, 8).toString();
        numero_i = tdatos.getValueAt(fila, 9).toString();
        telefono = tdatos.getValueAt(fila, 10).toString();
        celular = tdatos.getValueAt(fila, 11).toString();

//        habilitarcamposdatopersonal(false);
//        habilitarcamposdatosdireccion(false);
//        habilitarcamposmensualidad(false);
//        deseleccionarckdias(false);
//        habilitarhoras(false);
//        //        btneliminar.setEnabled(true);
//        //        accion="editar";
//
//        int fila = tdatos.rowAtPoint(evt.getPoint());
//        txtidusuario.setText(tdatos.getValueAt(fila, 0).toString());
//        txtnombre.setText(tdatos.getValueAt(fila, 2).toString());
//        txtapellidos.setText(tdatos.getValueAt(fila, 3).toString());
//        //        txtfechatermino.setDate(StringaDate("2018/02/12"));
//        txtfechanacimiento.setDate(StringaDate(tdatos.getValueAt(fila, 4).toString()));
//        if (tdatos.getValueAt(fila, 11).toString().equals("")) {
//            cktutor.setEnabled(false);
//            cktutor.setSelected(false);
//            txtnombretutor.setVisible(false);
//            txtnombretutor.setEnabled(false);
//        } else {
//            txtnombretutor.setText(tdatos.getValueAt(fila, 11).toString());
//            txtnombretutor.setVisible(true);
//            txtnombretutor.setEnabled(false);
//            cktutor.setSelected(true);
//            cktutor.setEnabled(false);
//        }
//
//        txtlocalidad.setText(tdatos.getValueAt(fila, 5).toString());
//        txtcalle.setText(tdatos.getValueAt(fila, 6).toString());
//        txtnumex.setText(tdatos.getValueAt(fila, 7).toString());
//        txtnumin.setText(tdatos.getValueAt(fila, 8).toString());
//        txttelefono.setText(tdatos.getValueAt(fila, 9).toString());
//        txtcelular.setText(tdatos.getValueAt(fila, 10).toString());
//        txtfechainicio.setDate(StringaDate(tdatos.getValueAt(fila, 12).toString()));
//        //        txtfechatermino.setDate(StringaDate(tdatos.getValueAt(fila, 13).toString()));
//        txtmensualidad.setText(tdatos.getValueAt(fila, 14).toString());
//        btneditardatos.setEnabled(true);
//        btnrenovar.setEnabled(true);
//        btnguardar.setEnabled(false);
//        btnguardarmodificaciones.setEnabled(false);
//        btnguardarrenovacion.setEnabled(false);
    }//GEN-LAST:event_tdatosMouseClicked
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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnreinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreinscribirActionPerformed
        Inscripciones ins = new Inscripciones();
        ins.txteliminar.setText(id);
        
        ins.txtnombre.setText(nombre);
        ins.txtapellidos.setText(apellidos);
        ins.txtfechanacimiento.setDate(StringaDate(fecha_nacimiento));
        ins.txtnombretutor.setText(nombre_tutor);
        ins.txtlocalidad.setText(localidad);
        ins.txtcalle.setText(calle);
        ins.txtnumex.setText(numero_e);
        ins.txtnumin.setText(numero_i);
        ins.txttelefono.setText(telefono);
        ins.txtcelular.setText(celular);
        ins.setVisible(true);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnreinscribirActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        mostrar(txtbuscar.getText());
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
            java.util.logging.Logger.getLogger(eliminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnreinscribir;
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
