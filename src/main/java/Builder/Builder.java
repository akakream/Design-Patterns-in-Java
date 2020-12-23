package Builder;

public interface Builder {
    void setMotherBoard(String Motherboard);
    void setCPU(String CPU);
    void setGPU(String GPU);
    void setMemory(int Memory);
    void resetBuild();
}
