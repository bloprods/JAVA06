/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import Modelo.Libro;
import Modelo.LineaFactura;
import Modelo.Socio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author BLR
 */
public class Consultas {
    public Socio inicioSesion(String usuario, String contraseña){
        int cont = 0;
        Socio socioLogeado = null;
        try {
            String consulta = "select count(*) from socio where usuario = ? and contraseña = ?";
            
            Connection con = ConnectionBD.getConnection();
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setString(1, usuario);
            pstmt.setString(2, contraseña);
            
            ResultSet rs = pstmt.executeQuery();
            
            rs.next();
            cont = rs.getInt(1);
            
            if(cont == 0)
                return null;
            else{
                consulta = "select * from socio where usuario = ?";
                pstmt = con.prepareStatement(consulta);
                pstmt.setString(1, usuario);
                rs = pstmt.executeQuery();
                rs.next();
                socioLogeado = new Socio(rs.getString(1), rs.getString(2), new Date(rs.getDate(3).getTime()), rs.getString(4), rs.getString(5), rs.getString(6));
                
            }
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
        }
        return socioLogeado;

    }
    
    public ArrayList<LineaFactura> getLineas(int nfactura){
        ArrayList<LineaFactura> lista = new ArrayList<>();
        String consulta = "select * from linea_factura where nfactura = ?";
        try {
            
            Connection con = ConnectionBD.getConnection();
            
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setInt(1, nfactura);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {    
                lista.add(new LineaFactura(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getFloat(5)));    
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<Factura> getFacturas(String usuario){
        ArrayList<Factura> lista = new ArrayList<>();
        String consulta = "select * from factura where nifsocio = (select nif from socio where usuario = ?) order by numero";
        try {
            
            Connection con = ConnectionBD.getConnection();
            
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setString(1, usuario);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {    
                lista.add(new Factura(rs.getInt(1), new Date(rs.getDate(2).getTime()), rs.getString(3)));    
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<Libro> getLibros(){
        ArrayList<Libro> lista = new ArrayList<>();
        String consulta = "select * from libro order by cod";
        try {
            
            Connection con = ConnectionBD.getConnection();
            
            PreparedStatement pstmt = con.prepareStatement(consulta);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {    
                lista.add(new Libro(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4)));    
            }
            
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return lista;
    }
    
    public int insertarLineaFactura(int cod, int nfactura, int codlibro, int cantidad, float importe){
        int n = 0;
        try {
            String consulta = "insert into linea_factura values(?, ?, ?, ?, ?)";
            
            Connection con = ConnectionBD.getConnection();
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setInt(1, cod);
            pstmt.setInt(2, nfactura);
            pstmt.setInt(3, codlibro);
            pstmt.setInt(4, cantidad);
            pstmt.setFloat(5, importe);
            
            n = pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return n;
    }
    
    public int getNLineas(int nfactura){
        String consulta = "select count(*) from linea_factura where nfactura = ?";
        int n = 0;
        try {
            
            Connection con = ConnectionBD.getConnection();
            
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setInt(1, nfactura);
            ResultSet rs = pstmt.executeQuery();
            
            rs.next();
            
            n = rs.getInt(1);
            
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }
    
    public int updateFKTablaB(String nifactual, String nifnuevo){
        int n = 0;
        String consulta = "update factura set nifsocio = ? where nifsocio = ?";
        
        try {
            Connection con = ConnectionBD.getConnection();
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setString(1, nifnuevo);
            pstmt.setString(2, nifactual);
            
            n = pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return n;
    }
    
    public int insertSocio(String nif, String nombre, Date falta, String foto, String usuario, String contraseña){
        int n = 0;
        String consulta = "insert into socio values(?, ?, ?, ?, ?, ?)";
            
        try {   
            Connection con = ConnectionBD.getConnection();
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setString(1, nif);
            pstmt.setString(2, nombre);
            pstmt.setDate(3, falta);
            pstmt.setString(4, foto);
            pstmt.setString(5, usuario);
            pstmt.setString(6, contraseña);
            
            n = pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }
    
    public int deleteSocio(String nifAnterior){
        int n = 0;
        String consulta = "delete from socio where nif = ?";
            
        try {   
            Connection con = ConnectionBD.getConnection();
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setString(1, nifAnterior);
            
            n = pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n;
    }
    
    public int updateFechaSocio(Date fecha, String usuario){
        int n = 0;
        try {
            String consulta = "update socio set fechaalta = ? where usuario = ?";
            
            Connection con = ConnectionBD.getConnection();
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setDate(1, fecha);
            pstmt.setString(2, usuario);
            
            n = pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return n;
    }
    
    public boolean existeSocio(String nif){
        String consulta = "select count(*) from socio where nif = ?";
        int n = 0;
        try {
            
            Connection con = ConnectionBD.getConnection();
            
            PreparedStatement pstmt = con.prepareStatement(consulta);
            pstmt.setString(1, nif);
            ResultSet rs = pstmt.executeQuery();
            
            rs.next();
            
            n = rs.getInt(1);
            
            rs.close();
            pstmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return n == 1;
    }
    
}
