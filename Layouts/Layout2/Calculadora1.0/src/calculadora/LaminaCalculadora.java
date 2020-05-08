/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author andre
 */
public class LaminaCalculadora extends JPanel {
    // Referenciamos para que se pueda utilizar en todas las clases de la clase
    //padre LaminaCalculadora
    private JPanel lamina2;
    private JButton displayBoton;//Esta sera la pantalla en modelo boton
    private boolean displayInicio;//variable para borrar el display una vez comenzada las operaciones
        
    
    public LaminaCalculadora(){
        displayInicio=true;//Inicializamos este atributo para poder utilizarlo
        //Para el borde del marco
        setLayout(new BorderLayout());
        
        displayBoton=new JButton("0");
        
        //Deshabilitamos el click en el boton creado para que se vea comom un display
        displayBoton.setEnabled(false);
        //Agregamos el display a la zona norte de nuestro marco
        add(displayBoton,BorderLayout.NORTH);
        
        //Creamos otra lamina dentro de esta clase
        lamina2=new JPanel();
        //Disposicion de los layouts en forma de rejilla(Grid) 4 filas 4 columnas
        lamina2.setLayout(new GridLayout(4,4));
        
        //Creamos una instancia perteneciente a la clase interna InsertarNumeroDisplay
        //para colocar el texto en el display
        ActionListener insertar=new InsertarDisplay();
        
        //Creamos los botones
        this.colocarBoton("7",insertar);
        this.colocarBoton("8",insertar);
        this.colocarBoton("9",insertar);
        this.colocarBoton("x",insertar); 
        this.colocarBoton("4",insertar);
        this.colocarBoton("5",insertar);
        this.colocarBoton("6",insertar);
        this.colocarBoton("/",insertar);
        this.colocarBoton("1",insertar);
        this.colocarBoton("2",insertar);
        this.colocarBoton("3",insertar);
        this.colocarBoton("+",insertar);
        this.colocarBoton("0",insertar);
        this.colocarBoton(",",insertar);
        this.colocarBoton("=",insertar);
        this.colocarBoton("-",insertar);
        
        //Agregamos la  lamina2 en la zona central
        add(lamina2,BorderLayout.CENTER);
        
    }
    //Creamos un metodo que nos agregara los botones de forma dinamica a nuestra calculadora
    //Ademas este metodo pondra los botones a la escucha 
    private void colocarBoton(String tipo, ActionListener oyente){
        
        JButton boton=new JButton(tipo);
        
        //Ponemos a la escucha nuestro boton
        boton.addActionListener(oyente);
        
        lamina2.add(boton);  
    } 
    
    //Creamos una clase Interna, esta clase almacenara el objeto que desancadena el objeto
    //y agrega el numero a la pantalla
    private class InsertarDisplay implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
        //Capturamos el texto asociado al objeto del evento
        //Este metodo devuelve el comando string asociado a esta accion
        String entrada=e.getActionCommand();
        
        //Si estra variable es verdadera nos borra la pantalla
         if(displayInicio){         
             displayBoton.setText("");
             displayInicio=false;//La cambiamos a false para que no nos borre nuevamente la pantalla
         }
         
        //De la siguiente forma podemos colocar los objetos de la accion en el display
        //de forma continua
        displayBoton.setText(displayBoton.getText()+entrada);
        }
        
    }
    
    


}

