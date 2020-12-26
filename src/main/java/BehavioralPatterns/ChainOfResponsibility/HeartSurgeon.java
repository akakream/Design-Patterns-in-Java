package BehavioralPatterns.ChainOfResponsibility;

public class HeartSurgeon implements Doctor{
    private Doctor nextDoctor;

    @Override
    public void doSurgery(String disease) {
        if (!disease.equalsIgnoreCase("HEART"))
            this.nextDoctor.doSurgery(disease);
        else
            System.out.println("Heart surgeon did the surgery");
    }

    @Override
    public void setNextDoctor(Doctor doctor) {
        this.nextDoctor = doctor;
    }
}
