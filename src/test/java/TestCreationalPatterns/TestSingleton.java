package TestCreationalPatterns;

import CreationalPatterns.Singleton.Database;
import org.junit.jupiter.api.Test;

public class TestSingleton {
    @Test
    public void TestMain() {
        Database bank = Database.getDatabaseInstance("amo");
        Database bank2 = Database.getDatabaseInstance("kemo");

        System.out.println(bank.getValue());
        System.out.println(bank2.getValue());
    }
}
