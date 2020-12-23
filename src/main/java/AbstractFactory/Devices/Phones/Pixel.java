package AbstractFactory.Devices.Phones;

public class Pixel implements Phone{
    @Override
    public void destroy() {
        System.out.println("Pixel destroyed!");
    }

    @Override
    public void printBrand() {
        System.out.println("Google");
    }
}
