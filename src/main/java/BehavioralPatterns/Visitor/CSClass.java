package BehavioralPatterns.Visitor;

public class CSClass implements Class{
    @Override
    public void accept(Visitor visitor) {
        visitor.visitCSClass(this);
    }
}
