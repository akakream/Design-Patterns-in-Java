package CreationalPatterns.AbstractFactory.Factories;

import CreationalPatterns.AbstractFactory.Devices.Computers.Chromebook;
import CreationalPatterns.AbstractFactory.Devices.Computers.Computer;
import CreationalPatterns.AbstractFactory.Devices.Phones.Phone;
import CreationalPatterns.AbstractFactory.Devices.Phones.Pixel;

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
