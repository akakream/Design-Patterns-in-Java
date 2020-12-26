package BehavioralPatterns.TemplateMethod;

public class User {
    private Login login;

    public User(Login login) {
        this.login = login;
    }

    public void authenticate() {
        this.login.authenticate();
    }
}
