package AbstractMethod.Buttons;

public class WebSquareButton implements Button{

    @Override
    public void click() {
        System.out.println("Web square button clicked");
    }

    @Override
    public void render() {
        System.out.println("Web square button rendered");
    }
}
