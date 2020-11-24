/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author Carlos
 */
public class Solid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche c=new Coche ("Toyota");
        Coche c2=new Coche ("Nissan");
        
        c.GuardarCoche();
        c2.GuardarCoche();
    }
    
}
