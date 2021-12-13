/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author BLR
 */
public class Consultas {
    public boolean inicioSesion(String usuario, String contraseña){
        try {
            int cont = 0;

            Connection con = ConnectionBD.getConnection();
            System.out.println("action" + con);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select count(*) from socio where usuario = " + "'" + usuario + "' and contraseña = " + "'" + contraseña + "'");
            
            rs.next();
            cont = rs.getInt(1);
            
            rs.close();
            stmt.close();
            
            return cont != 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;

    }
    
    public ArrayList<Factura> getFacturas(String usuario){
        ArrayList<Factura> lista = new ArrayList<Factura>();
        try {
            
            Connection con = ConnectionBD.getConnection();
            System.out.println("facturas" + con);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from factura where nifsocio = (select nif from socio where usuario = " + "'" + usuario +"'" + ") order by numero");
            ResultSetMetaData rsmd = rs.getMetaData();
            int ncol = rsmd.getColumnCount();
            
            while (rs.next()) {    
                lista.add(new Factura(rs.getInt(1), new Date(rs.getDate(2).getTime()), rs.getString(3)));    
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
}
