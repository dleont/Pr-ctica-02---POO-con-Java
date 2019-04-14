/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;

/**
 * Clase Avion "hijo" hereda atributos y métodos de la clase Transporte "abuelo"
 * y de Aereo la clase "padre". Contiene métodos abstractos. Se denomima como
 * clase final. Se implementa métodos abstractos de la clase Interfaz.
 *
 * @author Darwin Leon, Est.
 */
public final class Avion extends Aereo implements Interfaz {

    private double distanciaPista;
    private int cantAlas;
    private double anchoFuselaje;
    private int cantZonasCarga;

    /**
     * Método abstracto heredado de la clase Aereo.
     */
    @Override
    public void calcularCategoriaVuelo() {

    }

    /**
     * Método abstracto heredado de la clase Transporte.
     */
    @Override
    public void calcularTamaño() {

    }

    //Mpetodos getter's y setter's
    public double getDistanciaPista() {
        return distanciaPista;
    }

    public void setDistanciaPista(double distanciaPista) {
        this.distanciaPista = distanciaPista;
    }

    public int getCantAlas() {
        return cantAlas;
    }

    public void setCantAlas(int cantAlas) {
        this.cantAlas = cantAlas;
    }

    public double getAnchoFuselaje() {
        return anchoFuselaje;
    }

    public void setAnchoFuselaje(double anchoFuselaje) {
        this.anchoFuselaje = anchoFuselaje;
    }

    public int getCantZonasCarga() {
        return cantZonasCarga;
    }

    public void setCantZonasCarga(int cantZonasCarga) {
        this.cantZonasCarga = cantZonasCarga;
    }

    /**
     * Método toString convierte un objeto en cadena de texto.
     *
     * @return Atributos de la clase Aereo mediante super.toString() y ademas
     * valores de su propia clase.
     */
    @Override
    public String toString() {
        return "Avion{" + super.toString() + "distanciaPista=" + distanciaPista + ", cantAlas=" + cantAlas + ", anchoFuselaje=" + anchoFuselaje + ", cantZonasCarga=" + cantZonasCarga + '}';
    }

    //Métodos abstrcatos implementados de la clase Interfaz
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
