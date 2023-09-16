package E10_Template_Composite.Template;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public abstract class DatenHandler {
    // Fields
    private File datei;

    // Constructor
    public DatenHandler(File datei) {
        this.datei = datei;
    }

    // Methods
    public Aktienkurs einlesen() throws IOException, ParseException {
        if (datei.exists()){
            validiereDateipfad();
            return transformiereDaten();
        }
        else {
            System.out.println("File does not exist");
            return null;
        }
    }
    public boolean validiereDateipfad() throws IOException, ParseException { return false; }
    public boolean validiereDatentyp(){ return false; }
    public Aktienkurs transformiereDaten() throws IOException, ParseException { return null; }

}
