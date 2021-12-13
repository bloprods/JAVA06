/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author BLR
 */
public class About extends javax.swing.JPanel {

    /**
     * Creates new form About
     */
    public About() {
        initComponents();
        setLicencia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAcercade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JLabelLicencia = new javax.swing.JLabel();

        setBackground(new java.awt.Color(41, 44, 51));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabelAcercade.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        jLabelAcercade.setForeground(new java.awt.Color(204, 204, 204));
        jLabelAcercade.setText("Acerca de:");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(41, 44, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 204, 204));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Este programa ha sido creado por Bruno López Rodríguez de 2º DAM, curso 2021-2022.\nPrograma sobre socios, facturas, líneas de factura y libros, utilizando conexión a base de datos para realizar consultas a las diferentes tablas creadas para recoger los datos solicitados por el usuario.\nEl usuario tendrá que iniciar sesión para hacer uso del\nprograma y así ver las facturas y demás datos relacionados con el mismo.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabelAcercade))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(JLabelLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelAcercade)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JLabelLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    protected void setLicencia(){
        var icon = new ImageIcon("img/licencia.png");
        Image img = icon.getImage();
        icon = new ImageIcon(img.getScaledInstance(187, 52, Image.SCALE_SMOOTH));
        JLabelLicencia.setIcon(icon);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelLicencia;
    private javax.swing.JLabel jLabelAcercade;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
