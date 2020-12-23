package TestCreationalPatterns;

import AbstractMethod.Dialogs.Dialog;
import AbstractMethod.Dialogs.WebDialog;
import org.junit.jupiter.api.Test;

public class TestAbstractMethod {

    @Test
    public void testMain() {
        Dialog wdial = new WebDialog();
        wdial.render();
    }

}
