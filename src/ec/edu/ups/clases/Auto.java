/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Clase Auto "hijo" hereda valores de la clase Terrestre "padre".
 *
 * @author Darwin Leon, Est.
 */
public class Auto extends Terrestre {

   private String tipoCambio;
   private int cantCambio;

/**
     * Método abstracto de la clase Terrestre
     */
    @Override
    public void calcularTiempoViaje() {

    }

    /**
     * Método abstracto de la clase Transporte
     */
    @Override
    public void calcularTamaño() {

    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public int getCantCambio() {
        return cantCambio;
    }

    public void setCantCambio(int cantCambio) {
        this.cantCambio = cantCambio;
    }

    @Override
    public String toString() {
        return "Auto{" + super.toString()+"tipoCambio=" + tipoCambio + ", cantCambio=" + cantCambio + '}';
    }
    
    
}
