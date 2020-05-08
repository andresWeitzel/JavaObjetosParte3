/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel {
     //**Atributos**
     //Recordar que al definir los atributos en la clase principal y no en el
    //contsructor podemos utilizarlas en clases internas
    //--Contenedor cuadros de textos--
    JPanel contenedorCuadrosTextos;
    //--Etiquetas--
    JLabel etiquetaUsuario;
    JLabel etiquetaContraseña;
    //--Cuadros de Texto--
    JTextField cuadroTextoUsuario;
    JPasswordField cuadroTextoContraseña;
    //--Boton Validacion Login--
    JButton botonValidacion;
    
    public ContenedorHijo(){
    //--Layout--
    //Usamos alineaciones con Layout
    setLayout(new BorderLayout());
    
    //--Contenedor etiquetas y cuadros de texto--    
    //Creamos un contenedor para los cuadros de textos
    contenedorCuadrosTextos=new JPanel();
    //Alineamos el contenedor, dos columnas dos filas
    contenedorCuadrosTextos.setLayout(new GridLayout(2,2));
    //Agregamos el contenedor y le indicamos la posicion
    add(contenedorCuadrosTextos,BorderLayout.NORTH);
    
    //--Usuario--
    //Creamos una etiqueta para usuario
    etiquetaUsuario=new JLabel("Usuario:");
    contenedorCuadrosTextos.add(etiquetaUsuario,BorderLayout.NORTH);    
    //Creamos cuadro de texto Usuario, con 20 columnas   
    cuadroTextoUsuario=new JTextField(20);
    contenedorCuadrosTextos.add(cuadroTextoUsuario,BorderLayout.NORTH);
    
    //--Contraseña--
    //Etiqueta Contraseña
    etiquetaContraseña=new JLabel("Contraseña:");
    contenedorCuadrosTextos.add(etiquetaContraseña,BorderLayout.NORTH);  
    //Creamos cuadro de texto Contraseña, con 20 columnas 
    cuadroTextoContraseña=new JPasswordField(20);
    
    //Instanciamos el objeto de la clase interna de eventos
    EventosVerificacionLogin eventoContraseña=new EventosVerificacionLogin();
    //Colocamos el objeto/evento como oyente
    /*FUNCIONAMIENTO-->Se instancia un objeto que esta a la escucha cada vez que
    se utilize un metodo sobreescrito de la clase EventosVerificacionLogin(lanzar un evento), 
    este se guarda en un documento.
    */
    cuadroTextoContraseña.getDocument().addDocumentListener(eventoContraseña);
    
    //agregamos el cuadro de texto contraseña
    contenedorCuadrosTextos.add(cuadroTextoContraseña,BorderLayout.NORTH);
    
    //--Boton Validacion--
    botonValidacion=new JButton("Enviar");
    add(botonValidacion,BorderLayout.SOUTH);
    
    }
    
    //cLASE iNTERNA PARA LOS EVENTOS
    private class EventosVerificacionLogin implements DocumentListener{
        //CXomprobacion de la longitud de la contraseña en un array del 
         //tipo char(asi me lo indica la api de java)
         char contraseña[];
         
        @Override
        public void insertUpdate(DocumentEvent arg0) {         
         contraseña=cuadroTextoContraseña.getPassword();        
         //El cuadro de la contraseña se colocara en rojo en el siguiente caso
         if(contraseña.length < 8 || contraseña.length > 12){
            cuadroTextoContraseña.setBackground(Color.red);
          }else{
             cuadroTextoContraseña.setBackground(Color.white);
         }
        }
        
        @Override
        public void removeUpdate(DocumentEvent arg0) {
         contraseña=cuadroTextoContraseña.getPassword();        
         //El cuadro de la contraseña se colocara en rojo en el siguiente caso
         if(contraseña.length < 8 || contraseña.length > 12){
            cuadroTextoContraseña.setBackground(Color.red);
          }else{
             cuadroTextoContraseña.setBackground(Color.white);
         }
       }

        @Override
        public void changedUpdate(DocumentEvent arg0) {
         }
        
    }
    
   
}
