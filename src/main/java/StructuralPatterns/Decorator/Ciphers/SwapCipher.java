package StructuralPatterns.Decorator.Ciphers;

import StructuralPatterns.Decorator.Message.Message;

public class SwapCipher extends CipherDecorator {

    public SwapCipher(Message message) {
        super(message);
    }

    @Override
    public String code(String message) {
        return super.code(ciphit(message));
    }

    @Override
    public String decode(String message) {
        return super.decode(deciphit(message));
    }

    public String ciphit(String message) {
        String first = message.substring(0, message.length() / 2);
        String second = message.substring(message.length() / 2);
        return second.concat(first);
    }

    public String deciphit(String message) {
        String first;
        String second;
        if (message.length() % 2 == 0) {
            first = message.substring(0, message.length() / 2);
            second = message.substring(message.length() / 2);
        } else {
            first = message.substring(0, message.length() / 2 + 1);
            second = message.substring(message.length() / 2 + 1);
        }
        return second.concat(first);
    }

}
