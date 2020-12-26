package BehavioralPatterns.Mediator;

public class BoardMembershipApplication extends Application{

    public BoardMembershipApplication(String applicantName, Position appliedPosition, Position currentPosition, Mediator mediator) {
        super(applicantName, appliedPosition, currentPosition, mediator);
    }

    @Override
    public void apply() {
        this.mediator.apply(this);
    }
}
