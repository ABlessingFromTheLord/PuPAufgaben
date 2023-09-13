package E07_Command.Beispiel;

import java.io.IOException;

public class Benutzer {
    public static void main(String[] args) throws IOException {
        Document doc = new Document();
        ActionOpen actionOpen = new ActionOpen(doc);
        ActionSave actionSave = new ActionSave(doc);

        MenuOptionen menuOptionen = new MenuOptionen(actionOpen, actionSave);
        menuOptionen.clickOpen(); // clicking open document
        menuOptionen.clickSave(); // clicking save document

    }
}
