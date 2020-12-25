package StructuralPatterns.Facade.Ingredients;

public class Fish implements Ingredient{
    @Override
    public void add() {
        System.out.println("Fish added");
    }
}
