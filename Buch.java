public class Buch extends Artikel{
    // Fields
    private int seiten;
    private String autor;
    private int auflage;

    // Constructor
    public Buch(String m_titel, double m_preis, long m_barcode, int m_seiten, String m_autor, int m_auflage){
        super(m_titel, m_preis, m_barcode);
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

}
