package BehavioralPatterns.Observer.Magazines;

import BehavioralPatterns.Observer.Customers.Customer;

public interface Magazine {
    void register(Customer cutomer);
    void unregister(Customer customer);
    void notify(Customer customer, String newissue);
    void reissue();
}
