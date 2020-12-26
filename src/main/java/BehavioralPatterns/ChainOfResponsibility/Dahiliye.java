package BehavioralPatterns.ChainOfResponsibility;

public class Dahiliye implements Doctor{
    private Doctor nextDoctor;

    @Override
    public void doSurgery(String disease) {
        System.out.println("Take these medications and go home. You got nothing wrong!");
    }

    @Override
    public void setNextDoctor(Doctor doctor) {
        this.nextDoctor = doctor;
    }
}
