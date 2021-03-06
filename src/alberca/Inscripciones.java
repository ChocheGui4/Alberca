/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.Eliminarusuarios;
import Consultas.Guardarmodificaciones;
import Consultas.Render;
import Consultas.Renovar;
import Consultas.inscripcion;
import Consultas.tabla;
import com.toedter.calendar.JDateChooser;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Choche
 */
public class Inscripciones extends javax.swing.JFrame {

    /**
     * Creates new form Inscripciones
     */
    FondoPanel fondo = new FondoPanel();
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
    byte[] image;
    int dias = 1;
    int diacero = 0, diauno = 1, diados = 2, diatres = 3, diacuatro = 4, diacinco = 5;
    int resultado = -1;
    int r = 0;
    //Camara
//    BufferedImage ruta=null;
    //Número de días de la semanna
    int dia0 = 0;
    int dia1 = 0;
    int dia2 = 0;
    int dia3 = 0;
    int dia4 = 0;
    int dia5 = 0;

    //Capturar fechas para insertar nombres
    int diamasuno[] = new int[1];
    int diamasdos[] = new int[2];
    int diamastres[] = new int[3];
    int diamascuatro[] = new int[4];
    int diamascinco[] = new int[5];
    int diamasseis[] = new int[6];

    //Capturar mes
    int unasesionmes[] = new int[4];
    int dossesionmes[][] = new int[2][4];
    int tressesionmes[][] = new int[3][4];
    int cuatrosesionmes[][] = new int[4][4];
    int cincosesionmes[][] = new int[5][4];

    //Capturar numero de dias
    int unasesion[] = new int[4];
    int dossesion[][] = new int[2][4];
    int tressesion[][] = new int[3][4];
    int cuatrosesion[][] = new int[4][4];
    int cincosesion[][] = new int[5][4];

    //
    int masuno[] = {-1};

    int contardos = 0, dos = 0;
    int masdos[] = {-1, -1};

    int contartres = 0, tres = 0;
    int mastres[] = {-1, -1, -1};

    int contarcuatro = 0, cuatro = 0;
    int mascuatro[] = {-1, -1, -1, -1};

    int contarcinco = 0, cinco = 0;
    int mascinco[] = {-1, -1, -1, -1, -1};

    //variables para horas de combos
    String combohoras[] = new String[7];

    //
    JCheckBox diasdos[] = new JCheckBox[2];
    JComboBox combodos[] = new JComboBox[2];
    JCheckBox diastres[] = new JCheckBox[3];
    JComboBox combotres[] = new JComboBox[3];
    JCheckBox diascuatro[] = new JCheckBox[4];
    JComboBox combocuatro[] = new JComboBox[4];
    JCheckBox diascinco[] = new JCheckBox[5];
    JComboBox combocinco[] = new JComboBox[5];
    public Date fechaselec = null;
    tabla tab = new tabla();

    public Inscripciones() {
        Calendar calendario = Calendar.getInstance();

//        this.setContentPane(fondo);
        initComponents();
        
        lbltutor.setVisible(false);
        txtnombretutor.setVisible(false);
        habilitarhoras(false);
        btnrenovar.setEnabled(false);
//        btnguardar.setEnabled(false);
        txtidusuario.setEnabled(false);
        txtidusuario.setVisible(false);
        txtmensualidad.setVisible(false);
        txteliminar.setVisible(false);
        btnguardarrenovacion.setEnabled(false);
        cbidmaestro.setVisible(false);
        cbidhorario.setVisible(false);
        btntomarfoto.setVisible(false);
//        btnfoto.setVisible(false);
        mostrar("");
        tdatos.setDefaultRenderer(Object.class, new Render());
        marcarcalendar(new Date());
//        llenarclaves();
        tab.mostraridhorario(cbidhorario);
        tab.mostrarmaestros(cbmaestros);
        tab.mostraridmaestros(cbidmaestro);
        System.out.println(calendario.get(Calendar.HOUR_OF_DAY) + ":00 - " + (calendario.get(Calendar.HOUR_OF_DAY) + 1) + ":00");
        this.setLocationRelativeTo(null);
        ((JTextField) this.txtfechainicio.getDateEditor()).setEditable(false);
        ((JTextField) this.txtfechatermino.getDateEditor()).setEditable(false);
    }


