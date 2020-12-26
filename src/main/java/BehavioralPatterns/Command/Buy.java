package BehavioralPatterns.Command;

public class Buy implements Order{
    @Override
    public void execute() {
        System.out.println("Bought 10 grams of Gold.");
    }

    @Override
    public void undo() {
        System.out.println("Sold 10 grams of Gold.");
    }
}
