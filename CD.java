public class CD {
    // Fields
    private String titel;
    private double preis;
    private long barcode;
    private  int laufzeit;
    private String komponist;

    // Constructors
    public CD(String m_titel, double m_preis, long m_barcode, int m_laufzeit, String m_komponist){
        this.titel = m_titel;
        this.preis = m_preis;
        this.barcode = m_barcode;
        this.laufzeit = m_laufzeit;
        this.komponist = m_komponist;
    }

    // Methods
    // Getters
    public String getBeschreibung(){
        return "CD: " + " \"" + this.titel + "\"" + " von " + this.komponist + ", " +
                " dauert " + String.valueOf(this.laufzeit) + " Sekunden";
    }

    public double getPreis(){
        return this.preis;
    }

    public long getBarcode(){
        return this.barcode;
    }

}
