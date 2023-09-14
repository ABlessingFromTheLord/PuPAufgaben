package E07_Command_Decorator.Beispiel;

import java.io.IOException;

public class MenuOptionen {
    // Fields
    private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;

    // Constructor

    public MenuOptionen(ActionListenerCommand openCommand, ActionListenerCommand saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }


    // Methods
    public void clickOpen() throws IOException {
        this.openCommand.execute();
    }

    public void clickSave() throws IOException {
        this.saveCommand.execute();
    }

}
