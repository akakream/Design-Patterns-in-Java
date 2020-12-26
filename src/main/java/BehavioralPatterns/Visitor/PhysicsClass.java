package BehavioralPatterns.Visitor;

public class PhysicsClass implements Class{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitPhysicsClass(this);
    }
}
