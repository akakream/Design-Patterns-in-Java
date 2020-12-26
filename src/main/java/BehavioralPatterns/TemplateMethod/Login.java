package BehavioralPatterns.TemplateMethod;

public abstract class Login {
    abstract boolean authenticate();

    public boolean amIaLoginComponent() {
        return true;
    }
}
