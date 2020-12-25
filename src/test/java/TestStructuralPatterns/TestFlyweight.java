package TestStructuralPatterns;

import StructuralPatterns.Flyweight.WW2;
import org.junit.jupiter.api.Test;

public class TestFlyweight {
    @Test
    public void testMain() {
        WW2 ww2 = new WW2();
        ww2.createGermanForces();
        ww2.createAmericanForces();
    }
}
