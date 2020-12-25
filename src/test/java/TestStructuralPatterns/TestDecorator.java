package TestStructuralPatterns;

import StructuralPatterns.Decorator.Ciphers.CipherDecorator;
import StructuralPatterns.Decorator.Ciphers.SubstitutionCipher;
import StructuralPatterns.Decorator.Ciphers.SwapCipher;
import StructuralPatterns.Decorator.Message.TextMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDecorator {
    @Test
    public void testMain() {
        CipherDecorator m = new SubstitutionCipher(new SwapCipher(new TextMessage()));
        String codeToCode = "Kerramiko";
        String codedMessage = m.code(codeToCode);
        String decodedMessage = m.decode(codedMessage);
        assertEquals(decodedMessage, codeToCode.toUpperCase());
    }

    @Test
    public void SubCodeCipherTest() {
        char[] actual =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] code =    "TIMEODANSFRBCGHJKLPQUVWXYZ".toCharArray();
        SubstitutionCipher cipher = new SubstitutionCipher(new TextMessage());
        String codedMessage = cipher.code("code");
        assertEquals(codedMessage, "MHEO");
    }

    @Test
    public void SubDecodeCipherTest() {
        char[] actual =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] code =    "TIMEODANSFRBCGHJKLPQUVWXYZ".toCharArray();
        SubstitutionCipher cipher = new SubstitutionCipher(new TextMessage());
        String decodedMessage = cipher.decode("MHEO");
        assertEquals(decodedMessage, "CODE");
    }

    @Test
    public void SwapCodeCipherTest() {
        SwapCipher cipher = new SwapCipher(new TextMessage());
        String codedMessage = cipher.code("codek");
        assertEquals(codedMessage, "dekco");
    }

    @Test
    public void SwapDecodeCipherTest() {
        SwapCipher cipher = new SwapCipher(new TextMessage());
        String decodedMessage = cipher.decode("dekco");
        assertEquals(decodedMessage, "codek");
    }
}
