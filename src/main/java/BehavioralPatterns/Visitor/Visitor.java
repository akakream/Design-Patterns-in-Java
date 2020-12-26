package BehavioralPatterns.Visitor;

public interface Visitor {
    void visitCSClass(CSClass csClass);
    void visitMathClass(MathClass mathClass);
    void visitPhysicsClass(PhysicsClass phyClass);
}
