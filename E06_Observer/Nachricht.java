package E06_Observer;

import java.util.Date;

public class Nachricht {
    // Fields
    private Date Uhrzeit;
    private String Text;
    private String Empfaenger;
    private String Sender;


    // Constructor
    public Nachricht(String text, String sender, String empfaenger) {
        this.Text = text;
        this.Empfaenger = empfaenger;
        this.Sender = sender;
    }


    // Methods
    // Getters
    public Date getUhrzeit() { return this.Uhrzeit; }

    public String getText() { return this.Text; }

    public String getEmpfaenger() { return this.Empfaenger; }

    public String getSender() { return this.Sender; }
}
