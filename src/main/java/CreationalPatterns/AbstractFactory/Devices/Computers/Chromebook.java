package CreationalPatterns.AbstractFactory.Devices.Computers;

public class Chromebook implements Computer{

    @Override
    public void destroy() {
        System.out.println("Chromebook destroyed!");
    }

    @Override
    public void printBrand() {
        System.out.println("Google");
    }
}
