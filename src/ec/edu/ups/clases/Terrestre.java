/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 * Clase Terrestre "padre" de tipo abstracta que hereda todos los atributos de
 * la clase Transporte "abuelo" y ademas contine sus propias atributos. Se
 * implementa herencia en esta clase. Contiene un metodo abstracto el cual solo
 * se declara.
 *
 * @author Darwin Leon, Est.
 */
public abstract class Terrestre extends Transporte {

    //atributos propios de la clase Terrestre
    private String tipoVia;
    private String sistAlumbrado;
    private int cantChoques;

    /**
     * Metodo abstracto de la clase Terrestre: solo se declara. Calcula tiempo
     * de viaje mediante la velocidad máxima.
     */
    public abstract double calcularTiempoViaje();

    /**
     * Constructor espacial de la clase Terrestre tipo publico, no retorna
     * ningun paramtro, con el nombre de la clase.
     */
    public Terrestre() {
    }

    /**
     * Constructor con los atributos de la clase Terrestre.
     *
     * @param tipoVia
     * @param sistAlumbrado
     * @param cantChoques
     */
    public Terrestre(String tipoVia, String sistAlumbrado, int cantChoques) {
        this.tipoVia = tipoVia;
        this.sistAlumbrado = sistAlumbrado;
        this.cantChoques = cantChoques;
    }

    /**
     * Constructor con los atributos de la clase Terestre y ademas hereda de la
     * clase Transporte.
     *
     * @param tipoVia
     * @param sistAlumbrado
     * @param cantChoques
     * @param codigo
     * @param nombre
     * @param modelo
     * @param marca
     * @param color
     * @param costo
     * @param capacidad
     * @param maximaVelocidad
     */
    public Terrestre(String tipoVia, String sistAlumbrado, int cantChoques, int codigo, String nombre, String modelo, String marca, String color, double costo, int capacidad, double maximaVelocidad) {
        super(codigo, nombre, modelo, marca, color, costo, capacidad, maximaVelocidad);
        this.tipoVia = tipoVia;
        this.sistAlumbrado = sistAlumbrado;
        this.cantChoques = cantChoques;
    }

    //metodos setter's y getter's
    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getSistAlumbrado() {
        return sistAlumbrado;
    }

    public void setSistAlumbrado(String sistAlumbrado) {
        this.sistAlumbrado = sistAlumbrado;
    }

    public int getCantChoques() {
        return cantChoques;
    }

    public void setCantChoques(int cantChoques) {
        this.cantChoques = cantChoques;
    }

    /**
     * Metodo to String convierte un objeto en cadena de texto.
     *
     * @return metodo to String (super.toString())de la clase Transporte y
     * ademas con valores de la clase Terrestre.
     */
    @Override
    public String toString() {
        return " Terrestre{" + super.toString() + " Para Tipo de Via= " + tipoVia
                + ", Sistema de Alumbrado= " + sistAlumbrado + "\n"
                + " Cantidad de Choques= " + cantChoques;
    }

}
