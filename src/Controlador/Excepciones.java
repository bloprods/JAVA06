/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author BLR
 */
public class Excepciones extends Exception{
    private int cod;
    
    public Excepciones(int cod, String mensaje){
        super(mensaje);
        this.cod = cod;
        appendLog();
    }
    
    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public void appendLog(){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));
            bw.append((CharSequence) this.toString());
            bw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public String toString(){        
        return (new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()) + " | Error: " + this.getMessage() + "\n");
    }
}
