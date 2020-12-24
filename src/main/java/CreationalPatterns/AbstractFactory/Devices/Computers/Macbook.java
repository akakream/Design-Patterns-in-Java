package CreationalPatterns.AbstractFactory.Devices.Computers;

public class Macbook implements Computer{
    @Override
    public void destroy() {
        System.out.println("Macbook destroyed!");
    }

    @Override
    public void printBrand() {
        System.out.println("Apple");
    }
}
