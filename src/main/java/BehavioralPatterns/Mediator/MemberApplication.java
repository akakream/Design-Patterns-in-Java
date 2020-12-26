package BehavioralPatterns.Mediator;

public class MemberApplication extends Application {

    public MemberApplication(String applicantName, Position appliedPosition, Position currentPosition, Mediator mediator) {
        super(applicantName, appliedPosition, currentPosition, mediator);
    }

    @Override
    public void apply() {
        this.mediator.apply(this);
    }
}
