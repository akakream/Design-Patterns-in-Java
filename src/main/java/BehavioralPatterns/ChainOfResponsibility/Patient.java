package BehavioralPatterns.ChainOfResponsibility;

public class Patient {
    private String disease;

    public Patient(String disease) {
        this.disease = disease;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
