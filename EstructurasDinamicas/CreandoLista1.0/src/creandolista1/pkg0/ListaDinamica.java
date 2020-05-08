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
public class ListaDinamica<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamaño;
    
    public ListaDinamica(){
        primero=null;
        ultimo=null;
        tamaño=0;
    }

    public boolean isEmpty(){
        return tamaño==0;
    }
    public int size(){
        return tamaño;
    }
    private Nodo<T> getNode(int index){
        if(isEmpty() || (index < 0 || index >= size())){
            return null;
        }else if(index == 0){
            return primero;
        }else if(index == size()-1){
            return ultimo;
        }else{
            Nodo<T> buscado=primero;
            int contador=0;
            while(contador < index){
                contador++;
                buscado=buscado.getSiguiente();
            }
            return buscado;
        }
    }
    public T get(int index){
        if(isEmpty() || (index < 0 || index >= size())){
            return null;
        }else if(index == 0){
            return getFirst();
        }else if(index == size()-1){
            return getLast();
        }else{
            Nodo<T> buscado=getNode(index);
            return buscado.getElemento(); 
        }
    }
    public T getFirst(){
        if(isEmpty()){
            return null;
        }else{
            return primero.getElemento();
        }         
    }
    public T getLast(){
        if(isEmpty()){
            return null;
        }else{
            return ultimo.getElemento();
        }      
    }
    public T addFirst( T elemento){
        Nodo <T> aux;
        
        if(isEmpty()){
            aux=new Nodo <>(elemento, null);//Logicamente al ser el primero no habra un siguiente en ese momento, por eso null
            primero=aux;
            ultimo=aux;
        }else{
            aux=new Nodo<>(elemento, primero);
            primero=aux;
        }
        tamaño ++;
        return primero.getElemento();
    }

}
