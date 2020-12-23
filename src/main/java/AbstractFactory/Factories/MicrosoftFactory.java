package AbstractFactory.Factories;

import AbstractFactory.Devices.Computers.Computer;
import AbstractFactory.Devices.Computers.SurfacePro;
import AbstractFactory.Devices.Phones.Phone;
import AbstractFactory.Devices.Phones.SurfaceDuo;

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
