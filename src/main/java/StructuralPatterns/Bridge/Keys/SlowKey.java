package StructuralPatterns.Bridge.Keys;

import StructuralPatterns.Bridge.Locks.Lock;

public class SlowKey implements Key{

    protected Lock lock;

    public SlowKey() {}

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void turnLockRight() {
        this.lock.turnRight(1);
    }

    @Override
    public void turnLockLeft() {
        this.lock.turnLeft(1);
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
