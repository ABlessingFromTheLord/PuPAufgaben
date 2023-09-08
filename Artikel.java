public abstract class Artikel {
    // Fields
    protected String titel;
    protected double preis;
    protected long barcode;

    // Constructors
    public Artikel(String m_titel, double m_preis, long m_barcode){
        this.titel = m_titel;
        this.preis = m_preis;
        this.barcode = m_barcode;
    }

    // Methods
    // Getters
    public double getPreis() {
        return this.preis;
    }

    public long getBarcode() {
        return this.barcode;
    }

    public abstract String getBeschreibung();
}
