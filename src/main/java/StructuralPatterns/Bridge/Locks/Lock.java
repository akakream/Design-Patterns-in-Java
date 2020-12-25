package StructuralPatterns.Bridge.Locks;

public interface Lock {
    boolean isLocked();
    void TurnUntilLocked();
    void TurnUntilUnlocked();
    void turnRight(int times);
    void turnLeft(int times);
    void printStatus();
}
