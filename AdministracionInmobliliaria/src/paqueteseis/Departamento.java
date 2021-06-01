/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

import java.io.Serializable;
import paquetecinco.Constructora;
import paquetecuatro.Ciudad;
import paquetedos.Propietario;
import paquetetres.Ubicacion;

/**
 *
 * @author Usuario iTC
 */
public class Departamento implements Serializable{

    private String nombreEdificio;
    private String ubicacionDeEdificio;
    private int numeroCuartos;
    private double valorCuotaMensual;
    private double costoTotal;
    private Ubicacion ubicacion;
    private double precioMCuadrado;
    private Constructora constructora;
    private Ciudad ciudad;
    private double precio;
    private Propietario propietario;
    private String identificacion;
    private double mCuadrados;

    public Departamento(String nomEdi, String ubiEdificio, int nCuartos,
            double valorCm, Ubicacion ubi, double precioMC,
            Constructora cnt, Ciudad cd, double prec,
            Propietario prop, String id, double mCuad)   {
        nombreEdificio = nomEdi;
        ubicacionDeEdificio = ubiEdificio;
        numeroCuartos = nCuartos;
        valorCuotaMensual = valorCm;
        ubicacion = ubi;
        precioMCuadrado = precioMC;
        constructora = cnt;
        ciudad = cd;
        precio = prec;
        propietario = prop;
        identificacion = id;
        mCuadrados = mCuad;
    }

    public String obtenerIdentificacion() {
        return identificacion;
    }

    public void establecerIdentificacion(String id) {
        identificacion = id;
    }

    public String obtenerUbicacionDeEdificio() {
        return ubicacionDeEdificio;
    }

    public void establecerUbicacionDeEdificio(String ubcEnEdi) {
        ubicacionDeEdificio = ubcEnEdi;
    }

    public Propietario obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Propietario prop) {
        propietario = prop;
    }

    public double obtenerPrecioMetroCuadrado() {
        return precioMCuadrado;
    }

    public void establecerPrecioMetroCuadrado(double precioMC) {
        precioMCuadrado = precioMC;
    }

    public double obtenerMCuadrados() {
        return mCuadrados;
    }

    public void establecerMCuadrados(double mCuadrados) {
        this.mCuadrados = mCuadrados;
    }

    public double obtenerCostoTotal() {
        return costoTotal;
    }

    public void calcularCostoTotal() {
        this.costoTotal = (mCuadrados * precioMCuadrado) + valorCuotaMensual * 12;
    }

    public Ubicacion obtenerUbicacion() {
        return ubicacion;
    }

    public void establecerUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public void establecerCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int obtenerNumeroCuartos() {
        return numeroCuartos;
    }

    public void establecerNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public Constructora obtenerConstructora() {
        return constructora;
    }

    public void establecerConstructora(Constructora constructora) {
        this.constructora = constructora;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public void establecerPrecio(double precio) {
        this.precio = precio;
    }

    public double obtenerValorCuotaMensual() {
        return valorCuotaMensual;
    }

    public void establecerValorCuotaMensual(double valorCuotaMensual) {
        this.valorCuotaMensual = valorCuotaMensual;
    }

    public String obtenerNombreEdificio() {
        return nombreEdificio;
    }

    public void establecerNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }
}
