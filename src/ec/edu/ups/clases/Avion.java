/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Clase Avion "hijo" hereda atributos y métodos de la clase Transporte "abuelo"
 * y de Aereo la clase "padre". Contiene métodos abstractos.
 * Se denomima clase final.
 *
 * @author Darwin Leon, Est.
 */
public final class Avion extends Aereo {

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

    @Override
    public String toString() {
        return "Avion{" + super.toString() + "distanciaPista=" + distanciaPista + ", cantAlas=" + cantAlas + ", anchoFuselaje=" + anchoFuselaje + ", cantZonasCarga=" + cantZonasCarga + '}';
    }

}
