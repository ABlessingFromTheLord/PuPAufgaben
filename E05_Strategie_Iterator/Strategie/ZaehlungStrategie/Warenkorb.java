package E05_Strategie_Iterator.Strategie.ZaehlungStrategie;

import E05_Strategie_Iterator.Strategie.ZaehlungStrategie.Zahlungsstrategie;

public class Warenkorb {
    // Fields
    private Zahlungsstrategie zahlungsstrategie;

    // Constructor
    public Warenkorb(Zahlungsstrategie zahlungsstrategie){
        this.zahlungsstrategie = zahlungsstrategie;
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
