package BehavioralPatterns.State;

public interface UniFeePayer {
    boolean payUniFee();
    void setState(State state);
    State getState();
}