    public void marcarcalendar(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
//        calendar.add(Calendar.DAY_OF_MONTH, masuno[0]);
        int i = calendar.get(Calendar.DAY_OF_WEEK);
        deseleccionarckdias(false);
        habilitarhoras(false);
        inicializarvariables();
        cbdias.setSelectedIndex(0);
//        System.out.println("dia de la semana: " + i);
//        txtfechainicio.getJCalendar().setMinSelectableDate(new Date());
        if (i == 1) {
//            calendar.setTime(fecha);
//            calendar.add(Calendar.DAY_OF_YEAR, 1);
//            txtfechainicio.setDate(calendar.getTime());
            txtfechainicio.setDate(fecha);
            System.out.println("Hoy es domingo");
        } else if (i == 2) {
//            txtfechainicio.setDate(fecha);
            txtfechainicio.setDate(fecha);

//            System.out.println("Hoy es lunes");
            escogerdias(0, 1, 2, 3, 4, 5);
            dia0 = 0;
            dia1 = 1;
            dia2 = 2;
            dia3 = 3;
            dia4 = 4;
            dia5 = 5;

            darnombredias("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado");

        } else if (i == 3) {
//            calendar.setTime(fecha);
//            calendar.add(Calendar.DAY_OF_YEAR, -1);
//            txtfechainicio.setDate(calendar.getTime());
            txtfechainicio.setDate(fecha);
//            System.out.println("Hoy es martes");
            escogerdias(1, 2, 3, 4, 5, 0);
            dia0 = 0;
            dia1 = 1;
            dia2 = 2;
            dia3 = 3;
            dia4 = 4;
            dia5 = 6;
            darnombredias("Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Lunes");
        } else if (i == 4) {
//            calendar.setTime(fecha);
//            calendar.add(Calendar.DAY_OF_YEAR, -2);
//            txtfechainicio.setDate(calendar.getTime());
            txtfechainicio.setDate(fecha);
//            System.out.println("Hoy es miércoles");
            escogerdias(2, 3, 4, 5, 0, 1);
            dia0 = 0;
            dia1 = 1;
            dia2 = 2;
            dia3 = 3;
            dia4 = 5;
            dia5 = 6;
            darnombredias("Miércoles", "Jueves", "Viernes", "Sábado", "Lunes", "Martes");
        } else if (i == 5) {
//            calendar.setTime(fecha);
//            calendar.add(Calendar.DAY_OF_YEAR, -3);
//            txtfechainicio.setDate(calendar.getTime());
            txtfechainicio.setDate(fecha);
//            System.out.println("Hoy es jueves");
            escogerdias(3, 4, 5, 0, 1, 2);
            dia0 = 0;
            dia1 = 1;
            dia2 = 2;
            dia3 = 4;
            dia4 = 5;
            dia5 = 6;
            darnombredias("Jueves", "Viernes", "Sábado", "Lunes", "Martes", "Miércoles");
        } else if (i == 6) {
//            calendar.setTime(fecha);
//            calendar.add(Calendar.DAY_OF_YEAR, -4);
//            txtfechainicio.setDate(calendar.getTime());
            txtfechainicio.setDate(fecha);
//            System.out.println("Hoy es viernes");
            escogerdias(4, 5, 0, 1, 2, 3);
            dia0 = 0;
            dia1 = 1;
            dia2 = 3;
            dia3 = 4;
            dia4 = 5;
            dia5 = 6;
            darnombredias("Viernes", "Sábado", "Lunes", "Martes", "Miércoles", "Jueves");
        } else if (i == 7) {
//            calendar.setTime(fecha);
//            calendar.add(Calendar.DAY_OF_YEAR, -5);
//            txtfechainicio.setDate(calendar.getTime());
            txtfechainicio.setDate(fecha);
//            System.out.println("Hoy es sábado");
            escogerdias(5, 0, 1, 2, 3, 4);
            dia0 = 0;
            dia1 = 2;
            dia2 = 3;
            dia3 = 4;
            dia4 = 5;
            dia5 = 6;
            darnombredias("Sábado", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
        }
//        cklunes.setSelected(true);
//        cklunes.setEnabled(false);
//        cbhoralunes.setEnabled(true);
    }

    public void escogerdias(int cero, int uno, int dos, int tres, int cuatro, int cinco) {
        diacero = cero;
        diauno = uno;
        diados = dos;
        diatres = tres;
        diacuatro = cuatro;
        diacinco = cinco;
    }

    public void darnombredias(String uno, String dos, String tres, String cuatro, String cinco, String seis) {
        cklunes.setText(uno);
        ckmartes.setText(dos);
        ckmiercoles.setText(tres);
        ckjueves.setText(cuatro);
        ckviernes.setText(cinco);
        cksabado.setText(seis);
    }

    public void checkdias(int numero, int m, JCheckBox check1, JCheckBox check2, JCheckBox check3, JCheckBox check4, JCheckBox check5,
            JCheckBox checkprincipal, JComboBox cb1, JComboBox cb2, JComboBox cb3, JComboBox cb4, JComboBox cb5,
            JComboBox cbprincipal, JComboBox chora) {
        if (dias == 1) {
            if (checkprincipal.isSelected() == true) {
                diamasuno[0] = numero;
                masuno[0] = m;
                System.out.println("mas uno -> " + masuno[0]);
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
            } else {
                masuno[0] = -1;
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
                        diamasdos[i] = numero;
                        masdos[i] = m;
                        break;
                    } else if (contardos == 2) {

                        if (dos == i & i == 0) {
                            diasdos[i].setSelected(false);
                            diasdos[i] = checkprincipal;
                            combodos[i].setEnabled(false);
                            combodos[i] = cbprincipal;
                            combodos[i].setEnabled(true);
                            diamasdos[i] = numero;
                            masdos[i] = m;
                            dos = i + 1;
                            break;
                        } else if (dos == i & i == 1) {
                            diasdos[i].setSelected(false);
                            diasdos[i] = checkprincipal;
                            combodos[i].setEnabled(false);
                            combodos[i] = cbprincipal;
                            combodos[i].setEnabled(true);
                            diamasdos[i] = numero;
                            masdos[i] = m;
                            dos = i - 1;
                            break;
                        }

                    }
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    if (checkprincipal == diasdos[i]) {
                        diasdos[i] = null;
                        diamasdos[i] = -1;
                        masdos[i] = -1;
                        combodos[i].setEnabled(false);
                        combodos[i] = null;
                        contardos -= 1;
                        break;
                    }
                }

//                for (int i = 0; i < 2; i++) {
//                    if (diasdos[i] != null) {
//                        System.out.println(diasdos[i].getText());
//                    } else {
//                        System.out.println(diasdos[i]);
//                    }
//
//                }
            }
        } else if (dias == 3) {
            if (checkprincipal.isSelected() == true) {
                for (int i = 0; i < 3; i++) {

                    if (diastres[i] == null) {
                        contartres += 1;
                        diamastres[i] = numero;
                        mastres[i] = m;
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
                            diamastres[i] = numero;
                            mastres[i] = m;
                            tres = i + 1;

                            break;
                        } else if (tres == i & i == 1) {
                            diastres[i].setSelected(false);
                            diastres[i] = checkprincipal;
                            combotres[i].setEnabled(false);
                            combotres[i] = cbprincipal;
                            combotres[i].setEnabled(true);
                            diamastres[i] = numero;
                            mastres[i] = m;
                            tres = i + 1;
                            break;
                        } else if (tres == i & i == 2) {
                            diastres[i].setSelected(false);
                            diastres[i] = checkprincipal;
                            combotres[i].setEnabled(false);
                            combotres[i] = cbprincipal;
                            combotres[i].setEnabled(true);
                            diamastres[i] = numero;
                            mastres[i] = m;
                            tres = i - 2;
                            break;
                        }
                    }
                }
                for (int i = 0; i < 3; i++) {
                    if (diastres[i] != null) {
//                        System.out.println(diastres[i].getText());
                        diastres[i].setSelected(true);
                    }

                }
            } else {
                for (int i = 0; i < 3; i++) {
                    if (checkprincipal == diastres[i]) {
                        diastres[i] = null;
                        combotres[i].setEnabled(false);
                        combotres[i] = null;
                        diamastres[i] = -1;
                        mastres[i] = -1;
                        contartres -= 1;
                        break;
                    }
                }

//                for (int i = 0; i < 3; i++) {
//                    if (diastres[i] != null) {
//                        System.out.println(diastres[i].getText());
//                    } else {
//                        System.out.println(diastres[i]);
//                    }
//
//                }
            }
        } else if (dias == 4) {
            if (checkprincipal.isSelected() == true) {
                for (int i = 0; i < 4; i++) {

                    if (diascuatro[i] == null) {
                        contarcuatro += 1;
                        diamascuatro[i] = numero;
                        mascuatro[i] = m;
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
                            diamascuatro[i] = numero;
                            mascuatro[i] = m;
                            cuatro = i + 1;
                            break;
                        } else if (cuatro == i & i == 1) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            diamascuatro[i] = numero;
                            mascuatro[i] = m;
                            cuatro = i + 1;

                            break;
                        } else if (cuatro == i & i == 2) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            diamascuatro[i] = numero;
                            mascuatro[i] = m;
                            cuatro = i + 1;

                            break;
                        } else if (cuatro == i & i == 3) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            diamascuatro[i] = numero;
                            mascuatro[i] = m;
                            cuatro = i - 3;

                            break;
                        }

                    }
                }
                for (int i = 0; i < 4; i++) {
                    if (diascuatro[i] != null) {
//                        System.out.println(diascuatro[i].getText());
                        diascuatro[i].setSelected(true);
                    }

                }
            } else {
                for (int i = 0; i < 4; i++) {
                    if (checkprincipal == diascuatro[i]) {
                        diascuatro[i] = null;
                        combocuatro[i].setEnabled(false);
                        combocuatro[i] = null;
                        diamascuatro[i] = -1;
                        mascuatro[i] = -1;
                        contarcuatro -= 1;
                        break;
                    }
                }

//                for (int i = 0; i < 4; i++) {
//                    if (diascuatro[i] != null) {
//                        System.out.println(diascuatro[i].getText());
//                    } else {
//                        System.out.println(diascuatro[i]);
//                    }
//
//                }
            }
        } else if (dias == 5) {
            if (checkprincipal.isSelected() == true) {
                for (int i = 0; i < 5; i++) {

                    if (diascinco[i] == null) {
                        contarcinco += 1;
                        diamascinco[i] = numero;
                        mascinco[i] = m;
                        diascinco[i] = checkprincipal;
                        combocinco[i] = cbprincipal;
                        combocinco[i].setEnabled(true);

                        break;
                    } else if (contarcinco == 5) {
//                        System.out.println("contar 5");
                        if (cinco == i & i == 0) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            diamascinco[i] = numero;
                            mascinco[i] = m;
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 1) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            diamascinco[i] = numero;
                            mascinco[i] = m;
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 2) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            diamascinco[i] = numero;
                            mascinco[i] = m;
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 3) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            diamascinco[i] = numero;
                            mascinco[i] = m;
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 4) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            diamascinco[i] = numero;
                            mascinco[i] = m;
                            cinco = i - 4;
                            break;
                        }
                    }
                }
                for (int i = 0; i < 5; i++) {
                    if (diascinco[i] != null) {
//                        System.out.println(diascinco[i].getText());
                        diascinco[i].setSelected(true);
                    }

                }
            } else {
                for (int i = 0; i < 5; i++) {
                    if (checkprincipal == diascinco[i]) {
                        diascinco[i] = null;
                        combocinco[i].setEnabled(false);
                        combocinco[i] = null;
                        diamascinco[i] = -1;
                        mascinco[i] = -1;
                        contarcinco -= 1;
                        break;
                    }
                }

//                for (int i = 0; i < 5; i++) {
//                    if (diascinco[i] != null) {
//                        System.out.println(diascinco[i].getText());
//                    } else {
//                        System.out.println(diascinco[i]);
//                    }
//
//                }
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

    public void habilitarcamposdatopersonal(boolean valor) {
        txtfolio.setEnabled(valor);
        txtnombre.setEnabled(valor);
        txtapellidos.setEnabled(valor);
        txtnombretutor.setEnabled(valor);

    }

    public void habilitarcamposdatosdireccion(boolean valor) {
        txtnombre.setEnabled(valor);
        txtapellidos.setEnabled(valor);
        cbedad.setEnabled(valor);
        txtnombretutor.setEnabled(valor);
        cktutor.setEnabled(valor);
        txtlocalidad.setEnabled(valor);
        txtcelular.setEnabled(valor);

    }

    public void limpiar() {
        txtfolio.setText("");
        txtnombre.setText("");
        txtapellidos.setText("");
        txtnombretutor.setText("");
        txtnombretutor.setVisible(false);
        txtnombretutor.setEnabled(false);
        cktutor.setSelected(false);
        txtlocalidad.setText("");
        txtcelular.setText("");
        txtfechainicio.setDate(new Date());
        cktutor.setSelected(false);
        cktutor.setEnabled(true);

    }

    public void habilitarcamposmensualidad(boolean valor) {

//        txtfechainicio.setEnabled(valor);
//        txtfechatermino.setEnabled(valor);
        cbdias.setEnabled(valor);
        cklunes.setEnabled(valor);
        ckmartes.setEnabled(valor);
        ckmiercoles.setEnabled(valor);
        ckjueves.setEnabled(valor);
        ckviernes.setEnabled(valor);
        cksabado.setEnabled(valor);
        txtfechainicio.setEnabled(valor);
        txtfechatermino.setEnabled(valor);

    }

    public void reiniciarcombos(int valor) {
        cbhoralunes.setSelectedIndex(valor);
        cbhoramartes.setSelectedIndex(valor);
        cbhoramiercoles.setSelectedIndex(valor);
        cbhorajueves.setSelectedIndex(valor);
        cbhoraviernes.setSelectedIndex(valor);
        cbhorasabado.setSelectedIndex(valor);

    }

    public void inicializarvariables() {
        contardos = 0;
        dos = 0;
        masuno[0] = -1;
        contartres = 0;
        tres = 0;
        contarcuatro = 0;
        cuatro = 0;
        contarcinco = 0;
        cinco = 0;

        for (int i = 0; i < 2; i++) {
            diasdos[i] = null;
            combodos[i] = null;
            masdos[i] = -1;
        }
        for (int i = 0; i < 3; i++) {
            diastres[i] = null;
            combotres[i] = null;
            mastres[i] = -1;
        }

        for (int i = 0; i < 4; i++) {
            diascuatro[i] = null;
            combocuatro[i] = null;
            mascuatro[i] = -1;
            unasesion[i] = 0;
        }
        for (int i = 0; i < 5; i++) {
            diascinco[i] = null;
            combocinco[i] = null;
            mascinco[i] = -1;
        }
    }

    public String obtenerfechastr(JDateChooser jd, int mas) {
        if (jd.getDate() == null) {
            return "";
        } else {
//            System.out.println("suma que es igual que ultimo... " + mas);
            if (jd.getDate() != null) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(jd.getDate());
                calendar.add(Calendar.DAY_OF_YEAR, mas);
                return formato.format(calendar.getTime());
            } else {
                return null;
            }
        }
    }

    public String obtenerfecha(JDateChooser jd, int ultimo) {
        if (jd.getDate() == null) {
            return "";
        } else {
//            System.out.println("ultimo....: " + ultimo);
            fechaselec = jd.getDate();
            Calendar calendar = Calendar.getInstance();
//            System.out.println("Fecha a poner ultimo -> " + jd.getDate());
            calendar.setTime(jd.getDate());
            //Aquí se aumentan los días por 21 o por 28
//            calendar.add(Calendar.DAY_OF_YEAR, 28 + ultimo);
            
            calendar.add(Calendar.DAY_OF_YEAR, 21 + ultimo);
            if (jd.getDate() != null) {
//                txtfechatermino.getJCalendar().setMinSelectableDate(calendar.getTime());
//                txtfechatermino.getJCalendar().setm);
                return formato.format(calendar.getTime());
            } else {
                return null;
            }
        }
    }

    public String obtenerfechanacimiento(JDateChooser jd) {
        if (jd.getDate() == null) {
            return "";
        } else {
            if (jd.getDate() != null) {

                return formato.format(jd.getDate());
            } else {
                return null;
            }
        }
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

    void mostrar(String buscar) {
        try {
            DefaultTableModel modelo;

            modelo = tab.mostrar(buscar);

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
            lblregistros.setText("Registros: " + Integer.toString(tab.totalregistros));

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

        tdatos.getColumnModel().getColumn(2).setMaxWidth(200);
        tdatos.getColumnModel().getColumn(2).setMinWidth(200);
        tdatos.getColumnModel().getColumn(2).setPreferredWidth(200);

        tdatos.getColumnModel().getColumn(4).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(4).setMinWidth(0);
        tdatos.getColumnModel().getColumn(4).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(5).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(5).setMinWidth(0);
        tdatos.getColumnModel().getColumn(5).setPreferredWidth(0);
//        
        tdatos.getColumnModel().getColumn(6).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(6).setMinWidth(0);
        tdatos.getColumnModel().getColumn(6).setPreferredWidth(0);
//        
        tdatos.getColumnModel().getColumn(7).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(7).setMinWidth(0);
        tdatos.getColumnModel().getColumn(7).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(8).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(8).setMinWidth(0);
        tdatos.getColumnModel().getColumn(8).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(9).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(9).setMinWidth(0);
        tdatos.getColumnModel().getColumn(9).setPreferredWidth(0);
//        
        tdatos.getColumnModel().getColumn(10).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(10).setMinWidth(0);
        tdatos.getColumnModel().getColumn(10).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(11).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(11).setMinWidth(0);
        tdatos.getColumnModel().getColumn(11).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(12).setMaxWidth(110);
        tdatos.getColumnModel().getColumn(12).setMinWidth(110);
        tdatos.getColumnModel().getColumn(12).setPreferredWidth(110);

        tdatos.getColumnModel().getColumn(13).setMaxWidth(110);
        tdatos.getColumnModel().getColumn(13).setMinWidth(110);
        tdatos.getColumnModel().getColumn(13).setPreferredWidth(110);

        tdatos.getColumnModel().getColumn(15).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(15).setMinWidth(0);
        tdatos.getColumnModel().getColumn(15).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(16).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(16).setMinWidth(0);
        tdatos.getColumnModel().getColumn(16).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(17).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(17).setMinWidth(0);
        tdatos.getColumnModel().getColumn(17).setPreferredWidth(0);

        tdatos.getColumnModel().getColumn(14).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(14).setMinWidth(0);
        tdatos.getColumnModel().getColumn(14).setPreferredWidth(0);
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
        tdatos.getColumnModel().getColumn(15).setResizable(false);
        tdatos.getColumnModel().getColumn(17).setResizable(false);

    }

    public static void quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = A[i];                      // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quicksort(A, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der);          // ordenamos subarray derecho
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
        lblnombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtlocalidad = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        cktutor = new javax.swing.JCheckBox();
        lbltutor = new javax.swing.JLabel();
        txtnombretutor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tdatos = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnrenovar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbdias = new javax.swing.JComboBox<>();
        cbhorasabado = new javax.swing.JComboBox<>();
        cbhoralunes = new javax.swing.JComboBox<>();
        cbhoramartes = new javax.swing.JComboBox<>();
        ckmartes = new javax.swing.JCheckBox();
        cbhoramiercoles = new javax.swing.JComboBox<>();
        cbhorajueves = new javax.swing.JComboBox<>();
        cbhoraviernes = new javax.swing.JComboBox<>();
        cklunes = new javax.swing.JCheckBox();
        ckmiercoles = new javax.swing.JCheckBox();
        ckjueves = new javax.swing.JCheckBox();
        ckviernes = new javax.swing.JCheckBox();
        cksabado = new javax.swing.JCheckBox();
        txtidusuario = new javax.swing.JTextField();
        txtfechainicio = new com.toedter.calendar.JDateChooser();
        txtfechatermino = new com.toedter.calendar.JDateChooser();
        jSeparator2 = new javax.swing.JSeparator();
        btnguardarrenovacion = new javax.swing.JButton();
        txtmensualidad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txteliminar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbidhorario = new javax.swing.JComboBox<>();
        cbmaestros = new javax.swing.JComboBox<>();
        cbedad = new javax.swing.JComboBox<>();
        cbidmaestro = new javax.swing.JComboBox<>();
        jpcamara = new javax.swing.JPanel();
        lblfotousuario = new javax.swing.JLabel();
        btntomarfoto = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtfolio = new javax.swing.JTextField();
        lblimagen = new javax.swing.JLabel();
        lblregistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 630));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

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

        lblnombre.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre.setText("Nombre:");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(22, 64, 107, 31);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(22, 102, 107, 31);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Fecha de inicio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 400, 170, 25);

        txtnombre.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre);
        txtnombre.setBounds(230, 50, 290, 40);

        txtapellidos.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txtapellidos);
        txtapellidos.setBounds(230, 90, 290, 40);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Localidad:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 240, 107, 31);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("No. folio:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 320, 107, 31);

        txtlocalidad.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtlocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlocalidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtlocalidad);
        txtlocalidad.setBounds(130, 230, 290, 40);

        txtcelular.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });
        getContentPane().add(txtcelular);
        txtcelular.setBounds(130, 270, 290, 40);

        cktutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cktutor.setForeground(new java.awt.Color(255, 255, 255));
        cktutor.setText("Tutor");
        cktutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cktutorActionPerformed(evt);
            }
        });
        getContentPane().add(cktutor);
        cktutor.setBounds(449, 140, 70, 25);

        lbltutor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbltutor.setForeground(new java.awt.Color(204, 204, 204));
        lbltutor.setText("Nombre del tutor:");
        getContentPane().add(lbltutor);
        lbltutor.setBounds(22, 182, 180, 31);

        txtnombretutor.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtnombretutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombretutorKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombretutor);
        txtnombretutor.setBounds(230, 170, 290, 40);

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
        jScrollPane1.setBounds(530, 180, 720, 210);

        txtbuscar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(620, 130, 180, 40);

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
        btneliminar.setBounds(1100, 120, 150, 50);

        btnnuevo.setBackground(new java.awt.Color(0, 153, 204));
        btnnuevo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Nuevo.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo);
        btnnuevo.setBounds(190, 560, 140, 50);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Edad:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(22, 144, 210, 31);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Fecha de termino:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 430, 171, 31);

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
        btnguardar.setBounds(350, 560, 160, 50);

        btnrenovar.setBackground(new java.awt.Color(0, 153, 204));
        btnrenovar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnrenovar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Editar mes.png"))); // NOI18N
        btnrenovar.setText("Editar y renovar mensualidad");
        btnrenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrenovarActionPerformed(evt);
            }
        });
        getContentPane().add(btnrenovar);
        btnrenovar.setBounds(530, 560, 350, 50);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Sesiones por semana:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(420, 400, 230, 25);

        cbdias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbdias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbdias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdiasActionPerformed(evt);
            }
        });
        getContentPane().add(cbdias);
        cbdias.setBounds(640, 400, 70, 40);

        cbhorasabado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhorasabado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 - 7:00", "7:00 - 8:00", "8:00 - 9:00", "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhorasabado);
        cbhorasabado.setBounds(1010, 500, 140, 30);

        cbhoralunes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhoralunes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 - 7:00", "7:00 - 8:00", "8:00 - 9:00", "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoralunes);
        cbhoralunes.setBounds(70, 500, 150, 30);

        cbhoramartes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhoramartes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 - 7:00", "7:00 - 8:00", "8:00 - 9:00", "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoramartes);
        cbhoramartes.setBounds(260, 500, 150, 30);

        ckmartes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ckmartes.setForeground(new java.awt.Color(255, 255, 255));
        ckmartes.setText("Martes");
        ckmartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmartesActionPerformed(evt);
            }
        });
        getContentPane().add(ckmartes);
        ckmartes.setBounds(260, 470, 150, 33);

        cbhoramiercoles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhoramiercoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 - 7:00", "7:00 - 8:00", "8:00 - 9:00", "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoramiercoles);
        cbhoramiercoles.setBounds(440, 500, 140, 30);

        cbhorajueves.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhorajueves.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 - 7:00", "7:00 - 8:00", "8:00 - 9:00", "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhorajueves);
        cbhorajueves.setBounds(620, 500, 140, 30);

        cbhoraviernes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhoraviernes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6:00 - 7:00", "7:00 - 8:00", "8:00 - 9:00", "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoraviernes);
        cbhoraviernes.setBounds(810, 500, 150, 30);

        cklunes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cklunes.setForeground(new java.awt.Color(255, 255, 255));
        cklunes.setText("Lunes");
        cklunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cklunesActionPerformed(evt);
            }
        });
        getContentPane().add(cklunes);
        cklunes.setBounds(70, 470, 150, 33);

        ckmiercoles.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ckmiercoles.setForeground(new java.awt.Color(255, 255, 255));
        ckmiercoles.setText("Miércoles");
        ckmiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmiercolesActionPerformed(evt);
            }
        });
        getContentPane().add(ckmiercoles);
        ckmiercoles.setBounds(440, 470, 140, 33);

        ckjueves.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ckjueves.setForeground(new java.awt.Color(255, 255, 255));
        ckjueves.setText("Jueves");
        ckjueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckjuevesActionPerformed(evt);
            }
        });
        getContentPane().add(ckjueves);
        ckjueves.setBounds(620, 470, 140, 33);

        ckviernes.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        ckviernes.setForeground(new java.awt.Color(255, 255, 255));
        ckviernes.setText("Viernes");
        ckviernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckviernesActionPerformed(evt);
            }
        });
        getContentPane().add(ckviernes);
        ckviernes.setBounds(810, 470, 150, 33);

        cksabado.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        cksabado.setForeground(new java.awt.Color(255, 255, 255));
        cksabado.setText("Sábado");
        cksabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cksabadoActionPerformed(evt);
            }
        });
        getContentPane().add(cksabado);
        cksabado.setBounds(1010, 470, 140, 33);
        getContentPane().add(txtidusuario);
        txtidusuario.setBounds(840, 150, 50, 20);

        txtfechainicio.setDateFormatString("yyyy/MM/dd");
        txtfechainicio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtfechainicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtfechainicioPropertyChange(evt);
            }
        });
        getContentPane().add(txtfechainicio);
        txtfechainicio.setBounds(200, 400, 180, 30);

        txtfechatermino.setDateFormatString("yyyy/MM/dd");
        txtfechatermino.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(txtfechatermino);
        txtfechatermino.setBounds(200, 430, 180, 30);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(520, 550, 30, 60);

        btnguardarrenovacion.setBackground(new java.awt.Color(51, 255, 0));
        btnguardarrenovacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnguardarrenovacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Guardar.png"))); // NOI18N
        btnguardarrenovacion.setText("Guardar");
        btnguardarrenovacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarrenovacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardarrenovacion);
        btnguardarrenovacion.setBounds(900, 560, 150, 50);
        getContentPane().add(txtmensualidad);
        txtmensualidad.setBounds(840, 130, 20, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Buscar: ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(530, 140, 141, 31);

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Ver eliminados.png"))); // NOI18N
        jButton2.setText("Eliminados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(910, 120, 170, 50);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 0, 819, 50);

        txteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteliminarActionPerformed(evt);
            }
        });
        getContentPane().add(txteliminar);
        txteliminar.setBounds(910, 140, 20, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1170, 490, 90, 90);

        cbidhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbidhorarioActionPerformed(evt);
            }
        });
        getContentPane().add(cbidhorario);
        cbidhorario.setBounds(1200, 460, 70, 30);

        cbmaestros.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cbmaestros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona instructor" }));
        cbmaestros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmaestrosActionPerformed(evt);
            }
        });
        getContentPane().add(cbmaestros);
        cbmaestros.setBounds(730, 400, 420, 40);

        cbedad.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        cbedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        getContentPane().add(cbedad);
        cbedad.setBounds(230, 140, 80, 30);

        getContentPane().add(cbidmaestro);
        cbidmaestro.setBounds(1140, 440, 80, 30);

        javax.swing.GroupLayout jpcamaraLayout = new javax.swing.GroupLayout(jpcamara);
        jpcamara.setLayout(jpcamaraLayout);
        jpcamaraLayout.setHorizontalGroup(
            jpcamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfotousuario, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jpcamaraLayout.setVerticalGroup(
            jpcamaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblfotousuario, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jpcamara);
        jpcamara.setBounds(1120, 10, 120, 100);

        btntomarfoto.setBackground(new java.awt.Color(0, 153, 204));
        btntomarfoto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btntomarfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cámara.png"))); // NOI18N
        btntomarfoto.setText("Tomar foto");
        btntomarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntomarfotoActionPerformed(evt);
            }
        });
        getContentPane().add(btntomarfoto);
        btntomarfoto.setBounds(530, 50, 190, 40);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Celular:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 270, 107, 31);

        txtfolio.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        getContentPane().add(txtfolio);
        txtfolio.setBounds(130, 310, 290, 40);

        lblimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/azul claro 1.jpg"))); // NOI18N
        getContentPane().add(lblimagen);
        lblimagen.setBounds(0, 0, 1280, 630);

        lblregistros.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblregistros.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(lblregistros);
        lblregistros.setBounds(1170, 390, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cktutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cktutorActionPerformed
        if (cktutor.isSelected() == true) {
            lbltutor.setVisible(true);
            txtnombretutor.setVisible(true);
            txtnombretutor.setEnabled(true);
        } else {
            lbltutor.setVisible(false);
            txtnombretutor.setVisible(false);
            txtnombretutor.setEnabled(false);
        }
    }//GEN-LAST:event_cktutorActionPerformed

    private void cklunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cklunesActionPerformed
        checkdias(diacero, dia0, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
                cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);

