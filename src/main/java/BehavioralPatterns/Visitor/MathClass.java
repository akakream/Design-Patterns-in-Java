package BehavioralPatterns.Visitor;

public class MathClass implements Class{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitMathClass(this);
    }
}
