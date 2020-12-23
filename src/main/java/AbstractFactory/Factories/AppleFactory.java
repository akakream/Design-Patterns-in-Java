package AbstractFactory.Factories;

import AbstractFactory.Devices.Computers.Computer;
import AbstractFactory.Devices.Computers.Macbook;
import AbstractFactory.Devices.Phones.IPhone;
import AbstractFactory.Devices.Phones.Phone;

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
