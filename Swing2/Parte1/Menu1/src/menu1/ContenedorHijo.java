/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu1;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel {

    //--Barra de Menu--
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

    public ContenedorHijo() {
        //--Layout--

        //--Barra de Menu-- 
        barraMenu = new JMenuBar();
        
        //--Elementos principales del menu--
        MenuClientes = new JMenu("Clientes");
        MenuProductos = new JMenu("Productos");
        MenuServicios = new JMenu("Servicios");
        
        //--Elementos secundarios del menu--
        elemento1MenuClientes=new JMenuItem("Minoristas");
        elemento2MenuClientes=new JMenuItem("Mayoristas");
         
        elemento1MenuProducto=new JMenuItem("Electronicos");
        elemento2MenuProducto=new JMenuItem("Electricos");
        
        elemento1MenuServicios=new JMenuItem("Mensajeria");
        elemento2MenuServicios=new JMenuItem("Mantenimiento");
        
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
        add(barraMenu);

    }
}
