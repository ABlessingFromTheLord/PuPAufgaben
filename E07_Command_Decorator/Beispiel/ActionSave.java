package E07_Command_Decorator.Beispiel;

import java.io.IOException;

public class ActionSave extends Document implements ActionListenerCommand {
    // Fields
    private Document doc;

    // Constructor
    public ActionSave(Document document) {
        this.doc = document;
    }

    // Methods
    @Override
    public void execute() throws IOException {
        System.out.println(" Executing saving operation: ");
        this.Save();
    }
}
