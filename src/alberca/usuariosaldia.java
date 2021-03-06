/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.Render;
import Consultas.Render2;
import Consultas.maestros;
import Consultas.tablausuariosaldia;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public class usuariosaldia extends javax.swing.JFrame {

    /**
     * Creates new form usariosaldia
     */
    FondoPanel fondo = new FondoPanel();
    maestros ma = new maestros();

    public usuariosaldia() {
//        this.setContentPane(fondo);
        initComponents();
        lblcoordinador.setText("Coordinador: " + ma.mostrarcoordinador());
        mostrar();
        tdatos.setDefaultRenderer(Object.class, new Render2());

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                // Esto se ejecuta en segundo plano una única vez
                while (true) {
                    // Pero usamos un truco y hacemos un ciclo infinito
                    try {
                        // En él, hacemos que el hilo duerma
                        Thread.sleep(60000);
                        // Y después realizamos las operaciones
                        mostrar();

//                        System.out.println("Me imprimo cada segundo");
                        // Así, se da la impresión de que se ejecuta cada cierto tiempo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread hilo = new Thread(runnable);
        hilo.start();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss"); // El formato es HH:mm:ss
//        String horaActual = formateador.format(LocalDateTime.now());
//        lblreloj.setText(horaActual);
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                // Esto se ejecuta en segundo plano una única vez
                while (true) {
                    // Pero usamos un truco y hacemos un ciclo infinito
                    try {
                        // En él, hacemos que el hilo duerma
                        Thread.sleep(500);
                        lblreloj.setText(formateador.format(LocalDateTime.now()));

//                        System.out.println("Me imprimo cada segundo");
                        // Así, se da la impresión de que se ejecuta cada cierto tiempo
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread hilo2 = new Thread(runnable2);
        hilo2.start();
        this.setLocationRelativeTo(null);
    }

    public static void mostrar() {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            int m = calendar.get(Calendar.MONTH) + 1;
            System.out.println("mes: " + m);
            //------------------- AQUI se cambió--------------
//            int d = calendar.get(Calendar.DAY_OF_MONTH);
//            int dianombre= calendar.get(Calendar.DAY_OF_MONTH);
            int d= calendar.get(Calendar.DAY_OF_WEEK);
            //--------------AQUI------------------------------------
            System.out.println("dia: " + d);
            int h = calendar.get(Calendar.HOUR_OF_DAY);
            System.out.println("hora: " + h);
            DefaultTableModel modelo;
            tablausuariosaldia tab = new tablausuariosaldia();
            modelo = tab.usuariosaldia("" + m, d, h);
//            ocultar_columnas();
            tdatos.setModel(modelo);
            ocultar_columnas();
//            lblregistros.setText("Registros: " + Integer.toString(tab.totalregistros));

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }

    }

    static void ocultar_columnas() {
        tdatos.getColumnModel().getColumn(0).setMaxWidth(400);
        tdatos.getColumnModel().getColumn(0).setMinWidth(400);
        tdatos.getColumnModel().getColumn(0).setPreferredWidth(400);

        tdatos.getColumnModel().getColumn(1).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(1).setMinWidth(0);
        tdatos.getColumnModel().getColumn(1).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(4).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(4).setMinWidth(0);
        tdatos.getColumnModel().getColumn(4).setPreferredWidth(0);

//        tdatos.getColumnModel().getColumn(5).setMaxWidth(0);
//        tdatos.getColumnModel().getColumn(5).setMinWidth(0);
//        tdatos.getColumnModel().getColumn(5).setPreferredWidth(0);
//        
        tdatos.getColumnModel().getColumn(0).setResizable(false);
        tdatos.getColumnModel().getColumn(1).setResizable(false);
        tdatos.getColumnModel().getColumn(2).setResizable(false);
        tdatos.getColumnModel().getColumn(3).setResizable(false);
        tdatos.getColumnModel().getColumn(4).setResizable(false);
        tdatos.getColumnModel().getColumn(5).setResizable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lblcoordinador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblreloj = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 613));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 10, 819, 50);

        tdatos.setBackground(new java.awt.Color(0, 255, 153));
        tdatos.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        tdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha de inicio", "Fecha de termino", "Día", "Horario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tdatos.setColumnSelectionAllowed(true);
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
        if (tdatos.getColumnModel().getColumnCount() > 0) {
            tdatos.getColumnModel().getColumn(0).setPreferredWidth(200);
            tdatos.getColumnModel().getColumn(2).setResizable(false);
            tdatos.getColumnModel().getColumn(3).setResizable(false);
            tdatos.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 140, 1180, 430);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuarios al día");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 260, 40);

        lblcoordinador.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblcoordinador.setForeground(new java.awt.Color(255, 255, 255));
        lblcoordinador.setText("Coordinador: Alfonso Sánchez Piedras2");
        getContentPane().add(lblcoordinador);
        lblcoordinador.setBounds(40, 560, 670, 50);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1140, 0, 100, 100);

        lblreloj.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblreloj.setForeground(new java.awt.Color(255, 255, 255));
        lblreloj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblreloj.setText("Hora");
        getContentPane().add(lblreloj);
        lblreloj.setBounds(430, 70, 390, 60);

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
            java.util.logging.Logger.getLogger(usuariosaldia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuariosaldia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuariosaldia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuariosaldia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usuariosaldia().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblcoordinador;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblreloj;
    private static javax.swing.JTable tdatos;
    // End of variables declaration//GEN-END:variables
}
