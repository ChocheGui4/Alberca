/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Choche
 */
public class tabla {

    static conexion con = new conexion();
    public static PreparedStatement s;
    public static Connection conn = null;
    private String sSQL = "";
    public Integer totalregistros;

    public static void main(String[] args) {
        tabla tab = new tabla();
        tab.contarhorarios(8, "Lunes", 1);
//
//        tab.contarhorarios(8);
    }

    //Capturar imagen
    public byte[] mostrarimagen(int id) {
        conn = con.conectar();

        sSQL = "select * from usuario where id_usuario='" + id + "'";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            byte[] image = null;
            while (rs.next()) {
                image = rs.getBytes("foto");

            }
            System.out.println("foto retorna");
            return image;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Método para mostrar usuarios totales del centro acuático
    public DefaultTableModel mostrar(String buscar) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"ID", "Clave", "Nombre", "Apellidos", "Edad", "localidad", "calle",
            "no_interno", "no_externo", "telefono", "celular", "nombre del tutor",
            "fecha de inicio", "fecha de termino", "id mes", "id maestro", "foto", "sesiones"};

        String[] registro = new String[18];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;

            }

        };

        sSQL = "select * from usuario join mensualidad on mensualidad.id_mensualidad ="
                + "usuario.mensualidad_id join dias on dias.mensualidad_id = mensualidad.id_mensualidad"
                + " where clave like '%" + buscar + "%' or nombre like '%" + buscar + "%' group by usuario.mensualidad_id "
                + "order by id_usuario";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_usuario");
                registro[1] = rs.getString("clave");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("apellidos");
                registro[4] = rs.getString("edad");
                registro[5] = rs.getString("localidad");
                registro[6] = rs.getString("calle");
                registro[7] = rs.getString("numero_e");
                registro[8] = rs.getString("numero_i");
                registro[9] = rs.getString("telefono_1");
                registro[10] = rs.getString("celular_1");
                registro[11] = rs.getString("nombre_tutor");
                registro[12] = rs.getString("fecha_ini");
                registro[13] = rs.getString("fecha_fin");
                registro[14] = rs.getString("mensualidad_id");
                registro[15] = rs.getString("maestros_id");
                registro[16] = rs.getString("foto");
                registro[17] = rs.getString("sesiones");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Mostrar a maestros
    public DefaultTableModel mostrarmaestros(String buscar) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"No.", "id", "Nombre del instructor"};

        String[] registro = new String[3];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;

            }

        };

        sSQL = "select * from maestros order by id_maestros";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            int idma = 0;
            while (rs.next()) {
                registro[0] = "" + (idma += 1);
                registro[1] = rs.getString("id_maestros");
                registro[2] = rs.getString("nombre") + " " + rs.getString("apellidos");
                modelo.addRow(registro);

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Método para mostrar usuarios eliminados del centro acuático
    public DefaultTableModel mostrareliminados(String buscar) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"ID", "Nombre", "Nombre completo", "Apellidos", "Edad",
            "localidad", "Dirección", "calle", "N. interior", "No. exterior",
            "telefono", "celular", "nombre del tutor"};

        String[] registro = new String[13];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;

            }

        };

        sSQL = "select * from usuarios_eliminados where nombre like '%" + buscar + "%' and nombre!=''"
                + " order by id_usuario";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                registro[0] = rs.getString("id_usuario");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("nombre") + " ";
                registro[2] += rs.getString("apellidos");
                registro[3] = rs.getString("apellidos");
                registro[4] = rs.getString("edad");
                registro[5] = rs.getString("localidad");
                registro[6] = rs.getString("localidad") + " ";
                registro[6] += rs.getString("calle") + " ";
                registro[6] += rs.getString("numero_e") + " ";
                registro[6] += rs.getString("numero_i");
                registro[7] = rs.getString("calle");
                registro[8] = rs.getString("numero_e");
                registro[9] = rs.getString("numero_i");
                registro[10] = rs.getString("telefono_1");
                registro[11] = rs.getString("celular_1");
                registro[12] = rs.getString("nombre_tutor");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Llnar horarios
    public JComboBox mostrarhorarios(JComboBox combo1, String dia, int maestro) {
        conn = con.conectar();
//        System.out.println("Se metió al método");

        sSQL = "select * from horario order by hora_num";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            int val = 0, cont = 1;
            while (rs.next()) {

                val = contarhorarios(cont, dia, maestro);
                if ((val / 4) < 5) {
                    combo1.addItem(rs.getString("horario"));
                }
                cont += 1;

            }
//            System.out.println("antes del return");
            return combo1;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Contar horarios disponibles
    public int contarhorarios(int id, String dia, int maestro) {
        conn = con.conectar();
//        System.out.println("Se metió al método");

        sSQL = " select count(*) as hola from maestros join dias on"
                + " dias.maestros_id = maestros.id_maestros join horario on"
                + " dias.horario_id = horario.id_horario where id_horario='" + id + "' "
                + "and dias_nombre='" + dia + "' and maestros_id='" + maestro + "'";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            int numero = 1;
            while (rs.next()) {
                numero = rs.getInt("hola");
//                JOptionPane.showConfirmDialog(null, "Resultado: " + rs.getInt("hola"));
            }

//            System.out.println("antes del return");
//            return combo1;
            return numero;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return 0;
        }
    }

    //Llenar maestros
    public JComboBox mostrarmaestros(JComboBox combo1) {
        conn = con.conectar();
//        System.out.println("Se metió al método");

        sSQL = "select * from maestros order by id_maestros";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            System.out.println("Antes de");
//            combo1.addItem("Seleccione un maestro");
            while (rs.next()) {
                System.out.println("Se metiò");
//                System.out.println("se metio a la iteración: "+rs.getString("nombre"));
                combo1.addItem(rs.getString("nombre") + " " + rs.getString("apellidos"));
                System.out.println(rs.getString("nombre")+" <-.");
//                System.out.println("se metio a la iteración: "+rs.getString("nombre"));

            }
//            System.out.println("antes del return");
            return combo1;
        } catch (Exception e) {
            System.out.println("Errorttt: "+ e);
            return null;
        }
    }

    //Llenar id de maestro
    public JComboBox mostraridmaestros(JComboBox combo1) {
        conn = con.conectar();
//        System.out.println("Se metió al método");

        sSQL = "select * from maestros order by id_maestros";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
//            combo1.addItem("0");
            while (rs.next()) {
                combo1.addItem(rs.getString("id_maestros"));

            }
//            System.out.println("antes del return");
            return combo1;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Llenar tabla de horario
    public DefaultTableModel mostrarhorario(String buscar) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"};

        String[] registro = new String[6];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;

            }

        };

        sSQL = "select count(*) as dato from usuario";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                System.out.println(rs.getString("dato"));
                registro[0] = rs.getString("dato");
                registro[1] = rs.getString("dato");
                registro[2] = rs.getString("dato");
                modelo.addColumn(registro);

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Llenar id de horario
    public JComboBox mostraridhorario(JComboBox combo1) {
        conn = con.conectar();
//        System.out.println("Se metió al método");

        sSQL = "select * from horario order by hora_num";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                combo1.addItem(rs.getString("id_horario"));

            }
