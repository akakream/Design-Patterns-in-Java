package Builder;

public class Computer {

    private String motherboard;
    private String CPU;
    private String GPU;
    private int memory;

    public Computer(String motherboard, String CPU, String GPU, int memory) {
        this.motherboard = motherboard;
        this.CPU = CPU;
        this.GPU = GPU;
        this.memory = memory;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getMemory() {
        return memory;
    }

}
