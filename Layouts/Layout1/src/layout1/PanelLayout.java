/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout1;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author andre
 */
public class PanelLayout extends JPanel {
    
    public PanelLayout(){
        //Daremos un borde a nuestro panel
        setLayout(new BorderLayout());
        
        //El segundo argumento es la posiion donde tiene que posicionarse el componente(amarillo,etc)
        add(new JButton("Amarillo"),BorderLayout.NORTH);
        add(new JButton("Rojo"),BorderLayout.SOUTH);
        add(new JButton("Azul"),BorderLayout.CENTER);
    }
}
