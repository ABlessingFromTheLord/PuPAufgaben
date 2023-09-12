package E05_Strategie_Iterator;

public class PaypalStrategie implements Zahlungsstrategie{
    @Override
    public String getZahlungsMethode() {
        return "Paypal";
    }
}
