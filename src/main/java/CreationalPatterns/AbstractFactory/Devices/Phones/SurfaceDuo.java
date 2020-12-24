package CreationalPatterns.AbstractFactory.Devices.Phones;

public class SurfaceDuo implements Phone{
    @Override
    public void destroy() {
        System.out.println("Surface Duo destroyed!");
    }

    @Override
    public void printBrand() {
        System.out.println("Microsoft");
    }
}
