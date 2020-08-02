/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.Eliminarusuarios;
import Consultas.Guardarmodificaciones;
import Consultas.Renovar;
import Consultas.inscripcion;
import Consultas.tabla;
import com.toedter.calendar.JDateChooser;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import newscomponents.RSDateChooser;

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
    int dias = 1;
    int diacero = 0, diauno = 1, diados = 2, diatres = 3, diacuatro = 4, diacinco = 5;
    int resultado = -1;
    int r = 0;

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

    public Inscripciones() {
        Calendar calendario = Calendar.getInstance();
//        this.setContentPane(fondo);
        initComponents();
        lbltutor.setVisible(false);
        txtnombretutor.setVisible(false);
        habilitarhoras(false);
        btneditardatos.setEnabled(false);
        btnrenovar.setEnabled(false);
//        btnguardar.setEnabled(false);
        txtidusuario.setEnabled(false);
        txtidusuario.setVisible(false);
        txtmensualidad.setVisible(false);
        txteliminar.setVisible(false);
        btnguardarmodificaciones.setEnabled(false);
        btnguardarrenovacion.setEnabled(false);
        cbclaves.setVisible(false);
        cbidus.setVisible(false);
        mostrar("");
        marcarcalendar(new Date());
        llenarclaves();
        System.out.println("es: " + cbclaves.getItemCount());
        System.out.println(calendario.get(Calendar.HOUR_OF_DAY) + ":00 - " + (calendario.get(Calendar.HOUR_OF_DAY) + 1) + ":00");
        this.setLocationRelativeTo(null);
        ((JTextField) this.txtfechanacimiento.getDateEditor()).setEditable(false);
        ((JTextField) this.txtfechainicio.getDateEditor()).setEditable(false);
        ((JTextField) this.txtfechatermino.getDateEditor()).setEditable(false);
    }

    public void llenarclaves() {
        tabla tb = new tabla();
        tb.consultarclaves(cbclaves);
        tb.consultarids(cbidus);
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
        System.out.println("dia de la semana: " + i);
        txtfechainicio.getJCalendar().setMinSelectableDate(new Date());
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
        txtnombre.setEnabled(valor);
        txtapellidos.setEnabled(valor);
        txtnombretutor.setEnabled(valor);
        txtfechanacimiento.setEnabled(valor);

    }

    public void habilitarcamposdatosdireccion(boolean valor) {

        txtlocalidad.setEnabled(valor);
        txtcalle.setEnabled(valor);
        txtnumex.setEnabled(valor);
        txtnumin.setEnabled(valor);
        txttelefono.setEnabled(valor);
        txtcelular.setEnabled(valor);

    }

    public void limpiar() {
        txtnombre.setText("");
        txtapellidos.setText("");
        txtnombretutor.setText("");
        txtnombretutor.setVisible(false);
        txtnombretutor.setEnabled(false);
        cktutor.setSelected(false);
        txtlocalidad.setText("");
        txtcalle.setText("");
        txtnumex.setText("");
        txtnumin.setText("");
        txttelefono.setText("");
        txtcelular.setText("");
        txtfechanacimiento.setDate(StringaDate(""));
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
            calendar.add(Calendar.DAY_OF_YEAR, 21 + ultimo);
            if (jd.getDate() != null) {
                txtfechatermino.getJCalendar().setMinSelectableDate(calendar.getTime());
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
            tabla tab = new tabla();
            modelo = tab.mostrar(buscar);

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

        tdatos.getColumnModel().getColumn(12).setMaxWidth(100);
        tdatos.getColumnModel().getColumn(12).setMinWidth(100);
        tdatos.getColumnModel().getColumn(12).setPreferredWidth(100);

        tdatos.getColumnModel().getColumn(13).setMaxWidth(110);
        tdatos.getColumnModel().getColumn(13).setMinWidth(110);
        tdatos.getColumnModel().getColumn(13).setPreferredWidth(110);

        tdatos.getColumnModel().getColumn(14).setMaxWidth(0);
        tdatos.getColumnModel().getColumn(14).setMinWidth(0);
        tdatos.getColumnModel().getColumn(14).setPreferredWidth(0);

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
        jPanelWebCam1 = new JPanelWebCam.JPanelWebCam();
        btneditardatos = new javax.swing.JButton();
        lblclave = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtidusuario = new javax.swing.JTextField();
        txtfechainicio = new com.toedter.calendar.JDateChooser();
        txtfechatermino = new com.toedter.calendar.JDateChooser();
        txtfechanacimiento = new com.toedter.calendar.JDateChooser();
        btnguardarmodificaciones = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnguardarrenovacion = new javax.swing.JButton();
        txtmensualidad = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbclaves = new javax.swing.JComboBox<>();
        txteliminar = new javax.swing.JTextField();
        cbidus = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        lblimagen = new javax.swing.JLabel();
        lblregistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 613));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

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

        lblnombre.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(204, 204, 204));
        lblnombre.setText("Nombre:");
        getContentPane().add(lblnombre);
        lblnombre.setBounds(22, 64, 107, 31);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Apellidos:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(22, 102, 107, 31);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Fecha de inicio:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(22, 403, 139, 25);

        txtnombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre);
        txtnombre.setBounds(220, 60, 230, 30);

        txtapellidos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txtapellidos);
        txtapellidos.setBounds(220, 100, 230, 30);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Localidad:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(22, 224, 107, 31);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Calle:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(22, 261, 107, 31);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("No. exterior:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(22, 298, 117, 31);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("No. interior:*");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(259, 298, 120, 31);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Teléfono:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(22, 335, 107, 31);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Celular:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(259, 335, 107, 31);

        txtlocalidad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtlocalidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtlocalidadKeyTyped(evt);
            }
        });
        getContentPane().add(txtlocalidad);
        txtlocalidad.setBounds(147, 222, 233, 30);

        txtcalle.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtcalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcalleKeyTyped(evt);
            }
        });
        getContentPane().add(txtcalle);
        txtcalle.setBounds(147, 259, 233, 30);

        txtnumin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtnumin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnuminKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumin);
        txtnumin.setBounds(380, 300, 106, 30);

        txtnumex.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtnumex.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnumexKeyTyped(evt);
            }
        });
        getContentPane().add(txtnumex);
        txtnumex.setBounds(150, 300, 100, 30);

        txttelefono.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono);
        txttelefono.setBounds(150, 340, 100, 30);

        txtcelular.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });
        getContentPane().add(txtcelular);
        txtcelular.setBounds(380, 340, 106, 30);

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
        lbltutor.setForeground(new java.awt.Color(204, 204, 204));
        lbltutor.setText("Nombre del tutor:");
        getContentPane().add(lbltutor);
        lbltutor.setBounds(22, 182, 155, 31);

        txtnombretutor.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtnombretutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombretutorKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombretutor);
        txtnombretutor.setBounds(215, 180, 261, 30);

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
        jScrollPane1.setBounds(530, 180, 710, 210);

        txtbuscar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(667, 140, 110, 30);

        btneliminar.setBackground(new java.awt.Color(255, 0, 0));
        btneliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btneliminar.setForeground(new java.awt.Color(204, 204, 204));
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar);
        btneliminar.setBounds(1140, 130, 100, 40);

        btnnuevo.setBackground(new java.awt.Color(255, 204, 0));
        btnnuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo);
        btnnuevo.setBounds(80, 550, 90, 40);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(22, 144, 189, 31);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Fecha de termino:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(430, 400, 160, 31);

        btnguardar.setBackground(new java.awt.Color(51, 255, 0));
        btnguardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnguardar.setText("Guardar nuevo");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(190, 550, 140, 40);

        btnrenovar.setBackground(new java.awt.Color(255, 153, 0));
        btnrenovar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnrenovar.setText("Renovar mensualidad");
        btnrenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrenovarActionPerformed(evt);
            }
        });
        getContentPane().add(btnrenovar);
        btnrenovar.setBounds(770, 550, 200, 40);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Sesiones por semana:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(880, 400, 206, 25);

        cbdias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbdias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cbdias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdiasActionPerformed(evt);
            }
        });
        getContentPane().add(cbdias);
        cbdias.setBounds(1080, 400, 70, 30);

        cbhorasabado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhorasabado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhorasabado);
        cbhorasabado.setBounds(1010, 480, 140, 30);

        cbhoralunes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhoralunes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoralunes);
        cbhoralunes.setBounds(70, 480, 150, 30);

        cbhoramartes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhoramartes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoramartes);
        cbhoramartes.setBounds(260, 480, 150, 30);

        ckmartes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ckmartes.setForeground(new java.awt.Color(255, 255, 255));
        ckmartes.setText("Martes");
        ckmartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmartesActionPerformed(evt);
            }
        });
        getContentPane().add(ckmartes);
        ckmartes.setBounds(260, 450, 140, 31);

        cbhoramiercoles.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhoramiercoles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoramiercoles);
        cbhoramiercoles.setBounds(440, 480, 140, 30);

        cbhorajueves.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhorajueves.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhorajueves);
        cbhorajueves.setBounds(620, 480, 140, 30);

        cbhoraviernes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbhoraviernes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "18:00 - 19:00", "19:00 - 20:00" }));
        getContentPane().add(cbhoraviernes);
        cbhoraviernes.setBounds(810, 480, 150, 30);

        cklunes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cklunes.setForeground(new java.awt.Color(255, 255, 255));
        cklunes.setText("Lunes");
        cklunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cklunesActionPerformed(evt);
            }
        });
        getContentPane().add(cklunes);
        cklunes.setBounds(70, 450, 150, 31);

        ckmiercoles.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ckmiercoles.setForeground(new java.awt.Color(255, 255, 255));
        ckmiercoles.setText("Miércoles");
        ckmiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmiercolesActionPerformed(evt);
            }
        });
        getContentPane().add(ckmiercoles);
        ckmiercoles.setBounds(440, 450, 140, 31);

        ckjueves.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ckjueves.setForeground(new java.awt.Color(255, 255, 255));
        ckjueves.setText("Jueves");
        ckjueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckjuevesActionPerformed(evt);
            }
        });
        getContentPane().add(ckjueves);
        ckjueves.setBounds(620, 450, 140, 31);

        ckviernes.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ckviernes.setForeground(new java.awt.Color(255, 255, 255));
        ckviernes.setText("Viernes");
        ckviernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckviernesActionPerformed(evt);
            }
        });
        getContentPane().add(ckviernes);
        ckviernes.setBounds(810, 450, 150, 31);

        cksabado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cksabado.setForeground(new java.awt.Color(255, 255, 255));
        cksabado.setText("Sábado");
        cksabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cksabadoActionPerformed(evt);
            }
        });
        getContentPane().add(cksabado);
        cksabado.setBounds(1010, 450, 130, 31);

        jPanelWebCam1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanelWebCam1);
        jPanelWebCam1.setBounds(1140, 20, 100, 90);

        btneditardatos.setBackground(new java.awt.Color(255, 153, 0));
        btneditardatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btneditardatos.setText("Editar datos");
        btneditardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditardatosActionPerformed(evt);
            }
        });
        getContentPane().add(btneditardatos);
        btneditardatos.setBounds(420, 550, 130, 40);

        lblclave.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblclave.setForeground(new java.awt.Color(204, 204, 204));
        lblclave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblclave.setText("AYO00");
        getContentPane().add(lblclave);
        lblclave.setBounds(590, 140, 90, 31);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Foto");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1160, 0, 50, 20);
        getContentPane().add(txtidusuario);
        txtidusuario.setBounds(460, 110, 50, 20);

        txtfechainicio.setDateFormatString("yyyy/MM/dd");
        txtfechainicio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtfechainicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtfechainicioPropertyChange(evt);
            }
        });
        getContentPane().add(txtfechainicio);
        txtfechainicio.setBounds(170, 400, 180, 30);

        txtfechatermino.setDateFormatString("yyyy/MM/dd");
        txtfechatermino.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txtfechatermino);
        txtfechatermino.setBounds(590, 400, 170, 30);

        txtfechanacimiento.setDateFormatString("yyyy/MM/dd");
        txtfechanacimiento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(txtfechanacimiento);
        txtfechanacimiento.setBounds(220, 140, 150, 30);

        btnguardarmodificaciones.setBackground(new java.awt.Color(51, 255, 0));
        btnguardarmodificaciones.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnguardarmodificaciones.setText("Guardar");
        btnguardarmodificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarmodificacionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardarmodificaciones);
        btnguardarmodificaciones.setBounds(570, 550, 110, 40);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(720, 540, 30, 60);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(370, 540, 30, 60);

        btnguardarrenovacion.setBackground(new java.awt.Color(51, 255, 0));
        btnguardarrenovacion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnguardarrenovacion.setText("Guardar");
        btnguardarrenovacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarrenovacionActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardarrenovacion);
        btnguardarrenovacion.setBounds(990, 550, 110, 40);
        getContentPane().add(txtmensualidad);
        txtmensualidad.setBounds(460, 80, 20, 20);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Buscar: ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(530, 140, 141, 31);

        jButton2.setBackground(new java.awt.Color(255, 153, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ver eliminados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(970, 130, 150, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 0, 819, 50);

        getContentPane().add(cbclaves);
        cbclaves.setBounds(460, 60, 130, 20);
        getContentPane().add(txteliminar);
        txteliminar.setBounds(590, 100, 6, 20);

        getContentPane().add(cbidus);
        cbidus.setBounds(610, 60, 28, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1160, 490, 90, 90);

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
//        if (diacero == 0) {
//            System.out.println("Es Lunes");
//            checkdias(diacero, 0, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
//                    cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);
//        } else if (diacero == 1) {
//            System.out.println("Es Martes");
//            checkdias(diauno, 1, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
//                    cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);
//        } else if (diacero == 2) {
//            System.out.println("Es Miércoles");
//            checkdias(diados, 2, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
//                    cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);
//        } else if (diacero == 3) {
//            System.out.println("Es Jueves");
//            checkdias(diatres, 3, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
//                    cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);
//
//        } else if (diacero == 4) {
//            System.out.println("Es Viernes");
//            checkdias(diacuatro,4, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
//                    cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);
//
//        } else if (diacero == 5) {
//            System.out.println("Es Sábado");
//            checkdias(diacinco, 5, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
//                    cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);
//
//        }
        System.out.println("diacero: " + diacero);
        checkdias(diacero, dia0, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
                cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);

//        checkdias(diacero, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
//                cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);

    }//GEN-LAST:event_cklunesActionPerformed

    private void ckmartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmartesActionPerformed
//        if (diauno == 0) {
//            System.out.println("Es Lunes");
//            checkdias(diacero, 0, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);
//        } else if (diauno == 1) {
//            System.out.println("Es Martes");
//            checkdias(diauno, 1, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);
//        } else if (diauno == 2) {
//            System.out.println("Es Miércoles");
//            checkdias(diados, 2, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);
//        } else if (diauno == 3) {
//            System.out.println("Es Jueves");
//            checkdias(diatres, 3, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);
//
//        } else if (diauno == 4) {
//            System.out.println("Es Viernes");
//            checkdias(diacuatro, 4, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);
//
//        } else if (diauno == 5) {
//            System.out.println("Es Sabado");
//            checkdias(diacinco, 5, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);
//
//        }
        System.out.println("diauno: " + diauno);
        checkdias(diauno, dia1, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);
//        checkdias(diauno, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
//                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);

    }//GEN-LAST:event_ckmartesActionPerformed

    private void ckmiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmiercolesActionPerformed
