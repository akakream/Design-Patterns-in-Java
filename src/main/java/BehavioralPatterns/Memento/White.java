package BehavioralPatterns.Memento;

public class White implements Player{
    private Caretaker caretaker;
    private Color color;

    public White(Caretaker caretaker) {
        this.caretaker = caretaker;
        this.color = Color.WHITE;
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
