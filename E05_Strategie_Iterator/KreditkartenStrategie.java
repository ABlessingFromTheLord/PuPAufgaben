package E05_Strategie_Iterator;

public class KreditkartenStrategie implements Zahlungsstrategie{
    @Override
    public String getZahlungsMethode() {
        return "Kreditkarten";
    }
}
