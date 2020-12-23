package AbstractFactory.Devices.Phones;

public class IPhone implements Phone{
    @Override
    public void destroy() {
        System.out.println("IPhone destroyed!");
    }

    @Override
    public void printBrand() {
        System.out.println("Apple");
    }
}
