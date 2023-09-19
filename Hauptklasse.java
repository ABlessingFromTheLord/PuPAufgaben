import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class Hauptklasse {
    public static void main(String[]args){

        /*
        // 1 Java Einführung






        // Assoziationen und Multiplizitäten
        E01_Java.Student s1 = new E01_Java.Student("Peter Petersen", 108089288888L);
        E01_Java.Computer c1 = new E01_Java.Computer("Dell OptiPlex 755 MT");
        E01_Java.CIPInsel cip1 = new E01_Java.CIPInsel("IC 04/630");

        /*s1.computer = c1;

        c1.benutzer = s1;
        c1.insel = cip1;
        System.out.println(s1.name + " benutzt einen " + s1.computer.typ);
        System.out.println(c1.typ + " ist von " + c1.benutzer.name + " benutzt");
        System.out.println(s1.name + " benutzt einen Rechner in " + s1.computer.insel.name);
        */
        /*
        // 10 Rechner erstellen und in E01_Java.CIPInsel cip1 zuweisen
        for (int i = 0; i < 10; i++){
            cip1.computer[i] = new E01_Java.Computer("Dell Optiplex 755 MT");
            cip1.computer[i].insel = cip1;
        }
        // Weisen den E01_Java.Student den ersten Rechner zu und umgekehrt
        s1.computer = cip1.computer[0];
        cip1.computer[0].benutzer = s1;

        // 20 Vorlesungen erstellen und student s1 zuweisen
        for (int i = 0; i < 20; i++ ){
        s1.vorlesungen.add(new E01_Java.Vorlesung("Mathe " + (i+1), (Integer.toString((i%6)+1))));
        }

        // Vorlesungen von student auszugeben
        System.out.println("E01_Java.Student " + s1.name + " has following lectures: ");
        for (E01_Java.Vorlesung i: s1.vorlesungen
             ) {
            System.out.println(i.bezeichnung + " in " + i.semester + " Semester");
        }

        // 5 zufälligfe Vorlesungen von E01_Java.Student's Vorlesungen entfernen
        Random rnd = new Random();

        for (int i = 0; i < 5; i++){
           s1.vorlesungEntfernen(s1.vorlesungen.get(rnd.nextInt(6)));
        }

        // Vorlesungen von student auszugeben
        System.out.println("E01_Java.Student " + s1.name + " has following lectures: ");
        for (E01_Java.Vorlesung i: s1.vorlesungen
        ) {
            System.out.println(i.bezeichnung + " in " + i.semester + " Semester");
        }*/


        /*
        // 2 Vererbung
        Buch b1 = new Buch("UML 2.0", 9.8, 9783897215214L, 139,
                "Dan Pilone", 2);
        Buch b2 = new Buch("A Game Of Thrones", 9.99, 9848956416184L, 807, "George R.R. Martin", 1);
        System.out.println(b1.getBeschreibung());
        System.out.println("Preis: " + b1.getPreis() + " Euro");
        System.out.println("Barcode: " + b1.getBarcode());
        System.out.println(b2.getBeschreibung());
        System.out.println("Preis: " + b2.getPreis() + " Euro");
        System.out.println("Barcode: " + b2.getBarcode());

        CD cd1 = new CD("Für Elise", 4.99, 9161561561156L, 177, "Ludwig Van Beethoven");
        CD cd2 = new CD("Eine kleine Nachtmusik", 7.99, 9874412355636L, 960, "Wolfgang Amadeus Mozart" );
        System.out.println(cd1.getBeschreibung());
        System.out.println(cd2.getBeschreibung());

        // Bücher Verwaltung
        Buch[] buecherliste = new Buch[] {b1, b2};
        for(int i = 0; i < buecherliste.length; i++) {
            System.out.println(buecherliste[i].getBarcode() + "\t" +
                    buecherliste[i].getBeschreibung());
        }

        System.out.println("\t");

        DVD d1 = new DVD("Spiderman", 2.99, 96546541651L, "Sam Raimi", 2002);
        DVD d2 = new DVD("Spiderman 2", 3.99, 91615615616L, "Sam Raimi", 2004);
        DVD d3 = new DVD("Spiderman 3", 2.99, 91561651151L, "Sam Raimi", 2007);

        Blueray br1 = new Blueray("Spiderman Homecoming", 3.99, 95631531153L, "Jon Watts", 2017);
        Blueray br2 = new Blueray("The Amazing Spiderman", 3.99, 96531653163L, "Marc Webb", 2012);

        Artikel[] artikelListe = new Artikel[] {b1, b2, cd1, cd2, d1, d2, d3, br1, br2};

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
            if(artikelListe[i] instanceof CD) {
                System.out.println(artikelListe[i].getBeschreibung());
            }
        }

        System.out.println("\t");

        // Bücher Barcodes auszugeben
        for (int i = 0; i < artikelListe.length; i++){
            if (artikelListe[i] instanceof Buch){
                System.out.println(artikelListe[i].getBarcode());
            }
        }

        // Gesamtpreis aller DVDs zu berechnen
        double gesamtPreisDVD = 0.00;

        for (int i = 0; i < artikelListe.length; i++){
            if (artikelListe[i] instanceof DVD && (!(artikelListe[i] instanceof Blueray))){
                gesamtPreisDVD += artikelListe[i].getPreis();
            }
        }
        System.out.println("Gesamtpreis aller DVDs ist: " + gesamtPreisDVD + "€");
        System.out.println("\t");

        // Casting Beispiel
        for(int i = 0; i < artikelListe.length; i++) {
            if(artikelListe[i] instanceof Buch) {
                //Buch b = (Buch)artikelListe[i];
                System.out.println(((Buch) artikelListe[i]).getAutor());
            }
        }
        System.out.println("\t");

        // Umtauschbare Artikeln auszugeben
        for (int i = 0; i < artikelListe.length; i++){
            if (artikelListe[i] instanceof Umtauschbar){
                System.out.println(((Umtauschbar) artikelListe[i]).umtauschfrist());
            }
        }
        System.out.println("\t");

        // Abspielbar Artikeln abspielen
        for (int i = 0; i < artikelListe.length; i++){
            if (artikelListe[i] instanceof Abspielbar && ( ((Abspielbar) artikelListe[i]).getAbspieldauer() > 90)){
                System.out.print(artikelListe[i].titel +  ((Abspielbar) artikelListe[i]).spieleAb());
                System.out.println("\t");
            }
        }*/


        /*
        // 3 Arbeiten mit UML
        Artist pinkFloyd = new Artist("Pink Floyd");
        Artist godspeedYouBlackEmperor = new Artist("Godspeed You! Black Emperor");
        Artist lilWayne = new Artist("Lil Wayne");
        Artist eminem = new Artist("Eminem");
        Artist rihanna = new Artist("Rihanna");
        Artist variousArtists = new Artist("Various Artists");

        Album carter3 = new Album("Carter 3", lilWayne);
        Album slimShadyLP = new Album("The Slim Shady LP", eminem);
        Album anti = new Album("ANTI", rihanna);

        Album wywh = new Album("Wish You Were Here", pinkFloyd);
        wywh.addTrack(new Track("Shine On You Crazy Diamond, Pts. 1-5", pinkFloyd, wywh, 13*60+30));
        wywh.addTrack(new Track("Welcome To The Machine", pinkFloyd, wywh, 7*60+33));
        wywh.addTrack(new Track("Have A Cigar", pinkFloyd, wywh, 5*60+7));
        wywh.addTrack(new Track("Wish You Were Here", pinkFloyd, wywh, 5*60+5));
        wywh.addTrack(new Track("Shine On You Crazy Diamond, Pts. 6-9", pinkFloyd, wywh, 12*60+23));
        wywh.updateLength();

        Album lysf = new Album("Lift Your Skinny Fists Like Antennas to Heaven", godspeedYouBlackEmperor);
        lysf.addTrack(new Track("Storm", godspeedYouBlackEmperor, lysf, 22*60+32));
        lysf.addTrack(new Track("Static", godspeedYouBlackEmperor, lysf, 22*60+35));
        lysf.addTrack(new Track("Sleep", godspeedYouBlackEmperor, lysf, 23*60+17));
        lysf.addTrack(new Track("Like Antennas To Heaven...", godspeedYouBlackEmperor, lysf, 18*60+57));
        lysf.updateLength();

        Playlist rap = new Playlist("rap", variousArtists);
        rap.addTrack(new Track("A milli ", lilWayne, carter3, 2 * 60 + 05));
        rap.addTrack(new Track("My Name is", eminem, slimShadyLP, 3*60+44));
        rap.addTrack(new Track("Needed Me", rihanna, anti, 2*60+59));
        rap.updateLength();

        Player player = new Player();
        player.PlayAlbum(wywh);
        player.PlayAlbum(lysf);
        player.PlayAlbum(rap);
         */


        // 4 Datenstrukturen


    }
}


