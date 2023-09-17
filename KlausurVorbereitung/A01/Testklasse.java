package KlausurVorbereitung.A01;

public class Testklasse {
    public static void main(String[] args) {
        Ort Bochum = new Ort("Bochum", 12, 15);
        Ort Wattenscheid = new Ort("Wattenscheid", 25, 18);
        Ort Essen = new Ort("Essen", 30, 20);
        Ort Muelheim = new Ort("Mülheim", 35, 25);
        Ort[] ortArray = {Bochum, Wattenscheid, Essen, Muelheim};

        AutoStrategie autoStrategie = new AutoStrategie();
        System.out.println(autoStrategie.berechneZeit(ortArray));

        FahrradStrategie fahrradStrategie = new FahrradStrategie();
        System.out.println(fahrradStrategie.berechneZeit(ortArray));

    }
}
