/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaz.Interfaz;

/**
 * Clase Tren "hijo" hereda atributos y metodos de la clase Transporte "abuelo"
 * y de la clase Terrestre "padre". Se denomina como clase final. Métodos
 * abstrcatos implementados de la clase Interfaz.
 *
 * @author Darwin Leon, Est.
 */
public final class Tren extends Terrestre implements Interfaz {

    private int cantVagones;
    private String tipoLocomotora;

    /**
     * Método abstracto de la clase Terrestre
     */
    @Override
    public void calcularTiempoViaje() {

    }

    /**
     * Método abstrcato de la clase Transporte
     */
    @Override
    public void calcularTamaño() {

    }

    //Métodos getter's y setter's
    public int getCantVagones() {
        return cantVagones;
    }

    public void setCantVagones(int cantVagones) {
        this.cantVagones = cantVagones;
    }

    public String getTipoLocomotora() {
        return tipoLocomotora;
    }

    public void setTipoLocomotora(String tipoLocomotora) {
        this.tipoLocomotora = tipoLocomotora;
    }

    /**
     * Método toString convierte un objeto en cadena de texto.
     *
     * @return atributos de la clase Terrestre en el método super.toString() y
     * ademas atributos de su pripia clase.
     */
    @Override
    public String toString() {
        return "Tren{" + super.toString() + "cantVagones=" + cantVagones + ", tipoLocomotora=" + tipoLocomotora + '}';
    }

    // Métodos abstractos que fueron implementados de la clase Interfaz.
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
