package AbstractMethod.Dialogs;

import AbstractMethod.Buttons.Button;
import AbstractMethod.Buttons.WebRoundButton;

public class WebDialog extends Dialog {
    @Override
    public void printDialogMessage() {
        System.out.println("This is a Web dialog message.");
    }

    @Override
    public Button createButton() {
        return new WebRoundButton();
    }

    public int someOtherFunc() {
        return 0;
    }
}
