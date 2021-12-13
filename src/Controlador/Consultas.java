/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Socio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author BLR
 */
public class Consultas {
    public Socio inicioSesion(String usuario, String contraseña){
        int cont = 0;
        Socio socioLogeado = null;
        try {
            
            Connection con = ConnectionBD.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select count(*) from socio where usuario = " + "'" + usuario + "' and contraseña = " + "'" + contraseña + "'");
            
            rs.next();
            cont = rs.getInt(1);
            
            
            
            if(cont == 0)
                return null;
            else{
                rs = stmt.executeQuery("select * from socio where usuario = " + "'" + usuario + "'");
                rs.next();
                socioLogeado = new Socio(rs.getString(1), rs.getString(2), new Date(rs.getDate(3).getTime()), rs.getString(4), rs.getString(5), rs.getString(6));
            }
            rs.close();
            stmt.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return socioLogeado;

    }
    
    
}
