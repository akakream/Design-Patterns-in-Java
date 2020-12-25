package StructuralPatterns.Facade.Ingredients;

public class Rice implements Ingredient{
    @Override
    public void add() {
        System.out.println("Rice added");
    }
}
