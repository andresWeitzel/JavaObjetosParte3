/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class Clase27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Vuelo vuelo1=new Vuelo("Airlo190",100);
            Vuelo vuelo2=new Vuelo("Julitgy2020",20);
            
        try {
            
            vuelo1.venderPasajes(40);//venta1
            vuelo1.venderPasajes(38);//venta2
            vuelo1.venderPasajes(105);//venta3, lanza exception
            vuelo2.venderPasajes(23);//No se realiza por que lanzo la exception antes
        } catch (NoHayMasPasajesException ex) {
            System.out.println(ex); 
        } 
    }
    
}