//            System.out.println("antes del return");
            return combo1;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Mostrar claves disponibles
    public JComboBox consultarclaves(JComboBox combo1) {
        conn = con.conectar();
//        System.out.println("Se metió al método");

        sSQL = "select * from usuario where nombre='' order by clave";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                combo1.addItem(rs.getString("clave"));

            }
//            System.out.println("antes del return");
            return combo1;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public JComboBox consultarids(JComboBox combo2) {
        conn = con.conectar();
//        System.out.println("Se metió al método");

        sSQL = "select * from usuario where nombre='' order by clave";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);

            while (rs.next()) {
                combo2.addItem(rs.getString("id_usuario"));

            }
//            System.out.println("antes del return");
            return combo2;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Mostrar datos completos de usuarios
    public DefaultTableModel mostrardatoscompletos(String buscar) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"ID", "Clave", "Nombre", "Apellidos", "Fecha de nacimiento", "localidad", "calle",
            "no_interno", "no_externo", "telefono", "celular", "nombre del tutor",
            "fecha de inicio", "fecha de termino", "Día Mes/Día", "Horario"};

        String[] registro = new String[16];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
//                if (columna == 11) {
//                    return true;
//                } else {
//                    return false;
//                }
                return false;

            }

        };
        int conti = 1, contador = 1;
        sSQL = "select * from usuario join mensualidad on usuario.mensualidad_id = mensualidad.id_mensualidad"
                + " join dias on dias.mensualidad_id = mensualidad.id_mensualidad join horario on dias.horario_id = "
                + "horario.id_horario where clave like '%" + buscar + "%' or nombre like '%" + buscar + "%' "
                + "order by clave";
