/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

import java.io.Serializable;

/**
 *
 * @author Usuario iTC
 */
public class Ciudad implements Serializable {

    private String identificacion;
    private String nombreCiudad;
    private String nombreProv;

    public Ciudad(String nombreC, String nombrePro, String id) {
        identificacion = id;
        nombreProv = nombrePro;
        nombreCiudad = nombreC;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public String obtenerNombreProvincia() {
        return nombreProv;
    }

    public void establecerNombreProv(String n) {
        nombreProv = n;
    }

    public String obtenerNombreCiudad() {
        return nombreCiudad;
    }

    public void establecerNombreCiudad(String n) {
        nombreCiudad = n;
    }
}

