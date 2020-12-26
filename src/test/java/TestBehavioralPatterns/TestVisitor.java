package TestBehavioralPatterns;

import BehavioralPatterns.Visitor.*;
import BehavioralPatterns.Visitor.Class;
import org.junit.jupiter.api.Test;

public class TestVisitor {
    @Test
    public void testMain() {
        Visitor student = new Student();
        Visitor professor = new Professor();

        Class csClass = new CSClass();
        Class mathClass = new MathClass();
        Class physicsClass = new PhysicsClass();
        Class[] classes = {csClass, mathClass, physicsClass};

        for (Class class_: classes) {
            class_.accept(student);
            class_.accept(professor);
        }
    }
}
