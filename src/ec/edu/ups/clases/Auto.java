/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;

/**
 * Clase Auto "hijo" hereda valores de la clase Terrestre "padre". Se denomina
 * clase final. Se implementan métodos abstractos de la clase Interfaz.
 *
 * @author Darwin Leon, Est.
 */
public final class Auto extends Terrestre implements Interfaz {

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

    //Métodos setter's y getter's
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

    /**
     * Método toString convierte un objeto en una cadena de texto.
     *
     * @return valores heredados mediante "super.toString()" y proios de la
     * clase Auto.
     */
    @Override
    public String toString() {
        return "Auto{" + super.toString() + "tipoCambio=" + tipoCambio + ", cantCambio=" + cantCambio + '}';
    }

    // 4 Métodos abstractos que se implementan de la clase Interfaz
    @Override
    public void transportar() {
    }

    @Override
    public void arrancar() {
    }

    @Override
    public void frenar() {
    }

    @Override
    public void estacionar() {
    }

}
