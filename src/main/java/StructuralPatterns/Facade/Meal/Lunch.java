package StructuralPatterns.Facade.Meal;

import StructuralPatterns.Facade.Ingredients.Green;
import StructuralPatterns.Facade.Ingredients.Oil;
import StructuralPatterns.Facade.Ingredients.Rice;

public class Lunch implements Meal{
    @Override
    public void eat() {
        System.out.println("Lunch eaten");
    }

    @Override
    public void prepare() {
        Oil oil = new Oil();
        oil.add();
        Green green = new Green();
        green.add();
        Rice rice = new Rice();
        rice.add();
        System.out.println("Lunch ready!");
    }
}
