package TestCreationalPatterns;

import CreationalPatterns.AbstractFactory.Factories.DeviceLineFactory;
import CreationalPatterns.AbstractFactory.Factories.GoogleFactory;
import CreationalPatterns.AbstractFactory.ProduceLine;
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
