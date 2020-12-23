package AbstractMethod.Dialogs;

import AbstractMethod.Buttons.Button;

public abstract class Dialog {
    public void render() {
        System.out.println("Starting rendering...");
        Button b = createButton();
        b.render();
        System.out.println("Ending rendering...");
    }
    public abstract void printDialogMessage();
    public abstract Button createButton();
}