//        System.out.println("Después de la consulta");
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            String clav = "", clavus = "";

            int sesion = 0;
            while (rs.next()) {

                registro[0] = rs.getString("id_usuario");
                registro[1] = rs.getString("clave");
                registro[2] = rs.getString("nombre") + " ";
                registro[2] += rs.getString("apellidos");
                registro[3] = rs.getString("apellidos");
                registro[4] = rs.getString("edad");
                registro[5] = rs.getString("localidad");
                registro[6] = rs.getString("calle");
                registro[7] = rs.getString("numero_e");
                registro[8] = rs.getString("numero_i");
                registro[9] = rs.getString("telefono_1");
                registro[10] = rs.getString("celular_1");
                registro[11] = rs.getString("nombre_tutor");
                registro[12] = rs.getString("fecha_ini");
                registro[13] = rs.getString("fecha_fin");
                registro[14] = "<html>";
                registro[14] += rs.getString("dias_nombre") + " ";
//                registro[14] += "<br>";
                registro[14] += rs.getString("mes_num") + "/";
                registro[14] += rs.getString("dias_num");
                registro[14] += "</html>";
                registro[15] = rs.getString("horario");
                totalregistros = totalregistros + 1;
                sesion = Integer.parseInt(rs.getString("sesiones"));
                if (contador == (sesion * 4)) {
                    registro[1] = "";
                    registro[2] = "";
                    registro[3] = "";
                    registro[4] = "";
                    registro[5] = "";
                    registro[6] = "";
                    registro[7] = "";
                    registro[8] = "";
                    registro[9] = "";
                    registro[10] = "";
                    registro[11] = "";
                    registro[12] = "";
                    registro[13] = "";
                    System.out.println("Numero......: " + sesion + " -> Más contador: " + conti);
                    conti = 1;
                    contador = 1;
                } else if (conti > sesion) {
                    registro[1] = "";
                    registro[2] = "";
                    registro[3] = "";
                    registro[4] = "";
                    registro[5] = "";
                    registro[6] = "";
                    registro[7] = "";
                    registro[8] = "";
                    registro[9] = "";
                    registro[10] = "";
                    registro[11] = "";
                    registro[12] = "";
                    registro[13] = "";
                    System.out.println("A ver.... " + conti + " y sesión: " + sesion);
                    conti = conti + 1;
                    contador += 1;
                } else if (conti == 1) {
                    System.out.println("respeta:" + conti);
//                    registro[1] = rs.getString("clave");
                    conti = sesion + 1;
                    contador = contador + 1;
                }
//                clav=rs.getString("clave");
//                clavus="AYO00"+rs.getString("id_usuario");
//                if(clav.equals(clavus) & conti==0){
////                    registro[1] = "";
//                    conti=1;
//                }else{
//                    registro[1] = "";
//                    
//                }
                modelo.addRow(registro);

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    //Mostrar alumnos por hora y por día en horario disponible
    public DefaultTableModel mostraralumnos(String dia, int numero) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"Horario", "Nombre completo",
            "fecha de inicio", "fecha de termino"};

        String[] registro = new String[4];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
//                if (columna == 11) {
//                    return true;
//                } else {
//                    return false;
//                }
                return false;

            }

        };
