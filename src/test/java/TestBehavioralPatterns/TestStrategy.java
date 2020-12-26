package TestBehavioralPatterns;

import BehavioralPatterns.Strategy.Road;
import BehavioralPatterns.Strategy.User;
import BehavioralPatterns.Strategy.Vehicle;
import org.junit.jupiter.api.Test;

public class TestStrategy {
    @Test
    public void testMain() {
        User user = new User();
        user.setVehicle(Vehicle.BICYCLE);
        Road road = user.calculateRoad();
        System.out.println(road);
    }
}
