/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout1;

import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author andre
 */
public class MarcoLayout extends JFrame{

    public MarcoLayout() {
        setTitle("LAYOUTS");
        setBounds(600, 300, 600, 300);
        
        //Instanciamos un objeeto de la clase PanelLayout para implementar JPanel
        PanelLayout lamina1=new PanelLayout();
        //Disposicion de los elementos dentro de la lamina e Implementamos la alineacion junto con su ancho y alto
        //lamina1.setLayout(new FlowLayout(FlowLayout.CENTER,50,100));//Alineacion por defecto
        
        add(lamina1);
    }
    
    
    
}
