package StructuralPatterns.Bridge.Locks;

public class HeavyLock implements Lock {

    private int position;

    public HeavyLock() {
        this.position = 0;
    }

    @Override
    public boolean isLocked() {
        return this.position > 0;
    }

    @Override
    public void TurnUntilLocked() {
        if (this.position > 0) {
            System.out.println("Already locked");
        } else {
            turnRight(Math.abs(this.position) + 1);
            System.out.println("Turned right " + (Math.abs(this.position) + 1) + " times. The lock is locked");
        }
    }

    @Override
    public void TurnUntilUnlocked() {
        if (this.position <= 0) {
            System.out.println("Already unlocked");
        } else {
            turnLeft(this.position);
            System.out.println("Turned left " + this.position + " times. The lock is unlocked");
        }
    }

    @Override
    public void turnRight(int times) {
        this.position = this.position + times;
    }

    @Override
    public void turnLeft(int times) {
        this.position = this.position - times;
    }

    @Override
    public void printStatus() {
        String status = "------- STATUS -------\n";
        status += "HEAVY LOCK\n";
        status += (isLocked() ? "Locked\n" : "Unlocked\n");
        status += "Position: " + this.position + "\n";
        status += "-------------------------------\n";
        System.out.println(status);
    }
}
