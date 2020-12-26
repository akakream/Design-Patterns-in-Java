package TestBehavioralPatterns;

import BehavioralPatterns.State.AfterDeadline;
import BehavioralPatterns.State.Student;
import BehavioralPatterns.State.UniFeePayMachine;
import BehavioralPatterns.State.UniFeePayer;
import org.junit.jupiter.api.Test;

public class TestState {
    @Test
    public void testMain() {
        UniFeePayer payer = new UniFeePayMachine();
        Student student = new Student();
        student.payUniFee(payer);
        payer.setState(new AfterDeadline(payer));
        student.payUniFee(payer);
    }
}
