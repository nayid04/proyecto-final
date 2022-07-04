/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Persistencia.ArchivoTxt;
import Utilidades.Interfaz;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.casos.*;
import modelo.personas.*;

/**
 *
 * @author steven
 */
public class RegistrarCaso extends javax.swing.JPanel {

    public static Interfaz util;
    public static ListaCasos modelo;
    public static Caso caso;
    public static ArchivoTxt txt;

    public RegistrarCaso() {
        initComponents();
        util = new Interfaz();
        modelo = new ListaCasos();
        txt = new ArchivoTxt();
        util.deshabilitarPanel(panelCiberCrimen);
        util.deshabilitarPanel(panelHomicidio);
        util.deshabilitarPanel(panelNarcotrafico);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        boxTipoCaso = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        boxPrioridad = new javax.swing.JComboBox<>();
        boxDetective = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        panelHomicidio = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        boxSegundo = new javax.swing.JComboBox<>();
        panelNarcotrafico = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        boxTipoNarcotrafico = new javax.swing.JComboBox<>();
        panelCiberCrimen = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        boxTipoCiber = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtNoCaso = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtSospechoso = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Detective para el caso:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nombre del caso:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tipo de caso:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 110, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 230, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 180, 10));

        jButton1.setBackground(new java.awt.Color(181, 220, 240));
        jButton1.setText("Registrar Caso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 120, 30));

        boxTipoCaso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Ciber Crimen", "Homicidio", "Narcotrafico" }));
        boxTipoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoCasoActionPerformed(evt);
            }
        });
        jPanel1.add(boxTipoCaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 200, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Sospechoso del caso:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Registrar Caso");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(181, 220, 240));
        jButton2.setText("←");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen_2022-07-02_001027389.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 180));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("No Caso:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 70, 20));

        boxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "A", "B", "C" }));
        jPanel1.add(boxPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 230, 30));

        boxDetective.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        jPanel1.add(boxDetective, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Prioridad:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, 20));

        panelHomicidio.setBackground(new java.awt.Color(204, 204, 255));
        panelHomicidio.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true), "Homicidio"));
        panelHomicidio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Seleccione un segundo detective:");
        panelHomicidio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 230, 20));

        boxSegundo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..." }));
        panelHomicidio.add(boxSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 30));

        jPanel1.add(panelHomicidio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 300, 260));

        panelNarcotrafico.setBackground(new java.awt.Color(204, 204, 255));
        panelNarcotrafico.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true), "Narcotrafico"));
        panelNarcotrafico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Seleccione el tipo de caso de narcotrafico:");
        panelNarcotrafico.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 20));

        boxTipoNarcotrafico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "local", "estatal", "federal" }));
        panelNarcotrafico.add(boxTipoNarcotrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 30));

        jPanel1.add(panelNarcotrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 300, 260));

        panelCiberCrimen.setBackground(new java.awt.Color(204, 204, 255));
        panelCiberCrimen.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 1, true), "Ciber Crimen"));
        panelCiberCrimen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Ingrese la descripcion del caso:");
        panelCiberCrimen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 230, 20));

        boxTipoCiber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar...", "Robo de identidad", "Robbo de informacion", "Fraudes por internet" }));
        panelCiberCrimen.add(boxTipoCiber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 210, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Seleccione el tipo de ciber crimen:");
        panelCiberCrimen.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 230, 20));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        panelCiberCrimen.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 250, 110));

        jPanel1.add(panelCiberCrimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 300, 260));

        txtNoCaso.setBackground(new java.awt.Color(204, 204, 255));
        txtNoCaso.setBorder(null);
        txtNoCaso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoCasoActionPerformed(evt);
            }
        });
        txtNoCaso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoCasoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNoCaso, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 230, 20));

        txtNombre.setBackground(new java.awt.Color(204, 204, 255));
        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 180, 20));

        txtSospechoso.setBackground(new java.awt.Color(204, 204, 255));
        txtSospechoso.setBorder(null);
        txtSospechoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSospechosoActionPerformed(evt);
            }
        });
        txtSospechoso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSospechosoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSospechoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 150, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 150, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 531));
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoCasoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoCasoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        util.showPanel(inicio.content, Iniciar.menu);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean vacio = true;
        int tamano = boxDetective.getItemCount();
        String arreglo[] = {"Si", "No"};
        int opcion = 0;
        if (tamano == 1) {
            opcion = JOptionPane.showOptionDialog(null, "No hay detectives registrados\n¿Desea registar uno?", "error", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "");
            vacio = true;
        } else {
            vacio = false;
        }
        if (opcion == 0) {
        }
        
        if (txtNoCaso.getText().equals("") || boxPrioridad.getSelectedIndex() == 0 || boxDetective.getSelectedIndex() == 0 || txtSospechoso.getText().equals("") || txtNombre.getText().equals("") || boxTipoCaso.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "complete todos los datos");
        }
        if (boxTipoCaso.getSelectedIndex() == 1) {
            if (boxTipoCiber.getSelectedIndex() == 0 || txtDescripcion.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "complete los datos del caso");
                vacio = true;
            } else {
                vacio = false;
            }
        }
        if (boxTipoCaso.getSelectedIndex() == 2) {
            if (boxSegundo.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "complete los datos del caso");
                vacio = true;
            } else {
                vacio = false;
            }
        }
        if (boxTipoCaso.getSelectedIndex() == 3) {
            if (boxTipoNarcotrafico.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "complete los datos del caso");
                vacio = true;
            } else {
                vacio = false;
            }
        }
        if (verificarNoCaso()) {
            JOptionPane.showMessageDialog(null, "N0 de caso ya registrado, ingrese otro!");
            vacio = true;
        } else {
            vacio = false;
        }
        if (vacio == false) {
            leerNuevoCaso();
            registrarCaso();
            txt.textCasos(this.modelo);
            JOptionPane.showMessageDialog(null, "Datos guardados!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNoCasoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoCasoKeyTyped
        util.soloNumeros(evt);
        util.limitarTexto(evt, txtNoCaso, 5);
    }//GEN-LAST:event_txtNoCasoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().isEmpty()) {
            util.letrasYnumeros(evt);
        } else {
            util.lestrasYnumerosYespacios(evt);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtSospechosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSospechosoActionPerformed

    }//GEN-LAST:event_txtSospechosoActionPerformed

    private void txtSospechosoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSospechosoKeyTyped
        if (txtNombre.getText().isEmpty()) {
            util.letrasYnumeros(evt);
        } else {
            util.lestrasYnumerosYespacios(evt);
        }
    }//GEN-LAST:event_txtSospechosoKeyTyped

    private void boxTipoCasoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoCasoActionPerformed
        if (boxTipoCaso.getSelectedIndex() == 0) {
            util.deshabilitarPanel(panelCiberCrimen);
            util.deshabilitarPanel(panelHomicidio);
            util.deshabilitarPanel(panelNarcotrafico);
        }
        if (boxTipoCaso.getSelectedIndex() == 1) {
            panelHomicidio.setVisible(false);
            panelNarcotrafico.setVisible(false);
            panelCiberCrimen.setVisible(true);
            util.habilitarPanel(panelCiberCrimen);
        }
        if (boxTipoCaso.getSelectedIndex() == 2) {
            panelHomicidio.setVisible(true);
            panelNarcotrafico.setVisible(false);
            panelCiberCrimen.setVisible(false);
            util.habilitarPanel(panelHomicidio);
        }
        if (boxTipoCaso.getSelectedIndex() == 3) {
            panelHomicidio.setVisible(false);
            panelNarcotrafico.setVisible(true);
            panelCiberCrimen.setVisible(false);
            util.habilitarPanel(panelNarcotrafico);
        }
    }//GEN-LAST:event_boxTipoCasoActionPerformed

    public boolean verificarNoCaso() {
        boolean repet = false;
        try
        {
            int num = Integer.parseInt(txtNoCaso.getText());
            List<Caso> lista = modelo.leerCasos();
            for (Caso c : lista) {
                if (num == c.getNoCaso()) {

                    repet = true;
                }
            }
        }catch(java.lang.NumberFormatException e)
        {
            System.out.println("no se pudo");
            System.exit(0);
        }
        return repet;
    }

    public void registrarCaso() {
        Caso nuevoCaso = this.leerNuevoCaso();
        this.modelo.insertarCasos(nuevoCaso);
    }

    public Caso leerNuevoCaso() {

        int noCaso = Integer.parseInt(txtNoCaso.getText());
        String prioridad = String.valueOf(boxPrioridad.getSelectedItem());
        String detective = String.valueOf(boxDetective.getSelectedItem());
        String sospechoso = String.valueOf(txtSospechoso.getText());
        String nombreCaso = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        int tipo = boxTipoCaso.getSelectedIndex();

        if (tipo == 1) {
            String tipoCiberCrimen = String.valueOf(boxTipoCiber.getSelectedItem());
            //caso = new CiberCrimen("hola",45,"como","A","nombre","nayid","diana");
            caso = new CiberCrimen(tipoCiberCrimen, noCaso, descripcion, prioridad, nombreCaso, detective, sospechoso);
        }
        if (tipo == 2) {
            String detective2 = String.valueOf(boxSegundo.getSelectedItem());
            caso = new Homicidio(detective2, noCaso, descripcion, prioridad, nombreCaso, detective, sospechoso);
        }
        if (tipo == 3) {
            String tipoNarcotrafico = String.valueOf(boxTipoNarcotrafico.getSelectedItem());
            caso = new Narcotrafico(tipoNarcotrafico, noCaso, descripcion, prioridad, nombreCaso, detective, sospechoso);
        }
        return caso;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> boxDetective;
    private javax.swing.JComboBox<String> boxPrioridad;
    public static javax.swing.JComboBox<String> boxSegundo;
    private javax.swing.JComboBox<String> boxTipoCaso;
    private javax.swing.JComboBox<String> boxTipoCiber;
    private javax.swing.JComboBox<String> boxTipoNarcotrafico;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel panelCiberCrimen;
    private javax.swing.JPanel panelHomicidio;
    private javax.swing.JPanel panelNarcotrafico;
    private javax.swing.JTextArea txtDescripcion;
    public static javax.swing.JTextField txtNoCaso;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSospechoso;
    // End of variables declaration//GEN-END:variables
}
