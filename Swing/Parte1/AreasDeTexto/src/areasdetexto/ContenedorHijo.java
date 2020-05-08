/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasdetexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel {
    //--Contenedor Barras de Scroll--
    JScrollPane contenedorScroll;
   //--Area de texto--
    JTextArea areaTexto;
   //--Boton de envio--
    JButton botonEnvio; 
    
    public ContenedorHijo(){
        //Instanciamos un nuevo area 8 filas y 20 columnas
        areaTexto=new JTextArea(8,20);
        //Cuando se llegue al borde derecho automaticamente realiza un salto de linea
        areaTexto.setLineWrap(true);
        
        //Contenedor con barras de Scroll para el area de Texto
        contenedorScroll=new JScrollPane(areaTexto);   
        //Agregamos el contenedor de Barras de Scroll que contiene al area de texto
        add(contenedorScroll);
        
        //Boton de envio del texto
        botonEnvio=new JButton("Enviar");
        //Colocamos como oyente el botone instanciamos un objeto cada vez que ocurra 
        //un evento
        botonEnvio.addActionListener(new EventosAreaTexto());
        //Agregamos nuestro boton
        add(botonEnvio);
        
    }
    //Clase Interna para los eventos
    private class EventosAreaTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent arg0) {
            //Cada vez que el evento utiice este metodo captura el texto del area de texto
            System.out.println(areaTexto.getText());
        }
        
    }
   
    
   
}
