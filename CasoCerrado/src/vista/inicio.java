/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import Utilidades.Interfaz;



public class inicio extends javax.swing.JFrame {

    public static Iniciar iniciar;
    public static Registrar registrar;
    public static Interfaz util;
    
    public inicio() {
        initComponents();
        setLocationRelativeTo(null);
        iniciar = new Iniciar();
        registrar = new Registrar();
        util = new Interfaz();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        botonIngresar = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(204, 204, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Principal");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/imagen_2022-07-02_001027389.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        botonRegistrarse.setBackground(new java.awt.Color(181, 220, 240));
        botonRegistrarse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonRegistrarse.setText("Salir");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 200, 160));

        botonIngresar.setBackground(new java.awt.Color(181, 220, 240));
        botonIngresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 197, 161));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        content.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        util.showPanel(content,iniciar);
        panelPrincipal.setVisible(false);
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        /*util.showPanel(content,registrar);
        panelPrincipal.setVisible(false);*/
        System.exit(0);
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    public void run() {
        new inicio().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonRegistrarse;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
