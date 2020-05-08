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
public class ColaDinamica<T> {

    private Nodo<T> primero;
    private Nodo<T> ultimo;
    private int tamaño;

//Constructor
    public ColaDinamica() {
        primero = null;
        ultimo = null;
        tamaño = 0;

    }

    //Metodos
    public boolean isEmpty() {
        return primero == null;

    }

    public int size() {
        return tamaño;
    }

    public T primero() {
        if (isEmpty()) {
            return null;
        }
        return primero.getElemento();
    }

    //Descolar
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T elemento = primero.getElemento();
        Nodo<T> aux = primero.getSiguiente();
        primero = null;//El garbage lo elimina

        primero = aux;
        tamaño--;

        if (isEmpty()) {
            ultimo = null;
        }
        return elemento;

    }

    //Encolar(Se encola al final)
    public T enqueue(T elemento) {
        //El que encole sera el ultimo, no ha otro elemento siguiente a este(cuadno
        //siguiente es null sera el ultimo)
        Nodo<T> aux = new Nodo(elemento, null);

        if (isEmpty()) {
            //Si no hay ningn elemento el ultimo sera el primero
            primero = aux;
            ultimo = aux;
        } else {
            //Aca tenemos dos nodos, cuando el tamaño sea de un elemento lo haremos
            //asi, sino de otra forma
            if (size() == 1) {
                primero.setSiguiente(ultimo);
            } else {
                ultimo.setSiguiente(aux);
                ultimo = aux;
            }
            ultimo = aux;
            return aux.getElemento();
        }
        //Aumentamos la cola
        tamaño++;
        return aux.getElemento();
    }

    public String toString() {
        if (isEmpty()) {
           return "La cola esta vacia";
        } else {
            String cadena = "";
            Nodo<T> aux = primero;
            
            while (aux != null) {
                cadena += aux;
                aux = aux.getSiguiente();
            }
            return cadena;
        }
    }

}
