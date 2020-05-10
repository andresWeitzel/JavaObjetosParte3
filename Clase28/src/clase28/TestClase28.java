/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase28;

/**
 *
 * @author andre
 */
public class TestClase28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (Lector lector=new Lector()){
            if(true){
                throw new Exception();
                }
             lector.leer();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