//        sSQL = "select * from usuario join mensualidad on usuario.mensualidad_id=id_mensualidad join "
//                + "dias on id_mensualidad=dias.mensualidad_id join horario on horario.id_horario=dias.horario_id "
//                + "where horario_id=1 and dias_nombre='Lunes' group by usuario.clave;";

//        System.out.println("Después de la consulta");
        try {
            int conti = 0;
            for (int i = 1; i <= 14; i++) {

//                sSQL = "select * from usuario join mensualidad on usuario.mensualidad_id=id_mensualidad join "
//                        + "dias on id_mensualidad=dias.mensualidad_id join horario on horario.id_horario=dias.horario_id "
//                        + "where horario_id=" + i + " and dias_nombre='" + dia + "' group by usuario.clave;";
                sSQL = "select * from usuario join mensualidad on usuario.mensualidad_id=id_mensualidad join"
                        + " dias on id_mensualidad=dias.mensualidad_id join maestros on dias.maestros_id=id_maestros"
                        + " where horario_id=" + i + " and dias_nombre='" + dia + "' and"
                        + " maestros_id="+numero+" group by usuario.clave;";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sSQL);
                if (i == 1) {
                    registro[0] = "6:00 - 7:00";
                } else if (i == 2) {
                    registro[0] = "7:00 - 8:00";
                } else if (i == 3) {
                    registro[0] = "8:00 - 9:00";
                } else if (i == 4) {
                    registro[0] = "9:00 - 10:00";
//                    System.out.println("999999");
                } else if (i == 5) {
                    registro[0] = "10:00 - 11:00";
                } else if (i == 6) {
                    registro[0] = "11:00 - 12:00";
                } else if (i == 7) {
                    registro[0] = "12:00 - 13:00";
                } else if (i == 8) {
                    registro[0] = "13:00 - 14:00";
                } else if (i == 9) {
                    registro[0] = "14:00 - 15:00";
                } else if (i == 10) {
                    registro[0] = "15:00 - 16:00";
                } else if (i == 11) {
                    registro[0] = "16:00 - 17:00";
                } else if (i == 12) {
                    registro[0] = "17:00 - 18:00";
                } else if (i == 13) {
                    registro[0] = "18:00 - 19:00";
                } else if (i == 14) {
                    registro[0] = "19:00 - 20:00";
                }

                while (rs.next()) {
                    conti++;
                    if (conti > 1) {
                        registro[0] = "";
                    }
                    registro[1] = rs.getString("nombre") + " " + rs.getString("apellidos");
                    registro[2] = rs.getString("fecha_ini");
                    registro[3] = rs.getString("fecha_fin");
                    totalregistros = totalregistros + 1;
                    modelo.addRow(registro);

                }
                conti = 0;

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            System.out.println("Error: "+e);
            return null;
        }
    }

    //Mostrar datos de usuario para recuperar día perdido
    public DefaultTableModel mostrarusuariosdiaperdido(String buscar) {
        conn = con.conectar();
        DefaultTableModel modelo;
//        System.out.println("Se metió al método");

        String[] titulos = {"ID", "No. usuario", "Clave", "Nombre", "Apellidos", "localidad", "Sesiones",
            "fecha de inicio", "fecha de termino", "id mes"};

        String[] registro = new String[10];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int fila, int columna) {
                return false;

            }

        };

        sSQL = "select * from usuario join mensualidad on mensualidad.id_mensualidad ="
                + "usuario.mensualidad_id where clave like '%" + buscar + "%' or nombre"
                + " like '%" + buscar + "%' order by nombre";
//        System.out.println("Después de la consulta");

        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            int contar = 1;

            while (rs.next()) {
                registro[0] = rs.getString("id_usuario");
                registro[1] = "" + contar;
                registro[2] = rs.getString("clave");
                registro[3] = rs.getString("nombre");
                registro[4] = rs.getString("apellidos");
                registro[5] = rs.getString("localidad");
                registro[6] = "" + (rs.getInt("sesiones") * 4);
                registro[7] = rs.getString("fecha_ini");
                registro[8] = rs.getString("fecha_fin");
                registro[9] = rs.getString("mensualidad_id");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
                contar += 1;

            }
//            System.out.println("antes del return");
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}
