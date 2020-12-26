package TestBehavioralPatterns;

import BehavioralPatterns.Memento.Black;
import BehavioralPatterns.Memento.Caretaker;
import BehavioralPatterns.Memento.White;
import org.junit.jupiter.api.Test;

public class TestMemento {
    @Test
    public void testMain() {
        Caretaker caretaker = new Caretaker();
        Black black = new Black(caretaker);
        White white = new White(caretaker);

        white.movePiece("A5");
        black.movePiece("B4");
        white.movePiece("F2");
        black.movePiece("C7");
        black.undoMove();
        black.movePiece("C6");
        white.movePiece("A5");
        white.undoMove();
        white.movePiece("B9");
        black.movePiece("B4");

        for (String s: caretaker.getActions()) {
            System.out.println(s);
        }
    }
}
