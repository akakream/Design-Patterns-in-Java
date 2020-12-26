package BehavioralPatterns.ChainOfResponsibility;

public class InternalOrganSurgeon implements Doctor{
    private Doctor nextDoctor;

    @Override
    public void doSurgery(String disease) {
        if (!disease.equalsIgnoreCase("INTERNALORGAN"))
            this.nextDoctor.doSurgery(disease);
        else
            System.out.println("Internal Organ surgeon did the surgery");
    }

    @Override
    public void setNextDoctor(Doctor doctor) {
        this.nextDoctor = doctor;
    }
}
