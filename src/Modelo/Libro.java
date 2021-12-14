/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author BLR
 */
public class Libro {
    private int cod;
    private String nombre;
    private String autor;
    private float precio;
    
    public Libro(){
        
    }
    
    public Libro(int cod, String nombre, String autor, float precio){
        this.cod = cod;
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }
    
    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return (//"Código: " + 
                cod +
                " |\n Nombre: " + nombre + 
                " |\n Autor: " + autor +
                " |\n Precio: " + String.format("%.2f", precio));
    }
}
