/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Factura;
import Modelo.Libro;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author BLR
 */
public class NuevaLinea extends javax.swing.JPanel {
    ArrayList<Factura> facturas = new ArrayList<>();
    ArrayList<Libro> libros = new ArrayList<>();
    GUI GUI;
    /**
     * Creates new form NuevaLinez
     */
    public NuevaLinea() {
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

        jLabelFacturas = new javax.swing.JLabel();
        jLabelFacturas1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListLibros = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListFacturas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        JButtonFirst = new javax.swing.JButton();
        jLabelCantidad = new javax.swing.JLabel();
        jTextFieldCantidad = new javax.swing.JTextField();

        setBackground(new java.awt.Color(41, 44, 51));
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabelFacturas.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabelFacturas.setForeground(new java.awt.Color(204, 204, 204));
        jLabelFacturas.setText("Facturas");

        jLabelFacturas1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabelFacturas1.setForeground(new java.awt.Color(204, 204, 204));
        jLabelFacturas1.setText("Libros");

        jListLibros.setBackground(new java.awt.Color(41, 44, 51));
        jListLibros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jListLibros.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(jListLibros);

        jListFacturas.setBackground(new java.awt.Color(41, 44, 51));
        jListFacturas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jListFacturas.setForeground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(jListFacturas);

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Selecciona una factura y un libro");

        JButtonFirst.setBackground(new java.awt.Color(56, 67, 75));
        JButtonFirst.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        JButtonFirst.setForeground(new java.awt.Color(255, 255, 255));
        JButtonFirst.setText("Crear");
        JButtonFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonFirstActionPerformed(evt);
            }
        });

        jLabelCantidad.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelCantidad.setForeground(new java.awt.Color(204, 204, 204));
        jLabelCantidad.setText("Cantidad");

        jTextFieldCantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextFieldCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFacturas1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelFacturas)
                                .addGap(365, 365, 365)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelCantidad)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JButtonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFacturas)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelFacturas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelCantidad)
                        .addComponent(jTextFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonFirstActionPerformed
        try {
            // TODO add your handling code here:
            Factura f = facturas.get(jListFacturas.getSelectedIndex());
            Libro l = libros.get(jListLibros.getSelectedIndex());
            int cantidad = Integer.parseInt(jTextFieldCantidad.getText());
            float importe = l.getPrecio() * cantidad;
            
            if(f == null)
                throw new Exception();
            if(l == null)
                throw new Exception();
            
            if(cantidad == 0)
                throw new Exception();
            
            GUI.consultas.insertarLineaFactura(GUI.consultas.getNLineas(f.getNumero())+1, f.getNumero(), l.getCod(), cantidad, importe);
            JOptionPane.showMessageDialog(this, "Se ha insertado una nueva linea de factura", null, 1);
        } catch(Exception ol){
            System.out.println("error");
        }
    }//GEN-LAST:event_JButtonFirstActionPerformed

    private void jTextFieldCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCantidadActionPerformed
    
    public void mostrarFacturas(){
        facturas = GUI.consultas.getFacturas(GUI.socioLogeado.getUsuario());
        DefaultListModel model = new DefaultListModel();
        
        for (Factura f : facturas){
            model.addElement(f);
        }
        jListFacturas.setModel(model);
        
    }
    
    public void mostrarLibros(){
        libros = GUI.consultas.getLibros();
        DefaultListModel model = new DefaultListModel();
        
        for (Libro l : libros){
            model.addElement(l);
        }
        jListLibros.setModel(model);
        
    }
    
    protected void setGUI(GUI GUI){
        this.GUI = GUI;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonFirst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCantidad;
    private javax.swing.JLabel jLabelFacturas;
    private javax.swing.JLabel jLabelFacturas1;
    private javax.swing.JList<String> jListFacturas;
    private javax.swing.JList<String> jListLibros;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldCantidad;
    // End of variables declaration//GEN-END:variables
}
