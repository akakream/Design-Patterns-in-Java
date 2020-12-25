package StructuralPatterns.Adapter;

public class HDMIsteckdose {

    private int model;

    public HDMIsteckdose() { }

    public HDMIsteckdose(int model) {
        this.model = model;
    }

    public boolean connects(HDMI hdmi) {
        return (this.model == hdmi.getHDMIModel());
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }
}
