package StructuralPatterns.Decorator.Ciphers;

import StructuralPatterns.Decorator.Message.Message;

public abstract class CipherDecorator implements Message {
    protected Message message;

    public CipherDecorator(Message message) {
        this.message = message;
    }

    @Override
    public String code(String message) {
        return this.message.code(message);
    }

    @Override
    public String decode(String message) {
        return this.message.decode(message);
    }

}
