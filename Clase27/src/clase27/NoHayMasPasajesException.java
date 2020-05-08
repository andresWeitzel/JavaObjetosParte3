/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

/**
 *
 * @author andre
 */
public class NoHayMasPasajesException extends Exception {
    private String nombreVuelo;
    private int cantidadPasajesDisponibles;
    private int cantidadPasajesNoDisponibles;
    

    public NoHayMasPasajesException(String nombreVuelo, int cantidadPasajesDisponibles, int cantidadPasajesNoDisponibles) {
        this.nombreVuelo = nombreVuelo;
        this.cantidadPasajesDisponibles = cantidadPasajesDisponibles;
        this.cantidadPasajesNoDisponibles= cantidadPasajesNoDisponibles;
    }
    
    
    @Override
    public String toString() {
        return "El vuelo " + nombreVuelo + ", solo dispone de " + cantidadPasajesDisponibles + " pasajes, no dispone de " + cantidadPasajesNoDisponibles + " pasajes!!";
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public int getCantidadPasajesDisponibles() {
        return cantidadPasajesDisponibles;
    }

    public void setCantidadPasajesDisponibles(int cantidadPasajesDisponibles) {
        this.cantidadPasajesDisponibles = cantidadPasajesDisponibles;
    }

    public int getCantidadPasajesNoDisponibles() {
        return cantidadPasajesNoDisponibles;
    }

    public void setCantidadPasajesNoDisponibles(int cantidadPasajesNoDisponibles) {
        this.cantidadPasajesNoDisponibles = cantidadPasajesNoDisponibles;
    }

    
    
}
