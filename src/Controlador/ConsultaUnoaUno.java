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
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author alumno
 */
public class ConsultaUnoaUno {
    private Connection con = ConnectionBD.getConnection();
    private ResultSet rs;
    private PreparedStatement pstmt;
    private int length;
    private Factura factura = new Factura();
    private Factura inicial = new Factura();
    private Factura ultima = new Factura();
    
    public ConsultaUnoaUno(String usuario) {
        
        try {
            String consulta = "select * from factura where nifsocio = (select nif from socio where usuario = ?) order by numero";
            pstmt = con.prepareStatement(consulta,
                                        ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                        ResultSet.CONCUR_READ_ONLY);
            pstmt.setString(1, usuario);
            this.rs = pstmt.executeQuery();
            
            length = size();
            
            if(length == 0)
                this.rs = null;
            
        } catch (SQLException ex) {
            this.rs = null;
        }
    }

    public boolean esNull(){
        return rs == null;
    }
    
    public Factura getFactura(){
        try {
            if(rs.isFirst())
                inicial = new Factura(rs.getInt(1), new Date(rs.getDate(2).getTime()), rs.getString(3));
            
            factura = new Factura(rs.getInt(1), new Date(rs.getDate(2).getTime()), rs.getString(3));
        } catch (SQLException ex) {}
        
        return factura;
    }
    
    public void closeObjects(){
        try {
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Factura getInicial(){
        return this.inicial;
    }
    
    public Factura getUltima(){
        return this.ultima;
    }
    
    public void irInicio(){
        try {
            while(rs.previous()){
                if(rs.isFirst())
                    this.inicial = new Factura (rs.getInt(1), new Date(rs.getDate(2).getTime()), rs.getString(3));
            }
        } catch (SQLException ex) {
            this.inicial = null;
        }
    }
    
    public void irFinal(){
        try {
            while(rs.next()){
                if(rs.isLast())
                    this.ultima = new Factura (rs.getInt(1), new Date(rs.getDate(2).getTime()), rs.getString(3));
                
            }
        } catch (SQLException ex) {
            this.ultima = null;
        }
    }
    
    public void avanzar(){
        try {
            rs.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void retroceder(){
        try {
            rs.previous();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean esPrimero(){
        try {
            return rs.isFirst();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public boolean esUltimo(){
        try {
            return rs.isLast();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public int size(){
        int i = 0;
        try {    
            if(rs.first())
                i ++;
            
            while(rs.next()){
                i++;
            }
            rs.beforeFirst();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            return i;
        }
    }
    
}
