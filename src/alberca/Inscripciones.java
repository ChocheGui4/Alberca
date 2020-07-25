/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author Choche
 */
public class Inscripciones extends javax.swing.JFrame {

    /**
     * Creates new form Inscripciones
     */
    FondoPanel fondo = new FondoPanel();
    int dias = 1;
    int contardos = 0, dos =  0;
    int contartres = 0, tres =  0;
    JCheckBox diasdos[] = new JCheckBox[2];
    JCheckBox diastres[] = new JCheckBox[3];

    public Inscripciones() {
        this.setContentPane(fondo);
        initComponents();
        lbltutor.setVisible(false);
        txtnombretutor.setVisible(false);

        this.setLocationRelativeTo(null);
    }

    public void checkdias(JCheckBox check1, JCheckBox check2, JCheckBox check3, JCheckBox check4, JCheckBox check5,
            JCheckBox checkprincipal) {
        if (dias == 1) {

            check1.setSelected(false);
            check2.setSelected(false);
            check3.setSelected(false);
            check4.setSelected(false);
            check5.setSelected(false);
        } else if (dias == 2) {
            if(checkprincipal.isSelected()==true){
                for (int i = 0; i < 2; i++) {

                    if (diasdos[i] == null) {
                        contardos += 1;
                        diasdos[i] = checkprincipal;
                        break;
                    }else if(contardos==2){
                        if(dos==i & i==0){
                            diasdos[i].setSelected(false);
                            diasdos[i]= checkprincipal;
                            dos=i+1;
                            break;
                        }else if(dos==i & i==1){
                            diasdos[i].setSelected(false);
                            diasdos[i]= checkprincipal;
                            dos=i-1;
                            break;
                        }


                    }
                }
            }else{
                for (int i = 0; i < 2; i++) {
                    if(checkprincipal==diasdos[i]){
                        diasdos[i]=null;
                        contardos -=1;
                        break;
                    }
                }
                
                for (int i = 0; i < 2; i++) {
                    if(diasdos[i]!=null){
                        System.out.println(diasdos[i].getText());    
                    }else{
                        System.out.println(diasdos[i]);
                    }
                    
                }
            }
        }else if(dias==3){
            if(checkprincipal.isSelected()==true){
                for (int i = 0; i < 3; i++) {

                    if (diastres[i] == null) {
                        contartres += 1;
                        diastres[i] = checkprincipal;
                        break;
                    }else if(contartres==3){
                        if(tres==i & i==0){
                            diastres[i].setSelected(false);
                            diastres[i]= checkprincipal;
                            tres=i+1;
                            break;
                        }else if(tres==i & i==1){
                            diastres[i].setSelected(false);
                            diastres[i]= checkprincipal;
                            tres=i+1;
                            break;
                        }else if(tres==i & i==2){
                            diastres[i].setSelected(false);
                            diastres[i]= checkprincipal;
                            tres=i-2;
                            break;
                        }


                    }
                }
                for (int i = 0; i < 3; i++) {
                    if(diastres[i]!=null){
                        System.out.println(diastres[i].getText());
                        diastres[i].setSelected(true);
                    }

                }
            }else{
                for (int i = 0; i < 3; i++) {
                    if(checkprincipal==diastres[i]){
                        diastres[i]=null;
                        contartres -=1;
                        break;
                    }
                }
                
                for (int i = 0; i < 3; i++) {
                    if(diastres[i]!=null){
                        System.out.println(diastres[i].getText());    
                    }else{
                        System.out.println(diastres[i]);
                    }
                    
                }
            }
        }

    }

    public void deshabilitarcheckdias(boolean valor) {
        cklunes.setEnabled(valor);
        ckmartes.setEnabled(valor);
        ckmiercoles.setEnabled(valor);
        ckjueves.setEnabled(valor);
        ckviernes.setEnabled(valor);
        cksabado.setEnabled(valor);
    }
    
