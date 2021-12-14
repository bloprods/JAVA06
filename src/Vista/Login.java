/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.ConnectionBD;
import javax.swing.JOptionPane;

/**
 *
 * @author BLR
 */
public class Login extends javax.swing.JPanel {

    /**
     * Creates new form LogIn
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccederButton = new javax.swing.JButton();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        JPasswordFieldContraseña = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(41, 44, 51));
        setPreferredSize(new java.awt.Dimension(800, 570));

        AccederButton.setBackground(new java.awt.Color(56, 67, 75));
        AccederButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        AccederButton.setForeground(new java.awt.Color(255, 255, 255));
        AccederButton.setText("Acceder");
        AccederButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccederButtonActionPerformed(evt);
            }
        });

        jLabelContraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jLabelContraseña.setText("Contraseña");

        jLabelUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jLabelUsuario.setText("Usuario");

        jTextFieldUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextFieldUsuario.setText("albergarlop250710");
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        JPasswordFieldContraseña.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JPasswordFieldContraseña.setText("xtgwWv77PT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(228, 228, 228)
                            .addComponent(AccederButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelContraseña)
                            .addGap(49, 49, 49)
                            .addComponent(JPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelUsuario)
                        .addGap(99, 99, 99)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabelUsuario))
                    .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContraseña))
                .addGap(18, 18, 18)
                .addComponent(AccederButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AccederButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccederButtonActionPerformed
        // TODO add your handling code here:
        GUI.con = new ConnectionBD();
        
        GUI.socioLogeado = GUI.consultas.inicioSesion(jTextFieldUsuario.getText(), new String(JPasswordFieldContraseña.getPassword()));
        
        if(ConnectionBD.getConnection() != null && GUI.socioLogeado != null){
            GUI.socioLogeado.setUsuario(jTextFieldUsuario.getText());
            GUI.cambiarContenedor(GUI.Welcome);
            GUI.showMenuBar(true);
        } else
            JOptionPane.showMessageDialog(this, "Las credenciales introducidas son erróneas.", "Error" , 0);

    }//GEN-LAST:event_AccederButtonActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed
    
    protected void setGUI(GUI GUI){
        this.GUI = GUI;
    }
    
    protected void deletePassword(){
        JPasswordFieldContraseña.setText("");
    }
    
    private GUI GUI;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccederButton;
    private javax.swing.JPasswordField JPasswordFieldContraseña;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
