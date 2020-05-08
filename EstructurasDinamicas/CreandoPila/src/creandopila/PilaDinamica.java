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
public class PilaDinamica<T> {
    private Nodo<T> top;//sera el ultimo elemento que entra a la pila osea el primero en salir(el de mas arriba de la escala)
    private int tamaño;

    public PilaDinamica(){
        top= null;
        this.tamaño=0;
    }

    public boolean isEmpty(){
        return top==null;
    }
    
    public int size(){
        return this.tamaño;
    }
    
    //devuleve el elemento top(del de arriba)
    public T top(){
        if(isEmpty()){
            return null;
        }else{
            //Si la lista no esta vacia dame el elemento top
            return top.getElemento();
        }       
    }
    
    //El pop saca un elemento, devuelve el contenido, no el nodo y lo elimina
    public T pop(){
       if(isEmpty()){
           return null;
       }else{
           //Hacemos una especie de backup antes de borrar el elemento
           T elemento = top.getElemento();
           
           //Colocando un elemento como null le decimos al Garbage Collector que 
           //lo elimine.
           Nodo<T> aux= top.getSiguiente();
           top=null;
           top=aux;
           
           //Como hemos sacado un elemento reducimos la pila 
           this.tamaño--;
           
           //Devolvemos el elemento 
           return elemento;
       }
    }
    //El push mete un elemento al  nodo
    public void push(T elemento){
        //Creo el elemento y le paso como valor el elemento siguiente(el de abajo)
        Nodo<T> aux= new Nodo<T>(elemento, top);
        //Ahora digo que el elemento top sera el elemento aux(elemento x = elemento x + 1)
        top=aux;    
        //Logicamente al agregar un elemento aumento el tamaño de la lista  
        this.tamaño++;
    
    }
    
        /* Agarro el primero(top),agarro el siguiente y mi aux sera ese, y asi con todo
    Vamos agarrando el siguiente del siguinete del nodo, voy del primero al ultimo
    y los voy imprimmiendo  
    */
    
    public String toString(){
        if(isEmpty()){
            return "La pila esta vacia";
        }else{
            String resultado=" ";
            
            Nodo<T> aux=top;
            
            //Voy al top, agarro el siguiente y lo guardo en aux, y asi hasta tener 
            //un null y salgo de la condicion 
            while(aux != null){
                
                resultado += aux.toString();
                
                aux=aux.getSiguiente();
            }
            return resultado;
        }
    }
    
    
    
    

}
