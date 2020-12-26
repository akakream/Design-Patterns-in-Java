package BehavioralPatterns.Mediator;

public interface Mediator {
    void apply(Application application);
    boolean checkisOK(Application application);
}
