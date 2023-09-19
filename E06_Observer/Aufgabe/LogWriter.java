package E06_Observer.Aufgabe;

import java.io.FileWriter;

public class LogWriter implements IChatBeobachter{
    // Fields
    private FileWriter fileWriter;

    // Constructor
    public LogWriter() {
    }


    // Methods
    // Getters
    public FileWriter getFileWriter() {
        return this.fileWriter;
    }

    // Setters
    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    @Override
    public void aktualisieren(Nachricht nachricht) {


    }
}
