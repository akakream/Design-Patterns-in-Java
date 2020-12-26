package TestBehavioralPatterns;

import BehavioralPatterns.Iterator.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestIterator {
    @Test
    public void testMain() {
        Paper cs1 = new Paper(PaperType.CS, "CCML", "kerem", 2020);
        Paper cs2 = new Paper(PaperType.CS, "GAN", "goodfellow", 2014);
        Paper math1 = new Paper(PaperType.MATH, "unentscheidbar", "goedel", 1960);
        Paper math2 = new Paper(PaperType.MATH, "Fermats Last Theo", "gauss", 1830);
        Paper phy1 = new Paper(PaperType.PHYSICS, "apple", "newton", 1665);
        Paper phy2 = new Paper(PaperType.PHYSICS, "photon", "einstein", 1930);
        Paper[] paperArray = {cs1, cs2, math1, math2, phy1, phy2};

        List<Paper> papers = new LinkedList<>();
        papers.addAll(Arrays.asList(paperArray));

        CSPaperIterator csIterator = new CSPaperIterator(papers);
        MathPaperIterator mathIterator = new MathPaperIterator(papers);
        PhysicsPaperIterator phyIterator = new PhysicsPaperIterator(papers);

        while (mathIterator.hasNext()) {
            System.out.println(mathIterator.getNext().getName());
        }

        System.out.println(csIterator.getNext().getName());
        System.out.println(csIterator.getNext().getName());
    }
}
