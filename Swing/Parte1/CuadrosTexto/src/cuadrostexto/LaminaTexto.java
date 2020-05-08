/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrostexto;

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
public class LaminaTexto extends JPanel{
    
    private JTextField texto1;//texto1 sera de tipo JTextField, lo definimos aca 
    //asi se podra utilizar en todas las clases
    
    public LaminaTexto(){
        //Creamos una etiqueta
        JLabel etiqueta1=new JLabel("Email: ");
        add(etiqueta1);
        
        //utilizamos el constructor que mas nos interese, fijarse API JAVA
        //Usamos el metodo para darle 20 columnas
         texto1=new JTextField(20);
        
        add(texto1);
        
        //Agregamos un boton
        JButton boton1=new JButton("Enviar");
        
        EventoTexto evento1=new EventoTexto();
        
        //El boton estara a la esucha de la clase EventoTexto
        boton1.addActionListener(evento1);
        
        add(boton1);
        
        
    }
    //Clase Interna(recordad que el private es para que no se pueda 
    //ingresar desde fuera de la clase)
    private class EventoTexto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //el metodo .getText toma el texto del FieldText y el .trim saca los espacios
            System.out.println(texto1.getText().trim());
        }
        
    }
}
