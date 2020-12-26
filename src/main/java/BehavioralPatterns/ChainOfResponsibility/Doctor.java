package BehavioralPatterns.ChainOfResponsibility;

public interface Doctor {
    void doSurgery(String disease);
    void setNextDoctor(Doctor doctor);
}
