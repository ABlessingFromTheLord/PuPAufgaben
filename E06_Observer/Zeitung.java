package E06_Observer;
import java.util.Date;

public class Zeitung {
    // Fields
    private Date Datum;
    private String Titel;

    // Constructors
    public Zeitung(Date datum, String titel){
        this.Datum = datum;
        this.Titel = titel;
    }

    // Methods
    // Getters
    public Date getDatum() {
        return this.Datum;
    }

    public String getTitel() {
        return this.Titel;
    }

    // Setters
    public void setDatum(Date datum) {
        this.Datum = datum;
    }

    public void setTitel(String titel) {
        this.Titel = titel;
    }
}
