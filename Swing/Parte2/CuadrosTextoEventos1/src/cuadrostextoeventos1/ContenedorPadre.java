/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrostextoeventos1;

import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class ContenedorPadre extends JFrame{
    
    public ContenedorPadre(){
        setBounds(500,300,500,300);
        
        ContenedorHijo contenedorHijo=new ContenedorHijo();
        add(contenedorHijo);
        
        setVisible(true);
    }
}