//        checkdias(diacero, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
//                cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);

    }//GEN-LAST:event_cklunesActionPerformed

    private void ckmartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmartesActionPerformed
        checkdias(diauno, dia1, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);
//        checkdias(diauno, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
//                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);

    }//GEN-LAST:event_ckmartesActionPerformed

    private void ckmiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmiercolesActionPerformed
        checkdias(diados, dia2, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
                cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);
//        checkdias(diados, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
//                cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);

    }//GEN-LAST:event_ckmiercolesActionPerformed

    private void ckjuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckjuevesActionPerformed
        checkdias(diatres, dia3, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
                cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);
//        checkdias(diatres, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
//                cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);

    }//GEN-LAST:event_ckjuevesActionPerformed

    private void ckviernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckviernesActionPerformed
        checkdias(diacuatro, dia4, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);
//        checkdias(diacuatro, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
//                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);

    }//GEN-LAST:event_ckviernesActionPerformed

    private void cksabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cksabadoActionPerformed
        checkdias(diacinco, dia5, ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado, cbhorasabado);
//        checkdias(diacinco, ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
//                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado, cbhorasabado);

    }//GEN-LAST:event_cksabadoActionPerformed

    private void cbdiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdiasActionPerformed

        dias = cbdias.getSelectedIndex() + 1;
        deseleccionarckdias(false);
        habilitarhoras(false);
