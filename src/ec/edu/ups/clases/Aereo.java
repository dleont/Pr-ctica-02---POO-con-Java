/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Clase Aereo "padre" de tipo abstracta que hereda atributos de la clase
 * Transporte "abuelo". Clase de tipo abstracta, con un método abstracto; además
 * cuenta con atributos proios de la clase.
 *
 * @author Darwin Leon, Est.
 */
public abstract class Aereo extends Transporte {

    //Atributos de la clase Aereo
    private String tipoTransporte;
    private double costoVuelo;
    private double alturaVuelo;
    private String formaDespegar;
    private String formaAterrizar;

    /**
     * Método abstracto: solo se declara el cual pertenece a la clase Aereo.
     * Calcula la categoria del vuelo(1clase/2clase) mediante el costo del
     * mismo.
     */
    public abstract void calcularCategoriaVuelo();

    /**
     * Constructor espacial de la clase Aereo: tipo publico, no retorna ningun
     * parametro, con el nombre de la clase.
     */
    public Aereo() {
    }

    /**
     * Constructor que hereda todos y solo los atributos de la clase heredada
     * "Transporte".
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
    public Aereo(int codigo, String nombre, String modelo, String marca, String color, double costo, int capacidad, double maximaVelocidad) {
        super(codigo, nombre, modelo, marca, color, costo, capacidad, maximaVelocidad);
    }

    /**
     * Constructor que hereda de la clase "Transporte" y ademas incluye los
     * atributos de la clase "Aereo".
     *
     * @param tipoTransporte
     * @param costoVuelo
     * @param alturaVuelo
     * @param formaDespegar
     * @param formaAterrizar
     * @param codigo
     * @param nombre
     * @param modelo
     * @param marca
     * @param color
     * @param costo
     * @param capacidad
     * @param maximaVelocidad
     */
    public Aereo(String tipoTransporte, double costoVuelo, double alturaVuelo, String formaDespegar, String formaAterrizar, int codigo, String nombre, String modelo, String marca, String color, double costo, int capacidad, double maximaVelocidad) {
        super(codigo, nombre, modelo, marca, color, costo, capacidad, maximaVelocidad);
        this.tipoTransporte = tipoTransporte;
        this.costoVuelo = costoVuelo;
        this.alturaVuelo = alturaVuelo;
        this.formaDespegar = formaDespegar;
        this.formaAterrizar = formaAterrizar;
    }

    //Métodos setter's y getter's
    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getCostoVuelo() {
        return costoVuelo;
    }

    public void setCostoVuelo(double costoVuelo) {
        this.costoVuelo = costoVuelo;
    }

    public double getAlturaVuelo() {
        return alturaVuelo;
    }

    public void setAlturaVuelo(double alturaVuelo) {
        this.alturaVuelo = alturaVuelo;
    }

    public String getFormaDespegar() {
        return formaDespegar;
    }

    public void setFormaDespegar(String formaDespegar) {
        this.formaDespegar = formaDespegar;
    }

    public String getFormaAterrizar() {
        return formaAterrizar;
    }

    public void setFormaAterrizar(String formaAterrizar) {
        this.formaAterrizar = formaAterrizar;
    }

    /**
     * Método to String convierte un objeto en una cadena de texto.
     *
     * @return método toString de la clase "ABUELO" (super.toString()) y además
     * con valores de esta clase.
     */
    @Override
    public String toString() {
        return "Aereo{ " + super.toString() + "Tipo de Transporte= " + tipoTransporte
                + ", Costo del Vuelo= " + costoVuelo + ", Altura de Vuelo= " + alturaVuelo
                + ", Forma de Despegar= " + formaDespegar + ", Forma  de Aterrizar= " + formaAterrizar + '}';
    }

}
