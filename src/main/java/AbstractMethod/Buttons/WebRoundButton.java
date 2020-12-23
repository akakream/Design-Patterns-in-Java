package AbstractMethod.Buttons;

public class WebRoundButton implements Button {

    @Override
    public void click() {
        System.out.println("Web round button clicked");
    }

    @Override
    public void render() {
        System.out.println("Web round button rendered");
    }
}
