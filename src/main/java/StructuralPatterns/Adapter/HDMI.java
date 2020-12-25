package StructuralPatterns.Adapter;

public class HDMI {

    private int model;

    public HDMI() { }

    public HDMI(int model) {
        this.model = model;
    }

    public int getHDMIModel() {
        return model;
    }

    public void setHDMIModel(int model) {
        this.model = model;
    }
}
