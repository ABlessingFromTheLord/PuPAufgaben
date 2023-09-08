public class DVD extends Artikel{
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
        return "DVD: " + " \"" + this.titel + "\"" + " von " + this.regisseur + ", in " + String.valueOf(this.erscheinungsjahr);
    }

}
