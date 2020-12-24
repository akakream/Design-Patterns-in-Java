package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.Devices.Computers.Computer;
import CreationalPatterns.AbstractFactory.Devices.Phones.Phone;
import CreationalPatterns.AbstractFactory.Factories.DeviceLineFactory;

public class ProduceLine {

    private Computer computer;
    private Phone phone;

    public void ProduceLine(DeviceLineFactory factory) {
        computer = factory.createComputer();
        phone = factory.createPhone();
    }

    public void printBrand() {
        computer.printBrand();
        phone.printBrand();
    }

    public void destroyAllProducts() {
        computer.destroy();
        phone.destroy();
    }
}
