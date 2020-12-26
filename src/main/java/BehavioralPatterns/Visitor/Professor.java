package BehavioralPatterns.Visitor;

public class Professor implements Visitor{

    public Professor() {
    }

    @Override
    public void visitCSClass(CSClass csClass) {
        System.out.println("Giving CS lecture");
    }

    @Override
    public void visitMathClass(MathClass mathClass) {
        System.out.println("Giving Math lecture");
    }

    @Override
    public void visitPhysicsClass(PhysicsClass phyClass) {
        System.out.println("Giving Physics lecture");
    }
}
