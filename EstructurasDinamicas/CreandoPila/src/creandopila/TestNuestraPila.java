/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creandopila;

/**
 *
 * @author andre
 */
public class TestNuestraPila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Le pasamos dentro del Generic un wrapper para que sea una lista de enteros
        PilaDinamica<Integer> pilaNumeros=new PilaDinamica<>();
        
        System.out.println("\n♦♦Creando Una Nueva PiLa Dinamica♦♦");
        System.out.println("¿La pila esta vacia? "+pilaNumeros.isEmpty());
        
        System.out.println("Agregamos elementos con el metodo push()");
        pilaNumeros.push(5);
        pilaNumeros.push(10);
        pilaNumeros.push(15);
        pilaNumeros.push(2);
        pilaNumeros.push(20);//Este sera el top, el ultimo en entrar y el primero en salir(el de mas arriba de la lista)
        
        System.out.println("El tamaño es de "+pilaNumeros.size()+" elementos");
        
        System.out.println("El elemento top es "+pilaNumeros.top());
        
        System.out.println("¿La pila esta vacia? "+pilaNumeros.isEmpty());
        
        System.out.println("Sacamos un elemento con el metodo pop");
        int elemento=pilaNumeros.pop();
        
        System.out.println("Hemos sacado el numero "+elemento);
        
        System.out.println("El nuevo tamaño de la pila es "+pilaNumeros.size());
        
         
        System.out.println("El elemento top es "+pilaNumeros.top());
        
    
    }
    
}
