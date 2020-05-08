/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

/**
 *
 * @author andre
 */
public class ContenedorHijo extends JPanel {
    //**Atributos**
    //Recordar que al definir los atributos en la clase principal y no en el
    //contsructor podemos utilizarlas en clases internas
    //--Contenedor cuadros de textos--
    JPanel contenedorCuadrosTextos;
    //--Contenedor Area de Texto--
    JScrollPane contenedorScroll;
    //--Etiquetas--
    JLabel etiquetaUsuario;
    JLabel etiquetaContraseña;
    JLabel etiquetaComentario;
    //--Cuadros de Texto--
    JTextField cuadroTextoUsuario;
    JPasswordField cuadroTextoContraseña;
    //--Area de Texto--
    JTextArea areaTexto;
    //--Boton Validacion Login--
    JButton botonValidacion;

    public ContenedorHijo() {
        
         //**LAYOUT**
        //Usamos alineaciones con Layout
        setLayout(new BorderLayout());
//---------------------------------------------------------------
         //**CONTENEDOR ETIQUETAS Y CUADROS DE TEXTOS**  
        //Creamos un contenedor para los cuadros de textos
        contenedorCuadrosTextos = new JPanel();
        //Alineamos el contenedor, tres columnas dos filas
        contenedorCuadrosTextos.setLayout(new GridLayout(3, 2));
        //Agregamos el contenedor y le indicamos la posicion
        add(contenedorCuadrosTextos, BorderLayout.NORTH);
//----------------------------------------------------------
         //**USUARIO**
        //Creamos una etiqueta para usuario
        etiquetaUsuario = new JLabel("Usuario:");
        contenedorCuadrosTextos.add(etiquetaUsuario, BorderLayout.NORTH);
        //Creamos cuadro de texto Usuario, con 20 columnas   
        cuadroTextoUsuario = new JTextField(20);
        contenedorCuadrosTextos.add(cuadroTextoUsuario, BorderLayout.NORTH);

        //**CONTRASEÑA**
        //Etiqueta Contraseña
        etiquetaContraseña = new JLabel("Contraseña:");
        contenedorCuadrosTextos.add(etiquetaContraseña, BorderLayout.NORTH);
        //Creamos cuadro de texto Contraseña, con 20 columnas 
        cuadroTextoContraseña = new JPasswordField(20);

        //Instanciamos el objeto de la clase interna de eventos
        EventosVerificacionLogin eventoContraseña = new EventosVerificacionLogin();
        //Colocamos el objeto/evento como oyente
        /*FUNCIONAMIENTO-->Se instancia un objeto que esta a la escucha cada vez que
    se utilize un metodo sobreescrito de la clase EventosVerificacionLogin(lanzar un evento), 
    este se guarda en un documento.
         */
        cuadroTextoContraseña.getDocument().addDocumentListener(eventoContraseña);

        //agregamos el cuadro de texto contraseña
        contenedorCuadrosTextos.add(cuadroTextoContraseña, BorderLayout.NORTH);
//-------------------------------------------------------
        //**AREA DE TEXTO**
        //Creamos una etiqueta para los comentarios
         etiquetaComentario=new JLabel("Agregue un comentario si desea: ");
         //Utilizamos el contenedor de los cuadros de textos para la etiqueta
        contenedorCuadrosTextos.add(etiquetaComentario,BorderLayout.NORTH);
        
        //Instanciamos un nuevo area 8 filas y 20 columnas
        areaTexto = new JTextArea(8, 20);
        //Cuando se llegue al borde derecho automaticamente realiza un salto de linea
        areaTexto.setLineWrap(true);

        //Contenedor con barras de Scroll para el area de Texto
        contenedorScroll = new JScrollPane(areaTexto);
        //Agregamos el contenedor de Barras de Scroll que contiene al area de texto
        add(contenedorScroll,BorderLayout.CENTER);
        
        

       
//--------------------------------------------------------
        //**BOTON VALIDACION LOGIN
        botonValidacion = new JButton("Enviar");
        add(botonValidacion, BorderLayout.SOUTH);

    }

   

    //cLASE iNTERNA PARA LOS EVENTOS del password
    private class EventosVerificacionLogin implements DocumentListener {

        //CXomprobacion de la longitud de la contraseña en un array del 
        //tipo char(asi me lo indica la api de java)
        char contraseña[];

        @Override
        public void insertUpdate(DocumentEvent arg0) {
            contraseña = cuadroTextoContraseña.getPassword();
            //El cuadro de la contraseña se colocara en rojo en el siguiente caso
            if (contraseña.length < 8 || contraseña.length > 12) {
                cuadroTextoContraseña.setBackground(Color.red);
            } else {
                cuadroTextoContraseña.setBackground(Color.white);
            }
        }

        @Override
        public void removeUpdate(DocumentEvent arg0) {
            contraseña = cuadroTextoContraseña.getPassword();
            //El cuadro de la contraseña se colocara en rojo en el siguiente caso
            if (contraseña.length < 8 || contraseña.length > 12) {
                cuadroTextoContraseña.setBackground(Color.red);
            } else {
                cuadroTextoContraseña.setBackground(Color.white);
            }
        }

        @Override
        public void changedUpdate(DocumentEvent arg0) {
        }

    }

}
