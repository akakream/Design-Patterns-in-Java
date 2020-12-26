package BehavioralPatterns.Mediator;

import java.util.Date;

public abstract class Application {
    protected int applicationId;
    protected String applicantName;
    protected Position appliedPosition;
    protected Position currentPosition;
    protected Mediator mediator;

    public Application(String applicantName, Position appliedPosition, Position currentPosition, Mediator mediator) {
        this.applicationId = (int) new Date().getTime();
        this.applicantName = applicantName;
        this.appliedPosition = appliedPosition;
        this.currentPosition = currentPosition;
        this.mediator = mediator;
    }

    public abstract void apply();
}
