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

    //atributos de la clase Auto
    private String tipoCambio;
    private int cantCambio;

    public Auto() {
    }

    public Auto(String tipoCambio, int cantCambio, String tipoVia, String sistAlumbrado, int cantChoques, int codigo, String nombre, String modelo, String marca, String color, double costo, int capacidad, double maximaVelocidad) {
        super(tipoVia, sistAlumbrado, cantChoques, codigo, nombre, modelo, marca, color, costo, capacidad, maximaVelocidad);
        this.tipoCambio = tipoCambio;
        this.cantCambio = cantCambio;
    }

    /**
     * Método abstracto de la clase Terrestre
     */
    @Override
    public double calcularTiempoViaje() {
        int distanciaQuito = 850;
        double tiempoViaje;
        int velocidad = (int) super.getMaximaVelocidad();
        if (velocidad <= 120) {
            tiempoViaje = distanciaQuito / velocidad;
        } else {
            tiempoViaje = distanciaQuito / velocidad;
        }
        return tiempoViaje;
    }

    /**
     * Método abstracto de la clase Transporte
     */
    @Override
    public double calcularTamaño() {
        return 0;
        
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

    // 4 Métodos abstractos que se implementan de la clase Interfaz
    @Override
    public void transportar() {
        System.out.println("El auto "+ super.getNombre()+ " transporta "+ super.getCapacidad()+ " pasajeros");
    }

    @Override
    public void arrancar() {
        System.out.println("El auto "+ super.getNombre()+ "del modelo "+super.getModelo()+" puede arrancar cuesta arriba");
    }

    @Override
    public void frenar() {
        System.out.println("El auto "+ super.getNombre()+ " de cambios "+this.getTipoCambio()+" frena a rraya ");
    }

    @Override
    public void estacionar() {
        System.out.println("El auto "+super.getColor()+ " esta mal estacionado");
    }

    /**
     * Método toString convierte un objeto en una cadena de texto.
     *
     * @return valores heredados mediante "super.toString()" y proios de la
     * clase Auto.
     */
    @Override
    public String toString() {
        return super.toString() + " Tipo de Cambio = " + tipoCambio
                + ", Cantidad de Cambios= " + cantCambio + " Con todas estas "
                + "caracteristicas se estima"+"\n"+ "el arribo a Quito "
                + "en " + this.calcularTiempoViaje() + " horas"+"\n";
    }

}
