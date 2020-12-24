package CreationalPatterns.AbstractFactory.Factories;

import CreationalPatterns.AbstractFactory.Devices.Computers.Computer;
import CreationalPatterns.AbstractFactory.Devices.Phones.Phone;

public interface DeviceLineFactory {
    Computer createComputer();
    Phone createPhone();
}