//        if (diados == 0) {
//            System.out.println("Es Lunes");
//            checkdias(diacero, 0, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
//                    cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);
//        } else if (diados == 1) {
//            System.out.println("Es Martes");
//            checkdias(diauno, 1, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
//                    cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);
//        } else if (diados == 2) {
//            System.out.println("Es Miércoles");
//            checkdias(diados, 2, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
//                    cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);
//        } else if (diados == 3) {
//            System.out.println("Es Jueves");
//            checkdias(diatres, 3, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
//                    cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);
//
//        } else if (diados == 4) {
//            System.out.println("Es Viernes");
//            checkdias(diacuatro, 4, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
//                    cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);
//
//        } else if (diados == 5) {
//            System.out.println("Es Sábado");
//            checkdias(diacinco, 5, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
//                    cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);
//
//        }
        System.out.println("diados: " + diados);
        checkdias(diados, dia2, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
                cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);
//        checkdias(diados, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
//                cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);

    }//GEN-LAST:event_ckmiercolesActionPerformed

    private void ckjuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckjuevesActionPerformed
//        if (diatres == 0) {
//            System.out.println("Es Lunes");
//            checkdias(diacero, 0, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
//                    cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);
//        } else if (diatres == 1) {
//            System.out.println("Es Martes");
//            checkdias(diauno, 1, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
//                    cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);
//        } else if (diatres == 2) {
//            System.out.println("Es Miércoles");
//            checkdias(diados, 2, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
//                    cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);
//        } else if (diatres == 3) {
//            System.out.println("Es Jueves");
//            checkdias(diatres, 3, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
//                    cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);
//
//        } else if (diatres == 4) {
//            System.out.println("Es Viernes");
//            checkdias(diacuatro, 4, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
//                    cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);
//
//        } else if (diatres == 5) {
//            System.out.println("Es Sábado");
//            checkdias(diacinco, 5, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
//                    cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);
//
//        }
        System.out.println("diatres: " + diatres);
        checkdias(diatres, dia3, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
                cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);
