package AbstractFactory;

import AbstractFactory.Devices.Computers.Computer;
import AbstractFactory.Devices.Phones.Phone;
import AbstractFactory.Factories.DeviceLineFactory;

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
