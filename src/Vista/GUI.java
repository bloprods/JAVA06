/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ConnectionBD;
import Controlador.ConsultaUnoaUno;
import Controlador.Consultas;
import Controlador.Errores;
import Modelo.Socio;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author BLR
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        this.setIconImage(new ImageIcon("img/ico.png").getImage());
        Errores.setErrores();
        
        Welcome.setGUI(this);
        Login.setGUI(this);
        VerFacturas.setGUI(this);
        MisDatos.setGUI(this);
        NuevaLinea.setGUI(this);
        cambiarContenedor(Login);
        showMenuBar(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuFacturas = new javax.swing.JMenu();
        jMenuLinea = new javax.swing.JMenu();
        jMenuDatos = new javax.swing.JMenu();
        JMenuAbout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JAVA06 by BLR");
        setBackground(new java.awt.Color(41, 44, 51));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jMenuInicio.setText("Inicio");
        jMenuInicio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInicioMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuInicio);

        jMenuFacturas.setText("Facturas");
        jMenuFacturas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuFacturasMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuFacturas);

        jMenuLinea.setText("Nueva L??nea");
        jMenuLinea.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLineaMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuLinea);

        jMenuDatos.setText("Mis datos");
        jMenuDatos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jMenuDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDatosMouseClicked(evt);
            }
        });
        jMenuBar.add(jMenuDatos);

        JMenuAbout.setText("Acerca de");
        JMenuAbout.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JMenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMenuAboutMouseClicked(evt);
            }
        });
        jMenuBar.add(JMenuAbout);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMenuAboutMouseClicked
        // TODO add your handling code here:
        cambiarContenedor(About);
    }//GEN-LAST:event_JMenuAboutMouseClicked

    private void jMenuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInicioMouseClicked
        // TODO add your handling code here:
        cambiarContenedor(Welcome);
    }//GEN-LAST:event_jMenuInicioMouseClicked

    private void jMenuFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuFacturasMouseClicked
        // TODO add your handling code here:
        
        consulta = new ConsultaUnoaUno(socioLogeado.getUsuario());
        if(consulta.esNull())
            JOptionPane.showMessageDialog(this, "Usted no tiene facturas", null, 1);
        else{
            cambiarContenedor(VerFacturas);
            VerFacturas.setConsulta(consulta);
            consulta.avanzar();
            VerFacturas.setFactura(consulta.getFactura());
            VerFacturas.mostrarFacturas();
            VerFacturas.mostrarLineas(consulta.getFactura().getNumero());
            VerFacturas.disableLeft();
            VerFacturas.enableRight();
        }
            
        
    }//GEN-LAST:event_jMenuFacturasMouseClicked

    private void jMenuDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDatosMouseClicked
        // TODO add your handling code here:
        cambiarContenedor(MisDatos);
        MisDatos.setDatos();
        
    }//GEN-LAST:event_jMenuDatosMouseClicked

    private void jMenuLineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLineaMouseClicked
        // TODO add your handling code here:
        cambiarContenedor(NuevaLinea);
        NuevaLinea.mostrarFacturas();
        NuevaLinea.mostrarLibros();
    }//GEN-LAST:event_jMenuLineaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    protected void cambiarContenedor(javax.swing.JPanel aux){
      this.setContentPane(aux);
      pack();
    }
    
    protected void showMenuBar(boolean show){
        jMenuBar.setVisible(show);
    }
    
    protected void resetearPaneles(){
        //al hacer logout hay que resetear los paneles
    }
    
    
    
    
    //Paneles
    protected Welcome Welcome = new Welcome();
    protected Login Login = new Login();
    protected About About = new About();
    protected VerFacturas VerFacturas = new VerFacturas();
    protected Consultas consultas = new Consultas();
    protected MisDatos MisDatos = new MisDatos();
    protected NuevaLinea NuevaLinea = new NuevaLinea();

    
    //Objetos
    protected ConsultaUnoaUno consulta;
    protected Socio socioLogeado = new Socio();
    protected ConnectionBD con;
    
    //Errores
//    protected Errores err = new Errores();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuAbout;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuDatos;
    private javax.swing.JMenu jMenuFacturas;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenu jMenuLinea;
    // End of variables declaration//GEN-END:variables
}
