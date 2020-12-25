package StructuralPatterns.Facade.Meal;

import StructuralPatterns.Facade.Ingredients.Egg;
import StructuralPatterns.Facade.Ingredients.Green;
import StructuralPatterns.Facade.Ingredients.Tea;

public class Breakfast implements Meal{
    @Override
    public void eat() {
        System.out.println("Breakfast eaten");
    }

    @Override
    public void prepare() {
        Egg egg = new Egg();
        egg.add();
        Tea tea = new Tea();
        tea.add();
        Green green = new Green();
        green.add();
        System.out.println("Breakfast ready!");
    }
}
