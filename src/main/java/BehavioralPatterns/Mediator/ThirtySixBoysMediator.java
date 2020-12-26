package BehavioralPatterns.Mediator;

public class ThirtySixBoysMediator implements Mediator{

    private ThirtySixBoysBoard board36;

    public ThirtySixBoysMediator(ThirtySixBoysBoard board36) {
        this.board36 = board36;
    }

    @Override
    public void apply(Application application) {
        if (checkisOK(application))
            sendApplicationToBoard(application);
    }

    @Override
    public boolean checkisOK(Application application) {
        if (application.currentPosition == Position.Member && application.appliedPosition == Position.BoardMember)
            return true;
        if (application.currentPosition == Position.Hitman && application.appliedPosition == Position.BoardMember)
            return true;
        if (application.currentPosition == Position.Member && application.appliedPosition == Position.Hitman)
            return true;
        if (application.currentPosition == Position.NoMember && application.appliedPosition == Position.Hitman)
            return true;
        return false;
    }

    private void sendApplicationToBoard(Application application) {
        this.board36.apply(application);
    }
}