//        checkdias(diatres, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
//                cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);

    }//GEN-LAST:event_ckjuevesActionPerformed

    private void ckviernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckviernesActionPerformed
//        if (diacuatro == 0) {
//            System.out.println("Es Lunes");
//            checkdias(diacero, 0, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);
//        } else if (diacuatro == 1) {
//            System.out.println("Es Martes");
//            checkdias(diauno, 1, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);
//        } else if (diacuatro == 2) {
//            System.out.println("Es Miércoles");
//            checkdias(diados, 2, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);
//        } else if (diacuatro == 3) {
//            System.out.println("Es Jueves");
//            checkdias(diatres, 3, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);
//
//        } else if (diacuatro == 4) {
//            System.out.println("Es Viernes");
//            checkdias(diacuatro, 4, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);
//
//        } else if (diacuatro == 5) {
//            System.out.println("Es Sábado");
//            checkdias(diacinco, 5, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);
//
//        }
        System.out.println("diacuatro: " + diacuatro);
        checkdias(diacuatro, dia4, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);
//        checkdias(diacuatro, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
//                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);

    }//GEN-LAST:event_ckviernesActionPerformed

    private void cksabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cksabadoActionPerformed
//        if (diacinco == 0) {
//            System.out.println("Es Lunes");
//            checkdias(diacero, 0, ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado, cbhorasabado);
//        } else if (diacinco == 1) {
//            System.out.println("Es Martes");
//            checkdias(diauno, 1, ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado, cbhorasabado);
//        } else if (diacinco == 2) {
//            System.out.println("Es Miércoles");
//            checkdias(diados, 2, ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado, cbhorasabado);
//        } else if (diacinco == 3) {
//            System.out.println("Es Jueves");
//            checkdias(diatres, 3, ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado, cbhorasabado);
//
//        } else if (diacinco == 4) {
//            System.out.println("Es Viernes");
//            checkdias(diacuatro, 4, ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado, cbhorasabado);
//
//        } else if (diacinco == 5) {
//            System.out.println("Es Sábado");
//            checkdias(diacinco, 5, ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
//                    cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado, cbhorasabado);
//
//        }
        System.out.println("diacinco: " + diacinco);
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
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[4] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[5] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 1) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[4] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 2) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 3) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[4] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 4) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[3] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[4] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 5) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[2] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[3] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[4] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
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
                String valor = "";
                String cha = "" + combohoras[masuno[0]].charAt(0) + combohoras[masuno[0]].charAt(1);
                if (cha.charAt(0) == '9') {
                    valor = "9";
                } else {
                    valor = cha;
                }
                int nm = Integer.parseInt(valor);
                re.insertardiasmes(unasesion, unasesionmes, diamasuno[0], r, combohoras[masuno[0]], nm);
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado días, hazlo por favor!");
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
                    String valor = "";
                    String cha = "" + combohoras[masdos[i]].charAt(0) + combohoras[masdos[i]].charAt(1);
                    if (cha.charAt(0) == '9') {
                        valor = "9";
                    } else {
                        valor = cha;
                    }
                    int nm = Integer.parseInt(valor);
                    re.insertardiasmes(val, mess, diamasdos[i], r, combohoras[masdos[i]], nm);
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado todos los días, hazlo por favor!");
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
                    String valor = "";
                    String cha = "" + combohoras[mastres[i]].charAt(0) + combohoras[mastres[i]].charAt(1);
                    if (cha.charAt(0) == '9') {
                        valor = "9";
                    } else {
                        valor = cha;
                    }
                    int nm = Integer.parseInt(valor);
                    re.insertardiasmes(val, mess, diamastres[i], r, combohoras[mastres[i]], nm);
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado todos los días, hazlo por favor!");

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
                    re.insertardiasmes(val, mess, diamascuatro[i], r, combohoras[mascuatro[i]], nm);
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado todos los días, hazlo por favor!");
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
                    String valor = "";
                    String cha = "" + combohoras[mascinco[i]].charAt(0) + combohoras[mascinco[i]].charAt(1);
                    if (cha.charAt(0) == '9') {
                        valor = "9";
                    } else {
                        valor = cha;
                    }
                    int nm = Integer.parseInt(valor);
                    re.insertardiasmes(val, mess, diamascinco[i], r, combohoras[mascinco[i]], nm);
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado todos los días, hazlo por favor!");
            }

        }
        //            System.out.println("A mitad");
        if (resultado == 1) {
            dias = 1;
            inscripcion ins = new inscripcion();
            r = re.idmensualidad();
            //                System.out.println("antes de::::::::::");
            boolean v = ins.insertardias(cbidus.getItemAt(0), cbclaves.getItemAt(0), txtnombre.getText(), txtapellidos.getText(), obtenerfechanacimiento(txtfechanacimiento), txtlocalidad.getText(),
                    txtcalle.getText(), txtnumex.getText(), txtnumin.getText(), txttelefono.getText(), txtcelular.getText(),
                    txtnombretutor.getText(), r);
            if (v == true) {
                if (txteliminar.getText().equals("")) {
                    //                        System.out.println("---------------------------------------vacío el de eliminar");
                } else {

                    Eliminarusuarios elus = new Eliminarusuarios();
                    elus.cambiardatosdetabla(Integer.parseInt(txteliminar.getText()));
                    //                        System.out.println("------------------------------------------Se eliminó en la tabla de usuarios eliminados");
                }

                habilitarcamposmensualidad(true);
                habilitarhoras(false);
                deseleccionarckdias(false);
                reiniciarcombos(0);
                inicializarvariables();
                limpiar();
                mostrar("");
                cbclaves.removeAllItems();
                cbidus.removeAllItems();
                llenarclaves();
                marcarcalendar(new Date());
            }

        }
    }
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
//        txtfechatermino.setDate(StringaDate("2018/02/12"));

        if (txtnombre.getText().equals("") | txtapellidos.getText().equals("") | txtfechanacimiento.getDate() == null
                | txtlocalidad.getText().equals("") | txtcalle.getText().equals("") | txtnumex.getText().equals("")
                | txttelefono.getText().equals("") | txtcelular.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos solicitados");
        } else {
            if (cktutor.isSelected()) {
                if (txtnombretutor.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Completa todos los campos solicitados");
                } else {
                    guardar();
                }
            } else {
                guardar();
            }
        }


    }//GEN-LAST:event_btnguardarActionPerformed

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked
        habilitarcamposdatopersonal(false);
        habilitarcamposdatosdireccion(false);
        habilitarcamposmensualidad(false);
        deseleccionarckdias(false);
        habilitarhoras(false);
