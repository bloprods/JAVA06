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
public class LineaFactura {
    private int cod;
    private int nfactura;
    private int codlibro;
    private int cantidad;
    private float importe;
    
    
    public LineaFactura(){
        
    }
    
    public LineaFactura(int cod, int nfactura, int codlibro, int cantidad, float importe){
        this.cod = cod;
        this.nfactura = nfactura;
        this.codlibro = codlibro;
        this.cantidad = cantidad;
        this.importe = importe;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }
    
    /**
     * @return the nfactura
     */
    public int getNfactura() {
        return nfactura;
    }

    /**
     * @return the codlibro
     */
    public int getCodlibro() {
        return codlibro;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @return the importe
     */
    public float getImporte() {
        return importe;
    }

    /**
     * @param nfactura the nfactura to set
     */
    public void setNfactura(int nfactura) {
        this.nfactura = nfactura;
    }

    /**
     * @param codlibro the codlibro to set
     */
    public void setCodlibro(int codlibro) {
        this.codlibro = codlibro;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(float importe) {
        this.importe = importe;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public String toString(){
        return (cod + 
                " | NFactura: " + nfactura + 
                " | CodLibro: " + codlibro + 
                " | Cantidad: " + cantidad + 
                " | Importe: " + String.format("%.2f", importe) + " ???");
    }
}
