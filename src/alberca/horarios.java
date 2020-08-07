/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberca;

import Consultas.Eliminarusuarios;
import Consultas.tabla;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Choche
 */
public class horarios extends javax.swing.JFrame {

    /**
     * Creates new form horarios
     */
    tabla tab = new tabla();
    
    public horarios() {
        initComponents();
        //Maestros
//        tab.mostrarmaestros(cbmaestros);
//        tab.mostraridmaestros(cbidmaestros);
        mostrar(1);

        //Adultos
        this.setLocationRelativeTo(null);
        
    }

   
    
    public void mostrar(int m) {
//        int m=Integer.parseInt(cbidmaestros.getItemAt(cbmaestros.getSelectedIndex()));

        Eliminarusuarios elus = new Eliminarusuarios();
        elus.contarusuariosadultos(lbl1a, 1, "Lunes", m);
        elus.contarusuariosadultos(lbl2a, 2, "Lunes", m);
        elus.contarusuariosadultos(lbl3a, 3, "Lunes", m);
        elus.contarusuariosadultos(lbl4a, 4, "Lunes", m);
        elus.contarusuariosadultos(lbl5a, 5, "Lunes", m);
        elus.contarusuariosadultos(lbl6a, 6, "Lunes", m);
        elus.contarusuariosadultos(lbl7a, 7, "Lunes", m);
        elus.contarusuariosadultos(lbl8a, 8, "Lunes", m);
        elus.contarusuariosadultos(lbl9a, 9, "Lunes", m);
        elus.contarusuariosadultos(lbl10a, 10, "Lunes", m);
        elus.contarusuariosadultos(lbl11a, 11, "Lunes", m);
        
        elus.contarusuariosadultos(lbm1a, 1, "Martes", m);
        elus.contarusuariosadultos(lbm2a, 2, "Martes", m);
        elus.contarusuariosadultos(lbm3a, 3, "Martes", m);
        elus.contarusuariosadultos(lbm4a, 4, "Martes", m);
        elus.contarusuariosadultos(lbm5a, 5, "Martes", m);
        elus.contarusuariosadultos(lbm6a, 6, "Martes", m);
        elus.contarusuariosadultos(lbm7a, 7, "Martes", m);
        elus.contarusuariosadultos(lbm8a, 8, "Martes", m);
        elus.contarusuariosadultos(lbm9a, 9, "Martes", m);
        elus.contarusuariosadultos(lbm10a, 10, "Martes", m);
        elus.contarusuariosadultos(lbm11a, 11, "Martes", m);
        
        elus.contarusuariosadultos(lbmi1a, 1, "Miercoles", m);
        elus.contarusuariosadultos(lbmi2a, 2, "Miercoles", m);
        elus.contarusuariosadultos(lbmi3a, 3, "Miercoles", m);
        elus.contarusuariosadultos(lbmi4a, 4, "Miercoles", m);
        elus.contarusuariosadultos(lbmi5a, 5, "Miercoles", m);
        elus.contarusuariosadultos(lbmi6a, 6, "Miercoles", m);
        elus.contarusuariosadultos(lbmi7a, 7, "Miercoles", m);
        elus.contarusuariosadultos(lbmi8a, 8, "Miercoles", m);
        elus.contarusuariosadultos(lbmi9a, 9, "Miercoles", m);
        elus.contarusuariosadultos(lbmi10a, 10, "Miercoles", m);
        elus.contarusuariosadultos(lbmi11a, 11, "Miercoles", m);
        
        elus.contarusuariosadultos(lbj1a, 1, "Jueves", m);
        elus.contarusuariosadultos(lbj2a, 2, "Jueves", m);
        elus.contarusuariosadultos(lbj3a, 3, "Jueves", m);
        elus.contarusuariosadultos(lbj4a, 4, "Jueves", m);
        elus.contarusuariosadultos(lbj5a, 5, "Jueves", m);
        elus.contarusuariosadultos(lbj6a, 6, "Jueves", m);
        elus.contarusuariosadultos(lbj7a, 7, "Jueves", m);
        elus.contarusuariosadultos(lbj8a, 8, "Jueves", m);
        elus.contarusuariosadultos(lbj9a, 9, "Jueves", m);
        elus.contarusuariosadultos(lbj10a, 10, "Jueves", m);
        elus.contarusuariosadultos(lbj11a, 11, "Jueves", m);
        
        elus.contarusuariosadultos(lbv1a, 1, "Viernes", m);
        elus.contarusuariosadultos(lbv2a, 2, "Viernes", m);
        elus.contarusuariosadultos(lbv3a, 3, "Viernes", m);
        elus.contarusuariosadultos(lbv4a, 4, "Viernes", m);
        elus.contarusuariosadultos(lbv5a, 5, "Viernes", m);
        elus.contarusuariosadultos(lbv6a, 6, "Viernes", m);
        elus.contarusuariosadultos(lbv7a, 7, "Viernes", m);
        elus.contarusuariosadultos(lbv8a, 8, "Viernes", m);
        elus.contarusuariosadultos(lbv9a, 9, "Viernes", m);
        elus.contarusuariosadultos(lbv10a, 10, "Viernes", m);
        elus.contarusuariosadultos(lbv11a, 11, "Viernes", m);
        
        elus.contarusuariosadultos(lbs1a, 1, "Sabado", m);
        elus.contarusuariosadultos(lbs2a, 2, "Sabado", m);
        elus.contarusuariosadultos(lbs3a, 3, "Sabado", m);
        elus.contarusuariosadultos(lbs4a, 4, "Sabado", m);
        elus.contarusuariosadultos(lbs5a, 5, "Sabado", m);
        elus.contarusuariosadultos(lbs6a, 6, "Sabado", m);
        elus.contarusuariosadultos(lbs7a, 7, "Sabado", m);
        elus.contarusuariosadultos(lbs8a, 8, "Sabado", m);
        elus.contarusuariosadultos(lbs9a, 9, "Sabado", m);
        elus.contarusuariosadultos(lbs10a, 10, "Sabado", m);
        elus.contarusuariosadultos(lbs11a, 11, "Sabado", m);

        //Kids
        elus.contarusuariosinfantes(lbl1k, 1, "Lunes", m);
        elus.contarusuariosinfantes(lbl2k, 2, "Lunes", m);
        elus.contarusuariosinfantes(lbl3k, 3, "Lunes", m);
        elus.contarusuariosinfantes(lbl4k, 4, "Lunes", m);
        elus.contarusuariosinfantes(lbl5k, 5, "Lunes", m);
        elus.contarusuariosinfantes(lbl6k, 6, "Lunes", m);
        elus.contarusuariosinfantes(lbl7k, 7, "Lunes", m);
        elus.contarusuariosinfantes(lbl8k, 8, "Lunes", m);
        elus.contarusuariosinfantes(lbl9k, 9, "Lunes", m);
        elus.contarusuariosinfantes(lbl10k, 10, "Lunes", m);
        elus.contarusuariosinfantes(lbl11k, 11, "Lunes", m);
        
        elus.contarusuariosinfantes(lbm1k, 1, "Martes", m);
        elus.contarusuariosinfantes(lbm2k, 2, "Martes", m);
        elus.contarusuariosinfantes(lbm3k, 3, "Martes", m);
        elus.contarusuariosinfantes(lbm4k, 4, "Martes", m);
        elus.contarusuariosinfantes(lbm5k, 5, "Martes", m);
        elus.contarusuariosinfantes(lbm6k, 6, "Martes", m);
        elus.contarusuariosinfantes(lbm7k, 7, "Martes", m);
        elus.contarusuariosinfantes(lbm8k, 8, "Martes", m);
        elus.contarusuariosinfantes(lbm9k, 9, "Martes", m);
        elus.contarusuariosinfantes(lbm10k, 10, "Martes", m);
        elus.contarusuariosinfantes(lbm11k, 11, "Martes", m);
        
        elus.contarusuariosinfantes(lbmi1k, 1, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi2k, 2, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi3k, 3, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi4k, 4, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi5k, 5, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi6k, 6, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi7k, 7, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi8k, 8, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi9k, 9, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi10k, 10, "Miercoles", m);
        elus.contarusuariosinfantes(lbmi11k, 11, "Miercoles", m);
        
        elus.contarusuariosinfantes(lbj1k, 1, "Jueves", m);
        elus.contarusuariosinfantes(lbj2k, 2, "Jueves", m);
        elus.contarusuariosinfantes(lbj3k, 3, "Jueves", m);
        elus.contarusuariosinfantes(lbj4k, 4, "Jueves", m);
        elus.contarusuariosinfantes(lbj5k, 5, "Jueves", m);
        elus.contarusuariosinfantes(lbj6k, 6, "Jueves", m);
        elus.contarusuariosinfantes(lbj7k, 7, "Jueves", m);
        elus.contarusuariosinfantes(lbj8k, 8, "Jueves", m);
        elus.contarusuariosinfantes(lbj9k, 9, "Jueves", m);
        elus.contarusuariosinfantes(lbj10k, 10, "Jueves", m);
        elus.contarusuariosinfantes(lbj11k, 11, "Jueves", m);
        
        elus.contarusuariosinfantes(lbv1k, 1, "Viernes", m);
        elus.contarusuariosinfantes(lbv2k, 2, "Viernes", m);
        elus.contarusuariosinfantes(lbv3k, 3, "Viernes", m);
        elus.contarusuariosinfantes(lbv4k, 4, "Viernes", m);
        elus.contarusuariosinfantes(lbv5k, 5, "Viernes", m);
        elus.contarusuariosinfantes(lbv6k, 6, "Viernes", m);
        elus.contarusuariosinfantes(lbv7k, 7, "Viernes", m);
        elus.contarusuariosinfantes(lbv8k, 8, "Viernes", m);
        elus.contarusuariosinfantes(lbv9k, 9, "Viernes", m);
        elus.contarusuariosinfantes(lbv10k, 10, "Viernes", m);
        elus.contarusuariosinfantes(lbv11k, 11, "Viernes", m);
        
        elus.contarusuariosinfantes(lbs1k, 1, "Sabado", m);
        elus.contarusuariosinfantes(lbs2k, 2, "Sabado", m);
        elus.contarusuariosinfantes(lbs3k, 3, "Sabado", m);
        elus.contarusuariosinfantes(lbs4k, 4, "Sabado", m);
        elus.contarusuariosinfantes(lbs5k, 5, "Sabado", m);
        elus.contarusuariosinfantes(lbs6k, 6, "Sabado", m);
        elus.contarusuariosinfantes(lbs7k, 7, "Sabado", m);
        elus.contarusuariosinfantes(lbs8k, 8, "Sabado", m);
        elus.contarusuariosinfantes(lbs9k, 9, "Sabado", m);
        elus.contarusuariosinfantes(lbs10k, 10, "Sabado", m);
        elus.contarusuariosinfantes(lbs11k, 11, "Sabado", m);
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
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        lbl3a = new javax.swing.JLabel();
        lbl3k = new javax.swing.JLabel();
        lbl1a = new javax.swing.JLabel();
        lbl1k = new javax.swing.JLabel();
        lbl4k = new javax.swing.JLabel();
        lbl5a = new javax.swing.JLabel();
        lbl5k = new javax.swing.JLabel();
        lbl6a = new javax.swing.JLabel();
        lbl6k = new javax.swing.JLabel();
        lbl7a = new javax.swing.JLabel();
        lbl7k = new javax.swing.JLabel();
        lbl8k = new javax.swing.JLabel();
        lbl9a = new javax.swing.JLabel();
        lbl9k = new javax.swing.JLabel();
        lbl10k = new javax.swing.JLabel();
        lbl11a = new javax.swing.JLabel();
        lbl11k = new javax.swing.JLabel();
        lbl2k = new javax.swing.JLabel();
        lbm1a = new javax.swing.JLabel();
        lbm1k = new javax.swing.JLabel();
        lbm2a = new javax.swing.JLabel();
        lbm2k = new javax.swing.JLabel();
        lbm3a = new javax.swing.JLabel();
        lbm3k = new javax.swing.JLabel();
        lbm4a = new javax.swing.JLabel();
        lbm4k = new javax.swing.JLabel();
        lbm5a = new javax.swing.JLabel();
        lbm5k = new javax.swing.JLabel();
        lbm6a = new javax.swing.JLabel();
        lbm6k = new javax.swing.JLabel();
        lbm7a = new javax.swing.JLabel();
        lbm7k = new javax.swing.JLabel();
        lbm11a = new javax.swing.JLabel();
        lbm10a = new javax.swing.JLabel();
        lbm9a = new javax.swing.JLabel();
        lbm8a = new javax.swing.JLabel();
        lbm8k = new javax.swing.JLabel();
        lbm9k = new javax.swing.JLabel();
        lbm10k = new javax.swing.JLabel();
        lbm11k = new javax.swing.JLabel();
        lbmi1a = new javax.swing.JLabel();
        lbmi1k = new javax.swing.JLabel();
        lbmi2a = new javax.swing.JLabel();
        lbmi2k = new javax.swing.JLabel();
        lbmi3a = new javax.swing.JLabel();
        lbmi3k = new javax.swing.JLabel();
        lbmi4a = new javax.swing.JLabel();
        lbmi4k = new javax.swing.JLabel();
        lbmi5a = new javax.swing.JLabel();
        lbmi5k = new javax.swing.JLabel();
        lbmi6a = new javax.swing.JLabel();
        lbmi6k = new javax.swing.JLabel();
        lbmi7a = new javax.swing.JLabel();
        lbmi7k = new javax.swing.JLabel();
        lbmi11a = new javax.swing.JLabel();
        lbmi10a = new javax.swing.JLabel();
        lbmi9a = new javax.swing.JLabel();
        lbmi8a = new javax.swing.JLabel();
        lbmi8k = new javax.swing.JLabel();
        lbmi9k = new javax.swing.JLabel();
        lbmi10k = new javax.swing.JLabel();
        lbmi11k = new javax.swing.JLabel();
        lbj1a = new javax.swing.JLabel();
        lbj1k = new javax.swing.JLabel();
        lbj2a = new javax.swing.JLabel();
        lbj2k = new javax.swing.JLabel();
        lbj3a = new javax.swing.JLabel();
        lbj3k = new javax.swing.JLabel();
        lbj4a = new javax.swing.JLabel();
        lbj4k = new javax.swing.JLabel();
        lbj5a = new javax.swing.JLabel();
        lbj5k = new javax.swing.JLabel();
        lbj6a = new javax.swing.JLabel();
        lbj6k = new javax.swing.JLabel();
        lbj7a = new javax.swing.JLabel();
        lbj7k = new javax.swing.JLabel();
        lbj11a = new javax.swing.JLabel();
        lbj10a = new javax.swing.JLabel();
        lbj9a = new javax.swing.JLabel();
        lbj8a = new javax.swing.JLabel();
        lbj8k = new javax.swing.JLabel();
        lbj9k = new javax.swing.JLabel();
        lbj10k = new javax.swing.JLabel();
        lbj11k = new javax.swing.JLabel();
        lbs1a = new javax.swing.JLabel();
        lbs1k = new javax.swing.JLabel();
        lbs2a = new javax.swing.JLabel();
        lbs2k = new javax.swing.JLabel();
        lbs3a = new javax.swing.JLabel();
        lbs3k = new javax.swing.JLabel();
        lbs4a = new javax.swing.JLabel();
        lbs4k = new javax.swing.JLabel();
        lbs5a = new javax.swing.JLabel();
        lbs5k = new javax.swing.JLabel();
        lbs6a = new javax.swing.JLabel();
        lbs6k = new javax.swing.JLabel();
        lbs7a = new javax.swing.JLabel();
        lbs7k = new javax.swing.JLabel();
        lbs11a = new javax.swing.JLabel();
        lbs10a = new javax.swing.JLabel();
        lbs9a = new javax.swing.JLabel();
        lbs8a = new javax.swing.JLabel();
        lbs8k = new javax.swing.JLabel();
        lbs9k = new javax.swing.JLabel();
        lbs10k = new javax.swing.JLabel();
        lbs11k = new javax.swing.JLabel();
        lbv1a = new javax.swing.JLabel();
        lbv1k = new javax.swing.JLabel();
        lbv2a = new javax.swing.JLabel();
        lbv2k = new javax.swing.JLabel();
        lbv3a = new javax.swing.JLabel();
        lbv3k = new javax.swing.JLabel();
        lbv4a = new javax.swing.JLabel();
        lbv4k = new javax.swing.JLabel();
        lbv5a = new javax.swing.JLabel();
        lbv5k = new javax.swing.JLabel();
        lbv6a = new javax.swing.JLabel();
        lbv6k = new javax.swing.JLabel();
        lbv7a = new javax.swing.JLabel();
        lbv7k = new javax.swing.JLabel();
        lbv11a = new javax.swing.JLabel();
        lbv10a = new javax.swing.JLabel();
        lbv9a = new javax.swing.JLabel();
        lbv8a = new javax.swing.JLabel();
        lbv8k = new javax.swing.JLabel();
        lbv9k = new javax.swing.JLabel();
        lbv10k = new javax.swing.JLabel();
        lbv11k = new javax.swing.JLabel();
        jPanel114 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jPanel117 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        lbl2a = new javax.swing.JLabel();
        jPanel118 = new javax.swing.JPanel();
        jPanel119 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jPanel120 = new javax.swing.JPanel();
        lbl4a = new javax.swing.JLabel();
        jPanel122 = new javax.swing.JPanel();
        jPanel123 = new javax.swing.JPanel();
        jPanel124 = new javax.swing.JPanel();
        jPanel125 = new javax.swing.JPanel();
        jPanel126 = new javax.swing.JPanel();
        jPanel127 = new javax.swing.JPanel();
        jPanel129 = new javax.swing.JPanel();
        jPanel128 = new javax.swing.JPanel();
        lbl8a = new javax.swing.JLabel();
        jPanel130 = new javax.swing.JPanel();
        jPanel131 = new javax.swing.JPanel();
        jPanel133 = new javax.swing.JPanel();
        jPanel132 = new javax.swing.JPanel();
        lbl10a = new javax.swing.JLabel();
        jPanel134 = new javax.swing.JPanel();
        jPanel135 = new javax.swing.JPanel();
        jPanel136 = new javax.swing.JPanel();
        jPanel137 = new javax.swing.JPanel();
        jPanel138 = new javax.swing.JPanel();
        jPanel139 = new javax.swing.JPanel();
        jPanel142 = new javax.swing.JPanel();
        jPanel140 = new javax.swing.JPanel();
        jPanel141 = new javax.swing.JPanel();
        jPanel144 = new javax.swing.JPanel();
        jPanel143 = new javax.swing.JPanel();
        jPanel145 = new javax.swing.JPanel();
        jPanel152 = new javax.swing.JPanel();
        jPanel154 = new javax.swing.JPanel();
        jPanel155 = new javax.swing.JPanel();
        jPanel158 = new javax.swing.JPanel();
        jPanel157 = new javax.swing.JPanel();
        jPanel156 = new javax.swing.JPanel();
        jPanel160 = new javax.swing.JPanel();
        jPanel159 = new javax.swing.JPanel();
        jPanel162 = new javax.swing.JPanel();
        jPanel161 = new javax.swing.JPanel();
        jPanel163 = new javax.swing.JPanel();
        jPanel153 = new javax.swing.JPanel();
        jPanel164 = new javax.swing.JPanel();
        jPanel165 = new javax.swing.JPanel();
        jPanel166 = new javax.swing.JPanel();
        jPanel167 = new javax.swing.JPanel();
        jPanel168 = new javax.swing.JPanel();
        jPanel169 = new javax.swing.JPanel();
        jPanel170 = new javax.swing.JPanel();
        jPanel173 = new javax.swing.JPanel();
        jPanel172 = new javax.swing.JPanel();
        jPanel171 = new javax.swing.JPanel();
        jPanel146 = new javax.swing.JPanel();
        jPanel147 = new javax.swing.JPanel();
        jPanel148 = new javax.swing.JPanel();
        jPanel149 = new javax.swing.JPanel();
        jPanel150 = new javax.swing.JPanel();
        jPanel151 = new javax.swing.JPanel();
        jPanel175 = new javax.swing.JPanel();
        jPanel174 = new javax.swing.JPanel();
        jPanel176 = new javax.swing.JPanel();
        jPanel177 = new javax.swing.JPanel();
        jPanel178 = new javax.swing.JPanel();
        jPanel179 = new javax.swing.JPanel();
        jPanel180 = new javax.swing.JPanel();
        jPanel183 = new javax.swing.JPanel();
        jPanel182 = new javax.swing.JPanel();
        jPanel181 = new javax.swing.JPanel();
        jPanel185 = new javax.swing.JPanel();
        jPanel191 = new javax.swing.JPanel();
        jPanel194 = new javax.swing.JPanel();
        jPanel189 = new javax.swing.JPanel();
        jPanel186 = new javax.swing.JPanel();
        jPanel193 = new javax.swing.JPanel();
        jPanel184 = new javax.swing.JPanel();
        jPanel192 = new javax.swing.JPanel();
        jPanel187 = new javax.swing.JPanel();
        jPanel188 = new javax.swing.JPanel();
        jPanel190 = new javax.swing.JPanel();
        jPanel196 = new javax.swing.JPanel();
        jPanel197 = new javax.swing.JPanel();
        jPanel199 = new javax.swing.JPanel();
        jPanel203 = new javax.swing.JPanel();
        jPanel205 = new javax.swing.JPanel();
        jPanel195 = new javax.swing.JPanel();
        jPanel202 = new javax.swing.JPanel();
        jPanel204 = new javax.swing.JPanel();
        jPanel200 = new javax.swing.JPanel();
        jPanel201 = new javax.swing.JPanel();
        jPanel198 = new javax.swing.JPanel();
        jPanel207 = new javax.swing.JPanel();
        jPanel212 = new javax.swing.JPanel();
        jPanel216 = new javax.swing.JPanel();
        jPanel206 = new javax.swing.JPanel();
        jPanel210 = new javax.swing.JPanel();
        jPanel208 = new javax.swing.JPanel();
        jPanel215 = new javax.swing.JPanel();
        jPanel214 = new javax.swing.JPanel();
        jPanel213 = new javax.swing.JPanel();
        jPanel209 = new javax.swing.JPanel();
        jPanel211 = new javax.swing.JPanel();
        jPanel219 = new javax.swing.JPanel();
        jPanel218 = new javax.swing.JPanel();
        jPanel222 = new javax.swing.JPanel();
        jPanel220 = new javax.swing.JPanel();
        jPanel223 = new javax.swing.JPanel();
        jPanel221 = new javax.swing.JPanel();
        jPanel224 = new javax.swing.JPanel();
        jPanel227 = new javax.swing.JPanel();
        jPanel226 = new javax.swing.JPanel();
        jPanel225 = new javax.swing.JPanel();
        jPanel217 = new javax.swing.JPanel();
        jPanel228 = new javax.swing.JPanel();
        jPanel230 = new javax.swing.JPanel();
        jPanel234 = new javax.swing.JPanel();
        jPanel231 = new javax.swing.JPanel();
        jPanel236 = new javax.swing.JPanel();
        jPanel233 = new javax.swing.JPanel();
        jPanel229 = new javax.swing.JPanel();
        jPanel235 = new javax.swing.JPanel();
        jPanel238 = new javax.swing.JPanel();
        jPanel237 = new javax.swing.JPanel();
        jPanel232 = new javax.swing.JPanel();
        jPanel247 = new javax.swing.JPanel();
        jPanel239 = new javax.swing.JPanel();
        jPanel241 = new javax.swing.JPanel();
        jPanel243 = new javax.swing.JPanel();
        jPanel240 = new javax.swing.JPanel();
        jPanel245 = new javax.swing.JPanel();
        jPanel242 = new javax.swing.JPanel();
        jPanel246 = new javax.swing.JPanel();
        jPanel249 = new javax.swing.JPanel();
        jPanel244 = new javax.swing.JPanel();
        jPanel248 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btninscripicion = new javax.swing.JButton();
        lblimagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1270, 640));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

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

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CENTRO ACUÁTICO ALFA & OMEGA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 0, 819, 50);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 130, 996, 10);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(0, 170, 996, 10);
        jPanel1.add(jSeparator4);
        jSeparator4.setBounds(0, 210, 996, 10);
        jPanel1.add(jSeparator5);
        jSeparator5.setBounds(0, 250, 996, 10);
        jPanel1.add(jSeparator6);
        jSeparator6.setBounds(0, 290, 996, 10);
        jPanel1.add(jSeparator7);
        jSeparator7.setBounds(0, 330, 996, 10);
        jPanel1.add(jSeparator8);
        jSeparator8.setBounds(0, 370, 996, 10);
        jPanel1.add(jSeparator9);
        jSeparator9.setBounds(0, 410, 996, 10);
        jPanel1.add(jSeparator10);
        jSeparator10.setBounds(0, 450, 996, 10);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 130, 173));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LUNES");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 120, 30);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 130, 173));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MARTES");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(170, 10, 120, 30);

        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 130, 173));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MIÉRCOLES");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(330, 10, 160, 30);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 130, 173));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("VIERNES");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(700, 10, 120, 30);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 130, 173));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("SÁBADO");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(870, 10, 120, 30);
        jPanel1.add(jSeparator11);
        jSeparator11.setBounds(0, 90, 1000, 10);
        jPanel1.add(jSeparator12);
        jSeparator12.setBounds(2, 49, 996, 10);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(840, 50, 10, 470);

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator13);
        jSeparator13.setBounds(150, 50, 10, 470);

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator14);
        jSeparator14.setBounds(310, 50, 10, 470);

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator15);
        jSeparator15.setBounds(510, 50, 10, 470);

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator16);
        jSeparator16.setBounds(670, 50, 10, 470);

        lbl3a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl3a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3a.setText("8 de 12");
        jPanel1.add(lbl3a);
        lbl3a.setBounds(0, 130, 70, 40);

        lbl3k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl3k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3k.setText("3 de 5");
        jPanel1.add(lbl3k);
        lbl3k.setBounds(70, 130, 80, 40);

        lbl1a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1a.setText("8 de 12");
        jPanel1.add(lbl1a);
        lbl1a.setBounds(0, 50, 70, 40);

        lbl1k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl1k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1k.setText("3 de 5");
        jPanel1.add(lbl1k);
        lbl1k.setBounds(70, 50, 80, 40);

        lbl4k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl4k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4k.setText("3 de 5");
        jPanel1.add(lbl4k);
        lbl4k.setBounds(70, 170, 80, 40);

        lbl5a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl5a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5a.setText("8 de 12");
        jPanel1.add(lbl5a);
        lbl5a.setBounds(0, 210, 70, 40);

        lbl5k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl5k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5k.setText("3 de 5");
        jPanel1.add(lbl5k);
        lbl5k.setBounds(70, 210, 80, 40);

        lbl6a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl6a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6a.setText("8 de 12");
        jPanel1.add(lbl6a);
        lbl6a.setBounds(0, 250, 70, 40);

        lbl6k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl6k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6k.setText("3 de 5");
        jPanel1.add(lbl6k);
        lbl6k.setBounds(70, 250, 80, 40);

        lbl7a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl7a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7a.setText("8 de 12");
        jPanel1.add(lbl7a);
        lbl7a.setBounds(0, 290, 70, 40);

        lbl7k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl7k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7k.setText("3 de 5");
        jPanel1.add(lbl7k);
        lbl7k.setBounds(70, 290, 80, 40);

        lbl8k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl8k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8k.setText("3 de 5");
        jPanel1.add(lbl8k);
        lbl8k.setBounds(70, 330, 80, 40);

        lbl9a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl9a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9a.setText("8 de 12");
        jPanel1.add(lbl9a);
        lbl9a.setBounds(0, 370, 70, 40);

        lbl9k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl9k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9k.setText("3 de 5");
        jPanel1.add(lbl9k);
        lbl9k.setBounds(70, 370, 80, 40);

        lbl10k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl10k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10k.setText("3 de 5");
        jPanel1.add(lbl10k);
        lbl10k.setBounds(70, 410, 80, 40);

        lbl11a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl11a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11a.setText("8 de 12");
        jPanel1.add(lbl11a);
        lbl11a.setBounds(0, 450, 70, 40);

        lbl11k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl11k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl11k.setText("3 de 5");
        jPanel1.add(lbl11k);
        lbl11k.setBounds(70, 450, 80, 40);

        lbl2k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl2k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2k.setText("3 de 5");
        jPanel1.add(lbl2k);
        lbl2k.setBounds(70, 90, 80, 40);

        lbm1a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm1a.setText("8 de 12");
        jPanel1.add(lbm1a);
        lbm1a.setBounds(150, 50, 80, 40);

        lbm1k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm1k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm1k.setText("3 de 5");
        jPanel1.add(lbm1k);
        lbm1k.setBounds(230, 50, 80, 40);

        lbm2a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm2a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm2a.setText("8 de 12");
        jPanel1.add(lbm2a);
        lbm2a.setBounds(150, 90, 80, 40);

        lbm2k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm2k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm2k.setText("3 de 5");
        jPanel1.add(lbm2k);
        lbm2k.setBounds(230, 90, 80, 40);

        lbm3a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm3a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm3a.setText("8 de 12");
        jPanel1.add(lbm3a);
        lbm3a.setBounds(150, 130, 80, 40);

        lbm3k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm3k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm3k.setText("3 de 5");
        jPanel1.add(lbm3k);
        lbm3k.setBounds(230, 130, 80, 40);

        lbm4a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm4a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm4a.setText("8 de 12");
        jPanel1.add(lbm4a);
        lbm4a.setBounds(150, 170, 80, 40);

        lbm4k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm4k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm4k.setText("3 de 5");
        jPanel1.add(lbm4k);
        lbm4k.setBounds(230, 170, 80, 40);

        lbm5a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm5a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm5a.setText("8 de 12");
        jPanel1.add(lbm5a);
        lbm5a.setBounds(150, 210, 80, 40);

        lbm5k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm5k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm5k.setText("3 de 5");
        jPanel1.add(lbm5k);
        lbm5k.setBounds(230, 210, 80, 40);

        lbm6a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm6a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm6a.setText("8 de 12");
        jPanel1.add(lbm6a);
        lbm6a.setBounds(150, 250, 80, 40);

        lbm6k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm6k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm6k.setText("3 de 5");
        jPanel1.add(lbm6k);
        lbm6k.setBounds(230, 250, 80, 40);

        lbm7a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm7a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm7a.setText("8 de 12");
        jPanel1.add(lbm7a);
        lbm7a.setBounds(150, 290, 80, 40);

        lbm7k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm7k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm7k.setText("3 de 5");
        jPanel1.add(lbm7k);
        lbm7k.setBounds(230, 290, 80, 40);

        lbm11a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm11a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm11a.setText("8 de 12");
        jPanel1.add(lbm11a);
        lbm11a.setBounds(150, 450, 80, 40);

        lbm10a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm10a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm10a.setText("8 de 12");
        jPanel1.add(lbm10a);
        lbm10a.setBounds(150, 410, 80, 40);

        lbm9a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm9a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm9a.setText("8 de 12");
        jPanel1.add(lbm9a);
        lbm9a.setBounds(150, 370, 80, 40);

        lbm8a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm8a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm8a.setText("8 de 12");
        jPanel1.add(lbm8a);
        lbm8a.setBounds(150, 330, 80, 40);

        lbm8k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm8k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm8k.setText("3 de 5");
        jPanel1.add(lbm8k);
        lbm8k.setBounds(230, 330, 80, 40);

        lbm9k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm9k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm9k.setText("3 de 5");
        jPanel1.add(lbm9k);
        lbm9k.setBounds(230, 370, 80, 40);

        lbm10k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm10k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm10k.setText("3 de 5");
        jPanel1.add(lbm10k);
        lbm10k.setBounds(230, 410, 80, 40);

        lbm11k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbm11k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbm11k.setText("3 de 5");
        jPanel1.add(lbm11k);
        lbm11k.setBounds(230, 450, 80, 40);

        lbmi1a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi1a.setText("8 de 12");
        jPanel1.add(lbmi1a);
        lbmi1a.setBounds(310, 50, 100, 40);

        lbmi1k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi1k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi1k.setText("3 de 5");
        jPanel1.add(lbmi1k);
        lbmi1k.setBounds(410, 50, 100, 40);

        lbmi2a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi2a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi2a.setText("8 de 12");
        jPanel1.add(lbmi2a);
        lbmi2a.setBounds(310, 90, 100, 40);

        lbmi2k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi2k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi2k.setText("3 de 5");
        jPanel1.add(lbmi2k);
        lbmi2k.setBounds(410, 90, 100, 40);

        lbmi3a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi3a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi3a.setText("8 de 12");
        jPanel1.add(lbmi3a);
        lbmi3a.setBounds(310, 130, 100, 40);

        lbmi3k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi3k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi3k.setText("3 de 5");
        jPanel1.add(lbmi3k);
        lbmi3k.setBounds(410, 130, 100, 40);

        lbmi4a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi4a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi4a.setText("8 de 12");
        jPanel1.add(lbmi4a);
        lbmi4a.setBounds(310, 170, 100, 40);

        lbmi4k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi4k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi4k.setText("3 de 5");
        jPanel1.add(lbmi4k);
        lbmi4k.setBounds(410, 170, 100, 40);

        lbmi5a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi5a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi5a.setText("8 de 12");
        jPanel1.add(lbmi5a);
        lbmi5a.setBounds(310, 210, 100, 40);

        lbmi5k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi5k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi5k.setText("3 de 5");
        jPanel1.add(lbmi5k);
        lbmi5k.setBounds(410, 210, 100, 40);

        lbmi6a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi6a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi6a.setText("8 de 12");
        jPanel1.add(lbmi6a);
        lbmi6a.setBounds(310, 250, 100, 40);

        lbmi6k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi6k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi6k.setText("3 de 5");
        jPanel1.add(lbmi6k);
        lbmi6k.setBounds(410, 250, 100, 40);

        lbmi7a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi7a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi7a.setText("8 de 12");
        jPanel1.add(lbmi7a);
        lbmi7a.setBounds(310, 290, 100, 40);

        lbmi7k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi7k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi7k.setText("3 de 5");
        jPanel1.add(lbmi7k);
        lbmi7k.setBounds(410, 290, 100, 40);

        lbmi11a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi11a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi11a.setText("8 de 12");
        jPanel1.add(lbmi11a);
        lbmi11a.setBounds(310, 450, 100, 40);

        lbmi10a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi10a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi10a.setText("8 de 12");
        jPanel1.add(lbmi10a);
        lbmi10a.setBounds(310, 410, 100, 40);

        lbmi9a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi9a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi9a.setText("8 de 12");
        jPanel1.add(lbmi9a);
        lbmi9a.setBounds(310, 370, 100, 40);

        lbmi8a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi8a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi8a.setText("8 de 12");
        jPanel1.add(lbmi8a);
        lbmi8a.setBounds(310, 330, 100, 40);

        lbmi8k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi8k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi8k.setText("3 de 5");
        jPanel1.add(lbmi8k);
        lbmi8k.setBounds(410, 330, 100, 40);

        lbmi9k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi9k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi9k.setText("3 de 5");
        jPanel1.add(lbmi9k);
        lbmi9k.setBounds(410, 370, 100, 40);

        lbmi10k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi10k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi10k.setText("3 de 5");
        jPanel1.add(lbmi10k);
        lbmi10k.setBounds(410, 410, 100, 40);

        lbmi11k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbmi11k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmi11k.setText("3 de 5");
        jPanel1.add(lbmi11k);
        lbmi11k.setBounds(410, 450, 100, 40);

        lbj1a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj1a.setText("8 de 12");
        jPanel1.add(lbj1a);
        lbj1a.setBounds(510, 50, 80, 40);

        lbj1k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj1k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj1k.setText("3 de 5");
        jPanel1.add(lbj1k);
        lbj1k.setBounds(590, 50, 80, 40);

        lbj2a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj2a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj2a.setText("8 de 12");
        jPanel1.add(lbj2a);
        lbj2a.setBounds(510, 90, 80, 40);

        lbj2k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj2k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj2k.setText("3 de 5");
        jPanel1.add(lbj2k);
        lbj2k.setBounds(590, 90, 80, 40);

        lbj3a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj3a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj3a.setText("8 de 12");
        jPanel1.add(lbj3a);
        lbj3a.setBounds(510, 130, 80, 40);

        lbj3k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj3k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj3k.setText("3 de 5");
        jPanel1.add(lbj3k);
        lbj3k.setBounds(590, 130, 80, 40);

        lbj4a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj4a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj4a.setText("8 de 12");
        jPanel1.add(lbj4a);
        lbj4a.setBounds(510, 170, 80, 40);

        lbj4k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj4k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj4k.setText("3 de 5");
        jPanel1.add(lbj4k);
        lbj4k.setBounds(590, 170, 80, 40);

        lbj5a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj5a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj5a.setText("8 de 12");
        jPanel1.add(lbj5a);
        lbj5a.setBounds(510, 210, 80, 40);

        lbj5k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj5k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj5k.setText("3 de 5");
        jPanel1.add(lbj5k);
        lbj5k.setBounds(590, 210, 80, 40);

        lbj6a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj6a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj6a.setText("8 de 12");
        jPanel1.add(lbj6a);
        lbj6a.setBounds(510, 250, 80, 40);

        lbj6k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj6k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj6k.setText("3 de 5");
        jPanel1.add(lbj6k);
        lbj6k.setBounds(590, 250, 80, 40);

        lbj7a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj7a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj7a.setText("8 de 12");
        jPanel1.add(lbj7a);
        lbj7a.setBounds(510, 290, 80, 40);

        lbj7k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj7k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj7k.setText("3 de 5");
        jPanel1.add(lbj7k);
        lbj7k.setBounds(590, 290, 80, 40);

        lbj11a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj11a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj11a.setText("8 de 12");
        jPanel1.add(lbj11a);
        lbj11a.setBounds(510, 450, 80, 40);

        lbj10a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj10a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj10a.setText("8 de 12");
        jPanel1.add(lbj10a);
        lbj10a.setBounds(510, 410, 80, 40);

        lbj9a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj9a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj9a.setText("8 de 12");
        jPanel1.add(lbj9a);
        lbj9a.setBounds(510, 370, 80, 40);

        lbj8a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj8a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj8a.setText("8 de 12");
        jPanel1.add(lbj8a);
        lbj8a.setBounds(510, 330, 80, 40);

        lbj8k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj8k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj8k.setText("3 de 5");
        jPanel1.add(lbj8k);
        lbj8k.setBounds(590, 330, 80, 40);

        lbj9k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj9k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj9k.setText("3 de 5");
        jPanel1.add(lbj9k);
        lbj9k.setBounds(590, 370, 80, 40);

        lbj10k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj10k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj10k.setText("3 de 5");
        jPanel1.add(lbj10k);
        lbj10k.setBounds(590, 410, 80, 40);

        lbj11k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbj11k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbj11k.setText("3 de 5");
        jPanel1.add(lbj11k);
        lbj11k.setBounds(590, 450, 80, 40);

        lbs1a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs1a.setText("8 de 12");
        jPanel1.add(lbs1a);
        lbs1a.setBounds(840, 50, 70, 40);

        lbs1k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs1k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs1k.setText("3 de 5");
        jPanel1.add(lbs1k);
        lbs1k.setBounds(910, 50, 90, 40);

        lbs2a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs2a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs2a.setText("8 de 12");
        jPanel1.add(lbs2a);
        lbs2a.setBounds(840, 90, 70, 40);

        lbs2k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs2k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs2k.setText("3 de 5");
        jPanel1.add(lbs2k);
        lbs2k.setBounds(910, 90, 90, 40);

        lbs3a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs3a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs3a.setText("8 de 12");
        jPanel1.add(lbs3a);
        lbs3a.setBounds(840, 130, 70, 40);

        lbs3k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs3k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs3k.setText("3 de 5");
        jPanel1.add(lbs3k);
        lbs3k.setBounds(910, 130, 90, 40);

        lbs4a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs4a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs4a.setText("8 de 12");
        jPanel1.add(lbs4a);
        lbs4a.setBounds(840, 170, 70, 40);

        lbs4k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs4k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs4k.setText("3 de 5");
        jPanel1.add(lbs4k);
        lbs4k.setBounds(910, 170, 90, 40);

        lbs5a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs5a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs5a.setText("8 de 12");
        jPanel1.add(lbs5a);
        lbs5a.setBounds(840, 210, 70, 40);

        lbs5k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs5k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs5k.setText("3 de 5");
        jPanel1.add(lbs5k);
        lbs5k.setBounds(910, 210, 90, 40);

        lbs6a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs6a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs6a.setText("8 de 12");
        jPanel1.add(lbs6a);
        lbs6a.setBounds(840, 250, 70, 40);

        lbs6k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs6k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs6k.setText("3 de 5");
        jPanel1.add(lbs6k);
        lbs6k.setBounds(910, 250, 90, 40);

        lbs7a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs7a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs7a.setText("8 de 12");
        jPanel1.add(lbs7a);
        lbs7a.setBounds(840, 290, 70, 40);

        lbs7k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs7k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs7k.setText("3 de 5");
        jPanel1.add(lbs7k);
        lbs7k.setBounds(910, 290, 90, 40);

        lbs11a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs11a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs11a.setText("8 de 12");
        jPanel1.add(lbs11a);
        lbs11a.setBounds(840, 450, 70, 40);

        lbs10a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs10a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs10a.setText("8 de 12");
        jPanel1.add(lbs10a);
        lbs10a.setBounds(840, 410, 70, 40);

        lbs9a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs9a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs9a.setText("8 de 12");
        jPanel1.add(lbs9a);
        lbs9a.setBounds(840, 370, 70, 40);

        lbs8a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs8a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs8a.setText("8 de 12");
        jPanel1.add(lbs8a);
        lbs8a.setBounds(840, 330, 70, 40);

        lbs8k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs8k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs8k.setText("3 de 5");
        jPanel1.add(lbs8k);
        lbs8k.setBounds(910, 330, 90, 40);

        lbs9k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs9k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs9k.setText("3 de 5");
        jPanel1.add(lbs9k);
        lbs9k.setBounds(910, 370, 90, 40);

        lbs10k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs10k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs10k.setText("3 de 5");
        jPanel1.add(lbs10k);
        lbs10k.setBounds(910, 410, 90, 40);

        lbs11k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbs11k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbs11k.setText("3 de 5");
        jPanel1.add(lbs11k);
        lbs11k.setBounds(910, 450, 90, 40);

        lbv1a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv1a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv1a.setText("8 de 12");
        jPanel1.add(lbv1a);
        lbv1a.setBounds(670, 50, 80, 40);

        lbv1k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv1k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv1k.setText("3 de 5");
        jPanel1.add(lbv1k);
        lbv1k.setBounds(750, 50, 90, 40);

        lbv2a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv2a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv2a.setText("8 de 12");
        jPanel1.add(lbv2a);
        lbv2a.setBounds(670, 90, 80, 40);

        lbv2k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv2k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv2k.setText("3 de 5");
        jPanel1.add(lbv2k);
        lbv2k.setBounds(750, 90, 90, 40);

        lbv3a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv3a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv3a.setText("8 de 12");
        jPanel1.add(lbv3a);
        lbv3a.setBounds(670, 130, 80, 40);

        lbv3k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv3k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv3k.setText("3 de 5");
        jPanel1.add(lbv3k);
        lbv3k.setBounds(750, 130, 90, 40);

        lbv4a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv4a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv4a.setText("8 de 12");
        jPanel1.add(lbv4a);
        lbv4a.setBounds(670, 170, 80, 40);

        lbv4k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv4k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv4k.setText("3 de 5");
        jPanel1.add(lbv4k);
        lbv4k.setBounds(750, 170, 90, 40);

        lbv5a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv5a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv5a.setText("8 de 12");
        jPanel1.add(lbv5a);
        lbv5a.setBounds(670, 210, 80, 40);

        lbv5k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv5k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv5k.setText("3 de 5");
        jPanel1.add(lbv5k);
        lbv5k.setBounds(750, 210, 90, 40);

        lbv6a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv6a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv6a.setText("8 de 12");
        jPanel1.add(lbv6a);
        lbv6a.setBounds(670, 250, 80, 40);

        lbv6k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv6k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv6k.setText("3 de 5");
        jPanel1.add(lbv6k);
        lbv6k.setBounds(750, 250, 90, 40);

        lbv7a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv7a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv7a.setText("8 de 12");
        jPanel1.add(lbv7a);
        lbv7a.setBounds(670, 290, 80, 40);

        lbv7k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv7k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv7k.setText("3 de 5");
        jPanel1.add(lbv7k);
        lbv7k.setBounds(750, 290, 90, 40);

        lbv11a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv11a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv11a.setText("8 de 12");
        jPanel1.add(lbv11a);
        lbv11a.setBounds(670, 450, 80, 40);

        lbv10a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv10a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv10a.setText("8 de 12");
        jPanel1.add(lbv10a);
        lbv10a.setBounds(670, 410, 80, 40);

        lbv9a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv9a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv9a.setText("8 de 12");
        jPanel1.add(lbv9a);
        lbv9a.setBounds(670, 370, 80, 40);

        lbv8a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv8a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv8a.setText("8 de 12");
        jPanel1.add(lbv8a);
        lbv8a.setBounds(670, 330, 80, 40);

        lbv8k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv8k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv8k.setText("3 de 5");
        jPanel1.add(lbv8k);
        lbv8k.setBounds(750, 330, 90, 40);

        lbv9k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv9k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv9k.setText("3 de 5");
        jPanel1.add(lbv9k);
        lbv9k.setBounds(750, 370, 90, 40);

        lbv10k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv10k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv10k.setText("3 de 5");
        jPanel1.add(lbv10k);
        lbv10k.setBounds(750, 410, 90, 40);

        lbv11k.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbv11k.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbv11k.setText("3 de 5");
        jPanel1.add(lbv11k);
        lbv11k.setBounds(750, 450, 90, 40);

        jPanel114.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel114);
        jPanel114.setBounds(0, 50, 70, 40);

        jPanel115.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel115Layout = new javax.swing.GroupLayout(jPanel115);
        jPanel115.setLayout(jPanel115Layout);
        jPanel115Layout.setHorizontalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel115Layout.setVerticalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel115);
        jPanel115.setBounds(60, 50, 90, 40);

        jPanel117.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel117Layout = new javax.swing.GroupLayout(jPanel117);
        jPanel117.setLayout(jPanel117Layout);
        jPanel117Layout.setHorizontalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel117Layout.setVerticalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel117);
        jPanel117.setBounds(70, 90, 80, 40);

        jPanel116.setBackground(new java.awt.Color(153, 215, 236));

        lbl2a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl2a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2a.setText("8 de 12");

        javax.swing.GroupLayout jPanel116Layout = new javax.swing.GroupLayout(jPanel116);
        jPanel116.setLayout(jPanel116Layout);
        jPanel116Layout.setHorizontalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel116Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl2a, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel116Layout.setVerticalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel116Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl2a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel116);
        jPanel116.setBounds(0, 90, 70, 40);

        jPanel118.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel118Layout = new javax.swing.GroupLayout(jPanel118);
        jPanel118.setLayout(jPanel118Layout);
        jPanel118Layout.setHorizontalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel118Layout.setVerticalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel118);
        jPanel118.setBounds(0, 130, 70, 40);

        jPanel119.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel119Layout = new javax.swing.GroupLayout(jPanel119);
        jPanel119.setLayout(jPanel119Layout);
        jPanel119Layout.setHorizontalGroup(
            jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel119Layout.setVerticalGroup(
            jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel119);
        jPanel119.setBounds(60, 130, 90, 40);

        jPanel121.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel121Layout = new javax.swing.GroupLayout(jPanel121);
        jPanel121.setLayout(jPanel121Layout);
        jPanel121Layout.setHorizontalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel121Layout.setVerticalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel121);
        jPanel121.setBounds(70, 170, 80, 40);

        jPanel120.setBackground(new java.awt.Color(153, 215, 236));

        lbl4a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbl4a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4a.setText("8 de 12");

        javax.swing.GroupLayout jPanel120Layout = new javax.swing.GroupLayout(jPanel120);
        jPanel120.setLayout(jPanel120Layout);
        jPanel120Layout.setHorizontalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel120Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl4a, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel120Layout.setVerticalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel120Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl4a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel120);
        jPanel120.setBounds(0, 170, 70, 40);

        jPanel122.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel122Layout = new javax.swing.GroupLayout(jPanel122);
        jPanel122.setLayout(jPanel122Layout);
        jPanel122Layout.setHorizontalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel122Layout.setVerticalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel122);
        jPanel122.setBounds(0, 210, 70, 40);

        jPanel123.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel123Layout = new javax.swing.GroupLayout(jPanel123);
        jPanel123.setLayout(jPanel123Layout);
        jPanel123Layout.setHorizontalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel123Layout.setVerticalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel123);
        jPanel123.setBounds(60, 210, 90, 40);

        jPanel124.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel124Layout = new javax.swing.GroupLayout(jPanel124);
        jPanel124.setLayout(jPanel124Layout);
        jPanel124Layout.setHorizontalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel124Layout.setVerticalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel124);
        jPanel124.setBounds(0, 250, 70, 40);

        jPanel125.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel125Layout = new javax.swing.GroupLayout(jPanel125);
        jPanel125.setLayout(jPanel125Layout);
        jPanel125Layout.setHorizontalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel125Layout.setVerticalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel125);
        jPanel125.setBounds(60, 250, 90, 40);

        jPanel126.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel126Layout = new javax.swing.GroupLayout(jPanel126);
        jPanel126.setLayout(jPanel126Layout);
        jPanel126Layout.setHorizontalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel126Layout.setVerticalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel126);
        jPanel126.setBounds(0, 290, 70, 40);

        jPanel127.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel127);
        jPanel127.setBounds(60, 290, 90, 40);

        jPanel129.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel129Layout = new javax.swing.GroupLayout(jPanel129);
        jPanel129.setLayout(jPanel129Layout);
        jPanel129Layout.setHorizontalGroup(
            jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel129Layout.setVerticalGroup(
            jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel129);
        jPanel129.setBounds(70, 330, 80, 40);

        jPanel128.setBackground(new java.awt.Color(153, 215, 236));

        lbl8a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl8a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8a.setText("8 de 12");

        javax.swing.GroupLayout jPanel128Layout = new javax.swing.GroupLayout(jPanel128);
        jPanel128.setLayout(jPanel128Layout);
        jPanel128Layout.setHorizontalGroup(
            jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel128Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl8a, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel128Layout.setVerticalGroup(
            jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel128Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl8a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel128);
        jPanel128.setBounds(0, 330, 70, 40);

        jPanel130.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel130Layout = new javax.swing.GroupLayout(jPanel130);
        jPanel130.setLayout(jPanel130Layout);
        jPanel130Layout.setHorizontalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel130Layout.setVerticalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel130);
        jPanel130.setBounds(0, 370, 70, 40);

        jPanel131.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel131Layout = new javax.swing.GroupLayout(jPanel131);
        jPanel131.setLayout(jPanel131Layout);
        jPanel131Layout.setHorizontalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel131Layout.setVerticalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel131);
        jPanel131.setBounds(60, 370, 90, 40);

        jPanel133.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel133Layout = new javax.swing.GroupLayout(jPanel133);
        jPanel133.setLayout(jPanel133Layout);
        jPanel133Layout.setHorizontalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel133Layout.setVerticalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel133);
        jPanel133.setBounds(70, 410, 80, 40);

        jPanel132.setBackground(new java.awt.Color(153, 215, 236));

        lbl10a.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl10a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl10a.setText("8 de 12");

        javax.swing.GroupLayout jPanel132Layout = new javax.swing.GroupLayout(jPanel132);
        jPanel132.setLayout(jPanel132Layout);
        jPanel132Layout.setHorizontalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel132Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl10a, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel132Layout.setVerticalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel132Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl10a, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel132);
        jPanel132.setBounds(0, 410, 70, 40);

        jPanel134.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel134Layout = new javax.swing.GroupLayout(jPanel134);
        jPanel134.setLayout(jPanel134Layout);
        jPanel134Layout.setHorizontalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel134Layout.setVerticalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel134);
        jPanel134.setBounds(0, 450, 70, 40);

        jPanel135.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel135Layout = new javax.swing.GroupLayout(jPanel135);
        jPanel135.setLayout(jPanel135Layout);
        jPanel135Layout.setHorizontalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel135Layout.setVerticalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel135);
        jPanel135.setBounds(60, 450, 90, 40);

        jPanel136.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel136Layout = new javax.swing.GroupLayout(jPanel136);
        jPanel136.setLayout(jPanel136Layout);
        jPanel136Layout.setHorizontalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel136Layout.setVerticalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel136);
        jPanel136.setBounds(0, 250, 70, 40);

        jPanel137.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel137Layout = new javax.swing.GroupLayout(jPanel137);
        jPanel137.setLayout(jPanel137Layout);
        jPanel137Layout.setHorizontalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel137Layout.setVerticalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel137);
        jPanel137.setBounds(60, 250, 90, 40);

        jPanel138.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel138Layout = new javax.swing.GroupLayout(jPanel138);
        jPanel138.setLayout(jPanel138Layout);
        jPanel138Layout.setHorizontalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel138Layout.setVerticalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel138);
        jPanel138.setBounds(0, 290, 70, 40);

        jPanel139.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel139Layout = new javax.swing.GroupLayout(jPanel139);
        jPanel139.setLayout(jPanel139Layout);
        jPanel139Layout.setHorizontalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel139Layout.setVerticalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel139);
        jPanel139.setBounds(60, 290, 90, 40);

        jPanel142.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel142Layout = new javax.swing.GroupLayout(jPanel142);
        jPanel142.setLayout(jPanel142Layout);
        jPanel142Layout.setHorizontalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel142Layout.setVerticalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel142);
        jPanel142.setBounds(150, 130, 80, 40);

        jPanel140.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel140Layout = new javax.swing.GroupLayout(jPanel140);
        jPanel140.setLayout(jPanel140Layout);
        jPanel140Layout.setHorizontalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel140Layout.setVerticalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel140);
        jPanel140.setBounds(150, 330, 80, 40);

        jPanel141.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel141Layout = new javax.swing.GroupLayout(jPanel141);
        jPanel141.setLayout(jPanel141Layout);
        jPanel141Layout.setHorizontalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel141Layout.setVerticalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel141);
        jPanel141.setBounds(210, 330, 100, 40);

        jPanel144.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel144Layout = new javax.swing.GroupLayout(jPanel144);
        jPanel144.setLayout(jPanel144Layout);
        jPanel144Layout.setHorizontalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel144Layout.setVerticalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel144);
        jPanel144.setBounds(150, 170, 80, 40);

        jPanel143.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel143Layout = new javax.swing.GroupLayout(jPanel143);
        jPanel143.setLayout(jPanel143Layout);
        jPanel143Layout.setHorizontalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel143Layout.setVerticalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel143);
        jPanel143.setBounds(210, 130, 100, 40);

        jPanel145.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel145Layout = new javax.swing.GroupLayout(jPanel145);
        jPanel145.setLayout(jPanel145Layout);
        jPanel145Layout.setHorizontalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel145Layout.setVerticalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel145);
        jPanel145.setBounds(210, 170, 100, 40);

        jPanel152.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel152Layout = new javax.swing.GroupLayout(jPanel152);
        jPanel152.setLayout(jPanel152Layout);
        jPanel152Layout.setHorizontalGroup(
            jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel152Layout.setVerticalGroup(
            jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel152);
        jPanel152.setBounds(410, 50, 100, 40);

        jPanel154.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel154Layout = new javax.swing.GroupLayout(jPanel154);
        jPanel154.setLayout(jPanel154Layout);
        jPanel154Layout.setHorizontalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel154Layout.setVerticalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel154);
        jPanel154.setBounds(410, 90, 100, 40);

        jPanel155.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel155Layout = new javax.swing.GroupLayout(jPanel155);
        jPanel155.setLayout(jPanel155Layout);
        jPanel155Layout.setHorizontalGroup(
            jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel155Layout.setVerticalGroup(
            jPanel155Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel155);
        jPanel155.setBounds(410, 130, 100, 40);

        jPanel158.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel158Layout = new javax.swing.GroupLayout(jPanel158);
        jPanel158.setLayout(jPanel158Layout);
        jPanel158Layout.setHorizontalGroup(
            jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel158Layout.setVerticalGroup(
            jPanel158Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel158);
        jPanel158.setBounds(410, 170, 100, 40);

        jPanel157.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel157Layout = new javax.swing.GroupLayout(jPanel157);
        jPanel157.setLayout(jPanel157Layout);
        jPanel157Layout.setHorizontalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel157Layout.setVerticalGroup(
            jPanel157Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel157);
        jPanel157.setBounds(410, 210, 100, 40);

        jPanel156.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel156Layout = new javax.swing.GroupLayout(jPanel156);
        jPanel156.setLayout(jPanel156Layout);
        jPanel156Layout.setHorizontalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel156Layout.setVerticalGroup(
            jPanel156Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel156);
        jPanel156.setBounds(410, 250, 100, 40);

        jPanel160.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel160Layout = new javax.swing.GroupLayout(jPanel160);
        jPanel160.setLayout(jPanel160Layout);
        jPanel160Layout.setHorizontalGroup(
            jPanel160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel160Layout.setVerticalGroup(
            jPanel160Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel160);
        jPanel160.setBounds(410, 290, 100, 40);

        jPanel159.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel159Layout = new javax.swing.GroupLayout(jPanel159);
        jPanel159.setLayout(jPanel159Layout);
        jPanel159Layout.setHorizontalGroup(
            jPanel159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel159Layout.setVerticalGroup(
            jPanel159Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel159);
        jPanel159.setBounds(410, 330, 100, 40);

        jPanel162.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel162Layout = new javax.swing.GroupLayout(jPanel162);
        jPanel162.setLayout(jPanel162Layout);
        jPanel162Layout.setHorizontalGroup(
            jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel162Layout.setVerticalGroup(
            jPanel162Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel162);
        jPanel162.setBounds(410, 370, 100, 40);

        jPanel161.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel161Layout = new javax.swing.GroupLayout(jPanel161);
        jPanel161.setLayout(jPanel161Layout);
        jPanel161Layout.setHorizontalGroup(
            jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel161Layout.setVerticalGroup(
            jPanel161Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel161);
        jPanel161.setBounds(410, 450, 100, 40);

        jPanel163.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel163Layout = new javax.swing.GroupLayout(jPanel163);
        jPanel163.setLayout(jPanel163Layout);
        jPanel163Layout.setHorizontalGroup(
            jPanel163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel163Layout.setVerticalGroup(
            jPanel163Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel163);
        jPanel163.setBounds(410, 410, 100, 40);

        jPanel153.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel153Layout = new javax.swing.GroupLayout(jPanel153);
        jPanel153.setLayout(jPanel153Layout);
        jPanel153Layout.setHorizontalGroup(
            jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel153Layout.setVerticalGroup(
            jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel153);
        jPanel153.setBounds(310, 50, 100, 40);

        jPanel164.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel164Layout = new javax.swing.GroupLayout(jPanel164);
        jPanel164.setLayout(jPanel164Layout);
        jPanel164Layout.setHorizontalGroup(
            jPanel164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel164Layout.setVerticalGroup(
            jPanel164Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel164);
        jPanel164.setBounds(310, 90, 100, 40);

        jPanel165.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel165Layout = new javax.swing.GroupLayout(jPanel165);
        jPanel165.setLayout(jPanel165Layout);
        jPanel165Layout.setHorizontalGroup(
            jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel165Layout.setVerticalGroup(
            jPanel165Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel165);
        jPanel165.setBounds(310, 130, 100, 40);

        jPanel166.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel166Layout = new javax.swing.GroupLayout(jPanel166);
        jPanel166.setLayout(jPanel166Layout);
        jPanel166Layout.setHorizontalGroup(
            jPanel166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel166Layout.setVerticalGroup(
            jPanel166Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel166);
        jPanel166.setBounds(310, 170, 100, 40);

        jPanel167.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel167Layout = new javax.swing.GroupLayout(jPanel167);
        jPanel167.setLayout(jPanel167Layout);
        jPanel167Layout.setHorizontalGroup(
            jPanel167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel167Layout.setVerticalGroup(
            jPanel167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel167);
        jPanel167.setBounds(310, 210, 100, 40);

        jPanel168.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel168Layout = new javax.swing.GroupLayout(jPanel168);
        jPanel168.setLayout(jPanel168Layout);
        jPanel168Layout.setHorizontalGroup(
            jPanel168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel168Layout.setVerticalGroup(
            jPanel168Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel168);
        jPanel168.setBounds(310, 250, 100, 40);

        jPanel169.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel169Layout = new javax.swing.GroupLayout(jPanel169);
        jPanel169.setLayout(jPanel169Layout);
        jPanel169Layout.setHorizontalGroup(
            jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel169Layout.setVerticalGroup(
            jPanel169Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel169);
        jPanel169.setBounds(310, 290, 100, 40);

        jPanel170.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel170Layout = new javax.swing.GroupLayout(jPanel170);
        jPanel170.setLayout(jPanel170Layout);
        jPanel170Layout.setHorizontalGroup(
            jPanel170Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel170Layout.setVerticalGroup(
            jPanel170Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel170);
        jPanel170.setBounds(310, 330, 100, 40);

        jPanel173.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel173Layout = new javax.swing.GroupLayout(jPanel173);
        jPanel173.setLayout(jPanel173Layout);
        jPanel173Layout.setHorizontalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel173Layout.setVerticalGroup(
            jPanel173Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel173);
        jPanel173.setBounds(310, 370, 100, 40);

        jPanel172.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel172Layout = new javax.swing.GroupLayout(jPanel172);
        jPanel172.setLayout(jPanel172Layout);
        jPanel172Layout.setHorizontalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel172Layout.setVerticalGroup(
            jPanel172Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel172);
        jPanel172.setBounds(310, 410, 100, 40);

        jPanel171.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel171Layout = new javax.swing.GroupLayout(jPanel171);
        jPanel171.setLayout(jPanel171Layout);
        jPanel171Layout.setHorizontalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel171Layout.setVerticalGroup(
            jPanel171Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel171);
        jPanel171.setBounds(310, 450, 100, 40);

        jPanel146.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel146Layout = new javax.swing.GroupLayout(jPanel146);
        jPanel146.setLayout(jPanel146Layout);
        jPanel146Layout.setHorizontalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel146Layout.setVerticalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel146);
        jPanel146.setBounds(230, 370, 80, 40);

        jPanel147.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel147Layout = new javax.swing.GroupLayout(jPanel147);
        jPanel147.setLayout(jPanel147Layout);
        jPanel147Layout.setHorizontalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel147Layout.setVerticalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel147);
        jPanel147.setBounds(230, 410, 80, 40);

        jPanel148.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel148Layout = new javax.swing.GroupLayout(jPanel148);
        jPanel148.setLayout(jPanel148Layout);
        jPanel148Layout.setHorizontalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel148Layout.setVerticalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel148);
        jPanel148.setBounds(230, 450, 80, 40);

        jPanel149.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel149Layout = new javax.swing.GroupLayout(jPanel149);
        jPanel149.setLayout(jPanel149Layout);
        jPanel149Layout.setHorizontalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel149Layout.setVerticalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel149);
        jPanel149.setBounds(230, 290, 80, 40);

        jPanel150.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel150Layout = new javax.swing.GroupLayout(jPanel150);
        jPanel150.setLayout(jPanel150Layout);
        jPanel150Layout.setHorizontalGroup(
            jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel150Layout.setVerticalGroup(
            jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel150);
        jPanel150.setBounds(230, 250, 80, 40);

        jPanel151.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel151Layout = new javax.swing.GroupLayout(jPanel151);
        jPanel151.setLayout(jPanel151Layout);
        jPanel151Layout.setHorizontalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel151Layout.setVerticalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel151);
        jPanel151.setBounds(230, 210, 80, 40);

        jPanel175.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel175Layout = new javax.swing.GroupLayout(jPanel175);
        jPanel175.setLayout(jPanel175Layout);
        jPanel175Layout.setHorizontalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel175Layout.setVerticalGroup(
            jPanel175Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel175);
        jPanel175.setBounds(230, 50, 80, 40);

        jPanel174.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel174Layout = new javax.swing.GroupLayout(jPanel174);
        jPanel174.setLayout(jPanel174Layout);
        jPanel174Layout.setHorizontalGroup(
            jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel174Layout.setVerticalGroup(
            jPanel174Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel174);
        jPanel174.setBounds(230, 90, 80, 40);

        jPanel176.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel176Layout = new javax.swing.GroupLayout(jPanel176);
        jPanel176.setLayout(jPanel176Layout);
        jPanel176Layout.setHorizontalGroup(
            jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel176Layout.setVerticalGroup(
            jPanel176Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel176);
        jPanel176.setBounds(150, 90, 80, 40);

        jPanel177.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel177Layout = new javax.swing.GroupLayout(jPanel177);
        jPanel177.setLayout(jPanel177Layout);
        jPanel177Layout.setHorizontalGroup(
            jPanel177Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel177Layout.setVerticalGroup(
            jPanel177Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel177);
        jPanel177.setBounds(150, 50, 80, 40);

        jPanel178.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel178Layout = new javax.swing.GroupLayout(jPanel178);
        jPanel178.setLayout(jPanel178Layout);
        jPanel178Layout.setHorizontalGroup(
            jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel178Layout.setVerticalGroup(
            jPanel178Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel178);
        jPanel178.setBounds(150, 290, 80, 40);

        jPanel179.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel179Layout = new javax.swing.GroupLayout(jPanel179);
        jPanel179.setLayout(jPanel179Layout);
        jPanel179Layout.setHorizontalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel179Layout.setVerticalGroup(
            jPanel179Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel179);
        jPanel179.setBounds(150, 250, 80, 40);

        jPanel180.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel180Layout = new javax.swing.GroupLayout(jPanel180);
        jPanel180.setLayout(jPanel180Layout);
        jPanel180Layout.setHorizontalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel180Layout.setVerticalGroup(
            jPanel180Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel180);
        jPanel180.setBounds(150, 210, 80, 40);

        jPanel183.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel183Layout = new javax.swing.GroupLayout(jPanel183);
        jPanel183.setLayout(jPanel183Layout);
        jPanel183Layout.setHorizontalGroup(
            jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel183Layout.setVerticalGroup(
            jPanel183Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel183);
        jPanel183.setBounds(150, 370, 80, 40);

        jPanel182.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel182Layout = new javax.swing.GroupLayout(jPanel182);
        jPanel182.setLayout(jPanel182Layout);
        jPanel182Layout.setHorizontalGroup(
            jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel182Layout.setVerticalGroup(
            jPanel182Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel182);
        jPanel182.setBounds(150, 410, 80, 40);

        jPanel181.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel181Layout = new javax.swing.GroupLayout(jPanel181);
        jPanel181.setLayout(jPanel181Layout);
        jPanel181Layout.setHorizontalGroup(
            jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel181Layout.setVerticalGroup(
            jPanel181Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel181);
        jPanel181.setBounds(150, 450, 80, 40);

        jPanel185.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel185Layout = new javax.swing.GroupLayout(jPanel185);
        jPanel185.setLayout(jPanel185Layout);
        jPanel185Layout.setHorizontalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel185Layout.setVerticalGroup(
            jPanel185Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel185);
        jPanel185.setBounds(510, 250, 80, 40);

        jPanel191.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel191Layout = new javax.swing.GroupLayout(jPanel191);
        jPanel191.setLayout(jPanel191Layout);
        jPanel191Layout.setHorizontalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel191Layout.setVerticalGroup(
            jPanel191Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel191);
        jPanel191.setBounds(510, 50, 80, 40);

        jPanel194.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel194Layout = new javax.swing.GroupLayout(jPanel194);
        jPanel194.setLayout(jPanel194Layout);
        jPanel194Layout.setHorizontalGroup(
            jPanel194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel194Layout.setVerticalGroup(
            jPanel194Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel194);
        jPanel194.setBounds(510, 450, 80, 40);

        jPanel189.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel189Layout = new javax.swing.GroupLayout(jPanel189);
        jPanel189.setLayout(jPanel189Layout);
        jPanel189Layout.setHorizontalGroup(
            jPanel189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel189Layout.setVerticalGroup(
            jPanel189Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel189);
        jPanel189.setBounds(510, 130, 80, 40);

        jPanel186.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel186Layout = new javax.swing.GroupLayout(jPanel186);
        jPanel186.setLayout(jPanel186Layout);
        jPanel186Layout.setHorizontalGroup(
            jPanel186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel186Layout.setVerticalGroup(
            jPanel186Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel186);
        jPanel186.setBounds(510, 330, 80, 40);

        jPanel193.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel193Layout = new javax.swing.GroupLayout(jPanel193);
        jPanel193.setLayout(jPanel193Layout);
        jPanel193Layout.setHorizontalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel193Layout.setVerticalGroup(
            jPanel193Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel193);
        jPanel193.setBounds(510, 410, 80, 40);

        jPanel184.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel184Layout = new javax.swing.GroupLayout(jPanel184);
        jPanel184.setLayout(jPanel184Layout);
        jPanel184Layout.setHorizontalGroup(
            jPanel184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel184Layout.setVerticalGroup(
            jPanel184Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel184);
        jPanel184.setBounds(510, 290, 80, 40);

        jPanel192.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel192Layout = new javax.swing.GroupLayout(jPanel192);
        jPanel192.setLayout(jPanel192Layout);
        jPanel192Layout.setHorizontalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel192Layout.setVerticalGroup(
            jPanel192Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel192);
        jPanel192.setBounds(510, 370, 80, 40);

        jPanel187.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel187Layout = new javax.swing.GroupLayout(jPanel187);
        jPanel187.setLayout(jPanel187Layout);
        jPanel187Layout.setHorizontalGroup(
            jPanel187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel187Layout.setVerticalGroup(
            jPanel187Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel187);
        jPanel187.setBounds(510, 210, 80, 40);

        jPanel188.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel188Layout = new javax.swing.GroupLayout(jPanel188);
        jPanel188.setLayout(jPanel188Layout);
        jPanel188Layout.setHorizontalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel188Layout.setVerticalGroup(
            jPanel188Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel188);
        jPanel188.setBounds(510, 170, 80, 40);

        jPanel190.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel190Layout = new javax.swing.GroupLayout(jPanel190);
        jPanel190.setLayout(jPanel190Layout);
        jPanel190Layout.setHorizontalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel190Layout.setVerticalGroup(
            jPanel190Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel190);
        jPanel190.setBounds(510, 90, 80, 40);

        jPanel196.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel196Layout = new javax.swing.GroupLayout(jPanel196);
        jPanel196.setLayout(jPanel196Layout);
        jPanel196Layout.setHorizontalGroup(
            jPanel196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel196Layout.setVerticalGroup(
            jPanel196Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel196);
        jPanel196.setBounds(670, 250, 80, 40);

        jPanel197.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel197Layout = new javax.swing.GroupLayout(jPanel197);
        jPanel197.setLayout(jPanel197Layout);
        jPanel197Layout.setHorizontalGroup(
            jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel197Layout.setVerticalGroup(
            jPanel197Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel197);
        jPanel197.setBounds(670, 330, 80, 40);

        jPanel199.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel199Layout = new javax.swing.GroupLayout(jPanel199);
        jPanel199.setLayout(jPanel199Layout);
        jPanel199Layout.setHorizontalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel199Layout.setVerticalGroup(
            jPanel199Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel199);
        jPanel199.setBounds(670, 170, 80, 40);

        jPanel203.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel203Layout = new javax.swing.GroupLayout(jPanel203);
        jPanel203.setLayout(jPanel203Layout);
        jPanel203Layout.setHorizontalGroup(
            jPanel203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel203Layout.setVerticalGroup(
            jPanel203Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel203);
        jPanel203.setBounds(670, 370, 80, 40);

        jPanel205.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel205Layout = new javax.swing.GroupLayout(jPanel205);
        jPanel205.setLayout(jPanel205Layout);
        jPanel205Layout.setHorizontalGroup(
            jPanel205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel205Layout.setVerticalGroup(
            jPanel205Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel205);
        jPanel205.setBounds(670, 450, 80, 40);

        jPanel195.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel195Layout = new javax.swing.GroupLayout(jPanel195);
        jPanel195.setLayout(jPanel195Layout);
        jPanel195Layout.setHorizontalGroup(
            jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel195Layout.setVerticalGroup(
            jPanel195Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel195);
        jPanel195.setBounds(670, 290, 80, 40);

        jPanel202.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel202Layout = new javax.swing.GroupLayout(jPanel202);
        jPanel202.setLayout(jPanel202Layout);
        jPanel202Layout.setHorizontalGroup(
            jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel202Layout.setVerticalGroup(
            jPanel202Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel202);
        jPanel202.setBounds(670, 50, 80, 40);

        jPanel204.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel204Layout = new javax.swing.GroupLayout(jPanel204);
        jPanel204.setLayout(jPanel204Layout);
        jPanel204Layout.setHorizontalGroup(
            jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel204Layout.setVerticalGroup(
            jPanel204Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel204);
        jPanel204.setBounds(670, 410, 80, 40);

        jPanel200.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel200Layout = new javax.swing.GroupLayout(jPanel200);
        jPanel200.setLayout(jPanel200Layout);
        jPanel200Layout.setHorizontalGroup(
            jPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel200Layout.setVerticalGroup(
            jPanel200Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel200);
        jPanel200.setBounds(670, 130, 80, 40);

        jPanel201.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel201Layout = new javax.swing.GroupLayout(jPanel201);
        jPanel201.setLayout(jPanel201Layout);
        jPanel201Layout.setHorizontalGroup(
            jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel201Layout.setVerticalGroup(
            jPanel201Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel201);
        jPanel201.setBounds(670, 90, 80, 40);

        jPanel198.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel198Layout = new javax.swing.GroupLayout(jPanel198);
        jPanel198.setLayout(jPanel198Layout);
        jPanel198Layout.setHorizontalGroup(
            jPanel198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel198Layout.setVerticalGroup(
            jPanel198Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel198);
        jPanel198.setBounds(670, 210, 80, 40);

        jPanel207.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel207Layout = new javax.swing.GroupLayout(jPanel207);
        jPanel207.setLayout(jPanel207Layout);
        jPanel207Layout.setHorizontalGroup(
            jPanel207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel207Layout.setVerticalGroup(
            jPanel207Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel207);
        jPanel207.setBounds(840, 250, 80, 40);

        jPanel212.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel212Layout = new javax.swing.GroupLayout(jPanel212);
        jPanel212.setLayout(jPanel212Layout);
        jPanel212Layout.setHorizontalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel212Layout.setVerticalGroup(
            jPanel212Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel212);
        jPanel212.setBounds(840, 90, 80, 40);

        jPanel216.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel216Layout = new javax.swing.GroupLayout(jPanel216);
        jPanel216.setLayout(jPanel216Layout);
        jPanel216Layout.setHorizontalGroup(
            jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel216Layout.setVerticalGroup(
            jPanel216Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel216);
        jPanel216.setBounds(840, 450, 80, 40);

        jPanel206.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel206Layout = new javax.swing.GroupLayout(jPanel206);
        jPanel206.setLayout(jPanel206Layout);
        jPanel206Layout.setHorizontalGroup(
            jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel206Layout.setVerticalGroup(
            jPanel206Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel206);
        jPanel206.setBounds(840, 290, 80, 40);

        jPanel210.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel210Layout = new javax.swing.GroupLayout(jPanel210);
        jPanel210.setLayout(jPanel210Layout);
        jPanel210Layout.setHorizontalGroup(
            jPanel210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel210Layout.setVerticalGroup(
            jPanel210Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel210);
        jPanel210.setBounds(840, 170, 80, 40);

        jPanel208.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel208Layout = new javax.swing.GroupLayout(jPanel208);
        jPanel208.setLayout(jPanel208Layout);
        jPanel208Layout.setHorizontalGroup(
            jPanel208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel208Layout.setVerticalGroup(
            jPanel208Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel208);
        jPanel208.setBounds(840, 330, 80, 40);

        jPanel215.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel215Layout = new javax.swing.GroupLayout(jPanel215);
        jPanel215.setLayout(jPanel215Layout);
        jPanel215Layout.setHorizontalGroup(
            jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel215Layout.setVerticalGroup(
            jPanel215Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel215);
        jPanel215.setBounds(840, 410, 80, 40);

        jPanel214.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel214Layout = new javax.swing.GroupLayout(jPanel214);
        jPanel214.setLayout(jPanel214Layout);
        jPanel214Layout.setHorizontalGroup(
            jPanel214Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel214Layout.setVerticalGroup(
            jPanel214Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel214);
        jPanel214.setBounds(840, 370, 80, 40);

        jPanel213.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel213Layout = new javax.swing.GroupLayout(jPanel213);
        jPanel213.setLayout(jPanel213Layout);
        jPanel213Layout.setHorizontalGroup(
            jPanel213Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel213Layout.setVerticalGroup(
            jPanel213Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel213);
        jPanel213.setBounds(840, 50, 80, 40);

        jPanel209.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel209Layout = new javax.swing.GroupLayout(jPanel209);
        jPanel209.setLayout(jPanel209Layout);
        jPanel209Layout.setHorizontalGroup(
            jPanel209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel209Layout.setVerticalGroup(
            jPanel209Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel209);
        jPanel209.setBounds(840, 210, 80, 40);

        jPanel211.setBackground(new java.awt.Color(153, 215, 236));

        javax.swing.GroupLayout jPanel211Layout = new javax.swing.GroupLayout(jPanel211);
        jPanel211.setLayout(jPanel211Layout);
        jPanel211Layout.setHorizontalGroup(
            jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel211Layout.setVerticalGroup(
            jPanel211Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel211);
        jPanel211.setBounds(840, 130, 80, 40);

        jPanel219.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel219Layout = new javax.swing.GroupLayout(jPanel219);
        jPanel219.setLayout(jPanel219Layout);
        jPanel219Layout.setHorizontalGroup(
            jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel219Layout.setVerticalGroup(
            jPanel219Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel219);
        jPanel219.setBounds(570, 130, 100, 40);

        jPanel218.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel218Layout = new javax.swing.GroupLayout(jPanel218);
        jPanel218.setLayout(jPanel218Layout);
        jPanel218Layout.setHorizontalGroup(
            jPanel218Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel218Layout.setVerticalGroup(
            jPanel218Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel218);
        jPanel218.setBounds(590, 90, 80, 40);

        jPanel222.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel222Layout = new javax.swing.GroupLayout(jPanel222);
        jPanel222.setLayout(jPanel222Layout);
        jPanel222Layout.setHorizontalGroup(
            jPanel222Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel222Layout.setVerticalGroup(
            jPanel222Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel222);
        jPanel222.setBounds(590, 250, 80, 40);

        jPanel220.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel220Layout = new javax.swing.GroupLayout(jPanel220);
        jPanel220.setLayout(jPanel220Layout);
        jPanel220Layout.setHorizontalGroup(
            jPanel220Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel220Layout.setVerticalGroup(
            jPanel220Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel220);
        jPanel220.setBounds(570, 170, 100, 40);

        jPanel223.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel223Layout = new javax.swing.GroupLayout(jPanel223);
        jPanel223.setLayout(jPanel223Layout);
        jPanel223Layout.setHorizontalGroup(
            jPanel223Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel223Layout.setVerticalGroup(
            jPanel223Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel223);
        jPanel223.setBounds(590, 290, 80, 40);

        jPanel221.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel221Layout = new javax.swing.GroupLayout(jPanel221);
        jPanel221.setLayout(jPanel221Layout);
        jPanel221Layout.setHorizontalGroup(
            jPanel221Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel221Layout.setVerticalGroup(
            jPanel221Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel221);
        jPanel221.setBounds(590, 210, 80, 40);

        jPanel224.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel224Layout = new javax.swing.GroupLayout(jPanel224);
        jPanel224.setLayout(jPanel224Layout);
        jPanel224Layout.setHorizontalGroup(
            jPanel224Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel224Layout.setVerticalGroup(
            jPanel224Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel224);
        jPanel224.setBounds(570, 330, 100, 40);

        jPanel227.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel227Layout = new javax.swing.GroupLayout(jPanel227);
        jPanel227.setLayout(jPanel227Layout);
        jPanel227Layout.setHorizontalGroup(
            jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel227Layout.setVerticalGroup(
            jPanel227Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel227);
        jPanel227.setBounds(590, 450, 80, 40);

        jPanel226.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel226Layout = new javax.swing.GroupLayout(jPanel226);
        jPanel226.setLayout(jPanel226Layout);
        jPanel226Layout.setHorizontalGroup(
            jPanel226Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel226Layout.setVerticalGroup(
            jPanel226Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel226);
        jPanel226.setBounds(590, 410, 80, 40);

        jPanel225.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel225Layout = new javax.swing.GroupLayout(jPanel225);
        jPanel225.setLayout(jPanel225Layout);
        jPanel225Layout.setHorizontalGroup(
            jPanel225Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel225Layout.setVerticalGroup(
            jPanel225Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel225);
        jPanel225.setBounds(590, 370, 80, 40);

        jPanel217.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel217Layout = new javax.swing.GroupLayout(jPanel217);
        jPanel217.setLayout(jPanel217Layout);
        jPanel217Layout.setHorizontalGroup(
            jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel217Layout.setVerticalGroup(
            jPanel217Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel217);
        jPanel217.setBounds(590, 50, 80, 40);

        jPanel228.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel228Layout = new javax.swing.GroupLayout(jPanel228);
        jPanel228.setLayout(jPanel228Layout);
        jPanel228Layout.setHorizontalGroup(
            jPanel228Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel228Layout.setVerticalGroup(
            jPanel228Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel228);
        jPanel228.setBounds(750, 50, 90, 40);

        jPanel230.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel230Layout = new javax.swing.GroupLayout(jPanel230);
        jPanel230.setLayout(jPanel230Layout);
        jPanel230Layout.setHorizontalGroup(
            jPanel230Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel230Layout.setVerticalGroup(
            jPanel230Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel230);
        jPanel230.setBounds(740, 130, 100, 40);

        jPanel234.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel234Layout = new javax.swing.GroupLayout(jPanel234);
        jPanel234.setLayout(jPanel234Layout);
        jPanel234Layout.setHorizontalGroup(
            jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel234Layout.setVerticalGroup(
            jPanel234Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel234);
        jPanel234.setBounds(750, 290, 90, 40);

        jPanel231.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel231Layout = new javax.swing.GroupLayout(jPanel231);
        jPanel231.setLayout(jPanel231Layout);
        jPanel231Layout.setHorizontalGroup(
            jPanel231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel231Layout.setVerticalGroup(
            jPanel231Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel231);
        jPanel231.setBounds(740, 170, 100, 40);

        jPanel236.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel236Layout = new javax.swing.GroupLayout(jPanel236);
        jPanel236.setLayout(jPanel236Layout);
        jPanel236Layout.setHorizontalGroup(
            jPanel236Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel236Layout.setVerticalGroup(
            jPanel236Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel236);
        jPanel236.setBounds(750, 370, 90, 40);

        jPanel233.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel233Layout = new javax.swing.GroupLayout(jPanel233);
        jPanel233.setLayout(jPanel233Layout);
        jPanel233Layout.setHorizontalGroup(
            jPanel233Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel233Layout.setVerticalGroup(
            jPanel233Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel233);
        jPanel233.setBounds(750, 250, 90, 40);

        jPanel229.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel229Layout = new javax.swing.GroupLayout(jPanel229);
        jPanel229.setLayout(jPanel229Layout);
        jPanel229Layout.setHorizontalGroup(
            jPanel229Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel229Layout.setVerticalGroup(
            jPanel229Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel229);
        jPanel229.setBounds(750, 90, 90, 40);

        jPanel235.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel235Layout = new javax.swing.GroupLayout(jPanel235);
        jPanel235.setLayout(jPanel235Layout);
        jPanel235Layout.setHorizontalGroup(
            jPanel235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel235Layout.setVerticalGroup(
            jPanel235Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel235);
        jPanel235.setBounds(740, 330, 100, 40);

        jPanel238.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel238Layout = new javax.swing.GroupLayout(jPanel238);
        jPanel238.setLayout(jPanel238Layout);
        jPanel238Layout.setHorizontalGroup(
            jPanel238Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel238Layout.setVerticalGroup(
            jPanel238Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel238);
        jPanel238.setBounds(750, 450, 90, 40);

        jPanel237.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel237Layout = new javax.swing.GroupLayout(jPanel237);
        jPanel237.setLayout(jPanel237Layout);
        jPanel237Layout.setHorizontalGroup(
            jPanel237Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel237Layout.setVerticalGroup(
            jPanel237Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel237);
        jPanel237.setBounds(750, 410, 90, 40);

        jPanel232.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel232Layout = new javax.swing.GroupLayout(jPanel232);
        jPanel232.setLayout(jPanel232Layout);
        jPanel232Layout.setHorizontalGroup(
            jPanel232Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel232Layout.setVerticalGroup(
            jPanel232Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel232);
        jPanel232.setBounds(750, 210, 90, 40);

        jPanel247.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel247Layout = new javax.swing.GroupLayout(jPanel247);
        jPanel247.setLayout(jPanel247Layout);
        jPanel247Layout.setHorizontalGroup(
            jPanel247Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel247Layout.setVerticalGroup(
            jPanel247Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel247);
        jPanel247.setBounds(920, 370, 80, 40);

        jPanel239.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel239Layout = new javax.swing.GroupLayout(jPanel239);
        jPanel239.setLayout(jPanel239Layout);
        jPanel239Layout.setHorizontalGroup(
            jPanel239Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel239Layout.setVerticalGroup(
            jPanel239Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel239);
        jPanel239.setBounds(920, 50, 80, 40);

        jPanel241.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel241Layout = new javax.swing.GroupLayout(jPanel241);
        jPanel241.setLayout(jPanel241Layout);
        jPanel241Layout.setHorizontalGroup(
            jPanel241Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel241Layout.setVerticalGroup(
            jPanel241Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel241);
        jPanel241.setBounds(900, 130, 100, 40);

        jPanel243.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel243Layout = new javax.swing.GroupLayout(jPanel243);
        jPanel243.setLayout(jPanel243Layout);
        jPanel243Layout.setHorizontalGroup(
            jPanel243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel243Layout.setVerticalGroup(
            jPanel243Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel243);
        jPanel243.setBounds(920, 210, 80, 40);

        jPanel240.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel240Layout = new javax.swing.GroupLayout(jPanel240);
        jPanel240.setLayout(jPanel240Layout);
        jPanel240Layout.setHorizontalGroup(
            jPanel240Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel240Layout.setVerticalGroup(
            jPanel240Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel240);
        jPanel240.setBounds(920, 90, 80, 40);

        jPanel245.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel245Layout = new javax.swing.GroupLayout(jPanel245);
        jPanel245.setLayout(jPanel245Layout);
        jPanel245Layout.setHorizontalGroup(
            jPanel245Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel245Layout.setVerticalGroup(
            jPanel245Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel245);
        jPanel245.setBounds(920, 290, 80, 40);

        jPanel242.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel242Layout = new javax.swing.GroupLayout(jPanel242);
        jPanel242.setLayout(jPanel242Layout);
        jPanel242Layout.setHorizontalGroup(
            jPanel242Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel242Layout.setVerticalGroup(
            jPanel242Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel242);
        jPanel242.setBounds(900, 170, 100, 40);

        jPanel246.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel246Layout = new javax.swing.GroupLayout(jPanel246);
        jPanel246.setLayout(jPanel246Layout);
        jPanel246Layout.setHorizontalGroup(
            jPanel246Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel246Layout.setVerticalGroup(
            jPanel246Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel246);
        jPanel246.setBounds(900, 330, 100, 40);

        jPanel249.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel249Layout = new javax.swing.GroupLayout(jPanel249);
        jPanel249.setLayout(jPanel249Layout);
        jPanel249Layout.setHorizontalGroup(
            jPanel249Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel249Layout.setVerticalGroup(
            jPanel249Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel249);
        jPanel249.setBounds(920, 450, 80, 40);

        jPanel244.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel244Layout = new javax.swing.GroupLayout(jPanel244);
        jPanel244.setLayout(jPanel244Layout);
        jPanel244Layout.setHorizontalGroup(
            jPanel244Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel244Layout.setVerticalGroup(
            jPanel244Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel244);
        jPanel244.setBounds(920, 250, 80, 40);

        jPanel248.setBackground(new java.awt.Color(84, 251, 84));

        javax.swing.GroupLayout jPanel248Layout = new javax.swing.GroupLayout(jPanel248);
        jPanel248.setLayout(jPanel248Layout);
        jPanel248Layout.setHorizontalGroup(
            jPanel248Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel248Layout.setVerticalGroup(
            jPanel248Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel248);
        jPanel248.setBounds(920, 410, 80, 40);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 130, 173));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("JUEVES");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(530, 10, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(160, 100, 1000, 490);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("10:00 - 11:00");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 200, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("12:00 - 13:00");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 280, 120, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("13:00 - 14:00");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 320, 120, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("14:00 - 15:00");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 360, 120, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("15:00 - 16:00");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 400, 120, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("16:00 - 17:00");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 440, 120, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("17:00 - 18:00");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 480, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("18:00 - 19:00");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 520, 120, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("19:00 - 20:00");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 560, 120, 30);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("11:00 - 12:00");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(30, 240, 120, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("9:00 - 10:00");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 160, 120, 30);

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/logo2.jpg"))); // NOI18N
        getContentPane().add(jLabel43);
        jLabel43.setBounds(1150, 0, 100, 100);

        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Horarios disponibles");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(160, 590, 310, 30);

        btninscripicion.setBackground(new java.awt.Color(0, 153, 204));
        btninscripicion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btninscripicion.setText("Ir a inscripción");
        btninscripicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscripicionActionPerformed(evt);
            }
        });
        getContentPane().add(btninscripicion);
        btninscripicion.setBounds(990, 590, 170, 50);

        lblimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/azul claro 1.jpg"))); // NOI18N
        getContentPane().add(lblimagen);
        lblimagen.setBounds(0, 0, 1280, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btninscripicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscripicionActionPerformed
        Inscripciones ins = new Inscripciones();
        ins.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btninscripicionActionPerformed

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
            java.util.logging.Logger.getLogger(horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(horarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new horarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btninscripicion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel155;
    private javax.swing.JPanel jPanel156;
    private javax.swing.JPanel jPanel157;
    private javax.swing.JPanel jPanel158;
    private javax.swing.JPanel jPanel159;
    private javax.swing.JPanel jPanel160;
    private javax.swing.JPanel jPanel161;
    private javax.swing.JPanel jPanel162;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel168;
    private javax.swing.JPanel jPanel169;
    private javax.swing.JPanel jPanel170;
    private javax.swing.JPanel jPanel171;
    private javax.swing.JPanel jPanel172;
    private javax.swing.JPanel jPanel173;
    private javax.swing.JPanel jPanel174;
    private javax.swing.JPanel jPanel175;
    private javax.swing.JPanel jPanel176;
    private javax.swing.JPanel jPanel177;
    private javax.swing.JPanel jPanel178;
    private javax.swing.JPanel jPanel179;
    private javax.swing.JPanel jPanel180;
    private javax.swing.JPanel jPanel181;
    private javax.swing.JPanel jPanel182;
    private javax.swing.JPanel jPanel183;
    private javax.swing.JPanel jPanel184;
    private javax.swing.JPanel jPanel185;
    private javax.swing.JPanel jPanel186;
    private javax.swing.JPanel jPanel187;
    private javax.swing.JPanel jPanel188;
    private javax.swing.JPanel jPanel189;
    private javax.swing.JPanel jPanel190;
    private javax.swing.JPanel jPanel191;
    private javax.swing.JPanel jPanel192;
    private javax.swing.JPanel jPanel193;
    private javax.swing.JPanel jPanel194;
    private javax.swing.JPanel jPanel195;
    private javax.swing.JPanel jPanel196;
    private javax.swing.JPanel jPanel197;
    private javax.swing.JPanel jPanel198;
    private javax.swing.JPanel jPanel199;
    private javax.swing.JPanel jPanel200;
    private javax.swing.JPanel jPanel201;
    private javax.swing.JPanel jPanel202;
    private javax.swing.JPanel jPanel203;
    private javax.swing.JPanel jPanel204;
    private javax.swing.JPanel jPanel205;
    private javax.swing.JPanel jPanel206;
    private javax.swing.JPanel jPanel207;
    private javax.swing.JPanel jPanel208;
    private javax.swing.JPanel jPanel209;
    private javax.swing.JPanel jPanel210;
    private javax.swing.JPanel jPanel211;
    private javax.swing.JPanel jPanel212;
    private javax.swing.JPanel jPanel213;
    private javax.swing.JPanel jPanel214;
    private javax.swing.JPanel jPanel215;
    private javax.swing.JPanel jPanel216;
    private javax.swing.JPanel jPanel217;
    private javax.swing.JPanel jPanel218;
    private javax.swing.JPanel jPanel219;
    private javax.swing.JPanel jPanel220;
    private javax.swing.JPanel jPanel221;
    private javax.swing.JPanel jPanel222;
    private javax.swing.JPanel jPanel223;
    private javax.swing.JPanel jPanel224;
    private javax.swing.JPanel jPanel225;
    private javax.swing.JPanel jPanel226;
    private javax.swing.JPanel jPanel227;
    private javax.swing.JPanel jPanel228;
    private javax.swing.JPanel jPanel229;
    private javax.swing.JPanel jPanel230;
    private javax.swing.JPanel jPanel231;
    private javax.swing.JPanel jPanel232;
    private javax.swing.JPanel jPanel233;
    private javax.swing.JPanel jPanel234;
    private javax.swing.JPanel jPanel235;
    private javax.swing.JPanel jPanel236;
    private javax.swing.JPanel jPanel237;
    private javax.swing.JPanel jPanel238;
    private javax.swing.JPanel jPanel239;
    private javax.swing.JPanel jPanel240;
    private javax.swing.JPanel jPanel241;
    private javax.swing.JPanel jPanel242;
    private javax.swing.JPanel jPanel243;
    private javax.swing.JPanel jPanel244;
    private javax.swing.JPanel jPanel245;
    private javax.swing.JPanel jPanel246;
    private javax.swing.JPanel jPanel247;
    private javax.swing.JPanel jPanel248;
    private javax.swing.JPanel jPanel249;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbj10a;
    private javax.swing.JLabel lbj10k;
    private javax.swing.JLabel lbj11a;
    private javax.swing.JLabel lbj11k;
    private javax.swing.JLabel lbj1a;
    private javax.swing.JLabel lbj1k;
    private javax.swing.JLabel lbj2a;
    private javax.swing.JLabel lbj2k;
    private javax.swing.JLabel lbj3a;
    private javax.swing.JLabel lbj3k;
    private javax.swing.JLabel lbj4a;
    private javax.swing.JLabel lbj4k;
    private javax.swing.JLabel lbj5a;
    private javax.swing.JLabel lbj5k;
    private javax.swing.JLabel lbj6a;
    private javax.swing.JLabel lbj6k;
    private javax.swing.JLabel lbj7a;
    private javax.swing.JLabel lbj7k;
    private javax.swing.JLabel lbj8a;
    private javax.swing.JLabel lbj8k;
    private javax.swing.JLabel lbj9a;
    private javax.swing.JLabel lbj9k;
    private javax.swing.JLabel lbl10a;
    private javax.swing.JLabel lbl10k;
    private javax.swing.JLabel lbl11a;
    private javax.swing.JLabel lbl11k;
    private javax.swing.JLabel lbl1a;
    private javax.swing.JLabel lbl1k;
    private javax.swing.JLabel lbl2a;
    private javax.swing.JLabel lbl2k;
    private javax.swing.JLabel lbl3a;
    private javax.swing.JLabel lbl3k;
    private javax.swing.JLabel lbl4a;
    private javax.swing.JLabel lbl4k;
    private javax.swing.JLabel lbl5a;
    private javax.swing.JLabel lbl5k;
    private javax.swing.JLabel lbl6a;
    private javax.swing.JLabel lbl6k;
    private javax.swing.JLabel lbl7a;
    private javax.swing.JLabel lbl7k;
    private javax.swing.JLabel lbl8a;
    private javax.swing.JLabel lbl8k;
    private javax.swing.JLabel lbl9a;
    private javax.swing.JLabel lbl9k;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JLabel lbm10a;
    private javax.swing.JLabel lbm10k;
    private javax.swing.JLabel lbm11a;
    private javax.swing.JLabel lbm11k;
    private javax.swing.JLabel lbm1a;
    private javax.swing.JLabel lbm1k;
    private javax.swing.JLabel lbm2a;
    private javax.swing.JLabel lbm2k;
    private javax.swing.JLabel lbm3a;
    private javax.swing.JLabel lbm3k;
    private javax.swing.JLabel lbm4a;
    private javax.swing.JLabel lbm4k;
    private javax.swing.JLabel lbm5a;
    private javax.swing.JLabel lbm5k;
    private javax.swing.JLabel lbm6a;
    private javax.swing.JLabel lbm6k;
    private javax.swing.JLabel lbm7a;
    private javax.swing.JLabel lbm7k;
    private javax.swing.JLabel lbm8a;
    private javax.swing.JLabel lbm8k;
    private javax.swing.JLabel lbm9a;
    private javax.swing.JLabel lbm9k;
    private javax.swing.JLabel lbmi10a;
    private javax.swing.JLabel lbmi10k;
    private javax.swing.JLabel lbmi11a;
    private javax.swing.JLabel lbmi11k;
    private javax.swing.JLabel lbmi1a;
    private javax.swing.JLabel lbmi1k;
    private javax.swing.JLabel lbmi2a;
    private javax.swing.JLabel lbmi2k;
    private javax.swing.JLabel lbmi3a;
    private javax.swing.JLabel lbmi3k;
    private javax.swing.JLabel lbmi4a;
    private javax.swing.JLabel lbmi4k;
    private javax.swing.JLabel lbmi5a;
    private javax.swing.JLabel lbmi5k;
    private javax.swing.JLabel lbmi6a;
    private javax.swing.JLabel lbmi6k;
    private javax.swing.JLabel lbmi7a;
    private javax.swing.JLabel lbmi7k;
    private javax.swing.JLabel lbmi8a;
    private javax.swing.JLabel lbmi8k;
    private javax.swing.JLabel lbmi9a;
    private javax.swing.JLabel lbmi9k;
    private javax.swing.JLabel lbs10a;
    private javax.swing.JLabel lbs10k;
    private javax.swing.JLabel lbs11a;
    private javax.swing.JLabel lbs11k;
    private javax.swing.JLabel lbs1a;
    private javax.swing.JLabel lbs1k;
    private javax.swing.JLabel lbs2a;
    private javax.swing.JLabel lbs2k;
    private javax.swing.JLabel lbs3a;
    private javax.swing.JLabel lbs3k;
    private javax.swing.JLabel lbs4a;
    private javax.swing.JLabel lbs4k;
    private javax.swing.JLabel lbs5a;
    private javax.swing.JLabel lbs5k;
    private javax.swing.JLabel lbs6a;
    private javax.swing.JLabel lbs6k;
    private javax.swing.JLabel lbs7a;
    private javax.swing.JLabel lbs7k;
    private javax.swing.JLabel lbs8a;
    private javax.swing.JLabel lbs8k;
    private javax.swing.JLabel lbs9a;
    private javax.swing.JLabel lbs9k;
    private javax.swing.JLabel lbv10a;
    private javax.swing.JLabel lbv10k;
    private javax.swing.JLabel lbv11a;
    private javax.swing.JLabel lbv11k;
    private javax.swing.JLabel lbv1a;
    private javax.swing.JLabel lbv1k;
    private javax.swing.JLabel lbv2a;
    private javax.swing.JLabel lbv2k;
    private javax.swing.JLabel lbv3a;
    private javax.swing.JLabel lbv3k;
    private javax.swing.JLabel lbv4a;
    private javax.swing.JLabel lbv4k;
    private javax.swing.JLabel lbv5a;
    private javax.swing.JLabel lbv5k;
    private javax.swing.JLabel lbv6a;
    private javax.swing.JLabel lbv6k;
    private javax.swing.JLabel lbv7a;
    private javax.swing.JLabel lbv7k;
    private javax.swing.JLabel lbv8a;
    private javax.swing.JLabel lbv8k;
    private javax.swing.JLabel lbv9a;
    private javax.swing.JLabel lbv9k;
    // End of variables declaration//GEN-END:variables
}