    public void deseleccionarckdias(boolean valor) {
        cklunes.setSelected(valor);
        ckmartes.setSelected(valor);
        ckmiercoles.setSelected(valor);
        ckjueves.setSelected(valor);
        ckviernes.setSelected(valor);
        cksabado.setSelected(valor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtlocalidad = new javax.swing.JTextField();
        txtcalle = new javax.swing.JTextField();
        txtnumin = new javax.swing.JTextField();
        txtnumex = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        cktutor = new javax.swing.JCheckBox();
        lbltutor = new javax.swing.JLabel();
        txtnombretutor = new javax.swing.JTextField();
        rSDateChooser1 = new rojerusan.RSDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rSDateChooser2 = new rojerusan.RSDateChooser();
        rSDateChooser3 = new rojerusan.RSDateChooser();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbdias = new javax.swing.JComboBox<>();
        cklunes = new javax.swing.JCheckBox();
        ckmartes = new javax.swing.JCheckBox();
        ckmiercoles = new javax.swing.JCheckBox();
        ckjueves = new javax.swing.JCheckBox();
        ckviernes = new javax.swing.JCheckBox();
        cksabado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1117, 613));
        setUndecorated(true);
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atrás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inscripción");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de inicio:");

        txtnombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtapellidos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Localidad:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Calle:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No. exterior:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No. interior:");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono:");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Celular:");

        txtlocalidad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtcalle.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtnumin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtnumex.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txttelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        txtcelular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        cktutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cktutor.setForeground(new java.awt.Color(255, 255, 255));
        cktutor.setText("Tutor");
        cktutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cktutorActionPerformed(evt);
            }
        });

        lbltutor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbltutor.setForeground(new java.awt.Color(255, 255, 255));
        lbltutor.setText("Nombre del tutor:");

        txtnombretutor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        rSDateChooser1.setBackground(new java.awt.Color(153, 153, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buscar: AYO00");

        txtbuscar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Buscar");

        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Nuevo");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha de nacimiento:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha de termino:");

        rSDateChooser2.setBackground(new java.awt.Color(204, 204, 204));

        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("Cancelar");

        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setText("Editar datos");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sesiones por semana:");

        cbdias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbdias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdiasActionPerformed(evt);
            }
        });

        cklunes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cklunes.setText("Lunes");
        cklunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cklunesActionPerformed(evt);
            }
        });

        ckmartes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ckmartes.setText("Martes");
        ckmartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmartesActionPerformed(evt);
            }
        });

        ckmiercoles.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ckmiercoles.setText("Miércoles");
        ckmiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmiercolesActionPerformed(evt);
            }
        });

        ckjueves.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ckjueves.setText("Jueves");
        ckjueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckjuevesActionPerformed(evt);
            }
        });

        ckviernes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ckviernes.setText("Viernes");
        ckviernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckviernesActionPerformed(evt);
            }
        });

        cksabado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cksabado.setText("Sábado");
        cksabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cksabadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(413, 413, 413)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(4, 4, 4)
                                .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cktutor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbltutor)
                                .addGap(38, 38, 38)
                                .addComponent(txtnombretutor, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtlocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtnumex, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtnumin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(38, 38, 38)
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(cklunes)
                        .addGap(77, 77, 77)
                        .addComponent(ckmartes)
                        .addGap(72, 72, 72)
                        .addComponent(ckmiercoles)
                        .addGap(61, 61, 61)
                        .addComponent(ckjueves)
                        .addGap(69, 69, 69)
                        .addComponent(ckviernes)
                        .addGap(56, 56, 56)
                        .addComponent(cksabado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(rSDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)
                        .addComponent(rSDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cbdias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jButton3)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cktutor))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltutor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtnombretutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtlocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnumex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtnumin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(rSDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cbdias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cklunes)
                    .addComponent(ckmartes)
                    .addComponent(ckmiercoles)
                    .addComponent(ckjueves)
                    .addComponent(ckviernes)
                    .addComponent(cksabado))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cktutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cktutorActionPerformed

    }//GEN-LAST:event_cktutorActionPerformed

    private void cklunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cklunesActionPerformed
        System.out.println(cklunes.getText());
        System.out.println(cklunes.isSelected());
        
            checkdias(ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes);            


    }//GEN-LAST:event_cklunesActionPerformed

    private void ckmartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmartesActionPerformed
            checkdias(cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes);
        
    }//GEN-LAST:event_ckmartesActionPerformed

    private void ckmiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmiercolesActionPerformed
            checkdias(cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles);
        
    }//GEN-LAST:event_ckmiercolesActionPerformed

    private void ckjuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckjuevesActionPerformed
            checkdias(ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves);
        
    }//GEN-LAST:event_ckjuevesActionPerformed

    private void ckviernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckviernesActionPerformed
            checkdias(ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes);
        
    }//GEN-LAST:event_ckviernesActionPerformed

    private void cksabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cksabadoActionPerformed
            checkdias(ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado);
        
    }//GEN-LAST:event_cksabadoActionPerformed

    private void cbdiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdiasActionPerformed

        dias = cbdias.getSelectedIndex() + 1;
        deseleccionarckdias(false);

    }//GEN-LAST:event_cbdiasActionPerformed

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
            java.util.logging.Logger.getLogger(Inscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscripciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inscripciones().setVisible(true);
            }
        });
    }

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbdias;
    private javax.swing.JCheckBox ckjueves;
    private javax.swing.JCheckBox cklunes;
    private javax.swing.JCheckBox ckmartes;
    private javax.swing.JCheckBox ckmiercoles;
    private javax.swing.JCheckBox cksabado;
    private javax.swing.JCheckBox cktutor;
    private javax.swing.JCheckBox ckviernes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbltutor;
    private rojerusan.RSDateChooser rSDateChooser1;
    private rojerusan.RSDateChooser rSDateChooser2;
    private rojerusan.RSDateChooser rSDateChooser3;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtlocalidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombretutor;
    private javax.swing.JTextField txtnumex;
    private javax.swing.JTextField txtnumin;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
