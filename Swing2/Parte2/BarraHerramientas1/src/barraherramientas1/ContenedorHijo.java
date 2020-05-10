/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barraherramientas1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel {
    //--CONTENEDOR COMPONENTES--
    JPanel contenedorBarras;
    JPanel contenedorAreaTexto;
    //--BARRA DE MENU--
    JMenuBar barraMenu;
    //--Elementos principales de menu--
    JMenu MenuClientes;
    JMenu MenuProductos;
    JMenu MenuServicios;
    //--Elementos secundarios de Menu--
    JMenuItem elemento1MenuClientes;
    JMenuItem elemento2MenuClientes;
    JMenuItem elemento1MenuProducto;
    JMenuItem elemento2MenuProducto;
    JMenuItem elemento1MenuServicios;
    JMenuItem elemento2MenuServicios;

    //--BARRA DE HERRAMIENTAS--
    JToolBar barraHerramientas;
    //--Botones para la barr de herramientas--
    JButton botonAñadir;
    JButton botonQuitar;
    JButton botonModificar;

    //--AREA DE TEXTO--
    JTextArea areaTexto;

    public ContenedorHijo() {
        //Contenedor Componentes
        contenedorBarras=new JPanel();
        contenedorAreaTexto=new JPanel();
//------------------------------------------------------------------        
        //--Layout--
       //contenedorComponentes.setLayout(new GridLayout(9,2));//filas-columnas
      contenedorBarras.setLayout(new BorderLayout(4,2));//filas-columnas
      contenedorAreaTexto.setLayout(new BorderLayout(2,2));
       
//----------------------------------------------------------------------------
        //--BARRA DE MENU-- 
        barraMenu = new JMenuBar();

        //--Elementos principales del menu--
        MenuClientes = new JMenu("Clientes");
        MenuProductos = new JMenu("Productos");
        MenuServicios = new JMenu("Servicios");

        //--Elementos secundarios del menu--
        elemento1MenuClientes = new JMenuItem("Minoristas");
        elemento2MenuClientes = new JMenuItem("Mayoristas");

        elemento1MenuProducto = new JMenuItem("Electronicos");
        elemento2MenuProducto = new JMenuItem("Electricos");

        elemento1MenuServicios = new JMenuItem("Mensajeria");
        elemento2MenuServicios = new JMenuItem("Mantenimiento");

        //--Agregamos los elementos secundarios dentro de los elementos principales--
        MenuClientes.add(elemento1MenuClientes);
        MenuClientes.add(elemento2MenuClientes);

        MenuProductos.add(elemento1MenuProducto);
        MenuProductos.add(elemento2MenuProducto);

        MenuServicios.add(elemento1MenuServicios);
        MenuServicios.add(elemento2MenuServicios);

        //--Agregamos los elementos principales a la barra de menu--
        barraMenu.add(MenuClientes);
        barraMenu.add(MenuProductos);
        barraMenu.add(MenuServicios);

        //--Agregamos la barra de menu al contenedor Hijo--
        contenedorBarras.add(barraMenu);
//------------------------------------------------------------------------------
        //--BARRA DE HERRAMIENTAS--
        barraHerramientas = new JToolBar();

        botonAñadir = new JButton("Añadir");
        botonQuitar = new JButton("Quitar");
        botonModificar = new JButton("Modificar");

        //--Añadimos los botones a la barra de herramientas--
        barraHerramientas.add(botonAñadir);
        barraHerramientas.add(botonQuitar);
        barraHerramientas.add(botonModificar);

        //--Agregamos la barra de herramientas al contenedor Hijo--
        contenedorBarras.add(barraHerramientas);
 //--------------------------------------------------------------
        //--Area de Texto--
        areaTexto = new JTextArea();//filas,columnas
        areaTexto.setLineWrap(true);//Salto de linea automatico

        //--Agregamos el area de texto al contenedor-
        contenedorAreaTexto.add(areaTexto);
//------------------------------------------------------------
        //--AGREGAMOS LOS CONTENEDORES DE LOS COMPONENTES--
        add(contenedorBarras,BorderLayout.NORTH);
        add(contenedorAreaTexto,BorderLayout.CENTER);
    
    
    
    }
}
