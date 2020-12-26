package BehavioralPatterns.Observer.Customers;

public class CustomerA implements Customer{
    private final String name = "customerA";

    @Override
    public void update(String newissue) {
        System.out.println(name + ": New issue with date " + newissue + ".");
    }
}
