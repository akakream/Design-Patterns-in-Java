package BehavioralPatterns.Visitor;

public class Student implements Visitor{
    public Student() {
    }

    @Override
    public void visitCSClass(CSClass csClass) {
        System.out.println("Joined CS lecture");
    }

    @Override
    public void visitMathClass(MathClass mathClass) {
        System.out.println("Joined Math lecture");
    }

    @Override
    public void visitPhysicsClass(PhysicsClass phyClass) {
        System.out.println("Joined Physics lecture");
    }
}
