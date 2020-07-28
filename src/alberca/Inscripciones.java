/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.Eliminarusuarios;
import Consultas.Renovar;
import Consultas.conexion;
import Consultas.inscripcion;
import Consultas.tabla;
import com.toedter.calendar.JDateChooser;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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
    SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
    int dias = 1;
    int r = 0;
    int masuno[] = new int[1];
    int unasesion[] = new int[4];
    int contardos = 0, dos = 0;
    int masdos[] = new int[2];
    int dossesion[][] = new int[2][4];
    int contartres = 0, tres = 0;
    int mastres[] = new int[3];
    int tressesion[][] = new int[3][4];
    int contarcuatro = 0, cuatro = 0;
    int mascuatro[] = new int[4];
    int cuatrosesion[][] = new int[4][4];
    int contarcinco = 0, cinco = 0;
    int mascinco[] = new int[5];
    int cincosesion[][] = new int[5][4];

    //variables para horas de combos
    String combohoras[] = new String[6];

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
        this.setContentPane(fondo);
        initComponents();
        lbltutor.setVisible(false);
        txtnombretutor.setVisible(false);
        habilitarhoras(false);
        btneditardatos.setEnabled(false);
        btnrenovar.setEnabled(false);
//        btnguardar.setEnabled(false);
        txtidusuario.setEnabled(false);
        mostrar("");
        txtfechainicio.setDate(new Date());

        this.setLocationRelativeTo(null);
    }

    public void checkdias(int numero, JCheckBox check1, JCheckBox check2, JCheckBox check3, JCheckBox check4, JCheckBox check5,
            JCheckBox checkprincipal, JComboBox cb1, JComboBox cb2, JComboBox cb3, JComboBox cb4, JComboBox cb5,
            JComboBox cbprincipal, JComboBox chora) {
        if (dias == 1) {
            if (checkprincipal.isSelected() == true) {

                masuno[0] = numero;
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
                        masdos[i] = numero;
                        break;
                    } else if (contardos == 2) {

                        if (dos == i & i == 0) {
                            diasdos[i].setSelected(false);
                            diasdos[i] = checkprincipal;
                            combodos[i].setEnabled(false);
                            combodos[i] = cbprincipal;
                            combodos[i].setEnabled(true);
                            masdos[i] = numero;
                            dos = i + 1;
                            break;
                        } else if (dos == i & i == 1) {
                            diasdos[i].setSelected(false);
                            diasdos[i] = checkprincipal;
                            combodos[i].setEnabled(false);
                            combodos[i] = cbprincipal;
                            combodos[i].setEnabled(true);
                            masdos[i] = numero;
                            dos = i - 1;
                            break;
                        }

                    }
                }
            } else {
                for (int i = 0; i < 2; i++) {
                    if (checkprincipal == diasdos[i]) {
                        diasdos[i] = null;
                        masdos[i] = 0;
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
                        mastres[i] = numero;
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
                            mastres[i] = numero;
                            tres = i + 1;

                            break;
                        } else if (tres == i & i == 1) {
                            diastres[i].setSelected(false);
                            diastres[i] = checkprincipal;
                            combotres[i].setEnabled(false);
                            combotres[i] = cbprincipal;
                            combotres[i].setEnabled(true);
                            mastres[i] = numero;
                            tres = i + 1;
                            break;
                        } else if (tres == i & i == 2) {
                            diastres[i].setSelected(false);
                            diastres[i] = checkprincipal;
                            combotres[i].setEnabled(false);
                            combotres[i] = cbprincipal;
                            combotres[i].setEnabled(true);
                            mastres[i] = numero;
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
                        mastres[i] = 0;
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
                        mascuatro[i] = numero;
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
                            mascuatro[i] = numero;
                            cuatro = i + 1;
                            break;
                        } else if (cuatro == i & i == 1) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            mascuatro[i] = numero;
                            cuatro = i + 1;

                            break;
                        } else if (cuatro == i & i == 2) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            mascuatro[i] = numero;
                            cuatro = i + 1;

                            break;
                        } else if (cuatro == i & i == 3) {
                            diascuatro[i].setSelected(false);
                            diascuatro[i] = checkprincipal;
                            combocuatro[i].setEnabled(false);
                            combocuatro[i] = cbprincipal;
                            combocuatro[i].setEnabled(true);
                            mascuatro[i] = numero;
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
                        mascuatro[i] = 0;
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
                        mascinco[i] = numero;
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
                            mascinco[i] = numero;
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 1) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            mascinco[i] = numero;
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 2) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            mascinco[i] = numero;
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 3) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            mascinco[i] = numero;
                            cinco = i + 1;
                            break;
                        } else if (cinco == i & i == 4) {
                            diascinco[i].setSelected(false);
                            diascinco[i] = checkprincipal;
                            combocinco[i].setEnabled(false);
                            combocinco[i] = cbprincipal;
                            combocinco[i].setEnabled(true);
                            mascinco[i] = numero;
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
                        mascinco[i] = 0;
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

    public void habilitarcamposdatos(boolean valor) {
        txtnombre.setEnabled(valor);
        txtapellidos.setEnabled(valor);
        txtnombretutor.setEnabled(valor);
        txtlocalidad.setEnabled(valor);
        txtcalle.setEnabled(valor);
        txtnumex.setEnabled(valor);
        txtnumin.setEnabled(valor);
        txttelefono.setEnabled(valor);
        txtcelular.setEnabled(valor);
        txtfechanacimiento.setEnabled(valor);

    }

    public void limpiar() {
        txtnombre.setText("");
        txtapellidos.setText("");
        txtnombretutor.setText("");
        txtlocalidad.setText("");
        txtcalle.setText("");
        txtnumex.setText("");
        txtnumin.setText("");
        txttelefono.setText("");
        txtcelular.setText("");
        txtfechanacimiento.setDate(StringaDate(""));
        txtfechainicio.setDate(new Date());

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
        masuno[0] = 0;
        contartres = 0;
        tres = 0;
        contarcuatro = 0;
        cuatro = 0;
        contarcinco = 0;
        cinco = 0;

        for (int i = 0; i < 2; i++) {
            diasdos[i] = null;
            combodos[i] = null;
            masdos[i] = 0;
        }
        for (int i = 0; i < 3; i++) {
            diastres[i] = null;
            combotres[i] = null;
            mastres[i] = 0;
        }

        for (int i = 0; i < 4; i++) {
            diascuatro[i] = null;
            combocuatro[i] = null;
            mascuatro[i] = 0;
            unasesion[i] = 0;
        }
        for (int i = 0; i < 5; i++) {
            diascinco[i] = null;
            combocinco[i] = null;
            mascinco[i] = 0;
        }
    }

    public String obtenerfechastr(JDateChooser jd, int mas) {
        if (jd.getDate() == null) {
            return "";
        } else {
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
            fechaselec = jd.getDate();
            Calendar calendar = Calendar.getInstance();
            System.out.println("Fecha a poner ultimo -> " + jd.getDate());
            calendar.setTime(jd.getDate());
            calendar.add(Calendar.DAY_OF_YEAR, 21 + ultimo);
            if (jd.getDate() != null) {
                txtfechatermino.getJCalendar().setMinSelectableDate(calendar.getTime());
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
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
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
        tdatos = new javax.swing.JTable();
        lblregistros = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btneliminar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnrenovar = new javax.swing.JButton();
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
        btneditardatos = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtidusuario = new javax.swing.JTextField();
        txtidultimousuario = new javax.swing.JTextField();
        txtfechainicio = new com.toedter.calendar.JDateChooser();
        txtfechatermino = new com.toedter.calendar.JDateChooser();
        txtfechanacimiento = new com.toedter.calendar.JDateChooser();
        btnhoras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1117, 613));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 255));
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
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Inscripción");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 0, 209, 54);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(22, 64, 107, 31);

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
        getContentPane().add(txtnombre);
        txtnombre.setBounds(220, 60, 230, 30);

        txtapellidos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
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
        getContentPane().add(txtlocalidad);
        txtlocalidad.setBounds(147, 222, 233, 30);

        txtcalle.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txtcalle);
        txtcalle.setBounds(147, 259, 233, 30);

        txtnumin.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txtnumin);
        txtnumin.setBounds(380, 300, 106, 30);

        txtnumex.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txtnumex);
        txtnumex.setBounds(150, 300, 100, 30);

        txttelefono.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        getContentPane().add(txttelefono);
        txttelefono.setBounds(150, 340, 100, 30);

        txtcelular.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
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
        tdatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tdatos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 180, 583, 210);

        lblregistros.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblregistros.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(lblregistros);
        lblregistros.setBounds(1000, 390, 70, 20);

        txtbuscar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });
        getContentPane().add(txtbuscar);
        txtbuscar.setBounds(630, 140, 97, 30);

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
        btneliminar.setBounds(970, 140, 100, 30);

        btnnuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnnuevo.setForeground(new java.awt.Color(51, 51, 51));
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo);
        btnnuevo.setBounds(60, 550, 90, 40);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(22, 144, 189, 31);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Fecha de termino:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(361, 402, 160, 31);

        btnguardar.setBackground(new java.awt.Color(51, 255, 0));
        btnguardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar);
        btnguardar.setBounds(330, 550, 90, 40);

        btnrenovar.setBackground(new java.awt.Color(255, 153, 0));
        btnrenovar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnrenovar.setText("Renovar mensualidad");
        btnrenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrenovarActionPerformed(evt);
            }
        });
        getContentPane().add(btnrenovar);
        btnrenovar.setBounds(590, 550, 200, 40);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
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

        cklunes.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cklunes.setForeground(new java.awt.Color(204, 204, 204));
        cklunes.setText("Lunes");
        cklunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cklunesActionPerformed(evt);
            }
        });
        getContentPane().add(cklunes);
        cklunes.setBounds(80, 450, 80, 27);

        ckmartes.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ckmartes.setForeground(new java.awt.Color(204, 204, 204));
        ckmartes.setText("Martes");
        ckmartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmartesActionPerformed(evt);
            }
        });
        getContentPane().add(ckmartes);
        ckmartes.setBounds(220, 450, 90, 27);

        ckmiercoles.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ckmiercoles.setForeground(new java.awt.Color(204, 204, 204));
        ckmiercoles.setText("Miércoles");
        ckmiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckmiercolesActionPerformed(evt);
            }
        });
        getContentPane().add(ckmiercoles);
        ckmiercoles.setBounds(370, 450, 120, 27);

        ckjueves.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ckjueves.setForeground(new java.awt.Color(204, 204, 204));
        ckjueves.setText("Jueves");
        ckjueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckjuevesActionPerformed(evt);
            }
        });
        getContentPane().add(ckjueves);
        ckjueves.setBounds(530, 450, 100, 27);

        ckviernes.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ckviernes.setForeground(new java.awt.Color(204, 204, 204));
        ckviernes.setText("Viernes");
        ckviernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckviernesActionPerformed(evt);
            }
        });
        getContentPane().add(ckviernes);
        ckviernes.setBounds(680, 450, 100, 27);

        cksabado.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        cksabado.setForeground(new java.awt.Color(204, 204, 204));
        cksabado.setText("Sábado");
        cksabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cksabadoActionPerformed(evt);
            }
        });
        getContentPane().add(cksabado);
        cksabado.setBounds(820, 450, 100, 27);

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

        btneditardatos.setBackground(new java.awt.Color(51, 255, 0));
        btneditardatos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btneditardatos.setText("Editar datos");
        btneditardatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditardatosActionPerformed(evt);
            }
        });
        getContentPane().add(btneditardatos);
        btneditardatos.setBounds(440, 550, 130, 40);

        btncancelar.setBackground(new java.awt.Color(255, 0, 0));
        btncancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(204, 204, 204));
        btncancelar.setText("Limpiar campos");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar);
        btncancelar.setBounds(160, 550, 160, 40);

        jLabel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Buscar: AYO00");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(490, 140, 141, 31);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Foto");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(1010, 120, 50, 20);
        getContentPane().add(txtidusuario);
        txtidusuario.setBounds(220, 30, 50, 20);
        getContentPane().add(txtidultimousuario);
        txtidultimousuario.setBounds(290, 30, 6, 20);

        txtfechainicio.setDateFormatString("yyyy/MM/dd");
        txtfechainicio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtfechainicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtfechainicioPropertyChange(evt);
            }
        });
        getContentPane().add(txtfechainicio);
        txtfechainicio.setBounds(170, 400, 140, 30);

        txtfechatermino.setDateFormatString("yyyy/MM/dd");
        txtfechatermino.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(txtfechatermino);
        txtfechatermino.setBounds(530, 400, 140, 30);

        txtfechanacimiento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(txtfechanacimiento);
        txtfechanacimiento.setBounds(220, 140, 150, 30);

        btnhoras.setText("jButton2");
        btnhoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhorasActionPerformed(evt);
            }
        });
        getContentPane().add(btnhoras);
        btnhoras.setBounds(460, 430, 73, 23);

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

        checkdias(0, ckmartes, ckmiercoles, ckjueves, ckviernes, cksabado, cklunes,
                cbhoramartes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoralunes, cbhoralunes);


    }//GEN-LAST:event_cklunesActionPerformed

    private void ckmartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmartesActionPerformed
        checkdias(1, cklunes, ckmiercoles, ckjueves, ckviernes, cksabado, ckmartes,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramartes, cbhoramartes);

    }//GEN-LAST:event_ckmartesActionPerformed

    private void ckmiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckmiercolesActionPerformed
        checkdias(2, cklunes, ckmartes, ckjueves, ckviernes, cksabado, ckmiercoles,
                cbhoralunes, cbhoramartes, cbhorajueves, cbhoraviernes, cbhorasabado, cbhoramiercoles, cbhoramiercoles);

    }//GEN-LAST:event_ckmiercolesActionPerformed

    private void ckjuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckjuevesActionPerformed
        checkdias(3, ckmartes, ckmiercoles, cklunes, ckviernes, cksabado, ckjueves,
                cbhoralunes, cbhoramiercoles, cbhoramartes, cbhoraviernes, cbhorasabado, cbhorajueves, cbhorajueves);

    }//GEN-LAST:event_ckjuevesActionPerformed

    private void ckviernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckviernesActionPerformed
        checkdias(4, ckmartes, ckmiercoles, ckjueves, cklunes, cksabado, ckviernes,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoramartes, cbhorasabado, cbhoraviernes, cbhoraviernes);

    }//GEN-LAST:event_ckviernesActionPerformed

    private void cksabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cksabadoActionPerformed
        checkdias(5, ckmartes, ckmiercoles, ckjueves, ckviernes, cklunes, cksabado,
                cbhoralunes, cbhoramiercoles, cbhorajueves, cbhoraviernes, cbhoramartes, cbhorasabado, cbhorasabado);

    }//GEN-LAST:event_cksabadoActionPerformed

    private void cbdiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdiasActionPerformed

        dias = cbdias.getSelectedIndex() + 1;
        deseleccionarckdias(false);
        habilitarhoras(false);