//        btneliminar.setEnabled(true);
//        accion="editar";

        int fila = tdatos.rowAtPoint(evt.getPoint());
        txtidusuario.setText(tdatos.getValueAt(fila, 0).toString());
        txtnombre.setText(tdatos.getValueAt(fila, 2).toString());
        txtapellidos.setText(tdatos.getValueAt(fila, 3).toString());
//        txtfechatermino.setDate(StringaDate("2018/02/12"));
        txtfechanacimiento.setDate(StringaDate(tdatos.getValueAt(fila, 4).toString()));
        if (tdatos.getValueAt(fila, 11).toString().equals("")) {
            cktutor.setEnabled(false);
            cktutor.setSelected(false);
            txtnombretutor.setVisible(false);
            txtnombretutor.setEnabled(false);
        } else {
            txtnombretutor.setText(tdatos.getValueAt(fila, 11).toString());
            txtnombretutor.setVisible(true);
            txtnombretutor.setEnabled(false);
            cktutor.setSelected(true);
            cktutor.setEnabled(false);
        }

        txtlocalidad.setText(tdatos.getValueAt(fila, 5).toString());
        txtcalle.setText(tdatos.getValueAt(fila, 6).toString());
        txtnumex.setText(tdatos.getValueAt(fila, 7).toString());
        txtnumin.setText(tdatos.getValueAt(fila, 8).toString());
        txttelefono.setText(tdatos.getValueAt(fila, 9).toString());
        txtcelular.setText(tdatos.getValueAt(fila, 10).toString());
        txtfechainicio.setDate(StringaDate(tdatos.getValueAt(fila, 12).toString()));
