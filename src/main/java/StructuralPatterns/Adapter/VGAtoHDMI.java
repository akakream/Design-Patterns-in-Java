package StructuralPatterns.Adapter;

public class VGAtoHDMI extends HDMI{

    private VGA vga;

    public VGAtoHDMI(VGA vga) {
        this.vga = vga;
    }

    @Override
    public int getHDMIModel() {
        return vga.getVGAModel() + 1;
    }
}
