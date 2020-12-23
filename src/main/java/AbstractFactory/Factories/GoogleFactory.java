package AbstractFactory.Factories;

import AbstractFactory.Devices.Computers.Chromebook;
import AbstractFactory.Devices.Computers.Computer;
import AbstractFactory.Devices.Phones.Phone;
import AbstractFactory.Devices.Phones.Pixel;

public class GoogleFactory implements DeviceLineFactory{
    @Override
    public Computer createComputer() {
        return new Chromebook();
    }

    @Override
    public Phone createPhone() {
        return new Pixel();
    }
}
