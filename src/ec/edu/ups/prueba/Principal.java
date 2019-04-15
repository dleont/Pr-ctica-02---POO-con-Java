/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;

import ec.edu.ups.clases.Auto;
import ec.edu.ups.clases.Terrestre;
import ec.edu.ups.clases.Transporte;
import ec.edu.ups.clases.Tren;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Darwin
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println(" ►►► TRANSPORTES ◄◄");
        System.out.println(" ");

        List<Transporte> lista = new ArrayList<>();

        Auto autoFor = new Auto("Automatico", 5, "todo terreno", "electrico", 0, 01, "For 150", "2015", "FOR", "negro", 30000, 5, 150);
        double tiempoAutoFor = autoFor.calcularTiempoViaje();
        System.out.println(" Tiempo de llegada con un transporte: " + "\n" + autoFor.toString());
        autoFor.arrancar();
        autoFor.transportar();
        autoFor.frenar();
        autoFor.estacionar();
        System.out.println("\n");

        Auto autoPichirilo = new Auto("manual", 5, "asfalto", "electrico", 0, 02, " Pichirilo", "1990", "Volkswagen", "rojo", 2500, 5, 100);
        double tiempoAutoPichi = autoPichirilo.calcularTiempoViaje();
        System.out.println(" Tiempo de llegada con un transporte: " + "\n" + autoPichirilo.toString());
        autoPichirilo.arrancar();
        autoPichirilo.transportar();
        autoPichirilo.frenar();
        autoPichirilo.estacionar();
        System.out.println("\n");

        Tren trenVala = new Tren(20, "electrico", "rieles", "magnético", 0, 03, "Tren Bala", "k 1", "Japon", "blanco", 150000, 150, 500);
        double tiempoTrenVala = trenVala.calcularTiempoViaje();
        System.out.println(" Tiempo de llegada con un transporte: " + "\n" + trenVala.toString());
        trenVala.arrancar();
        trenVala.transportar();
        trenVala.frenar();
        trenVala.estacionar();
        System.out.println("\n");

        Tren trenEcu = new Tren(12, "petroleo", "rieles", "electrico", 0, 04, "Tren Ecuador", " 1964", "Ecuador", "rojo", 900000, 80, 140);
        double tiempoTrenEcu = trenEcu.calcularTiempoViaje();
        System.out.println(" Tiempo de llegada con un transporte: " + "\n" + trenEcu.toString());
        trenEcu.arrancar();
        trenEcu.transportar();
        trenEcu.frenar();
        trenEcu.estacionar();
        System.out.println("\n");

        lista.add(autoFor);
        lista.add(autoPichirilo);
        lista.add(trenVala);
        lista.add(trenEcu);

        System.out.println(" ");

        Terrestre terreAnonimo = new Terrestre("Rieles", "electrico", 4) {
            @Override
            public double calcularTiempoViaje() {
                return this.getCapacidad();
            }

            @Override
            public double calcularTamaño() {
                return 0;
            }
        };
        System.out.println(" ");
        System.out.println("Transporte Anonimo");
        System.out.println(terreAnonimo);

    }

}
