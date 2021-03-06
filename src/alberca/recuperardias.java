/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.maestros;
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
    int id = 0,idmen=0;
    String fecha = null;
    maestros ma=new maestros();

    public recuperardias() {
//        this.setContentPane(fondo);
        initComponents();
        lblcoordinador.setText("Coordinador: "+ma.mostrarcoordinador());
        mostrar("");
        btnrecuperar.setEnabled(false);
        this.setLocationRelativeTo(null);
        cbrecuperarid.setVisible(false);
        cbidhorario.setVisible(false);
        btncambiar.setEnabled(false);
        cbidmaestros.setVisible(false);

    }

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;
            tabla tab = new tabla();
            modelo = tab.mostrarusuariosdiaperdido(buscar);
            tab.mostrarmaestros(cbmaestros);
            tab.mostraridmaestros(cbidmaestros);

            tdatos.setModel(modelo);
            ocultar_columnas();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

    }

    public void ocultar_columnas() {

        tdatos.getColumnModel().getColumn(0).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(0).setMinWidth(0);
        tdatos.getColumnModel().getColumn(0).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(2).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(2).setMinWidth(0);
        tdatos.getColumnModel().getColumn(2).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(3).setMaxWidth(170);
        tdatos.getColumnModel().getColumn(3).setMinWidth(170);
        tdatos.getColumnModel().getColumn(3).setPreferredWidth(170);

        tdatos.getColumnModel().getColumn(4).setMaxWidth(300);
        tdatos.getColumnModel().getColumn(4).setMinWidth(300);
        tdatos.getColumnModel().getColumn(4).setPreferredWidth(300);

        tdatos.getColumnModel().getColumn(5).setMaxWidth(300);
        tdatos.getColumnModel().getColumn(5).setMinWidth(300);
        tdatos.getColumnModel().getColumn(5).setPreferredWidth(300);

        tdatos.getColumnModel().getColumn(6).setMaxWidth(80);
        tdatos.getColumnModel().getColumn(6).setMinWidth(80);
        tdatos.getColumnModel().getColumn(6).setPreferredWidth(80);

        tdatos.getColumnModel().getColumn(7).setMaxWidth(130);
        tdatos.getColumnModel().getColumn(7).setMinWidth(130);
        tdatos.getColumnModel().getColumn(7).setPreferredWidth(130);
        tdatos.getColumnModel().getColumn(8).setMaxWidth(130);
        tdatos.getColumnModel().getColumn(8).setMinWidth(130);
        tdatos.getColumnModel().getColumn(8).setPreferredWidth(130);
        tdatos.getColumnModel().getColumn(9).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(9).setMinWidth(0);
        tdatos.getColumnModel().getColumn(9).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(0).setResizable(false);
        tdatos.getColumnModel().getColumn(1).setResizable(false);
        tdatos.getColumnModel().getColumn(2).setResizable(false);
        tdatos.getColumnModel().getColumn(3).setResizable(false);
        tdatos.getColumnModel().getColumn(4).setResizable(false);
        tdatos.getColumnModel().getColumn(5).setResizable(false);
        tdatos.getColumnModel().getColumn(6).setResizable(false);
        tdatos.getColumnModel().getColumn(7).setResizable(false);
        tdatos.getColumnModel().getColumn(8).setResizable(false);
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
        lblnombre = new javax.swing.JLabel();
        lblnombre2 = new javax.swing.JLabel();
        lblnombre3 = new javax.swing.JLabel();
        lblnombre4 = new javax.swing.JLabel();
        cbmaestros = new javax.swing.JComboBox<>();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblcoordinador = new javax.swing.JLabel();
        cbidhorario = new javax.swing.JComboBox<>();
        btncambiar = new javax.swing.JButton();
        lblnombre11 = new javax.swing.JLabel();
        cbidmaestros = new javax.swing.JComboBox<>();
        cbnombredias = new javax.swing.JLabel();
        cbnombredias1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 613));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

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
        jScrollPane1.setBounds(30, 310, 1220, 250);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 0, 819, 50);

        lblnombre.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre.setText("Buscar: ");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(30, 270, 170, 31);

        lblnombre2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre2.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre2.setText("Apellidos:");
        getContentPane().add(lblnombre2);
        lblnombre2.setBounds(30, 130, 107, 31);

        lblnombre3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre3.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre3.setText("Fecha de inicio:");
        getContentPane().add(lblnombre3);
        lblnombre3.setBounds(30, 170, 160, 31);

        lblnombre4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre4.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre4.setText("Nombre:");
        getContentPane().add(lblnombre4);
        lblnombre4.setBounds(30, 90, 107, 31);

        cbmaestros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbmaestros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona instructor" }));
        cbmaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmaestrosActionPerformed(evt);
            }
        });
        getContentPane().add(cbmaestros);
        cbmaestros.setBounds(670, 240, 340, 50);

        lblnombreset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblnombreset.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(lblnombreset);
        lblnombreset.setBounds(210, 90, 210, 31);

        lblapellidosset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblapellidosset.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(lblapellidosset);
        lblapellidosset.setBounds(210, 130, 210, 31);

        lblfechainicioset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblfechainicioset.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(lblfechainicioset);
        lblfechainicioset.setBounds(210, 170, 210, 31);

        lblnombre8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre8.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre8.setText("Nueva sesión:");
        getContentPane().add(lblnombre8);
        lblnombre8.setBounds(470, 180, 210, 31);

        txtfechamaxima.setDateFormatString("yyyy/MM/dd");
        txtfechamaxima.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(txtfechamaxima);
        txtfechamaxima.setBounds(670, 160, 180, 50);

        cbrecuperarnombres.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbrecuperarnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbrecuperarnombresActionPerformed(evt);
            }
        });
        getContentPane().add(cbrecuperarnombres);
        cbrecuperarnombres.setBounds(670, 110, 340, 40);

        getContentPane().add(cbrecuperarid);
        cbrecuperarid.setBounds(1000, 70, 70, 30);

        lblfechaterminoset.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblfechaterminoset.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(lblfechaterminoset);
        lblfechaterminoset.setBounds(210, 210, 210, 31);

        lblnombre10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre10.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblnombre10.setText("Escoger profesor:");
        getContentPane().add(lblnombre10);
        lblnombre10.setBounds(470, 250, 210, 31);

        cbhorario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbhorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 - 7:00", "7:00 - 8:00", "8:00 - 9:00", "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhorario);
        cbhorario.setBounds(860, 160, 150, 50);

        txtbuscar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(120, 260, 220, 40);

        btnrecuperar.setBackground(new java.awt.Color(51, 255, 0));
        btnrecuperar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnrecuperar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Guardar 2.png"))); // NOI18N
        btnrecuperar.setText("Recuperar día");
        btnrecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrecuperarActionPerformed(evt);
            }
        });
        getContentPane().add(btnrecuperar);
        btnrecuperar.setBounds(1040, 160, 190, 50);

        lblnombre1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre1.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre1.setText("Fecha de termino:");
        getContentPane().add(lblnombre1);
        lblnombre1.setBounds(30, 210, 190, 31);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1140, 0, 100, 100);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Recuperar días y cambiar profesor");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 70, 340, 40);

        lblcoordinador.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblcoordinador.setForeground(new java.awt.Color(255, 255, 255));
        lblcoordinador.setText("Coordinador: Alfonso Sánchez Piedras2");
        getContentPane().add(lblcoordinador);
        lblcoordinador.setBounds(30, 550, 650, 60);

        cbidhorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14" }));
        getContentPane().add(cbidhorario);
        cbidhorario.setBounds(920, 70, 70, 30);

        btncambiar.setBackground(new java.awt.Color(51, 255, 0));
        btncambiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btncambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Guardar 2.png"))); // NOI18N
        btncambiar.setText("Cambiar");
        btncambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiarActionPerformed(evt);
            }
        });
        getContentPane().add(btncambiar);
        btncambiar.setBounds(1040, 240, 190, 50);

        lblnombre11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre11.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre11.setText("Sesión a recuperar:");
        getContentPane().add(lblnombre11);
        lblnombre11.setBounds(470, 120, 210, 31);

        getContentPane().add(cbidmaestros);
        cbidmaestros.setBounds(1010, 30, 70, 30);

        cbnombredias.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbnombredias.setForeground(new java.awt.Color(204, 204, 204));
        cbnombredias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(cbnombredias);
        cbnombredias.setBounds(460, 230, 790, 70);

        cbnombredias1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cbnombredias1.setForeground(new java.awt.Color(204, 204, 204));
        cbnombredias1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        getContentPane().add(cbnombredias1);
        cbnombredias1.setBounds(460, 100, 790, 120);

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
        btncambiar.setEnabled(true);
        int fila = tdatos.rowAtPoint(evt.getPoint());

        id = Integer.parseInt(tdatos.getValueAt(fila, 0).toString());
        idmen = Integer.parseInt(tdatos.getValueAt(fila, 9).toString());
        cbrecuperarnombres.removeAllItems();
        cbrecuperarid.removeAllItems();
        recu.traerdiasarecuperar(cbrecuperarnombres, id);
        recu.traerdiasarecuperarid(cbrecuperarid, id);
        fecha = tdatos.getValueAt(fila, 8).toString();
        txtfechamaxima.setDate(StringaDate(fecha));
        //Primera opción
