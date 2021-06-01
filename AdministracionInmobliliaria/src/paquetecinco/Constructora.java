/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecinco;

import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class Constructora implements Serializable{

    private String identificacion;
    private String nombreConstructora;

    public Constructora(String id, String nombre) {
        this.identificacion = id;
        this.nombreConstructora = nombre;
    }

    public String obtenerNombreConstructora() {
        return nombreConstructora;
    }

    public void establecerNombreConstructora(String nombreConstructora) {
        this.nombreConstructora = nombreConstructora;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }
}

