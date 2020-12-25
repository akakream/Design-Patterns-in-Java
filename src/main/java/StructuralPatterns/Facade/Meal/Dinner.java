package StructuralPatterns.Facade.Meal;

import StructuralPatterns.Facade.Ingredients.Fish;
import StructuralPatterns.Facade.Ingredients.Oil;
import StructuralPatterns.Facade.Ingredients.Onion;

public class Dinner implements Meal{
    @Override
    public void eat() {
        System.out.println("Dinner eaten");
    }

    @Override
    public void prepare() {
        Fish fish = new Fish();
        fish.add();
        Oil oil = new Oil();
        oil.add();
        Onion onion = new Onion();
        onion.add();
        System.out.println("Dinner ready!");
    }
}
