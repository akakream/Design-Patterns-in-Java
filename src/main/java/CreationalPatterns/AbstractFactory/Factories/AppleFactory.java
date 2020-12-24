package CreationalPatterns.AbstractFactory.Factories;

import CreationalPatterns.AbstractFactory.Devices.Computers.Computer;
import CreationalPatterns.AbstractFactory.Devices.Computers.Macbook;
import CreationalPatterns.AbstractFactory.Devices.Phones.IPhone;
import CreationalPatterns.AbstractFactory.Devices.Phones.Phone;

public class AppleFactory implements DeviceLineFactory{
    @Override
    public Computer createComputer() {
        return new Macbook();
    }

    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
