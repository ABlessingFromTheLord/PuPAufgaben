package E07_Command.Beispiel;

import java.io.IOException;

public class ActionOpen extends Document implements ActionListenerCommand{
    // Fields
    private Document doc;

    // Constructor
    public ActionOpen(Document document) {
        this.doc = document;
    }

    // Methods
    @Override
    public void execute() throws IOException {
        System.out.println(" Executing open operation: ");
        this.Open();
    }

}
