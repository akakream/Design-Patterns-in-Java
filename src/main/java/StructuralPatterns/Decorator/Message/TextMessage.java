package StructuralPatterns.Decorator.Message;

public class TextMessage implements Message{

    public TextMessage() {
    }

    @Override
    public String code(String message) {
        return message;
    }

    @Override
    public String decode(String message) {
        return message;
    }
}
