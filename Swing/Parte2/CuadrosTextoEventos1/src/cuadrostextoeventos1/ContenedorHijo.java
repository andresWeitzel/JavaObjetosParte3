/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrostextoeventos1;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel {
    JTextField cuadroTexto;
    
    public ContenedorHijo(){
    //20 columnas    
    cuadroTexto=new JTextField(20);
    //Instanciamos un objeto de la clase evento
    EventosTexto eventoTexto=new EventosTexto();
    //Capturamos el documento que nos crea cuando utilizamos el JTextField
    Document documentoEvento=cuadroTexto.getDocument();
    //Ponemos el documento a la escucha pasandole la instancia de la clase que maneja el evento
    documentoEvento.addDocumentListener(eventoTexto);
    
    add(cuadroTexto);
    
    }
    
    //Clase Interna que gestiona los eventos
    private class EventosTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent arg0) {
            System.out.println("Has insertado texto");
      }

        @Override
        public void removeUpdate(DocumentEvent arg0) {
            System.out.println("Has borrado texto");
       }

        @Override
        public void changedUpdate(DocumentEvent arg0) {
         }
        
    }
}
