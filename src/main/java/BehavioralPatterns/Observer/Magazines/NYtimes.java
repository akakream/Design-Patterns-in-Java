package BehavioralPatterns.Observer.Magazines;

import BehavioralPatterns.Observer.Customers.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NYtimes implements Magazine{

    private List<Customer> observers;

    public NYtimes() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Customer customer) {
        observers.add(customer);
    }

    @Override
    public void unregister(Customer customer) {
        observers.remove(customer);
    }

    @Override
    public void notify(Customer customer, String newissue) {
        customer.update(newissue);
    }

    @Override
    public void reissue() {
        String newissue = new Date().toString();
        for (Customer observer: observers) {
            notify(observer, newissue);
        }
    }
}
