package BehavioralPatterns.Memento;

public class Black implements Player {
    private Caretaker caretaker;
    private Color color;

    public Black(Caretaker caretaker) {
        this.caretaker = caretaker;
        this.color = Color.BLACK;
    }

    @Override
    public void movePiece(String move) {
        caretaker.addMove(this.color, new ChessPiecePosition(move, this.color));
    }

    @Override
    public void undoMove() {
        caretaker.undoMove(this.color);
    }
}
