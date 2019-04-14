/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.interfaz;

/**
 * Clase Interfaz donde contiene los metodos de las clases hijas, el cual todos
 * realizan la misma accion pero de manera diferente.
 *
 * @author Darwin Leon, Est.
 */
public interface Interfaz {

    public abstract void transportar();

    public abstract void arrancar();

    public abstract void frenar();

    public abstract void estacionar();

}
