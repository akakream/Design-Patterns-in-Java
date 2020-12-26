package BehavioralPatterns.Memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Caretaker {
    private Stack<ChessPiecePosition> positionStack;
    private Color turn;
    private List<String> actions;

    public Caretaker() {
        this.positionStack = new Stack<>();
        this.actions = new ArrayList<>();
        this.turn = Color.WHITE;
    }

    public void addMove(Color color, ChessPiecePosition pos) {
        if (getTurn() == color) {
            positionStack.push(pos);
            actions.add(color + " played move " + pos.getPosition() + ".");
            this.turn = color.other(color);
        }
    }

    public ChessPiecePosition undoMove(Color color) {
        if (getTurn() != color) {
            ChessPiecePosition pos = positionStack.pop();
            actions.add(color + " undid move " + pos.getPosition() + ".");
            this.turn = color;
            return pos;
        } else
            return null;
    }

    public Color getTurn() {
        return turn;
    }

    public void setTurn(Color turn) {
        this.turn = turn;
    }

    public List<String> getActions() {
        return actions;
    }
}
