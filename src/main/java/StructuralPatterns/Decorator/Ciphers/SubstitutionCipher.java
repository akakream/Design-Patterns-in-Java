package StructuralPatterns.Decorator.Ciphers;

import StructuralPatterns.Decorator.Message.Message;

public class SubstitutionCipher extends CipherDecorator{

    private char[] actual =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private char[] code = "TIMEODANSFRBCGHJKLPQUVWXYZ".toCharArray();

    public SubstitutionCipher(Message message) {
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
        char[] messageChars = message.toCharArray();

        for (int i=0; i<messageChars.length; i++) {
            for (int k=0; k<actual.length; k++) {
                if (makeUpperCase(messageChars[i]) == actual[k]) {
                    messageChars[i] = code[k];
                    break;
                }
            }
        }
        return new String(messageChars);
    }

    public String deciphit(String message) {
        char[] messageChars = message.toCharArray();

        for (int i=0; i<messageChars.length; i++) {
            for (int k=0; k<code.length; k++) {
                if (makeUpperCase(messageChars[i]) == code[k]) {
                    messageChars[i] = actual[k];
                    break;
                }
            }
        }
        return new String(messageChars);
    }

    public char makeUpperCase(char c) {
        return Character.toUpperCase(c);
    }

}
