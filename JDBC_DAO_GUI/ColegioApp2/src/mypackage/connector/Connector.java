 
package mypackage.connector;

import java.sql.Connection;
import java.sql.DriverManager;


public class Connector {
        
    //Configuracion de la db
      private static String driver="com.mysql.cj.jdbc.Driver";//Driver mysql 6 o superior
      //private static String driver="com.mysql.jdbc.Driver";//Driver mysql 5
      private static String vendor="mysql";//Nombre del fabricando de la base de datos
      //private static String server="localhost";
      private static String server="192.168.1.51";//direccion del servidor
      private static String port="3306";//puerto
      private static String db="colegio";//nombre da base de datos
      private static String params="";//parametro(algunas las requieren)
      //private static String user="root";
      private static String user="andres_remoto";//usuario
      private static String pass="andres";
      //private static String pass="andres";//contraseña
      
    //URL  de conexion de la db
      private static String url="jdbc:"+vendor+"://"+server+":"+port+"/"+db+params;
    
    //Conexion a la db(el import se hace a mano)
      private static Connection conexionDB=null;
      
    //Conector privado(no se puede crear un objeto y acceder al constructor)
     private Connector(){}
     
     /*||Metodo publico que devuelve un objeto de conexion(Usamos el
      patron de diseño Singleton(con este patron nos aseguramos el objeto de la
      clase sea siempre uno solo))
      ||El synchronized nos limita que no se ingrese algun proceso dentro de nuestro
        try hasta que termine el que se este analizando
     */
     public synchronized static Connection getConnection(){
          try {
              //Pra que no se abra y cierre la conexion y/o conexiones distintas la dejamos abierta
              //Se abre al principio y se cierra cuando se termina de ejecutar el software
              if(conexionDB==null || conexionDB.isClosed()){
                  //Devuelve la conexion existente
                  //Registramos el driver, creamos la clase en memoria
                  Class.forName(driver);
                 
                  //factorizamos la conexion
                  conexionDB=DriverManager.getConnection(url, user, pass);
                  
              }
          } catch (Exception ex) {
              ex.printStackTrace();
              
          }
      return conexionDB;
     }
      
      
      

}
