/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.List;

/**
 *
 * @author Carlos
 */
class Sandwich {
        public BreadType BreadType;
        public boolean IsToasted;
        public CheeseType CheeseType;
        public MeatType MeatType;
        public boolean HasMustard;
        public boolean HasMayo;
        public List<String> Vegetables;

        public void Display()
        {
            System.out.println("Sandwich on "+BreadType +" bread");
            if(IsToasted)
                System.out.println("Toasted");
            if (HasMayo)
                System.out.println("With Mayo");
            if (HasMustard)
                System.out.println("With Mustard");
            System.out.println("Meat: "+MeatType);
            System.out.println("Cheese: "+CheeseType);
            System.out.println("Veggies:");
            for(String vegetable:Vegetables)
                System.out.println("   "+vegetable);
        }
}
enum BreadType {
     White,
     Wheat
}
enum MeatType
    {
        Turkey,
        Ham,
        Chicken,
        Salami
    }

enum CheeseType
    {
        American,
        Swiss,
        Cheddar,
        Provolone
    }

