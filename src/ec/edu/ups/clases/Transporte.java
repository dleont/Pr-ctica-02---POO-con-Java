/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Clase Transporte "abuelo" de tipo abstracta donde van la mayoria de atributos
 * que serán heredados. Metodos setters y getters y tres tipos de constructores.
 * Método abstracto.
 *
 * @author Darwin Leon, Est.
 */
public abstract class Transporte {

   //atributos de tipo privado de la clase Transporte
    private int codigo;
    private String nombre;
    private String modelo;
    private String marca;
    private String color;
    private double costo;
    private int capacidad;
    private double maximaVelocidad;

    /**
     * Constructor especial donde se inicializa al momento de instanciar una
     * clase. tipo publico, no retorna nungun elemnto y mismo nombre de la
     * clase.
     */
    public Transporte() {
    }

    /**
     * Contructor que recibe como parametro 4 atributos de la clase.
     *
     * @param codigo
     * @param nombre
     * @param capacidad
     * @param maximaVelocidad
     */
    public Transporte(int codigo, String nombre, int capacidad, double maximaVelocidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.maximaVelocidad = maximaVelocidad;
    }

    /**
     * Constructor que contiene todos los atributos de la clase y que recibe
     * como parametro todos los atributos de la clase.
     *
     * @param codigo
     * @param nombre
     * @param modelo
     * @param marca
     * @param color
     * @param costo
     * @param capacidad
     * @param maximaVelocidad
     */
    public Transporte(int codigo, String nombre, String modelo, String marca,
            String color, double costo, int capacidad, double maximaVelocidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.costo = costo;
        this.capacidad = capacidad;
        this.maximaVelocidad = maximaVelocidad;
    }
    
    /**
     * Método abstracto: calcula el tamaño del transporte mediante la cantidad
     * de pasajeros "capacidad".
     */
    public abstract void calcularTamaño();

}
