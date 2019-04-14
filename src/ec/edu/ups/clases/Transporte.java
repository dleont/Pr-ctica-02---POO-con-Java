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

    //metodos getter's y setter's
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getMaximaVelocidad() {
        return maximaVelocidad;
    }

    public void setMaximaVelocidad(double maximaVelocidad) {
        this.maximaVelocidad = maximaVelocidad;
    }

    /**
     * metodo to String convierte un objeto en cadena de texto.
     *
     * @return valores de la clase Transporte
     */
    @Override
    public String toString() {
        return "Transporte{" + "Código= " + codigo + ", Nombre= " + nombre
                + ", Modelo= " + modelo + ", Marca= " + marca + ", Color= " + color
                + ", Costo= " + costo + ", Capacidad de personas= " + capacidad
                + ", Máxima Velocidad= " + maximaVelocidad + '}';
    }

}
