package CreationalPatterns.AbstractFactory.Factories;

import CreationalPatterns.AbstractFactory.Devices.Computers.Computer;
import CreationalPatterns.AbstractFactory.Devices.Computers.SurfacePro;
import CreationalPatterns.AbstractFactory.Devices.Phones.Phone;
import CreationalPatterns.AbstractFactory.Devices.Phones.SurfaceDuo;

public class MicrosoftFactory implements DeviceLineFactory{

    @Override
    public Computer createComputer() {
        return new SurfacePro();
    }

    @Override
    public Phone createPhone() {
        return new SurfaceDuo();
    }
}
