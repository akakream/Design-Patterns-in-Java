package BehavioralPatterns.State;

public class AfterDeadline implements State{
    private UniFeePayer uniFeePayer;

    public AfterDeadline(UniFeePayer uniFeePayer) {
        this.uniFeePayer = uniFeePayer;
    }

    @Override
    public boolean payUniFee() {
        return false;
    }
}
