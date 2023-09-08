public class Blueray extends DVD{
    // Fields


    // Constructor
    public Blueray(String m_titel, double m_preis, long m_barcode, String m_regisseur, int m_erscheinungsjahr) {
        super(m_titel, m_preis, m_barcode, m_regisseur, m_erscheinungsjahr);
    }

    // Methods
    public String getBeschreibung(){
        return "Blueray©: " + " \"" + this.titel + "\"" + " von " + this.regisseur
                + ", in " + String.valueOf(this.erscheinungsjahr);
    }

}
