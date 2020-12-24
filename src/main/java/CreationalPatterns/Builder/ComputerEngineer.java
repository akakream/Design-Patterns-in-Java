package CreationalPatterns.Builder;

public class ComputerEngineer {

    public void buildARMComputer(Builder builder) {
        builder.setMotherBoard("ASUS");
        builder.setCPU("ARM");
        builder.setGPU("NVIDIA");
        builder.setMemory(16);
    }

    public void buildINTELComputer(Builder builder) {
        builder.setMotherBoard("ASUS");
        builder.setCPU("INTEL");
        builder.setGPU("NVIDIA");
        builder.setMemory(16);
    }
}
