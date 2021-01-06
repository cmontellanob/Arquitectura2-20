/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class ClubSandwichBuilder extends SandwichBuilder {

    @Override
    public void PrepareBread() {
         sandwich.BreadType = BreadType.White;
         sandwich.IsToasted = true; }

    @Override
    public void ApplyMeatAndCheese() {
         sandwich.CheeseType = CheeseType.Swiss;
            sandwich.MeatType = MeatType.Turkey;  }

    @Override
    public void ApplyVegetables() {
       sandwich.Vegetables= new ArrayList();
       sandwich.Vegetables.add("Tomato");
       sandwich.Vegetables.add("Onion");
       sandwich.Vegetables.add("Lettuce");
       
    }

    @Override
    public void AddCondiments() {
      sandwich.HasMayo = true;
        sandwich.HasMustard = true; }
    
}
