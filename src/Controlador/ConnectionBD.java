/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author BLR
 */
public class ConnectionBD {
    private static Connection con;
    
    public ConnectionBD(){
        setConnection();
    }
    
    public void setConnection(){
        try {
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            } catch (Exception e) {
                System.out.println("JDBC driver falied to load.");
            }
            this.con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", "admin", "admin");

        } catch (SQLNonTransientConnectionException cred) {
            JOptionPane.showMessageDialog(null, "Las credenciales introducidas son erróneas.", "Error", 0);
            this.con = null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(0);
        }
    }
    
    public Connection getConnection(){
        return this.con;
    }
}
