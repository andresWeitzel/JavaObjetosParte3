/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.*;

/**
 *
 * @author andre
 */
public class MarcoCalculadora extends JFrame{
    
    public MarcoCalculadora(){
        setTitle("Calculadora de Java");
        
        setBounds(500,300,450,300);
        
        LaminaCalculadora lamina1=new LaminaCalculadora();
        add(lamina1);
        
        //Utilizamos un metodo antiguo que sea tipo responsive, pero no es configurable
        //el jframe se coloca en cualquier posicion
        //pack();
        
    }
}