//        txtfechamaxima.getJCalendar().setMinSelectableDate(new Date());
//        txtfechamaxima.getJCalendar().setMaxSelectableDate(txtfechamaxima.getDate());

        //Segunda opción
//        txtfechamaxima.getJCalendar().setMaxSelectableDate(txtfechamaxima.getDate());
        lblnombreset.setText(tdatos.getValueAt(fila, 3).toString());
        lblapellidosset.setText(tdatos.getValueAt(fila, 4).toString());
        lblfechainicioset.setText(tdatos.getValueAt(fila, 7).toString());
        lblfechaterminoset.setText(tdatos.getValueAt(fila, 8).toString());

    }//GEN-LAST:event_tdatosMouseClicked

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        if (txtbuscar.getText().equals("")) {
            mostrar(txtbuscar.getText());
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
                mostrar(txtbuscar.getText());
            } else {
                mostrar(txtbuscar.getText());
            }
        }
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btnrecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrecuperarActionPerformed
//        System.out.println("fecha elegida: " + txtfechamaxima.getDate());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(txtfechamaxima.getDate());
        int m = calendar.get(Calendar.MONTH) + 1;
        int dm = calendar.get(Calendar.DAY_OF_MONTH);
        int dw = calendar.get(Calendar.DAY_OF_WEEK) - 2;
