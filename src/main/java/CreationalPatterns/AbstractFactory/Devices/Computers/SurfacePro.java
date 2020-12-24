package CreationalPatterns.AbstractFactory.Devices.Computers;

public class SurfacePro implements Computer{
    @Override
    public void destroy() {
        System.out.println("Surface Pro destroyed!");
    }

    @Override
    public void printBrand() {
        System.out.println("Microsoft");
    }
}
