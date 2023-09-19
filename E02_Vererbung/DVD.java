package E02_Vererbung;

public class DVD extends Artikel implements Abspielbar {
    // Fields
    protected String regisseur;
    protected int erscheinungsjahr;

    // Constructor
    public DVD(String m_titel, double m_preis, long m_barcode, String m_regisseur, int m_erscheinungsjahr){
        super(m_titel, m_preis, m_barcode);
        this.regisseur = m_regisseur;
        this.erscheinungsjahr = m_erscheinungsjahr;
    }

    // Methods
    public String getBeschreibung(){
        return "E02_Vererbung.DVD: " + " \"" + this.titel + "\"" + " von " + this.regisseur + ", in " + String.valueOf(this.erscheinungsjahr);
    }

    @Override
    public int getAbspieldauer() {
        return 120;
    }

    @Override
    public String spieleAb() {
        return " spielt.....";
    }
}
