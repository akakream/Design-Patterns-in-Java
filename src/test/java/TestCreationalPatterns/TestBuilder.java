package TestCreationalPatterns;

import CreationalPatterns.Builder.Computer;
import CreationalPatterns.Builder.ComputerBuilder;
import CreationalPatterns.Builder.ComputerEngineer;
import org.junit.jupiter.api.Test;

public class TestBuilder {

    @Test
    public void TestMain() {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerEngineer.buildINTELComputer(computerBuilder);

        Computer computer = computerBuilder.getComputer();
        System.out.println(computer.getCPU());
    }
}
