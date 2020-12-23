package AbstractMethod.Buttons;

public class DesktopButton implements Button{

    @Override
    public void click() {
        System.out.println("Desktop button clicked");
    }

    @Override
    public void render() {
        System.out.println("Desktop button rendered");
    }
}
