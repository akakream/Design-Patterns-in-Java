package BehavioralPatterns.ChainOfResponsibility;

public class BrainSurgeon implements Doctor{
    private Doctor nextDoctor;

    @Override
    public void doSurgery(String disease) {
        if (!disease.equalsIgnoreCase("BRAIN"))
            this.nextDoctor.doSurgery(disease);
        else
            System.out.println("Brain surgeon did the surgery");
    }

    @Override
    public void setNextDoctor(Doctor doctor) {
        this.nextDoctor = doctor;
    }
}
