package BehavioralPatterns.Mediator;

import java.util.Random;

public class ThirtySixBoysBoard {
    private Random randomResult;

    public ThirtySixBoysBoard() {
        this.randomResult = new Random();
    }

    public void apply(Application application) {
        if (decidedPositively())
            System.out.println("You are in Alder!");
        else
            System.out.println("Scheiss auf dein Application Diggah");
    }

    private boolean decidedPositively() {
        return getRandomResult();
    }

    private boolean getRandomResult() {
        return this.randomResult.nextBoolean();
    }
}
