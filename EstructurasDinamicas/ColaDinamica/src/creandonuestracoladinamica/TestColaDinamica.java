/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creandonuestracoladinamica;

/**
 *
 * @author andre
 */
public class TestColaDinamica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ColaDinamica<Integer> cola1 = new ColaDinamica();
        System.out.println("\n♦♦Creando nuestra propia Cola Dinamica♦♦");
        System.out.println("\n--Encolamos elementos--");
        System.out.println("Añadiendo elementos...");        
        cola1.enqueue(5);
        cola1.enqueue(10);
        cola1.enqueue(15);
        cola1.enqueue(20);
        System.out.println("El tamaño de la cola es de "+cola1.size()+" elementos");
        System.out.println("La cola esa vacia?"+cola1.isEmpty());
        System.out.println("El primer elemento de la cola es "+cola1.primero());
        
        System.out.println("\n--Descolamos elementos--");
        System.out.println("Quitando el primer elemento...");
        cola1.dequeue();
        System.out.println("El tamaño de la cola es de "+cola1.size()+" elementos");
         System.out.println("La cola esa vacia?"+cola1.isEmpty());
        System.out.println("El primer elemento de la cola es "+cola1.primero());
        
        
    }

}
