/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radiobutton;

import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class ContenedorPadre extends JFrame {

    public ContenedorPadre() {
    setTitle("RadioButton");    
    setVisible(true);
    setBounds(500,300,250,300);
    
    ContenedorHijo contenedorHijo=new ContenedorHijo();
    add(contenedorHijo);
    }
    
}
