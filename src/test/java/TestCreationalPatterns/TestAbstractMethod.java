package TestCreationalPatterns;

import CreationalPatterns.AbstractMethod.Dialogs.Dialog;
import CreationalPatterns.AbstractMethod.Dialogs.WebDialog;
import org.junit.jupiter.api.Test;

public class TestAbstractMethod {

    @Test
    public void testMain() {
        Dialog wdial = new WebDialog();
        wdial.render();
    }

}
