package BehavioralPatterns.Command;

public class Sell implements Order{
    @Override
    public void execute() {
        System.out.println("Sold 10 grams of Gold.");
    }

    @Override
    public void undo() {
        System.out.println("Bought 10 grams of Gold.");
    }
}
