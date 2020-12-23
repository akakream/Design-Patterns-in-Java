package AbstractMethod.Dialogs;

import AbstractMethod.Buttons.Button;
import AbstractMethod.Buttons.DesktopButton;

public class DesktopDialog extends Dialog {
    @Override
    public void printDialogMessage() {
        System.out.println("This is a Desktop Dialog message");
    }

    @Override
    public Button createButton() {
        return new DesktopButton();
    }
}
