package TestBehavioralPatterns;

import BehavioralPatterns.TemplateMethod.Login;
import BehavioralPatterns.TemplateMethod.LoginWithHarderSecurityChecks;
import BehavioralPatterns.TemplateMethod.User;
import org.junit.jupiter.api.Test;

public class TestTemplateMethod {
    @Test
    public void testMain() {
        Login login = new LoginWithHarderSecurityChecks();
        User user = new User(login);
        user.authenticate();
    }
}