//        txtfechatermino.setDate(StringaDate(tdatos.getValueAt(fila, 13).toString()));
        txtmensualidad.setText(tdatos.getValueAt(fila, 14).toString());
        btneditardatos.setEnabled(true);
        btnrenovar.setEnabled(true);
        btnguardar.setEnabled(false);
        btnguardarmodificaciones.setEnabled(false);
        btnguardarrenovacion.setEnabled(false);

    }//GEN-LAST:event_tdatosMouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitarcamposdatopersonal(true);
        habilitarcamposdatosdireccion(true);
        limpiar();
        reiniciarcombos(0);
        habilitarcamposmensualidad(true);
        habilitarhoras(false);
        inicializarvariables();
        marcarcalendar(new Date());
        cbdias.setSelectedIndex(0);
        deseleccionarckdias(false);
        btneditardatos.setEnabled(false);
        btnrenovar.setEnabled(false);
        btnguardar.setEnabled(true);
        btnguardarmodificaciones.setEnabled(false);


    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btneditardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditardatosActionPerformed
        habilitarcamposdatosdireccion(true);
        btnguardarmodificaciones.setEnabled(true);
    }//GEN-LAST:event_btneditardatosActionPerformed

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

    private void btnrenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrenovarActionPerformed
        habilitarcamposmensualidad(true);
        btnguardarrenovacion.setEnabled(true);
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
        btneditardatos.setEnabled(false);
        btnrenovar.setEnabled(false);
        btnguardar.setEnabled(true);
        btnguardarmodificaciones.setEnabled(false);
        mostrar("");
        marcarcalendar(new Date());
        cbclaves.removeAllItems();
        cbidus.removeAllItems();
        llenarclaves();

    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtfechainicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtfechainicioPropertyChange
        txtfechatermino.setDate(StringaDate(obtenerfecha(txtfechainicio, 0)));

