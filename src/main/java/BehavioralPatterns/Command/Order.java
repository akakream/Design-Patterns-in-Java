package BehavioralPatterns.Command;

public interface Order {
    void execute();
    void undo();
}
