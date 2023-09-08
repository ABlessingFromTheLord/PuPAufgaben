public class CD extends Artikel{
    // Fields
    private  int laufzeit;
    private String komponist;

    // Constructors
    public CD(String m_titel, double m_preis, long m_barcode, int m_laufzeit, String m_komponist){
        super(m_titel, m_preis, m_barcode);
        this.laufzeit = m_laufzeit;
        this.komponist = m_komponist;
    }

    // Methods
    public String getBeschreibung(){
        return "CD: " + " \"" + this.titel + "\"" + " von " + this.komponist + ", " +
                " dauert " + String.valueOf(this.laufzeit) + " Sekunden";
    }
}
