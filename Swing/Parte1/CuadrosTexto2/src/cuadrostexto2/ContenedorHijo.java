/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrostexto2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel{
    //DECLARAMOS LOS ELEMENTOS EN LA CLASE PRINCIPAL PARA PODER UTILIZARLOS 
    //EN TODAS LAS CLASES INTERNAS DE LA CLASE PADRE
    
    //Declaramos un nuevo contenedor para los mensajes de validacion
    private JPanel contenedorValidacionEmail;
    
    //Declaramos un input
    private JTextField textoInput;
    
    //Declaramos etiquetas
    private JLabel etiquetaEmail;
    private JLabel mensajeValidacionEmail;
    
    //Deaclaramos boton
    private JButton boton1;
    
    public ContenedorHijo(){
        //Instanciamos nuestro contenedor de respuestas de validacion
        contenedorValidacionEmail=new JPanel();
        //Instanciamos un layout para nuestro contenedor de respuestas de validacion
        setLayout(new BorderLayout());
        //ubicamos nuestro contenedor de respuestass
        contenedorValidacionEmail.setLayout(new FlowLayout());
        
        //Creamos una etiqueta
        etiquetaEmail=new JLabel("Email: ");
        contenedorValidacionEmail.add(etiquetaEmail);
        
        //Creamos un input, fijarse API JAVA
        //Usamos el metodo para darle 20 columnas
        textoInput=new JTextField(20);
         contenedorValidacionEmail.add(textoInput);
        
        //Creamos una etiqueta para la respuesta de la validacion del input
        mensajeValidacionEmail=new JLabel("",JLabel.CENTER);
        add(mensajeValidacionEmail,BorderLayout.CENTER);
        
        //Creamos un evento
        EventoTexto evento1=new EventoTexto();
        //Agregamos un boton
         boton1=new JButton("Enviar");    
        //El boton estara a la escucha  de la clase EventoTexto
        boton1.addActionListener(evento1);     
        contenedorValidacionEmail.add(boton1);
        
        //Agregamos el contenedor de validacion del email a la parte norte de
        //nuestro contenedor hijo
        add(contenedorValidacionEmail,BorderLayout.NORTH);
        
    }
    //Clase Interna(recordad que el private es para que no se pueda 
    //ingresar desde fuera de la clase)
    private class EventoTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            //Validacion de email.
            int validacion=0;
            String email=textoInput.getText().trim();
            
            //Analizamos caracter por caracter
            for(int i=0; i < email.length(); i++){
                if(email.charAt(i)=='@'){
                    validacion ++;
                }
            }
            if(validacion != 1){
                mensajeValidacionEmail.setText("Agregue un arroba\n");
                   }else{
                mensajeValidacionEmail.setText("Email Correcto!!\n");
               }
            //el metodo .getText toma el texto del FieldText y el .trim saca los espacios
            System.out.println(textoInput.getText().trim());
        }
        
    }
}
