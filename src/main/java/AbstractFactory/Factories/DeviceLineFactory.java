package AbstractFactory.Factories;

import AbstractFactory.Devices.Computers.Computer;
import AbstractFactory.Devices.Phones.Phone;

public interface DeviceLineFactory {
    Computer createComputer();
    Phone createPhone();
}
