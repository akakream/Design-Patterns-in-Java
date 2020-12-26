package TestBehavioralPatterns;

import BehavioralPatterns.Command.Buy;
import BehavioralPatterns.Command.Order;
import BehavioralPatterns.Command.Sell;
import BehavioralPatterns.Command.Transact;
import org.junit.jupiter.api.Test;

public class TestCommand {
    @Test
    public void testMain() {
        Transact transact = new Transact();
        Order buy = new Buy();
        Order sell = new Sell();

        transact.addOrder(buy);
        transact.addOrder(buy);
        transact.executeOrders();
    }
}
