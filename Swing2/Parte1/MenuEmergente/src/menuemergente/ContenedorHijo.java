/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuemergente;

import java.awt.BorderLayout;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel {

    //Menu emergente
    JPopupMenu menuEmergente;
    //Elementos/items
    JMenuItem itemClientes;
    JMenuItem itemProductos;
    JMenuItem itemServicios;

    public ContenedorHijo() {
        //--Layout--
        setLayout(new BorderLayout());

        //Menu emergente
        menuEmergente = new JPopupMenu();

        //Creamos los elementos items
        itemClientes = new JMenuItem("Clientes");
        itemProductos = new JMenuItem("Productos");
        itemServicios = new JMenuItem("Servicios");

        //Agregamos los elementos-items al menu emergente
        menuEmergente.add(itemClientes);
        menuEmergente.add(itemProductos);
        menuEmergente.add(itemServicios);
        
        //Seteamos que componenentes seran emergentes en el menu
        setComponentPopupMenu(menuEmergente);
        
        //Agregamos el menu emergente al contenedor hijo
        //add(menuEmergente);
    }
}
