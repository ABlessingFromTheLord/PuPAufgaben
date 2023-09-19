package E02_Vererbung;

public class Testklasse {
    public static void main(String[] args) {

        // 2 Vererbung
        E02_Vererbung.Buch b1 = new E02_Vererbung.Buch("UML 2.0", 9.8, 9783897215214L, 139,
                "Dan Pilone", 2);
        E02_Vererbung.Buch b2 = new E02_Vererbung.Buch("A Game Of Thrones", 9.99, 9848956416184L, 807, "George R.R. Martin", 1);
        System.out.println(b1.getBeschreibung());
        System.out.println("Preis: " + b1.getPreis() + " Euro");
        System.out.println("Barcode: " + b1.getBarcode());
        System.out.println(b2.getBeschreibung());
        System.out.println("Preis: " + b2.getPreis() + " Euro");
        System.out.println("Barcode: " + b2.getBarcode());

        E02_Vererbung.CD cd1 = new E02_Vererbung.CD("Für Elise", 4.99, 9161561561156L, 177, "Ludwig Van Beethoven");
        E02_Vererbung.CD cd2 = new E02_Vererbung.CD("Eine kleine Nachtmusik", 7.99, 9874412355636L, 960, "Wolfgang Amadeus Mozart" );
        System.out.println(cd1.getBeschreibung());
        System.out.println(cd2.getBeschreibung());

        // Bücher Verwaltung
        E02_Vererbung.Buch[] buecherliste = new E02_Vererbung.Buch[] {b1, b2};
        for(int i = 0; i < buecherliste.length; i++) {
            System.out.println(buecherliste[i].getBarcode() + "\t" +
                    buecherliste[i].getBeschreibung());
        }

        System.out.println("\t");

        E02_Vererbung.DVD d1 = new E02_Vererbung.DVD("Spiderman", 2.99, 96546541651L, "Sam Raimi", 2002);
        E02_Vererbung.DVD d2 = new E02_Vererbung.DVD("Spiderman 2", 3.99, 91615615616L, "Sam Raimi", 2004);
        E02_Vererbung.DVD d3 = new E02_Vererbung.DVD("Spiderman 3", 2.99, 91561651151L, "Sam Raimi", 2007);

        E02_Vererbung.Blueray br1 = new E02_Vererbung.Blueray("Spiderman Homecoming", 3.99, 95631531153L, "Jon Watts", 2017);
        E02_Vererbung.Blueray br2 = new E02_Vererbung.Blueray("The Amazing Spiderman", 3.99, 96531653163L, "Marc Webb", 2012);

        E02_Vererbung.Artikel[] artikelListe = new E02_Vererbung.Artikel[] {b1, b2, cd1, cd2, d1, d2, d3, br1, br2};

        // Gesamtpreis Berechnung
        double gesamtPreis = 0.00;

        for(int i = 0; i < artikelListe.length; i++) {
            System.out.println(artikelListe[i].getBarcode() + "\t" +
                    artikelListe[i].getBeschreibung());
            gesamtPreis += artikelListe[i].getPreis();
        }

        System.out.println("Gesamtpreis aller Artikeln: " + gesamtPreis + "€");
        System.out.println("\t");

        // Nur CDs auszugeben
        for(int i = 0; i < artikelListe.length; i++) {
            if(artikelListe[i] instanceof E02_Vererbung.CD) {
                System.out.println(artikelListe[i].getBeschreibung());
            }
        }

        System.out.println("\t");

        // Bücher Barcodes auszugeben
        for (int i = 0; i < artikelListe.length; i++){
            if (artikelListe[i] instanceof E02_Vererbung.Buch){
                System.out.println(artikelListe[i].getBarcode());
            }
        }

        // Gesamtpreis aller DVDs zu berechnen
        double gesamtPreisDVD = 0.00;

        for (int i = 0; i < artikelListe.length; i++){
            if (artikelListe[i] instanceof E02_Vererbung.DVD && (!(artikelListe[i] instanceof E02_Vererbung.Blueray))){
                gesamtPreisDVD += artikelListe[i].getPreis();
            }
        }
        System.out.println("Gesamtpreis aller DVDs ist: " + gesamtPreisDVD + "€");
        System.out.println("\t");

        // Casting Beispiel
        for(int i = 0; i < artikelListe.length; i++) {
            if(artikelListe[i] instanceof E02_Vererbung.Buch) {
                //E02_Vererbung.Buch b = (E02_Vererbung.Buch)artikelListe[i];
                System.out.println(((E02_Vererbung.Buch) artikelListe[i]).getAutor());
            }
        }
        System.out.println("\t");

        // Umtauschbare Artikeln auszugeben
        for (int i = 0; i < artikelListe.length; i++){
            if (artikelListe[i] instanceof E02_Vererbung.Umtauschbar){
                System.out.println(((E02_Vererbung.Umtauschbar) artikelListe[i]).umtauschfrist());
            }
        }
        System.out.println("\t");

        // E02_Vererbung.Abspielbar Artikeln abspielen
        for (int i = 0; i < artikelListe.length; i++){
            if (artikelListe[i] instanceof E02_Vererbung.Abspielbar && ( ((E02_Vererbung.Abspielbar) artikelListe[i]).getAbspieldauer() > 90)){
                System.out.print(artikelListe[i].titel +  ((E02_Vererbung.Abspielbar) artikelListe[i]).spieleAb());
                System.out.println("\t");
            }
        }
    }
}
