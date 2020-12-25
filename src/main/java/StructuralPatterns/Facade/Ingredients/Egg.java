package StructuralPatterns.Facade.Ingredients;

public class Egg implements Ingredient{
    @Override
    public void add() {
        System.out.println("Egg added");
    }
}