//        System.out.println("item = "+dias);
        inicializarvariables();


    }//GEN-LAST:event_cbdiasActionPerformed

    public void guardar() {
        Renovar re = new Renovar();
        if (diacero == 0) {
            combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[4] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[5] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 1) {
            combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[4] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 2) {
            combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 3) {
            combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[4] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 4) {
            combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[3] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[4] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 5) {
            combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[2] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[3] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[4] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
        }

        if (dias == 1) {

            if (masuno[0] != -1) {
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, masuno[0]),
                        obtenerfecha(txtfechainicio, masuno[0]), "" + dias);

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fechaselec);
                calendar.add(Calendar.DAY_OF_MONTH, 0);
                for (int i = 0; i < 4; i++) {

                    unasesion[i] = calendar.get(Calendar.DAY_OF_MONTH);
                    unasesionmes[i] = calendar.get(Calendar.MONTH) + 1;
                    calendar.add(Calendar.DAY_OF_MONTH, 7);
                }
                int r = re.idmensualidad();
//                String valor = "";
//                String cha = "" + combohoras[masuno[0]].charAt(0) + combohoras[masuno[0]].charAt(1);
//                if (cha.charAt(0) == '9') {
//                    valor = "9";
//                } else {
//                    valor = cha;
//                }
//                int nm = Integer.parseInt(valor);
                re.insertardiasmes(unasesion, unasesionmes, diamasuno[0], r, Integer.parseInt(combohoras[masuno[0]]),
                        Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado"
                        + " todos los días<br>hazlo por favor</span></html>",
                        "Escoger horario", JOptionPane.WARNING_MESSAGE);
            }
        } else if (dias == 2) {
            if (masdos[0] != -1 & masdos[1] != -1) {
                quicksort(masdos, 0, masdos.length - 1);
                //                    System.out.println(masdos[1] + " >>>>");
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, 0),
                        obtenerfecha(txtfechainicio, masdos[1]), "" + dias);
                Calendar calendar = Calendar.getInstance();
                for (int i = 0; i < 2; i++) {
                    calendar.setTime(fechaselec);
                    calendar.add(Calendar.DAY_OF_MONTH, masdos[i]);
                    for (int j = 0; j < 4; j++) {

                        dossesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                        dossesionmes[i][j] = calendar.get(Calendar.MONTH) + 1;
                        calendar.add(Calendar.DAY_OF_MONTH, 7);
                    }
                }
                int val[] = new int[4];
                int mess[] = new int[4];
                int r = re.idmensualidad();
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 4; j++) {
                        val[j] = dossesion[i][j];
                        mess[j] = dossesionmes[i][j];
                    }

                    re.insertardiasmes(val, mess, diamasdos[i], r, Integer.parseInt(combohoras[masdos[i]]),
                            Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado"
                        + " todos los días<br>hazlo por favor</span></html>",
                        "Escoger horario", JOptionPane.WARNING_MESSAGE);
            }
        } else if (dias == 3) {
            if (mastres[0] != -1 & mastres[1] != -1 & mastres[2] != -1) {

                quicksort(mastres, 0, mastres.length - 1);
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, 0),
                        obtenerfecha(txtfechainicio, mastres[2]), "" + dias);
                Calendar calendar = Calendar.getInstance();
                for (int i = 0; i < 3; i++) {
                    calendar.setTime(fechaselec);
                    calendar.add(Calendar.DAY_OF_MONTH, mastres[i]);
                    for (int j = 0; j < 4; j++) {

                        tressesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                        tressesionmes[i][j] = calendar.get(Calendar.MONTH) + 1;
                        calendar.add(Calendar.DAY_OF_MONTH, 7);
                    }
                }
                int val[] = new int[4];
                int mess[] = new int[4];
                int r = re.idmensualidad();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        val[j] = tressesion[i][j];
                        mess[j] = tressesionmes[i][j];
                    }

                    re.insertardiasmes(val, mess, diamastres[i], r, Integer.parseInt(combohoras[mastres[i]]),
                            Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado"
                        + " todos los días<br>hazlo por favor</span></html>",
                        "Escoger horario", JOptionPane.WARNING_MESSAGE);

            }
        } else if (dias == 4) {
            if (mascuatro[0] != -1 & mascuatro[1] != -1 & mascuatro[2] != -1 & mascuatro[3] != -1) {
                quicksort(mascuatro, 0, mascuatro.length - 1);
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, 0),
                        obtenerfecha(txtfechainicio, mascuatro[3]), "" + dias);
                Calendar calendar = Calendar.getInstance();
                for (int i = 0; i < 4; i++) {
                    calendar.setTime(fechaselec);
                    calendar.add(Calendar.DAY_OF_MONTH, mascuatro[i]);
                    for (int j = 0; j < 4; j++) {

                        cuatrosesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                        cuatrosesionmes[i][j] = calendar.get(Calendar.MONTH) + 1;
                        calendar.add(Calendar.DAY_OF_MONTH, 7);
                    }
                }
                int val[] = new int[4];
                int mess[] = new int[4];
                int r = re.idmensualidad();
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        val[j] = cuatrosesion[i][j];
                        mess[j] = cuatrosesionmes[i][j];
                    }

                    re.insertardiasmes(val, mess, diamascuatro[i], r, Integer.parseInt(combohoras[mascuatro[i]]),
                            Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado"
                        + " todos los días<br>hazlo por favor</span></html>",
                        "Escoger horario", JOptionPane.WARNING_MESSAGE);
            }
        } else if (dias == 5) {
            if (mascinco[0] != -1 & mascinco[1] != -1 & mascinco[2] != -1 & mascinco[3] != -1 & mascinco[4] != -1) {
                quicksort(mascinco, 0, mascinco.length - 1);
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, 0),
                        obtenerfecha(txtfechainicio, mascinco[4]), "" + dias);
                Calendar calendar = Calendar.getInstance();
                for (int i = 0; i < 5; i++) {
                    calendar.setTime(fechaselec);
                    calendar.add(Calendar.DAY_OF_MONTH, mascinco[i]);
                    for (int j = 0; j < 4; j++) {

                        cincosesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                        cincosesionmes[i][j] = calendar.get(Calendar.MONTH) + 1;
                        calendar.add(Calendar.DAY_OF_MONTH, 7);
                    }
                }
                int val[] = new int[4];
                int mess[] = new int[4];
                r = re.idmensualidad();
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 4; j++) {
                        val[j] = cincosesion[i][j];
                        mess[j] = cincosesionmes[i][j];
                    }

                    re.insertardiasmes(val, mess, diamascinco[i], r, Integer.parseInt(combohoras[mascinco[i]]),
                            Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado"
                        + " todos los días<br>hazlo por favor</span></html>",
                        "Escoger horario", JOptionPane.WARNING_MESSAGE);
            }

        }
        //            System.out.println("A mitad");
        if (resultado == 1) {
            dias = 1;
            inscripcion ins = new inscripcion();
            r = re.idmensualidad();
            System.out.println("Hasta aquíiiiiiiiiiiiiiiiiiiii");
            boolean v = ins.insertardias(txtfolio.getText(), txtnombre.getText(),
                    txtapellidos.getText(), cbedad.getItemAt(cbedad.getSelectedIndex()), txtlocalidad.getText(),
                    txtcelular.getText(),
                    txtnombretutor.getText(), r, "");
            if (v == true) {
                if (txteliminar.getText().equals("")) {
                    //                        System.out.println("---------------------------------------vacío el de eliminar");
                } else {

                    Eliminarusuarios elus = new Eliminarusuarios();
                    elus.cambiardatosdetabla(Integer.parseInt(txteliminar.getText()));
                    //                        System.out.println("------------------------------------------Se eliminó en la tabla de usuarios eliminados");
                }
                JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">Se agregó con éxito</span></html>",
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
                habilitarcamposmensualidad(true);
                habilitarhoras(false);
                deseleccionarckdias(false);
//                reiniciarcombos(0);
                inicializarvariables();
                limpiar();
                mostrar("");
//                cbclaves.removeAllItems();
//                cbidus.removeAllItems();
                cbmaestros.setSelectedIndex(0);
                cbedad.setSelectedIndex(0);
//                btnfoto.setEnabled(false);
//                jpcfoto.setImagenNull();
//                llenarclaves();
                marcarcalendar(new Date());
            }

        }
    }
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
//        txtfechatermino.setDate(StringaDate("2018/02/12"));

        if (txtnombre.getText().equals("") | txtapellidos.getText().equals("") | cbmaestros.getSelectedIndex() == 0
                | txtlocalidad.getText().equals("") | txtcelular.getText().equals("") | txtfolio.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">Completa los datos solicitados"
                    + "<br>por favor</span></html>", "Llenar campos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (cktutor.isSelected()) {
                if (txtnombretutor.getText().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">Completa todos los campos"
                            + "<br>por favor</span></html>", "Llenar campos", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    guardar();
                }
            } else {
                guardar();
            }
        }


    }//GEN-LAST:event_btnguardarActionPerformed

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked

        int fila = tdatos.rowAtPoint(evt.getPoint());
        Camara cam = new Camara();
        txtidusuario.setText(tdatos.getValueAt(fila, 0).toString());
        txtfolio.setText(tdatos.getValueAt(fila, 1).toString());
        txtnombre.setText(tdatos.getValueAt(fila, 2).toString());
        txtapellidos.setText(tdatos.getValueAt(fila, 3).toString());
        cbedad.setSelectedIndex(Integer.parseInt(tdatos.getValueAt(fila, 4).toString()) - 1);
        if (tdatos.getValueAt(fila, 11).toString().equals("")) {
            cktutor.setEnabled(false);
            lbltutor.setVisible(false);
            cktutor.setSelected(false);
            txtnombretutor.setVisible(false);
            txtnombretutor.setEnabled(false);
        } else {
            txtnombretutor.setText(tdatos.getValueAt(fila, 11).toString());
            lbltutor.setVisible(true);
            txtnombretutor.setVisible(true);
            txtnombretutor.setEnabled(false);
            cktutor.setSelected(true);
            cktutor.setEnabled(false);

        }

        txtlocalidad.setText(tdatos.getValueAt(fila, 5).toString());
        txtcelular.setText(tdatos.getValueAt(fila, 10).toString());
        txtfechainicio.setDate(StringaDate(tdatos.getValueAt(fila, 12).toString()));
        txtmensualidad.setText(tdatos.getValueAt(fila, 14).toString());
        cbidmaestro.setSelectedItem(tdatos.getValueAt(fila, 15).toString());
        String fotoo = tdatos.getValueAt(fila, 16).toString();
        ImageIcon icon = new ImageIcon(fotoo);
        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblfotousuario.getWidth(),
                lblfotousuario.getHeight(), Image.SCALE_DEFAULT));
        lblfotousuario.setText(null);
        lblfotousuario.setIcon(icono);
        cbdias.setSelectedItem(tdatos.getValueAt(fila, 17).toString());
        cbmaestros.setSelectedIndex(cbidmaestro.getSelectedIndex() + 1);
        btnrenovar.setEnabled(true);
        btnguardar.setEnabled(false);
        btnguardarrenovacion.setEnabled(false);
        cbmaestros.setEnabled(false);
        cbedad.setEnabled(false);
        btntomarfoto.setVisible(true);
        habilitarcamposdatopersonal(false);
        habilitarcamposdatosdireccion(false);
        habilitarcamposmensualidad(false);
        deseleccionarckdias(false);
        habilitarhoras(false);

    }//GEN-LAST:event_tdatosMouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitarcamposdatopersonal(true);
        habilitarcamposdatosdireccion(true);
        lbltutor.setVisible(false);
        limpiar();
        reiniciarcombos(0);
        habilitarcamposmensualidad(true);
        habilitarhoras(false);
        inicializarvariables();
        marcarcalendar(new Date());
        cbdias.setSelectedIndex(0);
        deseleccionarckdias(false);
        btnrenovar.setEnabled(false);
        btnguardar.setEnabled(true);
        cbedad.setSelectedIndex(0);
        cbmaestros.setSelectedIndex(0);
        cbedad.setEnabled(true);
        cbmaestros.setEnabled(true);
        btntomarfoto.setVisible(false);
        lblfotousuario.setIcon(null);
