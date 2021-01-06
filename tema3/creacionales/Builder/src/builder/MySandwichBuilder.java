/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class MySandwichBuilder extends SandwichBuilder {

    @Override
    public void PrepareBread() {
        sandwich.BreadType = BreadType.White;
            sandwich.IsToasted = true;    }

    @Override
    public void ApplyMeatAndCheese() {
        sandwich.CheeseType = CheeseType.Cheddar;
            sandwich.MeatType = MeatType.Turkey;
      }

    @Override
    public void ApplyVegetables() {
        sandwich.Vegetables= new ArrayList();
       sandwich.Vegetables.add("Tomato");
       sandwich.Vegetables.add("Onion"); }

    @Override
    public void AddCondiments() {
        sandwich.HasMayo = false;
            sandwich.HasMustard = true;
    }
    
}
