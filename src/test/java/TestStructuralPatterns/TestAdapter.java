package TestStructuralPatterns;

import StructuralPatterns.Adapter.HDMI;
import StructuralPatterns.Adapter.HDMIsteckdose;
import StructuralPatterns.Adapter.VGA;
import StructuralPatterns.Adapter.VGAtoHDMI;
import org.junit.jupiter.api.Test;

public class TestAdapter {
    @Test
    public void testMain() {
        VGA vga = new VGA(3);
        HDMI hdmi = new HDMI(4);
        HDMIsteckdose steckdose = new HDMIsteckdose(4);
        System.out.println(steckdose.connects(hdmi));
        VGAtoHDMI adapter = new VGAtoHDMI(vga);
        System.out.println(vga.getVGAModel());
        System.out.println(steckdose.connects(adapter));
        System.out.println(adapter.getHDMIModel());
    }
}
