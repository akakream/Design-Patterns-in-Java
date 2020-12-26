package BehavioralPatterns.TemplateMethod;

public class LoginWithSecurityCheck extends Login{

    @Override
    boolean authenticate() {
        easySecurityCheck();
        return true;
    }

    private void easySecurityCheck() {
        System.out.println("Easy security check");
    }
}