//        System.out.println("hora: " + cbhorario.getSelectedItem());
//        System.out.println("--------------------------------------------------------------------------");
//        System.out.println("item del dia: " + cbrecuperarnombres.getSelectedIndex());
//        System.out.println("id: " + cbrecuperarid.getItemAt(cbrecuperarnombres.getSelectedIndex()));
//        System.out.println("mes: " + m + "\ndia el mes: " + dm + "\ndia de la semana: " + dw);
//        System.out.println("--------------------------------------------------------------------------\n\n");
        recu.recuperardia(dm, m, Integer.parseInt(cbidhorario.getItemAt(cbhorario.getSelectedIndex())), dw,
                Integer.parseInt(cbrecuperarid.getItemAt(cbrecuperarnombres.getSelectedIndex())));
        cbrecuperarnombres.removeAllItems();
        cbrecuperarid.removeAllItems();
        recu.traerdiasarecuperar(cbrecuperarnombres, id);
        recu.traerdiasarecuperarid(cbrecuperarid, id);
        txtfechamaxima.setDate(StringaDate(fecha));
        cbhorario.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnrecuperarActionPerformed

    private void cbrecuperarnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbrecuperarnombresActionPerformed
//        System.out.println("index: " + cbrecuperarnombres.getSelectedIndex());

    }//GEN-LAST:event_cbrecuperarnombresActionPerformed

    private void cbmaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmaestrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmaestrosActionPerformed

    private void btncambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiarActionPerformed
        if (cbmaestros.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Escoge un maestro, por favor"
                    + "</span></html>",
                    "Cambiar maestro", JOptionPane.WARNING_MESSAGE);
        } else {
            recu.cambiarprofe(idmen, Integer.parseInt(cbidmaestros.getItemAt(cbmaestros.getSelectedIndex() - 1)));
//            btncambiar.setEnabled(false);
        }

    }//GEN-LAST:event_btncambiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton btncambiar;
    private javax.swing.JButton btnrecuperar;
    private javax.swing.JComboBox<String> cbhorario;
    private javax.swing.JComboBox<String> cbidhorario;
    private javax.swing.JComboBox<String> cbidmaestros;
    public javax.swing.JComboBox<String> cbmaestros;
    private javax.swing.JLabel cbnombredias;
    private javax.swing.JLabel cbnombredias1;
    public javax.swing.JComboBox<String> cbrecuperarid;
    public javax.swing.JComboBox<String> cbrecuperarnombres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblapellidosset;
    private javax.swing.JLabel lblcoordinador;
    private javax.swing.JLabel lblfechainicioset;
    private javax.swing.JLabel lblfechaterminoset;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblnombre1;
    private javax.swing.JLabel lblnombre10;
    private javax.swing.JLabel lblnombre11;
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
