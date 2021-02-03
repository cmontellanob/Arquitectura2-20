/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Carlos
 */
public class Facade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2021", "08/07/2021", "Sucre", "Santa Cruz");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2021", "08/07/2021", "Sucre", "La Paz");
    }
    
}
