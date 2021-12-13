/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ConsultaUnoaUno;
import Modelo.Factura;
import Modelo.LineaFactura;
import java.util.ArrayList;

/**
 *
 * @author BLR
 */
public class VerFacturas extends javax.swing.JPanel {
    private ArrayList<LineaFactura> lineas = new ArrayList<LineaFactura>();
    private int indice = 0;
    private ConsultaUnoaUno consulta;
    private Factura factura = new Factura();
    
    /**
     * Creates new form VerFacturas
     */
    public VerFacturas() {
        initComponents();
        disableLeft();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JButtonLast = new javax.swing.JButton();
        JButtonFirst = new javax.swing.JButton();
        JButtonPrevious = new javax.swing.JButton();
        JButtonNext = new javax.swing.JButton();
        jLabelNumero = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelFacturas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLineas = new javax.swing.JList<>();
        jSeparator = new javax.swing.JSeparator();
        jLabelLineas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(41, 44, 51));
        setPreferredSize(new java.awt.Dimension(800, 600));

        JButtonLast.setBackground(new java.awt.Color(56, 67, 75));
        JButtonLast.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        JButtonLast.setForeground(new java.awt.Color(255, 255, 255));
        JButtonLast.setText(">>");
        JButtonLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonLastActionPerformed(evt);
            }
        });

        JButtonFirst.setBackground(new java.awt.Color(56, 67, 75));
        JButtonFirst.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        JButtonFirst.setForeground(new java.awt.Color(255, 255, 255));
        JButtonFirst.setText("<<");
        JButtonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonFirstActionPerformed(evt);
            }
        });

        JButtonPrevious.setBackground(new java.awt.Color(56, 67, 75));
        JButtonPrevious.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        JButtonPrevious.setForeground(new java.awt.Color(255, 255, 255));
        JButtonPrevious.setText("<");
        JButtonPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPreviousActionPerformed(evt);
            }
        });

        JButtonNext.setBackground(new java.awt.Color(56, 67, 75));
        JButtonNext.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        JButtonNext.setForeground(new java.awt.Color(255, 255, 255));
        JButtonNext.setText(">");
        JButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonNextActionPerformed(evt);
            }
        });

        jLabelNumero.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelNumero.setForeground(new java.awt.Color(204, 204, 204));
        jLabelNumero.setText("Numero: ");

        jLabelFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelFecha.setForeground(new java.awt.Color(204, 204, 204));
        jLabelFecha.setText("Fecha:");

        jLabelDireccion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(204, 204, 204));
        jLabelDireccion.setText("Dirección:");

        jTextFieldNumero.setEditable(false);
        jTextFieldNumero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumeroActionPerformed(evt);
            }
        });

        jTextFieldFecha.setEditable(false);
        jTextFieldFecha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });

        jTextFieldDireccion.setEditable(false);
        jTextFieldDireccion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextFieldDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDireccionActionPerformed(evt);
            }
        });

        jLabelFacturas.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabelFacturas.setForeground(new java.awt.Color(204, 204, 204));
        jLabelFacturas.setText("Facturas");

        jListLineas.setBackground(new java.awt.Color(41, 44, 51));
        jListLineas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jListLineas.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jListLineas);

        jSeparator.setBackground(new java.awt.Color(204, 204, 204));

        jLabelLineas.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabelLineas.setForeground(new java.awt.Color(204, 204, 204));
        jLabelLineas.setText("Líneas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelFacturas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelFecha)
                                    .addComponent(jLabelNumero)
                                    .addComponent(jLabelDireccion))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JButtonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JButtonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(JButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JButtonLast, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelLineas)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelFacturas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonLast, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLineas)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonLastActionPerformed
        // TODO add your handling code here:
        consulta.irFinal();
        factura = consulta.getUltima();
        mostrarFacturas();
        disableRight();
        enableLeft();
        
    }//GEN-LAST:event_JButtonLastActionPerformed

    private void JButtonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonFirstActionPerformed
        // TODO add your handling code here:
        consulta.irInicio();
        factura = consulta.getInicial();
        mostrarFacturas();
        disableLeft();
        enableRight();
        
    }//GEN-LAST:event_JButtonFirstActionPerformed

    private void JButtonPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPreviousActionPerformed
        previous();
    }//GEN-LAST:event_JButtonPreviousActionPerformed

    public void previous() {
        // TODO add your handling code here:
        
        if(!consulta.esPrimero()){
            enableLeft();
            consulta.retroceder();
            factura = consulta.getFactura();
            mostrarFacturas();
            enableRight();
        }else
            disableLeft();
    }

    private void JButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonNextActionPerformed
        next();
    }//GEN-LAST:event_JButtonNextActionPerformed

    public void next() {
        // TODO add your handling code here:
        
        if(!consulta.esUltimo()){
            enableRight();
            consulta.avanzar();
            factura = consulta.getFactura();
            mostrarFacturas();
            enableLeft();
        }else
            disableRight();
    }

    private void jTextFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumeroActionPerformed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed
    
    private void jTextFieldDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDireccionActionPerformed


    /**
     * @param lineas the lineas to set
     */
    protected void setLineas(ArrayList<LineaFactura> lineas) {
        this.lineas = lineas;
    }
    
    protected void mostrarFacturas(){
        if(consulta.esNull()){
            disableLeft();
            disableRight();
            jSeparator.setVisible(false);
            jLabelLineas.setVisible(false);
            jListLineas.setVisible(false);
        }else{
            jSeparator.setVisible(true);
            jLabelLineas.setVisible(true);
            jListLineas.setVisible(true);
            
            jTextFieldNumero.setText(factura.getNumero()+"");
            jTextFieldFecha.setText(factura.getFecha().toString());
            jTextFieldDireccion.setText(factura.getDireccion());
        }
    }
    

    protected void enableRight() {
        JButtonNext.setEnabled(true);
        JButtonLast.setEnabled(true);
    }

    protected void disableLeft() {
        JButtonPrevious.setEnabled(false);
        JButtonFirst.setEnabled(false);
    }


    protected void enableLeft() {
        JButtonPrevious.setEnabled(true);
        JButtonFirst.setEnabled(true);
    }

    protected void disableRight() {
        JButtonNext.setEnabled(false);
        JButtonLast.setEnabled(false);
    }
    
    protected void setGUI(GUI GUI){
        this.GUI = GUI;
    }
    
    protected void setFactura(Factura factura){
        this.factura = factura;
    }
    
    protected void setConsulta(ConsultaUnoaUno consulta){
        this.consulta = consulta;
    }
    
    
    private GUI GUI;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonFirst;
    private javax.swing.JButton JButtonLast;
    private javax.swing.JButton JButtonNext;
    private javax.swing.JButton JButtonPrevious;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelFacturas;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelLineas;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JList<String> jListLineas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables

    /**
     * @param facturas the facturas to set
     */
    
}
