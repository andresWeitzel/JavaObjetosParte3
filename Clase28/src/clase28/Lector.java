/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

/**
 *
 * @author andre
 */
public class Lector implements AutoCloseable{
    
    public Lector(){
        System.out.println("Se creo un Lector");
    }
    public void leer(){
        System.out.println("Se lee el medio");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("Se ceerro el medio");
    }
    
}
