/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Clase Elicoptero "hijo" hereda atributos y métodos de la clase Transporte
 * "abuelo" y de Aereo la clase "padre". Contiene métodos abstractos. Se
 * denomina como clase final.
 *
 * @author Darwin Leon, Est.
 */
public final class Elicoptero extends Aereo {

    private int cantCuchillas;
    private int cantRotor;

    /**
     * Método abstracto heredado de la clase Aereo.
     */
    @Override
    public void calcularCategoriaVuelo() {

    }

    /**
     * Método abstracto heredado de la clase Transporte.
     *
     */
    @Override
    public void calcularTamaño() {

    }

    public int getCantCuchillas() {
        return cantCuchillas;
    }

    public void setCantCuchillas(int cantCuchillas) {
        this.cantCuchillas = cantCuchillas;
    }

    public int getCantRotor() {
        return cantRotor;
    }

    public void setCantRotor(int cantRotor) {
        this.cantRotor = cantRotor;
    }

    @Override
    public String toString() {
        return "Elicoptero{" + super.toString() + "cantCuchillas=" + cantCuchillas + ", cantRotor=" + cantRotor + '}';
    }

}
