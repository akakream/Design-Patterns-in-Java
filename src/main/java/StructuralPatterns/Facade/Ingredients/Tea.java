package StructuralPatterns.Facade.Ingredients;

public class Tea implements Ingredient{
    @Override
    public void add() {
        System.out.println("Tea added");
    }
}
