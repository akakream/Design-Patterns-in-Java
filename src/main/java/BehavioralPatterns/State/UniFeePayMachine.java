package BehavioralPatterns.State;

public class UniFeePayMachine implements UniFeePayer{
    private State state;

    public UniFeePayMachine() {
        this.state = new BeforeDeadline(this);
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public boolean payUniFee() {
        return this.state.payUniFee();
    }
}