//        System.out.println("item = "+dias);
        inicializarvariables();


    }//GEN-LAST:event_cbdiasActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
//        txtfechatermino.setDate(StringaDate("2018/02/12"));

        if (txtnombre.getText().equals("")|txtapellidos.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos solicitados");
        } else {
            Renovar re = new Renovar();
            combohoras[0] = cbhoralunes.getItemAt(cbhoralunes.getSelectedIndex());
            combohoras[1] = cbhoramartes.getItemAt(cbhoramartes.getSelectedIndex());
            combohoras[2] = cbhoramiercoles.getItemAt(cbhoramiercoles.getSelectedIndex());
            combohoras[3] = cbhorajueves.getItemAt(cbhorajueves.getSelectedIndex());
            combohoras[4] = cbhoraviernes.getItemAt(cbhoraviernes.getSelectedIndex());
            combohoras[5] = cbhorasabado.getItemAt(cbhorasabado.getSelectedIndex());
            if (dias == 1) {
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, masuno[0]),
                        obtenerfecha(txtfechainicio, masuno[0]), "" + dias);

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(fechaselec);
                calendar.add(Calendar.DAY_OF_MONTH, masuno[0]);
                for (int i = 0; i < 4; i++) {

                    unasesion[i] = calendar.get(Calendar.DAY_OF_MONTH);
                    calendar.add(Calendar.DAY_OF_MONTH, 7);
                }
                int r = re.idmensualidad();
                re.insertardiasmes(unasesion, masuno[0], r, combohoras[masuno[0]]);
            } else if (dias == 2) {
                quicksort(masdos, 0, masdos.length - 1);
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, masdos[0]),
                        obtenerfecha(txtfechainicio, masdos[1]), "" + dias);
                Calendar calendar = Calendar.getInstance();
                for (int i = 0; i < 2; i++) {
                    calendar.setTime(fechaselec);
                    calendar.add(Calendar.DAY_OF_MONTH, masdos[i]);
                    for (int j = 0; j < 4; j++) {

                        dossesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                        calendar.add(Calendar.DAY_OF_MONTH, 7);
                    }
                }
                int val[] = new int[4];
                int r = re.idmensualidad();
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 4; j++) {
                        val[j] = dossesion[i][j];
                    }
                    re.insertardiasmes(val, masdos[i], r, combohoras[masdos[i]]);
                }

            } else if (dias == 3) {
                quicksort(mastres, 0, mastres.length - 1);
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, mastres[0]),
                        obtenerfecha(txtfechainicio, mastres[2]), "" + dias);
                Calendar calendar = Calendar.getInstance();
                for (int i = 0; i < 3; i++) {
                    calendar.setTime(fechaselec);
                    calendar.add(Calendar.DAY_OF_MONTH, mastres[i]);
                    for (int j = 0; j < 4; j++) {

                        tressesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                        calendar.add(Calendar.DAY_OF_MONTH, 7);
                    }
                }
                int val[] = new int[4];
                int r = re.idmensualidad();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        val[j] = tressesion[i][j];
                    }
                    re.insertardiasmes(val, mastres[i], r, combohoras[mastres[i]]);
                }
            } else if (dias == 4) {
                quicksort(mascuatro, 0, mascuatro.length - 1);
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, mascuatro[0]),
                        obtenerfecha(txtfechainicio, mascuatro[3]), "" + dias);
                Calendar calendar = Calendar.getInstance();
                for (int i = 0; i < 4; i++) {
                    calendar.setTime(fechaselec);
                    calendar.add(Calendar.DAY_OF_MONTH, mascuatro[i]);
                    for (int j = 0; j < 4; j++) {

                        cuatrosesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                        calendar.add(Calendar.DAY_OF_MONTH, 7);
                    }
                }
                int val[] = new int[4];
                int r = re.idmensualidad();
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        val[j] = cuatrosesion[i][j];
                    }
                    re.insertardiasmes(val, mascuatro[i], r, combohoras[mascuatro[i]]);
                }
            } else if (dias == 5) {
                quicksort(mascinco, 0, mascinco.length - 1);
                re.insertarmensualidad(obtenerfechastr(txtfechainicio, mascinco[0]),
                        obtenerfecha(txtfechainicio, mascinco[4]), "" + dias);
                Calendar calendar = Calendar.getInstance();
                for (int i = 0; i < 5; i++) {
                    calendar.setTime(fechaselec);
                    calendar.add(Calendar.DAY_OF_MONTH, mascinco[i]);
                    for (int j = 0; j < 4; j++) {

                        cincosesion[i][j] = calendar.get(Calendar.DAY_OF_MONTH);
                        calendar.add(Calendar.DAY_OF_MONTH, 7);
                    }
                }
                int val[] = new int[4];
                r = re.idmensualidad();
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 4; j++) {
                        val[j] = cincosesion[i][j];
                    }
                    re.insertardiasmes(val, mascinco[i], r, combohoras[mascinco[i]]);
                }

            }
            dias = 1;
            System.out.println("resultado de mensu: " + r);
            inscripcion ins = new inscripcion();
            r = re.idmensualidad();
            ins.insertardias(txtnombre.getText(), txtapellidos.getText(), obtenerfechanacimiento(txtfechanacimiento), txtlocalidad.getText(),
                    txtcalle.getText(), txtnumex.getText(), txtnumin.getText(), txttelefono.getText(), txtcelular.getText(),
                    txtnombretutor.getText(), r);
            reiniciarcombos(0);
            inicializarvariables();
            habilitarcamposdatos(true);
            habilitarcamposmensualidad(true);
            habilitarhoras(false);
            deseleccionarckdias(false);
            limpiar();
            mostrar("");
        }


    }//GEN-LAST:event_btnguardarActionPerformed

    private void tdatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdatosMouseClicked

        habilitarcamposdatos(false);
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
//        txtfechanacimiento.setDate(StringaDate(tdatos.getValueAt(fila, 2).toString()));
        txtnombretutor.setText(tdatos.getValueAt(fila, 11).toString());
        txtlocalidad.setText(tdatos.getValueAt(fila, 5).toString());
        txtcalle.setText(tdatos.getValueAt(fila, 6).toString());
        txtnumex.setText(tdatos.getValueAt(fila, 7).toString());
        txtnumin.setText(tdatos.getValueAt(fila, 8).toString());
        txttelefono.setText(tdatos.getValueAt(fila, 9).toString());
        txtcelular.setText(tdatos.getValueAt(fila, 10).toString());
        btneditardatos.setEnabled(true);
        btnrenovar.setEnabled(true);
        btnguardar.setEnabled(false);
    }//GEN-LAST:event_tdatosMouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        habilitarcamposdatos(true);
        limpiar();
        habilitarcamposmensualidad(true);
        habilitarhoras(false);
        inicializarvariables();
        deseleccionarckdias(false);
        btneditardatos.setEnabled(false);
        btnrenovar.setEnabled(false);
        btnguardar.setEnabled(true);

    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btneditardatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditardatosActionPerformed
        habilitarcamposdatos(true);
        btnguardar.setEnabled(true);
    }//GEN-LAST:event_btneditardatosActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        mostrar(txtbuscar.getText());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        habilitarcamposdatos(true);
        limpiar();
        inicializarvariables();
        habilitarcamposmensualidad(true);
        habilitarhoras(false);
        deseleccionarckdias(false);
        btneditardatos.setEnabled(false);
        btnrenovar.setEnabled(false);
        btnguardar.setEnabled(true);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnrenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrenovarActionPerformed
        habilitarcamposmensualidad(true);
    }//GEN-LAST:event_btnrenovarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        Eliminarusuarios elus = new Eliminarusuarios();
        boolean var = elus.eliminarusuario(Integer.parseInt(txtidusuario.getText()));
        mostrar("");
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtfechainicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtfechainicioPropertyChange
        txtfechatermino.setDate(StringaDate(obtenerfecha(txtfechainicio, 0)));
    }//GEN-LAST:event_txtfechainicioPropertyChange

    private void btnhorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhorasActionPerformed
        cbhoralunes.setSelectedIndex(0);
    }//GEN-LAST:event_btnhorasActionPerformed

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
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneditardatos;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnhoras;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnrenovar;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel lblregistros;
    private javax.swing.JLabel lbltutor;
    private javax.swing.JTable tdatos;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcelular;
    private com.toedter.calendar.JDateChooser txtfechainicio;
    private com.toedter.calendar.JDateChooser txtfechanacimiento;
    private com.toedter.calendar.JDateChooser txtfechatermino;
    private javax.swing.JTextField txtidultimousuario;
    private javax.swing.JTextField txtidusuario;
    private javax.swing.JTextField txtlocalidad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombretutor;
    private javax.swing.JTextField txtnumex;
    private javax.swing.JTextField txtnumin;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
