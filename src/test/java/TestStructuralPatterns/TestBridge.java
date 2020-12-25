package TestStructuralPatterns;

import StructuralPatterns.Bridge.Keys.SlowKey;
import StructuralPatterns.Bridge.Locks.HeavyLock;
import org.junit.jupiter.api.Test;

public class TestBridge {
    @Test
    public void testMain() {
        HeavyLock hevi = new HeavyLock();
        SlowKey slowi = new SlowKey();
        slowi.setLock(hevi);
        slowi.getLockStatus();
        slowi.turnLockRight();
        slowi.getLockStatus();
    }
}
