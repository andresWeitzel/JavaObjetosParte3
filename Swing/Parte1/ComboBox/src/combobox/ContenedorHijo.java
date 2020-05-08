/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combobox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel{
    JPanel contenedorComboBox;
    JLabel etiquetaOpciones;
    JComboBox comboBox;
    JButton botonEnviar;
    
    public ContenedorHijo(){
     //--Layout--
     setLayout(new BorderLayout());  
     
    //--Etiquetas--
     etiquetaOpciones=new JLabel("Seleccione alguna opcion:");
     //Maquetamos la etiqueta
     etiquetaOpciones.setFont(new Font("MONOSPACED",Font.BOLD,16));    
     add(etiquetaOpciones,BorderLayout.NORTH);
     
     //--ComboBox--
     contenedorComboBox=new JPanel();
     comboBox=new JComboBox();  
     //Agregamos los elementos
     comboBox.addItem("Productos");
     comboBox.addItem("Servicios");
     comboBox.addItem("Clientes");
     
     //Agregamos el comboBox al contenedor.
     contenedorComboBox.add(comboBox);
     //agregamos y definimos una posicion al contenedor 
     add(contenedorComboBox,BorderLayout.CENTER);
     
     //--Boton Enviar--
     botonEnviar=new JButton("Enviar");
     
      //Instanciamos el objeto que estare pendiente de que se produzca algun evento
     EventoValidacion eventoValidacion=new EventoValidacion();
     //Dejamos el objeto a la espera
     botonEnviar.addActionListener(eventoValidacion);
     
     add(botonEnviar,BorderLayout.SOUTH);
     
     }
    
    //Clase Interna para la segunda ventana de validacion
    private class EventoValidacion implements ActionListener{
       
        @Override
        public void actionPerformed(ActionEvent arg0) {
            if("Productos".equals(comboBox.getSelectedItem())){
                JOptionPane.showMessageDialog(comboBox,"Has seleccionado Productos");
                 //System.out.println("Has seleccionado Productos");
            }
            else if("Servicios".equals(comboBox.getSelectedItem())){
                JOptionPane.showMessageDialog(comboBox,"Has seleccionado Servicios");
                //System.out.println("Has seleccionado Servicios");
            }
            else{
                JOptionPane.showMessageDialog(comboBox,"Has seleccionado Clientes");
                //System.out.println("Has seleccionado Clientes");
            }
           
        
        }
    }
}
