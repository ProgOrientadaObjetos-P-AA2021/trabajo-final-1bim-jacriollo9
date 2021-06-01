/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetedos;

import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class Propietario implements Serializable{

    String identificacion;
    String nombresPropietario;
    String apellidosPropietario;

    public Propietario(String id, String nombres, String apellidos) {
        nombresPropietario = nombres;
        apellidosPropietario = apellidos;
        identificacion = id;
    }

    public String obtenerNombresPropietario() {
        return nombresPropietario;
    }

    public void establecerNombresPropietario(String nombres) {
        nombresPropietario = nombres;
    }

    public String obtenerApellidosPropietario() {
        return apellidosPropietario;
    }

    public void establecerApellidosPropietario(String apellidos) {
        apellidosPropietario = apellidos;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void establecerIdentificacion(String id) {
        this.identificacion = id;
    }
}

