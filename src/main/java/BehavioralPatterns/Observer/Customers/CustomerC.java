package BehavioralPatterns.Observer.Customers;

public class CustomerC implements Customer{
    private final String name = "customerC";

    @Override
    public void update(String newissue) {
        System.out.println(name + ": New issue with date " + newissue + ".");
    }
}