//        jpcfoto.setImagenNull();


    }//GEN-LAST:event_btnnuevoActionPerformed

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

    private void btnrenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrenovarActionPerformed
        habilitarcamposdatopersonal(true);
        cktutor.setEnabled(true);
        txtnombretutor.setEnabled(true);
        habilitarcamposdatosdireccion(true);

        habilitarcamposmensualidad(true);
        btnguardarrenovacion.setEnabled(true);
        cbmaestros.setEnabled(true);
    }//GEN-LAST:event_btnrenovarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed

        Eliminarusuarios elus = new Eliminarusuarios();
        boolean var = elus.eliminarusuario(Integer.parseInt(txtidusuario.getText()),
                Integer.parseInt(txtmensualidad.getText()));
        habilitarcamposdatopersonal(true);
        habilitarcamposdatosdireccion(true);
        limpiar();
        habilitarcamposmensualidad(true);
        habilitarhoras(false);
        inicializarvariables();
        deseleccionarckdias(false);
        
        btnrenovar.setEnabled(false);
        btnguardar.setEnabled(true);
        mostrar("");
        marcarcalendar(new Date());
        btntomarfoto.setVisible(false);
        lblfotousuario.setIcon(null);
        cbedad.setSelectedIndex(0);
        txtbuscar.setText("");
        cbmaestros.setEnabled(true);
        cbmaestros.setSelectedIndex(0);

    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtfechainicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtfechainicioPropertyChange
        txtfechatermino.setDate(StringaDate(obtenerfecha(txtfechainicio, 0)));

