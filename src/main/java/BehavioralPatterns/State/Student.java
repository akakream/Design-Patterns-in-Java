package BehavioralPatterns.State;

public class Student {
    private int money;

    public Student() {
        this.money = 1000;
    }

    public void payUniFee(UniFeePayer payer) {
        boolean uniFeePaymentSuccessful = payer.payUniFee();
        if (uniFeePaymentSuccessful) {
            this.money -= 300;
            System.out.println("Uni Fee paid.");
        } else {
            System.out.println("Uni Fee Payment unsuccessful :(");
        }
    }
}
