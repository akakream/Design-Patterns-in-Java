package BehavioralPatterns.Observer.Customers;

public class CustomerB implements Customer{
    private final String name = "customerB";

    @Override
    public void update(String newissue) {
        System.out.println(name + ": New issue with date " + newissue + ".");
    }
}
