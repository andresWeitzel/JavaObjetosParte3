/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class ContenedorPadre extends JFrame{
    
    public ContenedorPadre(){
        setTitle("Login de Inicio");
        setBounds(500,300,300,200);
        
        ContenedorHijo contenedorHijo=new ContenedorHijo();
        add(contenedorHijo);
        
        setVisible(true);
    }
}
