package TestStructuralPatterns;

import StructuralPatterns.Composite.Scholar.Group;
import StructuralPatterns.Composite.Scholar.Msc;
import StructuralPatterns.Composite.Scholar.Phd;
import StructuralPatterns.Composite.Scholar.Professor;
import StructuralPatterns.Composite.University.University;
import org.junit.jupiter.api.Test;

public class TestComposite {
    @Test
    public void testMain() {
        University uni = new University();

        Professor mathProf = new Professor(6000);
        Professor csProf = new Professor(6000);
        Phd mathPhd1 = new Phd(4000);
        Phd mathPhd2 = new Phd(4000);
        Phd csPhd1 = new Phd(4000);
        Phd csPhd2 = new Phd(4000);
        Phd csPhd3 = new Phd(4000);
        Msc mathMsc1 = new Msc(3000);
        Msc csMsc1 = new Msc(3000);
        Msc csMsc2 = new Msc(3000);
        Msc csMsc3 = new Msc(3000);

        Group mathGroup = new Group(mathProf, mathPhd1, mathPhd2, mathMsc1);
        Group csGroup = new Group(csProf, csPhd1, csPhd2, csPhd3, csMsc1, csMsc2, csMsc3);

        uni.addScholar("mathGroup", mathGroup);
        uni.addScholar("csGroup", csGroup);

        uni.showScholars();
        System.out.println(mathGroup.getSalary());
        System.out.println(csGroup.getSalary());

        // Combine groups
        Group allGroups = new Group(mathGroup, csGroup);
        uni.addScholar("allGroups", allGroups);
        uni.showScholars();
    }
}
