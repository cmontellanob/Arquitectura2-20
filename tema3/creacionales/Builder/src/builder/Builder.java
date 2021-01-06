/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Carlos
 */
public class Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SandwichMaker preparadorMySandwich = new SandwichMaker(new MySandwichBuilder());
        preparadorMySandwich.BuildSandwich();
        Sandwich sandwich1 = preparadorMySandwich.GetSandwhich();
        sandwich1.Display();
        
        SandwichMaker preparadorClubSandwich = new SandwichMaker(new ClubSandwichBuilder());
        preparadorClubSandwich.BuildSandwich();
        Sandwich sandwich2 = preparadorClubSandwich.GetSandwhich();
        sandwich2.Display();

        SandwichMaker preparadorSuperSandwich = new SandwichMaker(new SuperSandwichBuilder());
        preparadorSuperSandwich.BuildSandwich();
        Sandwich sandwich3 = preparadorSuperSandwich.GetSandwhich();

        sandwich3.Display();
    }
    
}
