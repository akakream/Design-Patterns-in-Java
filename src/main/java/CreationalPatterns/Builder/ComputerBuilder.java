package CreationalPatterns.Builder;

public class ComputerBuilder implements Builder{

    private String motherboard;
    private String CPU;
    private String GPU;
    private int memory;

    @Override
    public void setMotherBoard(String Motherboard) {
        this.motherboard = motherboard;
    }

    @Override
    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    @Override
    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    @Override
    public void setMemory(int Memory) {
        this.memory = Memory;
    }

    @Override
    public void resetBuild() {
        this.motherboard = null;
        this.CPU = null;
        this.GPU = null;
        this.memory = 0;
    }

    public Computer getComputer() {
        return new Computer(this.motherboard, this.CPU, this.GPU, this.memory);
    }
}
