package BehavioralPatterns.TemplateMethod;

public class LoginWithHarderSecurityChecks extends Login{

    @Override
    boolean authenticate() {
        hardSecurityCheck();
        return true;
    }

    private void hardSecurityCheck() {
        System.out.println("Hard security check");
    }
}
