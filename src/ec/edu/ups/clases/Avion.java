/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Clase Avion "hijo" hereda atributos y métodos de la clase Transporte "abuelo"
 * y de Aereo la clase "padre". Contiene métodos abstractos.
 *
 * @author Darwin Leon, Est.
 */
public class Avion extends Aereo {

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

}
