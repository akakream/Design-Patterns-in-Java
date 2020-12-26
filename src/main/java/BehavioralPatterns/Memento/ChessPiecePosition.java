package BehavioralPatterns.Memento;

public class ChessPiecePosition {
    private String position;
    private Color color;

    public ChessPiecePosition(String position, Color color) {
        this.position = position;
        this.color = color;
    }

    public String getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }
}
