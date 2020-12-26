package TestBehavioralPatterns;

import BehavioralPatterns.ChainOfResponsibility.*;
import org.junit.jupiter.api.Test;

public class TestChainOfResponsibility {
    @Test
    public void testMain() {
        Doctor heartSurgeon = new HeartSurgeon();
        Doctor brainSurgeon = new BrainSurgeon();
        Doctor internalOrganSurgeon = new InternalOrganSurgeon();
        Doctor dahiliye = new Dahiliye();

        heartSurgeon.setNextDoctor(brainSurgeon);
        brainSurgeon.setNextDoctor(internalOrganSurgeon);
        internalOrganSurgeon.setNextDoctor(dahiliye);

        Patient patient = new Patient("headache");
        heartSurgeon.doSurgery(patient.getDisease());
    }
}
