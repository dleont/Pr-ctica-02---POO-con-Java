/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;

/**
 * Clase Elicoptero "hijo" hereda atributos y métodos de la clase Transporte
 * "abuelo" y de Aereo la clase "padre". Contiene métodos abstractos. Se
 * denomina como clase final. Se implementa métodos abstractos de la clase
 * Interfaz.
 *
 * @author Darwin Leon, Est.
 */
public final class Elicoptero extends Aereo implements Interfaz {

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
    public double calcularTamaño() {
        return 0;

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

    /**
     * Método toString convierte un objeto en cadena de texto.
     *
     * @return valores de la clase Aereo con atributos de esta clase.
     */
    @Override
    public String toString() {
        return "Elicoptero{" + super.toString() + "cantCuchillas=" + cantCuchillas + ", cantRotor=" + cantRotor + '}';
    }

    //Métodos implementados de la clase Interfaz
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
