/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Conexio;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Budha
 */
public class InsertarJuego extends javax.swing.JDialog {
    private String dni;
    /**
     * Creates new form InsertarJuego
     */
    public InsertarJuego(java.awt.Frame parent, boolean modal,String dni) {
        super(parent, modal);
        this.dni = dni;
        initComponents();
        this.setTitle("Insertar Juego");
        this.getContentPane().setBackground(new Color(243, 245, 246));
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
        jTextFieldNombreJuego = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneDescripcion = new javax.swing.JTextPane();
        jCheckBoxPS3 = new javax.swing.JCheckBox();
        jCheckBoxPS4 = new javax.swing.JCheckBox();
        jCheckBoxPSvita = new javax.swing.JCheckBox();
        jCheckBoxPC = new javax.swing.JCheckBox();
        jCheckBoxMAC = new javax.swing.JCheckBox();
        jCheckBoxWeb = new javax.swing.JCheckBox();
        jCheckBoxAndroid = new javax.swing.JCheckBox();
        jCheckBoxIphone = new javax.swing.JCheckBox();
        jButtonInsertar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jCheckBoxMultijugador = new javax.swing.JCheckBox();
        jCheckBoxWii = new javax.swing.JCheckBox();
        jCheckBoxWiiU = new javax.swing.JCheckBox();
        jCheckBox3DS = new javax.swing.JCheckBox();
        jCheckBoxXBox360 = new javax.swing.JCheckBox();
        jCheckBoxXBoxOne = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre de juego");

        jLabel2.setText("Descripción");

        jLabel3.setText("Plataformas");

        jScrollPane1.setViewportView(jTextPaneDescripcion);

        jCheckBoxPS3.setText("PS3");

        jCheckBoxPS4.setText("PS4");

        jCheckBoxPSvita.setText("PS Vita");

        jCheckBoxPC.setText("PC");

        jCheckBoxMAC.setText("MAC");

        jCheckBoxWeb.setText("Web");

        jCheckBoxAndroid.setText("Android");

        jCheckBoxIphone.setText("iPhone");

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });

        jCheckBoxMultijugador.setText("Multijugador");

        jCheckBoxWii.setText("Wii");

        jCheckBoxWiiU.setText("WiiU");

        jCheckBox3DS.setText("3DS");

        jCheckBoxXBox360.setText("XBox360");

        jCheckBoxXBoxOne.setText("XBoxOne");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxPS3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBoxPS4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxPC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCheckBoxMAC)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxWeb)
                                    .addComponent(jCheckBoxPSvita)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jTextFieldNombreJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBoxWii)
                                        .addGap(12, 12, 12)
                                        .addComponent(jCheckBoxWiiU))
                                    .addComponent(jCheckBoxAndroid)
                                    .addComponent(jCheckBoxXBox360))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxIphone)
                                    .addComponent(jCheckBox3DS)
                                    .addComponent(jCheckBoxXBoxOne)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonInsertar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCerrar))))
                    .addComponent(jCheckBoxMultijugador))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombreJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCheckBoxPS4)
                    .addComponent(jCheckBoxPSvita)
                    .addComponent(jCheckBoxPS3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPC)
                    .addComponent(jCheckBoxMAC)
                    .addComponent(jCheckBoxWeb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxWii)
                    .addComponent(jCheckBoxWiiU)
                    .addComponent(jCheckBox3DS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxAndroid)
                    .addComponent(jCheckBoxIphone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxXBox360)
                    .addComponent(jCheckBoxXBoxOne))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxMultijugador)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsertar)
                    .addComponent(jButtonCerrar))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarActionPerformed
    
    private boolean comprobarExistenciaJuego(String juego){
        boolean existe = false;
        String query = "";

        //Proceso
        Conexio mysql = new Conexio();
        Connection cn = mysql.conectar();

        query = "SELECT NombreJuego FROM juegos WHERE NombreJuego = '" + juego + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                if (rs.getString("Dni").contentEquals(juego)) {
                    JOptionPane.showMessageDialog(null, "El DNI introducido ya existe.\n Conectese con su cuenta.");
                    existe = true;
                }
            }
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
        } 
        finally {
            if (cn != null) {
                try {
                    cn.close();
                    cn = null;
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }

        return existe;
    }
        
    
    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        Conexio mysql = new Conexio();
        Connection conn = mysql.conectar();

        int n = -1;
        int m = -1; //Guardar cambios en base de datos
        int o = -1;
        
        boolean ok; //Validar variables
        String queryJuegos; //Consulta de la tabla Juegos
        String queryJuegos_has_Plataformas; //Consulta de la tabla Juegos_has_Plataformas
        String queryUsuarios_has_juegos; //insert relacion usuario-juegos
        String nombreJuego, descripcion;
        ArrayList<Integer> plataformas = new ArrayList<Integer>();
        boolean multijugador = false;

        nombreJuego = jTextFieldNombreJuego.getText();
        descripcion = jTextPaneDescripcion.getText();
        plataformas = plataformasSeleccionadas(conn);
        if (jCheckBoxMultijugador.isSelected()) {
            multijugador = true;
        }

        ok = validarVariables(nombreJuego, descripcion, plataformas);

        if (ok) {
            queryJuegos = "INSERT INTO Juegos VALUES (?, ?, ?)";
            queryJuegos_has_Plataformas = "INSERT INTO Juegos_has_Plataformas VALUES (?, ?)";
            queryUsuarios_has_juegos = "INSERT INTO usuarios_has_juegos VALUES (?,?)";
            try {
                //Guarda los valores obtenidos de los campos en la base de datos.
                //Tabla JUEGOS
                PreparedStatement psJuegos = conn.prepareStatement(queryJuegos);
                psJuegos.setString(1, nombreJuego);
                psJuegos.setString(2, descripcion);
                psJuegos.setBoolean(3, multijugador);

                n = psJuegos.executeUpdate();

                //Tabla Juegos_has_Plataformas            
                PreparedStatement psJuegosPlataformas = conn.prepareStatement(queryJuegos_has_Plataformas);
                for (int i = 0; i < plataformas.size(); i++) {
                    psJuegosPlataformas.setString(1, nombreJuego);
                    psJuegosPlataformas.setInt(2, plataformas.get(i));
                    m = psJuegosPlataformas.executeUpdate();
                }
                
                PreparedStatement psUsuarioJuegos = conn.prepareStatement(queryUsuarios_has_juegos);
                psUsuarioJuegos.setString(1, this.dni);
                psUsuarioJuegos.setString(2, nombreJuego);
                
                o = psUsuarioJuegos.executeUpdate();

                // 1:OK, -1:ERROR
                if (n > 0 && m > 0 && o > 0) {
                    JOptionPane.showMessageDialog(null, "Juego insertado satisfactoriamente!");
                    vaciarCampos();
                }
                
                
            } catch (SQLException sqlEx) {
                if (sqlEx.getErrorCode() == 1062) {
                    JOptionPane.showMessageDialog(null, "El nombre del juego ya existe!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error insertando el juego!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage());
            } finally {
                //Cierre de conexiones con la base de datos.
                if (conn != null) {
                    try {
                        conn.close();
                        conn = null;
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error al cerrar conexiones");
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonInsertarActionPerformed

    private void vaciarCampos() {
        jTextFieldNombreJuego.setText("");
        jTextPaneDescripcion.setText("");
        jCheckBoxPS4.setSelected(false);
        jCheckBoxPSvita.setSelected(false);
        jCheckBoxPC.setSelected(false);
        jCheckBoxMAC.setSelected(false);
        jCheckBoxWeb.setSelected(false);
        jCheckBoxWii.setSelected(false);
        jCheckBoxWiiU.setSelected(false);
        jCheckBox3DS.setSelected(false);
        jCheckBoxAndroid.setSelected(false);
        jCheckBoxIphone.setSelected(false);
        jCheckBoxXBox360.setSelected(false);
        jCheckBoxXBoxOne.setSelected(false);
        jCheckBoxMultijugador.setSelected(false);
    }
    
    private boolean validarVariables(String nombreJuego, String descripcion, ArrayList<Integer> plataformas) {
        boolean resultado = true;

        if (nombreJuego.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo 'Nombre juego' está vacia");
            resultado = false;
        }

        if (nombreJuego.length() > 45 && resultado) {
            JOptionPane.showMessageDialog(null, "El rango del nombre es de 45 caracteres");
            resultado = false;
        }

        if (descripcion.length() > 100 && resultado) {
            JOptionPane.showMessageDialog(null, "El rango de la descripcion es de 100 caracteres");
            resultado = false;
        }

        if (plataformas.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No has seleccionado ninguna plataforma");
            resultado = false;
        }
        return resultado;
    }

    /**
     * Comprueba todos los campos que selecciona el usuario.
     *
     * @return Devuelve la cadena con las opciones seleccionadas.
     */
    private ArrayList<Integer> plataformasSeleccionadas(Connection conn) {
        String query = "SELECT * FROM Plataformas";
        ArrayList<Integer> plataformasSeleccionadas = new ArrayList<Integer>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                if (jCheckBoxPS3.isSelected() && jCheckBoxPS3.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxPS4.isSelected() && jCheckBoxPS4.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxPSvita.isSelected() && jCheckBoxPSvita.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxPC.isSelected() && jCheckBoxPC.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxMAC.isSelected() && jCheckBoxMAC.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxWeb.isSelected() && jCheckBoxWeb.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxWii.isSelected() && jCheckBoxWii.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxWiiU.isSelected() && jCheckBoxWiiU.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBox3DS.isSelected() && jCheckBox3DS.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxAndroid.isSelected() && jCheckBoxAndroid.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxIphone.isSelected() && jCheckBoxIphone.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxXBox360.isSelected() && jCheckBoxXBox360.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
                if (jCheckBoxXBoxOne.isSelected() && jCheckBoxXBoxOne.getText().equalsIgnoreCase(rs.getString("NombrePlataforma"))) {
                    plataformasSeleccionadas.add(rs.getInt("IdPlataforma"));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
        }
        return plataformasSeleccionadas;
    }

    /**
     * @param args the command line arguments
     */
    /**
    public static void main(String args[]) {
       
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InsertarJuego dialog = new InsertarJuego(new javax.swing.JFrame(), true,);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
    }
*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JCheckBox jCheckBox3DS;
    private javax.swing.JCheckBox jCheckBoxAndroid;
    private javax.swing.JCheckBox jCheckBoxIphone;
    private javax.swing.JCheckBox jCheckBoxMAC;
    private javax.swing.JCheckBox jCheckBoxMultijugador;
    private javax.swing.JCheckBox jCheckBoxPC;
    private javax.swing.JCheckBox jCheckBoxPS3;
    private javax.swing.JCheckBox jCheckBoxPS4;
    private javax.swing.JCheckBox jCheckBoxPSvita;
    private javax.swing.JCheckBox jCheckBoxWeb;
    private javax.swing.JCheckBox jCheckBoxWii;
    private javax.swing.JCheckBox jCheckBoxWiiU;
    private javax.swing.JCheckBox jCheckBoxXBox360;
    private javax.swing.JCheckBox jCheckBoxXBoxOne;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNombreJuego;
    private javax.swing.JTextPane jTextPaneDescripcion;
    // End of variables declaration//GEN-END:variables
}
