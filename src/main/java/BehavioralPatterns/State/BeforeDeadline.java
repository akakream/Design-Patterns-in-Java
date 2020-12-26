package BehavioralPatterns.State;

public class BeforeDeadline implements State{
    private UniFeePayer uniFeePayer;

    public BeforeDeadline(UniFeePayer uniFeePayer) {
        this.uniFeePayer = uniFeePayer;
    }

    @Override
    public boolean payUniFee() {
        return true;
    }
}