//        marcarcalendar(new Date());
        if (txtfechainicio.getDate() != null) {
            marcarcalendar(txtfechainicio.getDate());
        }

    }//GEN-LAST:event_txtfechainicioPropertyChange

    private void btnguardarrenovacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarrenovacionActionPerformed
        if (txtnombre.getText().equals("") | txtapellidos.getText().equals("") | cbmaestros.getSelectedIndex() == 0
                | txtlocalidad.getText().equals("") | txtcelular.getText().equals("") | txtfolio.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">Completa los datos solicitados"
                    + "<br>por favor</span></html>", "Llenar campos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //Empieza la renovación
            Renovar re = new Renovar();
            if (diacero == 0) {
                combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
                combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
                combohoras[2] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
                combohoras[3] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
                combohoras[4] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
                combohoras[5] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
            } else if (diacero == 1) {
                combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
                combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
                combohoras[2] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
                combohoras[3] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
                combohoras[4] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
                combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
            } else if (diacero == 2) {
                combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
                combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
                combohoras[2] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
                combohoras[3] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
                combohoras[5] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
                combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
            } else if (diacero == 3) {
                combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
                combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
                combohoras[2] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
                combohoras[4] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
                combohoras[5] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
                combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
            } else if (diacero == 4) {
                combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
                combohoras[1] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
                combohoras[3] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
                combohoras[4] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
                combohoras[5] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
                combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
            } else if (diacero == 5) {
                combohoras[0] = cbidhorario.getItemAt(cbhoralunes.getSelectedIndex());
                combohoras[2] = cbidhorario.getItemAt(cbhoramartes.getSelectedIndex());
                combohoras[3] = cbidhorario.getItemAt(cbhoramiercoles.getSelectedIndex());
                combohoras[4] = cbidhorario.getItemAt(cbhorajueves.getSelectedIndex());
                combohoras[5] = cbidhorario.getItemAt(cbhoraviernes.getSelectedIndex());
                combohoras[6] = cbidhorario.getItemAt(cbhorasabado.getSelectedIndex());
            }
            if (dias == 1) {
                if (masuno[0] != -1 & cbmaestros.getSelectedIndex() != 0) {
                    re.renovarrmensualidad(Integer.parseInt(txtmensualidad.getText()),
                            obtenerfechastr(txtfechainicio, masuno[0]),
                            obtenerfecha(txtfechainicio, masuno[0]), "" + dias);

                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(fechaselec);
                    calendar.add(Calendar.DAY_OF_MONTH, 0);
                    for (int i = 0; i < 4; i++) {

                        unasesion[i] = calendar.get(Calendar.DAY_OF_MONTH);
                        unasesionmes[i] = calendar.get(Calendar.MONTH) + 1;
                        calendar.add(Calendar.DAY_OF_MONTH, 7);
                    }
                    int r = re.idmensualidad();
                    //                String valor = "";
                    //                String cha = "" + combohoras[masuno[0]].charAt(0) + combohoras[masuno[0]].charAt(1);
                    //                if (cha.charAt(0) == '9') {
                    //                    valor = "9";
                    //                } else {
                    //                    valor = cha;
                    //                }
                    //                int nm = Integer.parseInt(valor);
                    re.eliminardiasmes(Integer.parseInt(txtmensualidad.getText()));
                    System.out.println("combo tiene: " + combohoras[masuno[0]]);
                    re.insertardiasmes(unasesion, unasesionmes, diamasuno[0], Integer.parseInt(txtmensualidad.getText()),
                            Integer.parseInt(combohoras[masuno[0]]),
                            Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                    resultado = 1;
                    //                re.renovardiasmes(Integer.parseInt(txtmensualidad.getText()), unasesion, masuno[0], combohoras[masuno[0]]);
                } else {
                    resultado = -1;
                    JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado días "
                            + "<br>por favor hazlo</span></html>",
                            "Actualizar mensualidad", JOptionPane.WARNING_MESSAGE);
                }
            } else if (dias == 2) {
                if (masdos[0] != -1 & masdos[1] != -1 & cbmaestros.getSelectedIndex() != 0) {
                    quicksort(masdos, 0, masdos.length - 1);
                    //                    System.out.println(masdos[1] + " >>>>");
                    re.renovarrmensualidad(Integer.parseInt(txtmensualidad.getText()),
                            obtenerfechastr(txtfechainicio, masdos[0]),
                            obtenerfecha(txtfechainicio, masdos[1]), "" + dias);
                    //                    re.insertarmensualidad(obtenerfechastr(txtfechainicio, 0),
                    //                            obtenerfecha(txtfechainicio, masdos[1]), "" + dias);
                    Calendar calendar = Calendar.getInstance();
                    for (int i = 0; i < 2; i++) {
                        calendar.setTime(fechaselec);
                        calendar.add(Calendar.DAY_OF_MONTH, masdos[i]);
                        for (int j = 0; j < 4; j++) {

                            dossesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                            dossesionmes[i][j] = calendar.get(Calendar.MONTH) + 1;
                            calendar.add(Calendar.DAY_OF_MONTH, 7);
                        }
                    }
                    int val[] = new int[4];
                    int mess[] = new int[4];
                    int r = re.idmensualidad();
                    re.eliminardiasmes(Integer.parseInt(txtmensualidad.getText()));
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 4; j++) {
                            val[j] = dossesion[i][j];
                            mess[j] = dossesionmes[i][j];
                        }
                        //                    String valor = "";
                        //                    String cha = "" + combohoras[masdos[i]].charAt(0) + combohoras[masdos[i]].charAt(1);
                        //                    if (cha.charAt(0) == '9') {
                        //                        valor = "9";
                        //                    } else {
                        //                        valor = cha;
                        //                    }
                        //                    int nm = Integer.parseInt(valor);
                        //                    re.renovardiasmes(Integer.parseInt(txtmensualidad.getText()), val, masdos[i], combohoras[masdos[i]]);
                        re.insertardiasmes(val, mess, diamasdos[i], Integer.parseInt(txtmensualidad.getText()),
                                Integer.parseInt(combohoras[masdos[i]]),
                                Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                    }
                    resultado = 1;
                } else {
                    resultado = -1;
                    JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado todos días "
                            + "<br>por favor hazlo</span></html>",
                            "Actualizar mensualidad", JOptionPane.WARNING_MESSAGE);
                }
            } else if (dias == 3) {
                if (mastres[0] != -1 & mastres[1] != -1 & mastres[2] != -1 & cbmaestros.getSelectedIndex() != 0) {

                    quicksort(mastres, 0, mastres.length - 1);
                    //                re.insertarmensualidad(obtenerfechastr(txtfechainicio, 0),
                    //                        obtenerfecha(txtfechainicio, mastres[2]), "" + dias);
                    re.renovarrmensualidad(Integer.parseInt(txtmensualidad.getText()),
                            obtenerfechastr(txtfechainicio, mastres[0]),
                            obtenerfecha(txtfechainicio, mastres[2]), "" + dias);
                    Calendar calendar = Calendar.getInstance();
                    for (int i = 0; i < 3; i++) {
                        calendar.setTime(fechaselec);
                        calendar.add(Calendar.DAY_OF_MONTH, mastres[i]);
                        for (int j = 0; j < 4; j++) {

                            tressesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                            tressesionmes[i][j] = calendar.get(Calendar.MONTH) + 1;
                            calendar.add(Calendar.DAY_OF_MONTH, 7);
                        }
                    }
                    int val[] = new int[4];
                    int mess[] = new int[4];
                    int r = re.idmensualidad();
                    re.eliminardiasmes(Integer.parseInt(txtmensualidad.getText()));
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 4; j++) {
                            val[j] = tressesion[i][j];
                            mess[j] = tressesionmes[i][j];
                        }
                        //                    String valor = "";
                        //                    String cha = "" + combohoras[mastres[i]].charAt(0) + combohoras[mastres[i]].charAt(1);
                        //                    if (cha.charAt(0) == '9') {
                        //                        valor = "9";
                        //                    } else {
                        //                        valor = cha;
                        //                    }
                        //                    int nm = Integer.parseInt(valor);
                        re.insertardiasmes(val, mess, diamastres[i], Integer.parseInt(txtmensualidad.getText()),
                                Integer.parseInt(combohoras[mastres[i]]),
                                Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                        //                    re.renovardiasmes(Integer.parseInt(txtmensualidad.getText()), val, mastres[i], combohoras[mastres[i]]);
                    }
                    resultado = 1;
                } else {
                    resultado = -1;
                    JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado todos días "
                            + "<br>por favor hazlo</span></html>",
                            "Actualizar mensualidad", JOptionPane.WARNING_MESSAGE);

                }
            } else if (dias == 4) {
                if (mascuatro[0] != -1 & mascuatro[1] != -1 & mascuatro[2] != -1 & mascuatro[3] != -1 & cbmaestros.getSelectedIndex() != 0) {
                    quicksort(mascuatro, 0, mascuatro.length - 1);
                    //                re.insertarmensualidad(obtenerfechastr(txtfechainicio, 0),
                    //                        obtenerfecha(txtfechainicio, mascuatro[3]), "" + dias);
                    re.renovarrmensualidad(Integer.parseInt(txtmensualidad.getText()),
                            obtenerfechastr(txtfechainicio, mascuatro[0]),
                            obtenerfecha(txtfechainicio, mascuatro[3]), "" + dias);
                    Calendar calendar = Calendar.getInstance();
                    for (int i = 0; i < 4; i++) {
                        calendar.setTime(fechaselec);
                        calendar.add(Calendar.DAY_OF_MONTH, mascuatro[i]);
                        for (int j = 0; j < 4; j++) {

                            cuatrosesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                            cuatrosesionmes[i][j] = calendar.get(Calendar.MONTH) + 1;
                            calendar.add(Calendar.DAY_OF_MONTH, 7);
                        }
                    }
                    int val[] = new int[4];
                    int mess[] = new int[4];
                    int r = re.idmensualidad();
                    re.eliminardiasmes(Integer.parseInt(txtmensualidad.getText()));
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            val[j] = cuatrosesion[i][j];
                            mess[j] = cuatrosesionmes[i][j];
                        }
                        String valor = "";
                        System.out.println("Antes del error------------------------------------------");
                        String cha = "" + combohoras[mascuatro[i]].charAt(0) + combohoras[mascuatro[i]].charAt(1);
                        System.out.println("Continúa Antes del error------------------------------------------");
                        if (cha.charAt(0) == '9') {
                            valor = "9";
                        } else {
                            valor = cha;
                        }
                        int nm = Integer.parseInt(valor);
                        //                     re.renovardiasmes(Integer.parseInt(txtmensualidad.getText()), val, mascuatro[i], combohoras[mascuatro[i]]);
                        re.insertardiasmes(val, mess, diamascuatro[i], Integer.parseInt(txtmensualidad.getText()),
                                Integer.parseInt(combohoras[mascuatro[i]]),
                                Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                    }
                    resultado = 1;
                } else {
                    resultado = -1;
                    JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado todos días "
                            + "<br>por favor hazlo</span></html>",
                            "Actualizar mensualidad", JOptionPane.WARNING_MESSAGE);
                }
            } else if (dias == 5) {
                if (mascinco[0] != -1 & mascinco[1] != -1 & mascinco[2] != -1 & mascinco[3] != -1 & mascinco[4] != -1
                        & cbmaestros.getSelectedIndex() != 0) {
                    quicksort(mascinco, 0, mascinco.length - 1);
                    //                re.insertarmensualidad(obtenerfechastr(txtfechainicio, 0),
                    //                        obtenerfecha(txtfechainicio, mascinco[4]), "" + dias);
                    re.renovarrmensualidad(Integer.parseInt(txtmensualidad.getText()),
                            obtenerfechastr(txtfechainicio, mascinco[0]),
                            obtenerfecha(txtfechainicio, mascinco[4]), "" + dias);
                    Calendar calendar = Calendar.getInstance();
                    for (int i = 0; i < 5; i++) {
                        calendar.setTime(fechaselec);
                        calendar.add(Calendar.DAY_OF_MONTH, mascinco[i]);
                        for (int j = 0; j < 4; j++) {

                            cincosesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                            cincosesionmes[i][j] = calendar.get(Calendar.MONTH) + 1;
                            calendar.add(Calendar.DAY_OF_MONTH, 7);
                        }
                    }
                    int val[] = new int[4];
                    int mess[] = new int[4];
                    r = re.idmensualidad();
                    re.eliminardiasmes(Integer.parseInt(txtmensualidad.getText()));
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 4; j++) {
                            val[j] = cincosesion[i][j];
                            mess[j] = cincosesionmes[i][j];
                        }
                        //                    String valor = "";
                        //                    String cha = "" + combohoras[mascinco[i]].charAt(0) + combohoras[mascinco[i]].charAt(1);
                        //                    if (cha.charAt(0) == '9') {
                        //                        valor = "9";
                        //                    } else {
                        //                        valor = cha;
                        //                    }
                        //                    int nm = Integer.parseInt(valor);
                        //                    re.renovardiasmes(Integer.parseInt(txtmensualidad.getText()), val, mascinco[i], combohoras[mascinco[i]]);
                        re.insertardiasmes(val, mess, diamascinco[i], Integer.parseInt(txtmensualidad.getText()),
                                Integer.parseInt(combohoras[mascinco[i]]),
                                Integer.parseInt(cbidmaestro.getItemAt(cbmaestros.getSelectedIndex() - 1)));
                    }
                    resultado = 1;
                } else {
                    resultado = -1;
                    JOptionPane.showMessageDialog(rootPane, "<html><span style=\"font-size:2em\">No se han seleccionado días"
                            + " <br>por favor hazlo</span></html>",
                            "Actualizar mensualidad", JOptionPane.WARNING_MESSAGE);
                }

            }
            if (resultado == 1) {
                //            JOptionPane.showMessageDialog(null, "<html><span style=\"font-size:2em\">Se renovó la mensualidad con éxito</span></html>");
                //Se actualizan datos personales
                Guardarmodificaciones gm = new Guardarmodificaciones();

                gm.Actualizar(txtfolio.getText(), txtnombre.getText(), txtapellidos.getText(), cbedad.getItemAt(cbedad.getSelectedIndex()),
                        txtnombretutor.getText(), txtlocalidad.getText(),
                        txtcelular.getText(), Integer.parseInt(txtidusuario.getText()));
                //Se termina la actualización de datos personales

                //        btnfoto.setEnabled(false);
                habilitarcamposdatosdireccion(false);
                marcarcalendar(new Date());
                mostrar("");
                btnguardarrenovacion.setEnabled(false);
                habilitarcamposdatopersonal(false);
                habilitarcamposdatosdireccion(false);
                habilitarcamposmensualidad(false);
                deseleccionarckdias(false);
                inicializarvariables();
                //            limpiar();
                reiniciarcombos(0);
                habilitarhoras(false);
                cbdias.setSelectedIndex(0);
                inicializarvariables();
                //            limpiar();
                mostrar("");
                cbmaestros.setEnabled(false);
            }
        }
        //Termina la renovación
    }//GEN-LAST:event_btnguardarrenovacionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        eliminados elimi = new eliminados();
        elimi.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed
    public void SoloNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' | c > '9') {
            evt.consume();
        }
    }
    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        SoloNumeros(evt);
        if (txtcelular.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcelularKeyTyped

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

    private void txtnombretutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombretutorKeyTyped
        if (txtnombretutor.getText().length() == 34) {
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar())
                & !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                & !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
//      lblErrorLetra.setText("Escribe solo letras");
        }
    }//GEN-LAST:event_txtnombretutorKeyTyped

    private void txtlocalidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlocalidadKeyTyped
        if (txtlocalidad.getText().length() == 34) {
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar())
                & !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                & !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
