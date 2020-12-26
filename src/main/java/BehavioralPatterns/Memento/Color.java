package BehavioralPatterns.Memento;

public enum Color {
    WHITE,
    BLACK;

    public Color other(Color color) {
        if (color == Color.WHITE)
            return Color.BLACK;
        else
            return Color.WHITE;
    }
}
