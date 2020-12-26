package BehavioralPatterns.Mediator;

public class HitmanApplication extends Application {

    public HitmanApplication(String applicantName, Position appliedPosition, Position currentPosition, Mediator mediator) {
        super(applicantName, appliedPosition, currentPosition, mediator);
    }

    @Override
    public void apply() {
        this.mediator.apply(this);
    }
}
