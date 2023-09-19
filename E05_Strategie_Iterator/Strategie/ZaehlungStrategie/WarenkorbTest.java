package E05_Strategie_Iterator.Strategie.ZaehlungStrategie;

public class WarenkorbTest {
    public static void main(String[]args){
        KreditkartenStrategie kdrt = new KreditkartenStrategie("John Doe", 1687186786);
        PaypalStrategie pp = new PaypalStrategie("johndoe@gmail.com");

        Warenkorb wrn1 = new Warenkorb(kdrt);
        Warenkorb wrn2 = new Warenkorb(pp);

        wrn1.getZahlungsstrategie().zahle(89);
        wrn2.getZahlungsstrategie().zahle(65);
    }
}
