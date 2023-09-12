package E05_Strategie_Iterator;

public class Warenkorb {
    // Fields
    private Zahlungsstrategie zahlungsstrategie;

    // Constructor
    public Warenkorb(){

    }

    // Methods
    // Getters
    public Zahlungsstrategie getZahlungsstrategie() {
        return this.zahlungsstrategie;
    }

    // Setters
    public void setZahlungsstrategie(Zahlungsstrategie zahlungsstrategie) {
        this.zahlungsstrategie = zahlungsstrategie;
    }
}
