package TestBehavioralPatterns;

import BehavioralPatterns.Observer.Customers.CustomerA;
import BehavioralPatterns.Observer.Customers.CustomerB;
import BehavioralPatterns.Observer.Customers.CustomerC;
import BehavioralPatterns.Observer.Magazines.ESPN;
import org.junit.jupiter.api.Test;

public class TestObserver {
    @Test
    public void testMain() {
        ESPN espn = new ESPN();
        CustomerA customerA = new CustomerA();
        CustomerB customerB = new CustomerB();
        CustomerC customerC = new CustomerC();

        espn.register(customerA);
        espn.register(customerC);

        espn.reissue();
    }
}
