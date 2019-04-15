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

    public Tren() {    
    }

    public Tren(int cantVagones, String tipoLocomotora, String tipoVia, String sistAlumbrado, int cantChoques, int codigo, String nombre, String modelo, String marca, String color, double costo, int capacidad, double maximaVelocidad) {
        super(tipoVia, sistAlumbrado, cantChoques, codigo, nombre, modelo, marca, color, costo, capacidad, maximaVelocidad);
        this.cantVagones = cantVagones;
        this.tipoLocomotora = tipoLocomotora;
    }
    
    
    /**
     * Método abstracto de la clase Terrestre
     */
    @Override
    public double calcularTiempoViaje() {
        int distanciaQuito = 850;
        double tiempoViaje;
        int velocidad = (int) super.getMaximaVelocidad();
        if (velocidad <= 160) {
            tiempoViaje = distanciaQuito / velocidad;
        } else {
            tiempoViaje = distanciaQuito / velocidad;
        }
        return tiempoViaje;
    }

    /**
     * Método abstrcato de la clase Transporte
     */
    @Override
    public double calcularTamaño() {
        return 0;
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

   
    // Métodos abstractos que fueron implementados de la clase Interfaz.
    @Override
    public void transportar() {
        System.out.println(" El "+super.getNombre()+" transporta alrededor de "+super.getCapacidad()+" pasajeros en cada viaje");
    }

    @Override
    public void arrancar() {
        System.out.println(" El tren de "+super.getMarca()+" arranca mucho mas rapido");
    }

    @Override
    public void frenar() {
        System.out.println(" El tren modelo "+super.getModelo()+" frena en 5 segundos ");
    }

    @Override
    public void estacionar() {
        System.out.println(" El tren "+ super.getSistAlumbrado()+ " es muy facil de estacionar");
    }
    
     /**
     * Método toString convierte un objeto en cadena de texto.
     *
     * @return atributos de la clase Terrestre en el método super.toString() y
     * ademas atributos de su pripia clase.
     */
    @Override
    public String toString() {
        return  super.toString() + " Cantidad de vagones= " + cantVagones + 
                ", Tipode locomotora= " + tipoLocomotora + " Con todas estas "
                + "caracteristicas se estima"+"\n"+ "el arribo a Quito "
                + "en " + this.calcularTiempoViaje() + " horas"+"\n";
    }

}
