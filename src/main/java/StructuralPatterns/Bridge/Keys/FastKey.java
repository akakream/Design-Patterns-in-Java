package StructuralPatterns.Bridge.Keys;

import StructuralPatterns.Bridge.Locks.Lock;

public class FastKey implements Key{

    protected Lock lock;

    public FastKey() {}

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void turnLockRight() {
        this.lock.turnRight(2);
    }

    @Override
    public void turnLockLeft() {
        this.lock.turnLeft(2);
    }

    @Override
    public void lockLock() {
        this.lock.TurnUntilLocked();
    }

    @Override
    public void unlockLock() {
        this.lock.TurnUntilUnlocked();
    }

    @Override
    public void getLockStatus() {
        this.lock.printStatus();
    }
}
