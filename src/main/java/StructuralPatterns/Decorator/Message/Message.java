package StructuralPatterns.Decorator.Message;

public interface Message {
    String code(String message);
    String decode(String message);
}
