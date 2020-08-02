/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.recuperar;
import Consultas.tabla;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSDateChooser;

/**
 *
 * @author Choche
 */
public class recuperardias extends javax.swing.JFrame {

    /**
     * Creates new form recuperardias
     */
    FondoPanel fondo = new FondoPanel();
    recuperar recu = new recuperar();
    int id = 0;
    String fecha = null;

    public recuperardias() {
//        this.setContentPane(fondo);
        initComponents();
        mostrar("");
        btnrecuperar.setEnabled(false);
        this.setLocationRelativeTo(null);
        cbrecuperarid.setVisible(false);

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            tabla tab = new tabla();
            modelo = tab.mostrarusuariosdiaperdido(buscar);

            tdatos.setModel(modelo);
            ocultar_columnas();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

    }

    public void ocultar_columnas() {

        tdatos.getColumnModel().getColumn(0).setMaxWidth(50);
        tdatos.getColumnModel().getColumn(0).setMinWidth(50);
        tdatos.getColumnModel().getColumn(0).setPreferredWidth(50);
        
        tdatos.getColumnModel().getColumn(2).setMaxWidth(150);
        tdatos.getColumnModel().getColumn(2).setMinWidth(150);
        tdatos.getColumnModel().getColumn(2).setPreferredWidth(150);

        tdatos.getColumnModel().getColumn(1).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(1).setMinWidth(0);
        tdatos.getColumnModel().getColumn(1).setPreferredWidth(0);
        tdatos.getColumnModel().getColumn(5).setMaxWidth(80);
        tdatos.getColumnModel().getColumn(5).setMinWidth(80);
        tdatos.getColumnModel().getColumn(5).setPreferredWidth(80);
        
        tdatos.getColumnModel().getColumn(6).setMaxWidth(100);
        tdatos.getColumnModel().getColumn(6).setMinWidth(100);
        tdatos.getColumnModel().getColumn(6).setPreferredWidth(100);
        tdatos.getColumnModel().getColumn(7).setMaxWidth(120);
        tdatos.getColumnModel().getColumn(7).setMinWidth(120);
        tdatos.getColumnModel().getColumn(7).setPreferredWidth(120);
        tdatos.getColumnModel().getColumn(8).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(8).setMinWidth(0);
        tdatos.getColumnModel().getColumn(8).setPreferredWidth(0);
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();
        lblnombre2 = new javax.swing.JLabel();
        lblnombre3 = new javax.swing.JLabel();
        lblnombre4 = new javax.swing.JLabel();
        lblnombreset = new javax.swing.JLabel();
        lblapellidosset = new javax.swing.JLabel();
        lblfechainicioset = new javax.swing.JLabel();
        lblnombre8 = new javax.swing.JLabel();
        txtfechamaxima = new com.toedter.calendar.JDateChooser();
        cbrecuperarnombres = new javax.swing.JComboBox<>();
        cbrecuperarid = new javax.swing.JComboBox<>();
        lblfechaterminoset = new javax.swing.JLabel();
        lblnombre10 = new javax.swing.JLabel();
        cbhorario = new javax.swing.JComboBox<>();
        txtbuscar = new javax.swing.JTextField();
        btnrecuperar = new javax.swing.JButton();
        lblnombre1 = new javax.swing.JLabel();
        cbnombredias = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 613));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        tdatos.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
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
        jScrollPane1.setBounds(60, 300, 1160, 250);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 0, 819, 50);

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(22, 12, 130, 40);

        lblnombre.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre.setText("Buscar: AYO00");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(60, 260, 170, 31);

        lblnombre2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre2.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre2.setText("Apellidos:");
        getContentPane().add(lblnombre2);
        lblnombre2.setBounds(60, 130, 107, 31);

        lblnombre3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre3.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre3.setText("Fecha de inicio:");
        getContentPane().add(lblnombre3);
        lblnombre3.setBounds(60, 170, 160, 31);

        lblnombre4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre4.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre4.setText("Nombre:");
        getContentPane().add(lblnombre4);
        lblnombre4.setBounds(60, 100, 107, 31);

        lblnombreset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblnombreset.setForeground(new java.awt.Color(204, 204, 204));
        lblnombreset.setText("Dato");
        getContentPane().add(lblnombreset);
        lblnombreset.setBounds(240, 100, 240, 31);

        lblapellidosset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblapellidosset.setForeground(new java.awt.Color(204, 204, 204));
        lblapellidosset.setText("Dato");
        getContentPane().add(lblapellidosset);
        lblapellidosset.setBounds(240, 130, 210, 31);

        lblfechainicioset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblfechainicioset.setForeground(new java.awt.Color(204, 204, 204));
        lblfechainicioset.setText("Dato");
        getContentPane().add(lblfechainicioset);
        lblfechainicioset.setBounds(240, 170, 210, 31);

        lblnombre8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre8.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre8.setText("Nueva sesión:");
        getContentPane().add(lblnombre8);
        lblnombre8.setBounds(610, 190, 210, 31);

        txtfechamaxima.setDateFormatString("yyyy/MM/dd");
        txtfechamaxima.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(txtfechamaxima);
        txtfechamaxima.setBounds(830, 190, 180, 30);

        cbrecuperarnombres.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbrecuperarnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrecuperarnombresActionPerformed(evt);
            }
        });
        getContentPane().add(cbrecuperarnombres);
        cbrecuperarnombres.setBounds(840, 120, 350, 30);

        getContentPane().add(cbrecuperarid);
        cbrecuperarid.setBounds(1070, 240, 70, 30);

        lblfechaterminoset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblfechaterminoset.setForeground(new java.awt.Color(204, 204, 204));
        lblfechaterminoset.setText("Dato");
        getContentPane().add(lblfechaterminoset);
        lblfechaterminoset.setBounds(240, 210, 210, 31);

        lblnombre10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre10.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre10.setText("Sesión a recuperar:");
        getContentPane().add(lblnombre10);
        lblnombre10.setBounds(610, 120, 210, 31);

        cbhorario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbhorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhorario);
        cbhorario.setBounds(1040, 190, 150, 30);

        txtbuscar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(210, 260, 160, 30);

        btnrecuperar.setBackground(new java.awt.Color(51, 255, 0));
        btnrecuperar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnrecuperar.setText("Recuperar día");
        btnrecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecuperarActionPerformed(evt);
            }
        });
        getContentPane().add(btnrecuperar);
        btnrecuperar.setBounds(810, 230, 180, 50);

        lblnombre1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre1.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre1.setText("Fecha de termino:");
        getContentPane().add(lblnombre1);
        lblnombre1.setBounds(60, 210, 190, 31);

        cbnombredias.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbnombredias.setForeground(new java.awt.Color(204, 204, 204));
        cbnombredias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(cbnombredias);
        cbnombredias.setBounds(560, 100, 660, 190);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1140, 0, 100, 100);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Recuperar días");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(560, 70, 220, 40);

        lblimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/azul claro 1.jpg"))); // NOI18N
        getContentPane().add(lblimagen);
        lblimagen.setBounds(0, 0, 1270, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked

        //        btneliminar.setEnabled(true);
        //        accion="editar";
        btnrecuperar.setEnabled(true);
        int fila = tdatos.rowAtPoint(evt.getPoint());

        id = Integer.parseInt(tdatos.getValueAt(fila, 0).toString());
        cbrecuperarnombres.removeAllItems();
        cbrecuperarid.removeAllItems();
        recu.traerdiasarecuperar(cbrecuperarnombres, id);
        recu.traerdiasarecuperarid(cbrecuperarid, id);
        fecha = tdatos.getValueAt(fila, 6).toString();
        txtfechamaxima.setDate(StringaDate(fecha));
        //Primera opción
        txtfechamaxima.getJCalendar().setMinSelectableDate(new Date());
        txtfechamaxima.getJCalendar().setMaxSelectableDate(txtfechamaxima.getDate());

        //Segunda opción
//        txtfechamaxima.getJCalendar().setMaxSelectableDate(txtfechamaxima.getDate());
        lblnombreset.setText(tdatos.getValueAt(fila, 2).toString());
        lblapellidosset.setText(tdatos.getValueAt(fila, 3).toString());
        lblfechainicioset.setText(tdatos.getValueAt(fila, 5).toString());
        lblfechaterminoset.setText(tdatos.getValueAt(fila, 6).toString());

    }//GEN-LAST:event_tdatosMouseClicked

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

    private void btnrecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecuperarActionPerformed
        System.out.println("fecha elegida: " + txtfechamaxima.getDate());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(txtfechamaxima.getDate());
        int m = calendar.get(Calendar.MONTH) + 1;
        int dm = calendar.get(Calendar.DAY_OF_MONTH);
        int dw = calendar.get(Calendar.DAY_OF_WEEK) - 2;
        System.out.println("hora: " + cbhorario.getSelectedItem());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("item del dia: " + cbrecuperarnombres.getSelectedIndex());
        System.out.println("id: " + cbrecuperarid.getItemAt(cbrecuperarnombres.getSelectedIndex()));
        System.out.println("mes: " + m + "\ndia el mes: " + dm + "\ndia de la semana: " + dw);
        System.out.println("--------------------------------------------------------------------------\n\n");
        String valor = "";
        String hora = "" + cbhorario.getSelectedItem();
        String cha = "" + hora.charAt(0) + hora.charAt(1);
        if (cha.charAt(0) == '9') {
            valor = "9";
        } else {
            valor = cha;
        }
        int nm = Integer.parseInt(valor);
        recu.recuperardia(dm, m, "" + cbhorario.getSelectedItem(), nm, dw,
                Integer.parseInt(cbrecuperarid.getItemAt(cbrecuperarnombres.getSelectedIndex())));
        cbrecuperarnombres.removeAllItems();
        cbrecuperarid.removeAllItems();
        recu.traerdiasarecuperar(cbrecuperarnombres, id);
        recu.traerdiasarecuperarid(cbrecuperarid, id);
        txtfechamaxima.setDate(StringaDate(fecha));
        cbhorario.setSelectedIndex(0);
    }//GEN-LAST:event_btnrecuperarActionPerformed

    private void cbrecuperarnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbrecuperarnombresActionPerformed
        System.out.println("index: " + cbrecuperarnombres.getSelectedIndex());

    }//GEN-LAST:event_cbrecuperarnombresActionPerformed

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
            java.util.logging.Logger.getLogger(recuperardias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recuperardias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recuperardias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recuperardias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recuperardias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrecuperar;
    private javax.swing.JComboBox<String> cbhorario;
    private javax.swing.JLabel cbnombredias;
    public javax.swing.JComboBox<String> cbrecuperarid;
    public javax.swing.JComboBox<String> cbrecuperarnombres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblapellidosset;
    private javax.swing.JLabel lblfechainicioset;
    private javax.swing.JLabel lblfechaterminoset;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnombre10;
    private javax.swing.JLabel lblnombre2;
    private javax.swing.JLabel lblnombre3;
    private javax.swing.JLabel lblnombre4;
    private javax.swing.JLabel lblnombre8;
    private javax.swing.JLabel lblnombreset;
    private javax.swing.JTable tdatos;
    private javax.swing.JTextField txtbuscar;
    private com.toedter.calendar.JDateChooser txtfechamaxima;
    // End of variables declaration//GEN-END:variables
}
