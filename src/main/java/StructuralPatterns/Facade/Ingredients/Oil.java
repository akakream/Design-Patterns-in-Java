package StructuralPatterns.Facade.Ingredients;

public class Oil implements Ingredient{
    @Override
    public void add() {
        System.out.println("Oil added");
    }
}
