/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creandolista1.pkg0;

/**
 *
 * @author andre
 */
public class TestCreandoLista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n♦♦CREANDO NUESTRA LISTA DINAMICA♦♦");
        
        ListaDinamica<String> lista=new ListaDinamica<String>();
        
        System.out.println("Agregando elementos...");
        lista.add("Alvear", 0);
        lista.add("Martinez", 1);
        lista.add("Rodriguez",2);
        lista.add("Ivromich",3);
        lista.addLast("De Richetti");
        lista.addFirst("Extromitji");
        lista.addFirst("Puntijuitkki");
        
        System.out.println("\n--La lista esta vacia?--");
        System.out.println(lista.isEmpty());
        
        System.out.println("\n--Longitud de la lista?--");
        System.out.println(lista.size());
        
        System.out.println("\n--Cual es el primer elemento de nuetra lista?--");
         System.out.println(lista.getFirst());
         
          System.out.println("\n--Cual es el ultimo elemento de nuetra lista?--");
         System.out.println(lista.getLast());
         
        System.out.println("\n--Imprimimos nuestra Lista completa de menor a mayor indice--");
        System.out.println(lista.toString());
        
        
    }
    
}
