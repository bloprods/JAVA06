/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author BLR
 */
public final class Errores {
    private static ArrayList<Error> errores = new ArrayList<>();
    
    public static void setErrores(){
        errores.add(new Error(1, "La fecha introducida es mayor que la fecha actual"));
        errores.add(new Error(2, "El NIF introducido ya existe"));
        errores.add(new Error(3, "No se ha seleccionado una factura"));
        errores.add(new Error(4, "No se ha seleccionado un libro"));
        errores.add(new Error(5, "La cantidad introducida tiene que ser entre 1 y 99"));
        errores.add(new Error(6, "Tiene que introducir un valor para cantidad"));
        errores.add(new Error(7, "Las credenciales introducidas son erróneas"));
        errores.add(new Error(8, "El NIF introducido no tiene un formato adecuado según la Agencia Tributaria"));
    }
    
    public static String getError(int cod){
        for (Error e : errores){
            if(e.getCodigo() == cod)
                return e.getMensaje();
        }
        return "Error";
    }
    
    public static boolean esfechaMayor(Date fechaintroducida){
        Date fechaactual = new Date(System.currentTimeMillis());

        return fechaintroducida.after(fechaactual);
    }
    
    
    public static class Error {
        private int codigo;
        private String mensaje;

        private Error(int codigo, String mensaje) {
            this.codigo = codigo;
            this.mensaje = mensaje;
        }

        /**
         * @return the codigo
         */
        public int getCodigo() {
            return codigo;
        }

        /**
         * @return the mensaje
         */
        public String getMensaje() {
            return mensaje;
        }

        /**
         * @param codigo the codigo to set
         */
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        /**
         * @param mensaje the mensaje to set
         */
        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }
    }
}

