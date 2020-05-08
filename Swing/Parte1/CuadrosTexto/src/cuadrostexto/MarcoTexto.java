/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrostexto;

import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class MarcoTexto extends JFrame{
    
    public MarcoTexto(){
        setTitle("Componentes Swing");
        setBounds(600,300,600,350);
        
        LaminaTexto lamina1=new LaminaTexto();
        
        add(lamina1);
        
        setVisible(true);
    }
    
}
