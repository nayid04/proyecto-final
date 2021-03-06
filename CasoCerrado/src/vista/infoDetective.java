/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Persistencia.ArchivoTxt;
import Utilidades.Interfaz;
import java.awt.event.KeyAdapter;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.casos.ListaCasos;
import modelo.personas.Detective;
import modelo.personas.ListaDetective;
import modelo.personas.Persona;
import static vista.infoSospechoso.archivo;

/**
 *
 * @author steven
 */
public class infoDetective extends javax.swing.JPanel {

    /**
     * Creates new form infoDetective
     */
    public static Interfaz util;
    public static ArchivoTxt archivo;
    public static Detectives detec;
    private ListaDetective modelo;
    DefaultTableModel modelo_tabla;
    TableRowSorter trs;
    private String titulosTabla[] = {"ID","NOMBRE 1","NOMBRE 2", "APELLIDO 1", "APPELIDO 2","CAPACITADO","EXPERENCIA"};
    
    public infoDetective() {
        initComponents();
        util = new Interfaz();
        detec = new Detectives();
        archivo = new ArchivoTxt();
        this.modelo = new ListaDetective();
        //leerPublicaciones();
        modelo_tabla = new DefaultTableModel();
        for (int i = 0; i < titulosTabla.length; i++) {
            modelo_tabla.addColumn(titulosTabla[i]);
        }
        this.tabla.setModel(modelo_tabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        id = new javax.swing.JTextField();
        botonRegistar = new javax.swing.JToggleButton();
        botonEliminar = new javax.swing.JToggleButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(181, 220, 240));
        jButton2.setText("???");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 60, 20));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Informacion Detectives");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen_2022-07-02_001027389.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Digite la identificacion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 198, -1, -1));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Primer nombre", "segundo nombre", "Primer apellido", "Segundo apellido", "Capacitado", "Experiencia"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 346, 655, 120));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Id:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 174, 10));

        id.setBackground(new java.awt.Color(204, 204, 255));
        id.setBorder(null);
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 280, 180, 20));

        botonRegistar.setBackground(new java.awt.Color(181, 220, 240));
        botonRegistar.setText("REGISTRAR");
        botonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRegistar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        botonEliminar.setBackground(new java.awt.Color(181, 220, 240));
        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        util.showPanel(inicio.content, Iniciar.menu);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!(numeros)) {
            evt.consume();
        }

        id.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + id.getText(), 0));
            }
        });
        trs = new TableRowSorter(modelo_tabla);
        tabla.setRowSorter(trs);   
    }//GEN-LAST:event_idKeyTyped

    private void botonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistarActionPerformed
        util.showPanel(inicio.content, detec);
    }//GEN-LAST:event_botonRegistarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int fila = tabla.getSelectedRow();
        String isbn = String.valueOf(modelo_tabla.getValueAt(fila, 0));

        if (fila >= 0) {
            modelo_tabla.removeRow(fila);
            eliminarDetective(isbn);
            archivo.guardarTextDetectives(tabla, modelo_tabla);
        }
        else {
            JOptionPane.showMessageDialog(null, "seleccione un fila");
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    public void eliminarDetective(String isbn) {

        Persona pBusqueda = new Detective(isbn);

        Persona pEliminada = Detectives.modelo.eliminarDetectives(pBusqueda);
        if (pEliminada != null) {
            JOptionPane.showMessageDialog(null, "\n!! Detective eliminado ????");
        } else {
            JOptionPane.showMessageDialog(null, "\n!! el Detective no se encuentra registrado ????");
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botonEliminar;
    private javax.swing.JToggleButton botonRegistar;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
