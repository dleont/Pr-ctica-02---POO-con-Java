/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Terrestre;

/**
 *
 * @author Darwin
 */
public class Principal {
    
    public static void main(String[] args){
        System.out.println(" Transportes");  
        
        Terrestre terrestre;
        terrestre = new Terrestre("Rieles", "Electrico", 12) {
            @Override
            public void calcularTiempoViaje() {
                
            }
            
            @Override
            public void calcularTamaño() {
                
            }
        };
    }
    
}
