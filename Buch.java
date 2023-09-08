public class Buch {
    // Fields
    private String titel;
    private double preis;
    private long barcode;
    private int seiten;
    private String autor;
    private int auflage;

    // Constructor
    public Buch(String m_titel, double m_preis, long m_barcode, int m_seiten, String m_autor, int m_auflage){
        this.titel = m_titel;
        this.preis = m_preis;
        this.barcode = m_barcode;
        this.seiten = m_seiten;
        this.autor = m_autor;
        this.auflage = m_auflage;
    }

    //  Methods
    // Getters
    public String getBeschreibung()
    {
        return "Buch: " + " \"" + this.titel + "\"" + " von " + this.autor + ", " +
                String.valueOf(this.auflage) + ". Auflage, " + String.valueOf(this.seiten) + " Seiten" ;
    }

    public double getPreis() {
        return this.preis;
    }

    public long getBarcode() {
        return this.barcode;
    }
}
