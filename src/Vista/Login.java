/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

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
        jTextFieldContraseña = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();

        setBackground(new java.awt.Color(41, 44, 51));

        AccederButton.setBackground(new java.awt.Color(56, 67, 75));
        AccederButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        AccederButton.setForeground(new java.awt.Color(255, 255, 255));
        AccederButton.setText("Acceder");
        AccederButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccederButtonActionPerformed(evt);
            }
        });

        jTextFieldContraseña.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldContraseña.setText("usuario");

        jLabelContraseña.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(204, 204, 204));
        jLabelContraseña.setText("Contraseña");

        jLabelUsuario.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jLabelUsuario.setText("Usuario");

        jTextFieldUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextFieldUsuario.setText("usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(AccederButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelUsuario)
                        .addComponent(jLabelContraseña))
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(183, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(372, Short.MAX_VALUE)
                .addComponent(AccederButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jLabelUsuario)
                            .addGap(21, 21, 21)
                            .addComponent(jLabelContraseña))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(250, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AccederButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccederButtonActionPerformed
        // TODO add your handling code here:
//        if(bd.getConnection(jTextFieldUsuario.getText(), jTextFieldContraseña.getText()))
        GUI.cambiarContenedor(GUI.Welcome);
//        else
//        JOptionPane.showMessageDialog(this, "Las credenciales introducidas son erróneas.", "Error" , 0);

    }//GEN-LAST:event_AccederButtonActionPerformed
    
    
    
    protected void setGUI(GUI GUI){
        this.GUI = GUI;
    }
    
    
    private GUI GUI;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccederButton;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}