//      lblErrorLetra.setText("Escribe solo letras");
        }
    }//GEN-LAST:event_txtlocalidadKeyTyped

    private void cbmaestrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmaestrosActionPerformed

    }//GEN-LAST:event_cbmaestrosActionPerformed

    private void btntomarfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntomarfotoActionPerformed
        Camara cam = new Camara();
        cam.idusuario = Integer.parseInt(txtidusuario.getText());
        cam.setVisible(true);
    }//GEN-LAST:event_btntomarfotoActionPerformed

    private void cbidhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbidhorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbidhorarioActionPerformed

    private void txteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txteliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Inscripciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inscripciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inscripciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inscripciones.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarrenovacion;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnrenovar;
    public javax.swing.JButton btntomarfoto;
    private javax.swing.JComboBox<String> cbdias;
    public javax.swing.JComboBox<String> cbedad;
    private javax.swing.JComboBox<String> cbhorajueves;
    private javax.swing.JComboBox<String> cbhoralunes;
    private javax.swing.JComboBox<String> cbhoramartes;
    private javax.swing.JComboBox<String> cbhoramiercoles;
    private javax.swing.JComboBox<String> cbhorasabado;
    private javax.swing.JComboBox<String> cbhoraviernes;
    private javax.swing.JComboBox<String> cbidhorario;
    private javax.swing.JComboBox<String> cbidmaestro;
    private javax.swing.JComboBox<String> cbmaestros;
    private javax.swing.JCheckBox ckjueves;
    private javax.swing.JCheckBox cklunes;
    private javax.swing.JCheckBox ckmartes;
    private javax.swing.JCheckBox ckmiercoles;
    private javax.swing.JCheckBox cksabado;
    private javax.swing.JCheckBox cktutor;
    private javax.swing.JCheckBox ckviernes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel jpcamara;
    public javax.swing.JLabel lblfotousuario;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblregistros;
    private javax.swing.JLabel lbltutor;
    private javax.swing.JTable tdatos;
    public javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbuscar;
    public javax.swing.JTextField txtcelular;
    public javax.swing.JTextField txteliminar;
    private com.toedter.calendar.JDateChooser txtfechainicio;
    private com.toedter.calendar.JDateChooser txtfechatermino;
    private javax.swing.JTextField txtfolio;
    public javax.swing.JTextField txtidusuario;
    public javax.swing.JTextField txtlocalidad;
    private javax.swing.JTextField txtmensualidad;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtnombretutor;
    // End of variables declaration//GEN-END:variables
}
