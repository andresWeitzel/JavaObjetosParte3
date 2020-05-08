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
public class Vuelo {
    private String nombreVuelo;
    private int cantidadPasajes;

    public Vuelo(String nombreVuelo, int cantidadPasajes) {
        this.nombreVuelo = nombreVuelo;
        this.cantidadPasajes = cantidadPasajes;
    }
    public  void venderPasajes(int cantidad) throws NoHayMasPasajesException{
        if(cantidad > cantidadPasajes) {
            throw new NoHayMasPasajesException(nombreVuelo,cantidadPasajes,cantidad);   
        }
        cantidadPasajes-=cantidad;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "nombre del vuelo=" + nombreVuelo + ", cantidadPasajes=" + cantidadPasajes + '}';
    }

    public String getNombre() {
        return nombreVuelo;
    }

    public void setNombre(String nombre) {
        this.nombreVuelo= nombre;
    }

    public int getCantidadPasajes() {
        return cantidadPasajes;
    }

    public void setCantidadPasajes(int cantidadPasajes) {
        this.cantidadPasajes = cantidadPasajes;
    }
    
    
}
