package StructuralPatterns.Adapter;

public class VGA {

    private int model;

    public VGA() {}

    public VGA(int model) {
        this.model = model;
    }

    public int getVGAModel() {
        return model;
    }

    public void setVGAModel(int model) {
        this.model = model;
    }
}