//        marcarcalendar(new Date());
        if (txtfechainicio.getDate() != null) {
            marcarcalendar(txtfechainicio.getDate());
        }

    }//GEN-LAST:event_txtfechainicioPropertyChange

    private void btnguardarmodificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarmodificacionesActionPerformed
        Guardarmodificaciones gm = new Guardarmodificaciones();
        gm.Actualizar(txtlocalidad.getText(), txtcalle.getText(), txtnumex.getText(), txtnumin.getText(), txttelefono.getText(),
                txtcelular.getText(), Integer.parseInt(txtidusuario.getText()));
        btnguardarmodificaciones.setEnabled(false);
        habilitarcamposdatosdireccion(false);
        marcarcalendar(new Date());
        mostrar("");
    }//GEN-LAST:event_btnguardarmodificacionesActionPerformed

    private void btnguardarrenovacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarrenovacionActionPerformed

        //Empieza la renovación
        Renovar re = new Renovar();
        if (diacero == 0) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[4] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[5] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 1) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[4] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 2) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 3) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[4] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 4) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[3] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[4] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        } else if (diacero == 5) {
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[2] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[3] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[4] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[5] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[6] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
        }
        if (dias == 1) {
            if (masuno[0] != -1) {
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
                String valor = "";
                String cha = "" + combohoras[masuno[0]].charAt(0) + combohoras[masuno[0]].charAt(1);
                if (cha.charAt(0) == '9') {
                    valor = "9";
                } else {
                    valor = cha;
                }
                int nm = Integer.parseInt(valor);
                re.eliminardiasmes(Integer.parseInt(txtmensualidad.getText()));
                re.insertardiasmes(unasesion, unasesionmes, diamasuno[0], Integer.parseInt(txtmensualidad.getText()),
                        combohoras[masuno[0]], nm);
                resultado = 1;
//                re.renovardiasmes(Integer.parseInt(txtmensualidad.getText()), unasesion, masuno[0], combohoras[masuno[0]]);
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado días, hazlo por favor!");
            }
        } else if (dias == 2) {
            if (masdos[0] != -1 & masdos[1] != -1) {
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
                    String valor = "";
                    String cha = "" + combohoras[masdos[i]].charAt(0) + combohoras[masdos[i]].charAt(1);
                    if (cha.charAt(0) == '9') {
                        valor = "9";
                    } else {
                        valor = cha;
                    }
                    int nm = Integer.parseInt(valor);
//                    re.renovardiasmes(Integer.parseInt(txtmensualidad.getText()), val, masdos[i], combohoras[masdos[i]]);
                    re.insertardiasmes(val, mess, diamasdos[i], Integer.parseInt(txtmensualidad.getText()), combohoras[masdos[i]], nm);
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado todos los días, hazlo por favor!");
            }
        } else if (dias == 3) {
            if (mastres[0] != -1 & mastres[1] != -1 & mastres[2] != -1) {

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
                    String valor = "";
                    String cha = "" + combohoras[mastres[i]].charAt(0) + combohoras[mastres[i]].charAt(1);
                    if (cha.charAt(0) == '9') {
                        valor = "9";
                    } else {
                        valor = cha;
                    }
                    int nm = Integer.parseInt(valor);
                    re.insertardiasmes(val, mess, diamastres[i], Integer.parseInt(txtmensualidad.getText()),
                            combohoras[mastres[i]], nm);
//                    re.renovardiasmes(Integer.parseInt(txtmensualidad.getText()), val, mastres[i], combohoras[mastres[i]]);
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado todos los días, hazlo por favor!");

            }
        } else if (dias == 4) {
            if (mascuatro[0] != -1 & mascuatro[1] != -1 & mascuatro[2] != -1 & mascuatro[3] != -1) {
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
                            combohoras[mascuatro[i]], nm);
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado todos los días, hazlo por favor!");
            }
        } else if (dias == 5) {
            if (mascinco[0] != -1 & mascinco[1] != -1 & mascinco[2] != -1 & mascinco[3] != -1 & mascinco[4] != -1) {
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
                    String valor = "";
                    String cha = "" + combohoras[mascinco[i]].charAt(0) + combohoras[mascinco[i]].charAt(1);
                    if (cha.charAt(0) == '9') {
                        valor = "9";
                    } else {
                        valor = cha;
                    }
                    int nm = Integer.parseInt(valor);
//                    re.renovardiasmes(Integer.parseInt(txtmensualidad.getText()), val, mascinco[i], combohoras[mascinco[i]]);
                    re.insertardiasmes(val, mess, diamascinco[i], Integer.parseInt(txtmensualidad.getText()),
                            combohoras[mascinco[i]], nm);
                }
                resultado = 1;
            } else {
                resultado = -1;
                JOptionPane.showMessageDialog(this, "No se han seleccionado todos los días, hazlo por favor!");
            }

        }
        if (resultado == 1) {
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
            cbclaves.removeAllItems();
            cbidus.removeAllItems();
            llenarclaves();
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
    private void txtnumexKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumexKeyTyped
        if (txtnumex.getText().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnumexKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        SoloNumeros(evt);
        if (txttelefono.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtnuminKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnuminKeyTyped
        if (txtnumin.getText().length() == 5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnuminKeyTyped

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

    private void txtcalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcalleKeyTyped
        if (txtcalle.getText().length() == 34) {
            evt.consume();
        }
    }//GEN-LAST:event_txtcalleKeyTyped

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
    private javax.swing.JButton btneditardatos;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarmodificaciones;
    private javax.swing.JButton btnguardarrenovacion;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnrenovar;
    private javax.swing.JComboBox<String> cbclaves;
    private javax.swing.JComboBox<String> cbdias;
    private javax.swing.JComboBox<String> cbhorajueves;
    private javax.swing.JComboBox<String> cbhoralunes;
    private javax.swing.JComboBox<String> cbhoramartes;
    private javax.swing.JComboBox<String> cbhoramiercoles;
    private javax.swing.JComboBox<String> cbhorasabado;
    private javax.swing.JComboBox<String> cbhoraviernes;
    private javax.swing.JComboBox<String> cbidus;
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblclave;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblregistros;
    private javax.swing.JLabel lbltutor;
    private javax.swing.JTable tdatos;
    public javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbuscar;
    public javax.swing.JTextField txtcalle;
    public javax.swing.JTextField txtcelular;
    public javax.swing.JTextField txteliminar;
    private com.toedter.calendar.JDateChooser txtfechainicio;
    public com.toedter.calendar.JDateChooser txtfechanacimiento;
    private com.toedter.calendar.JDateChooser txtfechatermino;
    private javax.swing.JTextField txtidusuario;
    public javax.swing.JTextField txtlocalidad;
    private javax.swing.JTextField txtmensualidad;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtnombretutor;
    public javax.swing.JTextField txtnumex;
    public javax.swing.JTextField txtnumin;
    public javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
