package TestCreationalPatterns;

import AbstractFactory.Factories.DeviceLineFactory;
import AbstractFactory.Factories.GoogleFactory;
import AbstractFactory.ProduceLine;
import org.junit.jupiter.api.Test;

public class TestAbstractFactory {
    @Test
    public void testMain() {
        ProduceLine productionline = new ProduceLine();
        DeviceLineFactory factory = new GoogleFactory();
        productionline.ProduceLine(factory);
        productionline.printBrand();
        productionline.destroyAllProducts();
    }
}
