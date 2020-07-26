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
import javax.swing.JComboBox;
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
    int contardos = 0, dos = 0;
    int contartres = 0, tres = 0;
    int contarcuatro = 0, cuatro = 0;
    int contarcinco = 0, cinco = 0;
    JCheckBox diasdos[] = new JCheckBox[2];
    JComboBox combodos[] = new JComboBox[2];
    JCheckBox diastres[] = new JCheckBox[3];
    JComboBox combotres[] = new JComboBox[3];
    JCheckBox diascuatro[] = new JCheckBox[4];
    JComboBox combocuatro[] = new JComboBox[4];
    JCheckBox diascinco[] = new JCheckBox[5];
    JComboBox combocinco[] = new JComboBox[5];

    public Inscripciones() {
        this.setContentPane(fondo);
        initComponents();
        lbltutor.setVisible(false);
        txtnombretutor.setVisible(false);
        habilitarhoras(false);

        this.setLocationRelativeTo(null);
    }

    public void checkdias(JCheckBox check1, JCheckBox check2, JCheckBox check3, JCheckBox check4, JCheckBox check5,
            JCheckBox checkprincipal, JComboBox cb1, JComboBox cb2, JComboBox cb3, JComboBox cb4, JComboBox cb5, JComboBox cbprincipal) {
        if (dias == 1) {
            if (checkprincipal.isSelected() == true) {
                check1.setSelected(false);
                check2.setSelected(false);
                check3.setSelected(false);
                check4.setSelected(false);
                check5.setSelected(false);
                cb1.setEnabled(false);
                cb2.setEnabled(false);
                cb3.setEnabled(false);
                cb4.setEnabled(false);
                cb5.setEnabled(false);
                cbprincipal.setEnabled(true);
            }else{
                cbprincipal.setEnabled(false);
            }

        } else if (dias == 2) {
            if (checkprincipal.isSelected() == true) {
                for (int i = 0; i < 2; i++) {

                    if (diasdos[i] == null) {
                        contardos += 1;
                        diasdos[i] = checkprincipal;
                        combodos[i] = cbprincipal;
                        combodos[i].setEnabled(true);
                        break;
                    } else if (contardos == 2) {
                        if (dos == i & i == 0) {
                            diasdos[i].setSelected(false);
                            diasdos[i] = checkprincipal;
                            combodos[i].setEnabled(false);
                            combodos[i] = cbprincipal;
                            combodos[i].setEnabled(true);
                            dos = i + 1;
                            break;
                        } else if (dos == i & i == 1) {
                            diasdos[i].setSelected(false);
                            diasdos[i] = checkprincipal;
                            combodos[i].setEnabled(false);
                            combodos[i] = cbprincipal;
                            combodos[i].setEnabled(true);
                            dos = i - 1;
                            break;
                        }

                    }
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    if (checkprincipal == diasdos[i]) {
                        diasdos[i] = null;
                        combodos[i].setEnabled(false);
                        combodos[i] = null;
                        contardos -= 1;
                        break;
                    }
                }

                for (int i = 0; i < 2; i++) {
                    if (diasdos[i] != null) {
                        System.out.println(diasdos[i].getText());
                    } else {
                        System.out.println(diasdos[i]);
                    }

                }
            }
        } else if (dias == 3) {
            if (checkprincipal.isSelected() == true) {
                for (int i = 0; i < 3; i++) {

                    if (diastres[i] == null) {
                        contartres += 1;
                        diastres[i] = checkprincipal;
                        combotres[i] = cbprincipal;
                        combotres[i].setEnabled(true);
                        break;
                    } else if (contartres == 3) {
                        if (tres == i & i == 0) {
                            diastres[i].setSelected(false);
                            diastres[i] = checkprincipal;
                            combotres[i].setEnabled(false);
                            combotres[i] = cbprincipal;
                            combotres[i].setEnabled(true);
                            tres = i + 1;
                            break;
                        } else if (tres == i & i == 1) {
                            diastres[i].setSelected(false);
                            diastres[i] = checkprincipal;
                            combotres[i].setEnabled(false);
                            combotres[i] = cbprincipal;
                            combotres[i].setEnabled(true);
                            tres = i + 1;
                            break;
                        } else if (tres == i & i == 2) {
                            diastres[i].setSelected(false);
                            diastres[i] = checkprincipal;
                            combotres[i].setEnabled(false);
                            combotres[i] = cbprincipal;
                            combotres[i].setEnabled(true);
                            tres = i - 2;
                            break;
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    if (diastres[i] != null) {
                        System.out.println(diastres[i].getText());
                        diastres[i].setSelected(true);
                    }

                }
            } else {
                for (int i = 0; i < 3; i++) {
                    if (checkprincipal == diastres[i]) {
                        diastres[i] = null;
                        combotres[i].setEnabled(false);
                        combotres[i] = null;
                        contartres -= 1;
                        break;
                    }
                }

                for (int i = 0; i < 3; i++) {
                    if (diastres[i] != null) {
                        System.out.println(diastres[i].getText());
                    } else {
                        System.out.println(diastres[i]);
                    }

                }
            }
        } else if (dias == 4) {
            if (checkprincipal.isSelected() == true) {
                for (int i = 0; i < 4; i++) {

                    if (diascuatro[i] == null) {
                        contarcuatro += 1;
                        diascuatro[i] = checkprincipal;
                        combocuatro[i] = cbprincipal;
                        combocuatro[i].setEnabled(true);
                        break;
                    } else if (contarcuatro == 4) {
                        if (cuatro == i & i == 0) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            cuatro = i + 1;
                            break;
                        } else if (cuatro == i & i == 1) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            cuatro = i + 1;
                            break;
                        } else if (cuatro == i & i == 2) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            cuatro = i + 1;
                            break;
                        } else if (cuatro == i & i == 3) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            cuatro = i - 3;
                            break;
                        }

                    }
                }
                for (int i = 0; i < 4; i++) {
                    if (diascuatro[i] != null) {
                        System.out.println(diascuatro[i].getText());
                        diascuatro[i].setSelected(true);
                    }

                }
            } else {
                for (int i = 0; i < 4; i++) {
                    if (checkprincipal == diascuatro[i]) {
                        diascuatro[i] = null;
                        combocuatro[i].setEnabled(false);
                        combocuatro[i] = null;
                        contarcuatro -= 1;
                        break;
                    }
                }

                for (int i = 0; i < 4; i++) {
                    if (diascuatro[i] != null) {
                        System.out.println(diascuatro[i].getText());
                    } else {
                        System.out.println(diascuatro[i]);
                    }

                }
            }
        } else if (dias == 5) {
            if (checkprincipal.isSelected() == true) {
                for (int i = 0; i < 5; i++) {

                    if (diascinco[i] == null) {
                        contarcinco += 1;
                        diascinco[i] = checkprincipal;
                        combocinco[i] = cbprincipal;
                        combocinco[i].setEnabled(true);
                        break;
                    } else if (contarcinco == 5) {
                        System.out.println("contar 5");
                        if (cinco == i & i == 0) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 1) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 2) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 3) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 4) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            cinco = i - 4;
                            break;
                        }
                    }
                }
                for (int i = 0; i < 5; i++) {
                    if (diascinco[i] != null) {
                        System.out.println(diascinco[i].getText());
                        diascinco[i].setSelected(true);
                    }

                }
            } else {
                for (int i = 0; i < 5; i++) {
                    if (checkprincipal == diascinco[i]) {
                        diascinco[i] = null;
                        combocinco[i].setEnabled(false);
                        combocinco[i] = null;
                        contarcinco -= 1;
                        break;
                    }
                }

                for (int i = 0; i < 5; i++) {
                    if (diascinco[i] != null) {
                        System.out.println(diascinco[i].getText());
                    } else {
                        System.out.println(diascinco[i]);
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

    public void habilitarhoras(boolean valor) {
        cbhoralunes.setEnabled(valor);
        cbhoramartes.setEnabled(valor);
        cbhoramiercoles.setEnabled(valor);
        cbhorajueves.setEnabled(valor);
        cbhoraviernes.setEnabled(valor);
        cbhorasabado.setEnabled(valor);
    }

    public void inicializarvariables() {
        contardos = 0;
        dos = 0;
        contartres = 0;
        tres = 0;
        contarcuatro = 0;
        cuatro = 0;
        contarcinco = 0;
        cinco = 0;
        for (int i = 0; i < 2; i++) {
            diasdos[i] = null;
            combodos[i] = null;
        }
        for (int i = 0; i < 3; i++) {
            diastres[i] = null;
            combotres[i] = null;
        }

        for (int i = 0; i < 4; i++) {
            diascuatro[i] = null;
            combocuatro[i] = null;
        }
        for (int i = 0; i < 5; i++) {
            diascinco[i] = null;
            combocinco[i] = null;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
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
        cbhorasabado = new javax.swing.JComboBox<>();
        cbhoralunes = new javax.swing.JComboBox<>();
        cbhoramartes = new javax.swing.JComboBox<>();
        cbhoramiercoles = new javax.swing.JComboBox<>();
        cbhorajueves = new javax.swing.JComboBox<>();
        cbhoraviernes = new javax.swing.JComboBox<>();
        jPanelWebCam1 = new JPanelWebCam.JPanelWebCam();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        rSButtonHover1 = new rojerusan.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1117, 613));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel1.setText("Inscripción");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 0, 209, 54);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(22, 64, 107, 31);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(22, 102, 107, 31);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de inicio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(22, 403, 139, 25);

        txtnombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txtnombre);
        txtnombre.setBounds(215, 70, 230, 23);

        txtapellidos.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txtapellidos);
        txtapellidos.setBounds(215, 105, 230, 23);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Localidad:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(22, 224, 107, 31);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Calle:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(22, 261, 107, 31);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No. exterior:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(22, 298, 117, 31);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No. interior:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(259, 298, 107, 31);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teléfono:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(22, 335, 107, 31);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Celular:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(259, 335, 107, 31);

        txtlocalidad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txtlocalidad);
        txtlocalidad.setBounds(147, 227, 233, 23);

        txtcalle.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txtcalle);
        txtcalle.setBounds(147, 264, 233, 23);

        txtnumin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txtnumin);
        txtnumin.setBounds(370, 301, 106, 23);

        txtnumex.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txtnumex);
        txtnumex.setBounds(149, 298, 100, 23);

        txttelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txttelefono);
        txttelefono.setBounds(149, 338, 100, 23);

        txtcelular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txtcelular);
        txtcelular.setBounds(370, 338, 106, 23);

        cktutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cktutor.setForeground(new java.awt.Color(255, 255, 255));
        cktutor.setText("Tutor");
        cktutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cktutorActionPerformed(evt);
            }
        });
        getContentPane().add(cktutor);
        cktutor.setBounds(391, 144, 59, 25);

        lbltutor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbltutor.setForeground(new java.awt.Color(255, 255, 255));
        lbltutor.setText("Nombre del tutor:");
        getContentPane().add(lbltutor);
        lbltutor.setBounds(22, 182, 155, 31);

        txtnombretutor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txtnombretutor);
        txtnombretutor.setBounds(215, 185, 261, 23);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 180, 583, 210);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Buscar: AYO00");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(490, 140, 141, 31);

        txtbuscar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(630, 140, 97, 23);

        jButton2.setBackground(new java.awt.Color(153, 0, 153));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Buscar");
        getContentPane().add(jButton2);
        jButton2.setBounds(850, 140, 83, 27);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3.setText("Eliminar");
        getContentPane().add(jButton3);
        jButton3.setBounds(960, 140, 90, 27);

        jButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton4.setText("Nuevo");
        getContentPane().add(jButton4);
        jButton4.setBounds(60, 560, 80, 27);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(22, 144, 189, 31);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha de termino:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(361, 402, 160, 31);

        jButton5.setBackground(new java.awt.Color(51, 255, 0));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setText("Guardar");
        getContentPane().add(jButton5);
        jButton5.setBounds(650, 560, 91, 27);

        jButton6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton6.setText("Renovar mensualidad");
        getContentPane().add(jButton6);
        jButton6.setBounds(430, 560, 190, 27);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sesiones por semana:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(723, 406, 206, 25);

        cbdias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbdias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdiasActionPerformed(evt);
            }
        });
        getContentPane().add(cbdias);
        cbdias.setBounds(933, 408, 51, 25);

        cklunes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cklunes.setText("Lunes");
        cklunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cklunesActionPerformed(evt);
            }
        });
        getContentPane().add(cklunes);
        cklunes.setBounds(80, 450, 68, 25);

        ckmartes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ckmartes.setText("Martes");
        ckmartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmartesActionPerformed(evt);
            }
        });
        getContentPane().add(ckmartes);
        ckmartes.setBounds(220, 450, 74, 25);

        ckmiercoles.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ckmiercoles.setText("Miércoles");
        ckmiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmiercolesActionPerformed(evt);
            }
        });
        getContentPane().add(ckmiercoles);
        ckmiercoles.setBounds(370, 450, 95, 25);

        ckjueves.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ckjueves.setText("Jueves");
        ckjueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckjuevesActionPerformed(evt);
            }
        });
        getContentPane().add(ckjueves);
        ckjueves.setBounds(530, 450, 77, 25);

        ckviernes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ckviernes.setText("Viernes");
        ckviernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckviernesActionPerformed(evt);
            }
        });
        getContentPane().add(ckviernes);
        ckviernes.setBounds(680, 450, 79, 25);

        cksabado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cksabado.setText("Sábado");
        cksabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cksabadoActionPerformed(evt);
            }
        });
        getContentPane().add(cksabado);
        cksabado.setBounds(820, 450, 77, 25);

        cbhorasabado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhorasabado);
        cbhorasabado.setBounds(820, 480, 110, 30);

        cbhoralunes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoralunes);
        cbhoralunes.setBounds(75, 480, 110, 30);

        cbhoramartes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoramartes);
        cbhoramartes.setBounds(220, 480, 120, 30);

        cbhoramiercoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoramiercoles);
        cbhoramiercoles.setBounds(370, 480, 120, 30);

        cbhorajueves.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhorajueves);
        cbhorajueves.setBounds(530, 480, 120, 30);

        cbhoraviernes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoraviernes);
        cbhoraviernes.setBounds(680, 480, 120, 30);

        jPanelWebCam1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanelWebCam1);
        jPanelWebCam1.setBounds(970, 20, 100, 100);

        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setText("Editar datos");
        getContentPane().add(jButton7);
        jButton7.setBounds(290, 560, 117, 25);

        jButton8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton8.setText("Cancelar");
        getContentPane().add(jButton8);
        jButton8.setBounds(170, 560, 95, 25);

        rSButtonHover1.setText("rSButtonHover1");
        getContentPane().add(rSButtonHover1);
        rSButtonHover1.setBounds(760, 550, 200, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cktutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cktutorActionPerformed
        if (cktutor.isSelected() == true) {
            lbltutor.setVisible(true);
            txtnombretutor.setVisible(true);
        } else {
            lbltutor.setVisible(false);
            txtnombretutor.setVisible(false);
        }
    }//GEN-LAST:event_cktutorActionPerformed

    private void cklunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cklunesActionPerformed
        System.out.println(cklunes.getText());
        System.out.println(cklunes.isSelected());

        checkdias(ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
                cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes);


    }//GEN-LAST:event_cklunesActionPerformed

    private void ckmartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmartesActionPerformed
        checkdias(cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes);

    }//GEN-LAST:event_ckmartesActionPerformed

    private void ckmiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmiercolesActionPerformed
        checkdias(cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
                cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles);

    }//GEN-LAST:event_ckmiercolesActionPerformed

    private void ckjuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckjuevesActionPerformed
        checkdias(ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
                cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves);

    }//GEN-LAST:event_ckjuevesActionPerformed

    private void ckviernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckviernesActionPerformed
        checkdias(ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes);

    }//GEN-LAST:event_ckviernesActionPerformed

    private void cksabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cksabadoActionPerformed
        checkdias(ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado);

    }//GEN-LAST:event_cksabadoActionPerformed

    private void cbdiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdiasActionPerformed

        dias = cbdias.getSelectedIndex() + 1;
        deseleccionarckdias(false);
        habilitarhoras(false);
//        System.out.println("item = "+dias);
        inicializarvariables();
        System.out.println("contar 2 = " + contardos);
        System.out.println("contar 3 = " + contartres);
        System.out.println("contar 4 = " + contarcuatro);
        System.out.println("contar 5 = " + contarcinco);


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
    private javax.swing.JComboBox<String> cbhorajueves;
    private javax.swing.JComboBox<String> cbhoralunes;
    private javax.swing.JComboBox<String> cbhoramartes;
    private javax.swing.JComboBox<String> cbhoramiercoles;
    private javax.swing.JComboBox<String> cbhorasabado;
    private javax.swing.JComboBox<String> cbhoraviernes;
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
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    private JPanelWebCam.JPanelWebCam jPanelWebCam1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbltutor;
    private rojerusan.RSButtonHover rSButtonHover1;
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
