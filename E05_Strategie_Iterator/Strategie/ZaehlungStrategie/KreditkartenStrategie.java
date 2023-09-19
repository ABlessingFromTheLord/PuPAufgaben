package E05_Strategie_Iterator.Strategie.ZaehlungStrategie;

public class KreditkartenStrategie implements Zahlungsstrategie {
    // Fields
    private String Namen;
    private int Kreditkartennummer;

    // Constructor
    public KreditkartenStrategie(String Name, int kreditkartennummer){
        this.Namen = Name;
        this.Kreditkartennummer = kreditkartennummer;
    }

    // Methods
    // Getters
    public String getNamen() {
        return this.Namen;
    }
    public int getKreditkartennummer() {
        return this.Kreditkartennummer;
    }

    // Setters
    public void setNamen(String namen) {
        this.Namen = namen;
    }
    public void setKreditkartennummer(int kreditkartennummer) {
        this.Kreditkartennummer = kreditkartennummer;
    }

    @Override
    public void zahle(int preis) {
        System.out.println("Preis: " + preis + ", Namen: " + this.getNamen() + ", Kreditkartennummer: " + this.getKreditkartennummer());
    }
}
