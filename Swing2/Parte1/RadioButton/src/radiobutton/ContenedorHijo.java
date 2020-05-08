/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobutton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel {
    //Contenedor Grupo de Botones
    JPanel contenedorGrupoBotones;
    //--Etiquetas--
    JLabel etiquetaSeleccion;
    //Grupo de Botones
    ButtonGroup grupoBotones;
    //Botones de radio
    JRadioButton botonTablaClientes;
    JRadioButton botonTablaProductos;
    JRadioButton botonTablaServicios;
    //Boton Envio
    JButton botonEnvio;
    
    public ContenedorHijo(){
             
        setLayout(new BorderLayout());
//-----------------------Contenedor----------------------------------------
        contenedorGrupoBotones = new JPanel();
        //Alineamos el contenedor, tres filas una columna
        contenedorGrupoBotones.setLayout(new GridLayout(3,1));
        //Agregamos el contenedor y le indicamos la posicion
        add( contenedorGrupoBotones, BorderLayout.CENTER);
        
//--------------------------Etiquetas-------------------------------------                
         etiquetaSeleccion = new JLabel("Seleccione una opcion:");
         add(etiquetaSeleccion,BorderLayout.NORTH);
        
//--------------------------Grupo Botones-------------------------------------        
        //Creamos un grupo de botones
        grupoBotones=new ButtonGroup();
        //Creamos los botones de Radio, el primer parametro es el nombre del boton
        //y el segundo si esta o no seleccionado
        botonTablaClientes=new JRadioButton(" Clientes",false);
        botonTablaProductos=new JRadioButton(" Productos",false);
        botonTablaServicios=new JRadioButton(" Servicios",false);
        //Agregamos los botones al grupo de botones
        grupoBotones.add(botonTablaClientes);
        grupoBotones.add(botonTablaProductos);
        grupoBotones.add(botonTablaServicios);
        //El grupo no se puede agregar al contenedor, se deberan agregar cada uno de los botones 
        //y estos estraran en el grupo
        contenedorGrupoBotones.add(botonTablaClientes);
        contenedorGrupoBotones.add(botonTablaProductos);
        contenedorGrupoBotones.add(botonTablaServicios);
        
//---------------------------Boton Envio--------------------------------------        
        botonEnvio=new JButton("Enviar");
        add(botonEnvio,BorderLayout.SOUTH);
    }
}
