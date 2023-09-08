import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class Hauptklasse {
    public static void main(String[]args){

        /*
        // 1 Java Einführung

        // Hello World
        System.out.println("HalloWelt!");

        // Hauptklasse
        double circleRadius = 7.0;
        double kreisUmfang = 2 * Math.PI * circleRadius;
        double kreisFläche = Math.PI * circleRadius * circleRadius;
        System.out.println("Bei einem Radius von " + circleRadius + "cm beträgt der " +
                "umfang " + kreisUmfang + "cm und due Fläche " + kreisFläche + "cm");

        // Quader
        Quader q1 = new Quader(10, 5, 4, 0.5);
        System.out.println("Volumen von q1 ist : " + q1.berechneVolumen() + "m³");

        Quader q2 = new Quader(5, 5, 5, 0.5);
        System.out.println("Volumen von q2 ist : " + q2.berechneVolumen() + "m³");

        Quader q3 = new Quader(
                ((q1.getLaenge() + q2.getLaenge())/2),
                ((q1.getBreite() + q2.getBreite())/ 2),
                ((q1.getHoehe() + q2.getHoehe())/2),
                0.5
                );

        Quader q4 = new Quader(8, 6, 5, 0.5);
        Quader q5 = new Quader(3, 1, 4, 0.5);

        System.out.println("Volumen von q3 ist : " + q3.berechneVolumen() + "m³");
        System.out.println("Laenge, Breite und Hoehe  von q3 :" + q3.getLaenge() + "cm, " +q3.getBreite() + "cm, " + q3.getHoehe() + "cm");
        System.out.println(" Overfläche der Quader sind: " + q1.berechneOberflaeche() + "cm2, " + q2.berechneOberflaeche() + "cm2, " + q3.berechneOberflaeche() + "cm2");
        System.out.println("Dichte der Quader sind: " + q1.berechneGewicht() + "g, " + q2.berechneGewicht() + "g, " + q3.berechneGewicht() + "g");

        // Arrays und ArrayList
        ArrayList<Quader> quaderList = new ArrayList<Quader>();
        quaderList.add(q1);
        quaderList.add(q2);
        quaderList.add(q3);
        quaderList.add(q4);
        quaderList.add(q5);

        // Anzahl der Quader auszugeben
        System.out.println("List of quaders has: " + quaderList.size() + " quaders");

        // Gesamt Gewicht der Quader
        double gesamtGewicht = 0.0;

        for (Quader i:quaderList) {
            gesamtGewicht += i.berechneGewicht();
        }
        System.out.println("Gesamt Gewicht der Quader in der Liste: " + gesamtGewicht + "g");

        // Entefernen aller Quader die über 5000kg wiegen
        quaderList.removeIf(i -> i.berechneGewicht() >= 100);
        System.out.println("Aktuell Anzahl der Quader: " + quaderList.size());


        // Assoziationen und Multiplizitäten
        Student s1 = new Student("Peter Petersen", 108089288888L);
        Computer c1 = new Computer("Dell OptiPlex 755 MT");
        CIPInsel cip1 = new CIPInsel("IC 04/630");

        /*s1.computer = c1;

        c1.benutzer = s1;
        c1.insel = cip1;
        System.out.println(s1.name + " benutzt einen " + s1.computer.typ);
        System.out.println(c1.typ + " ist von " + c1.benutzer.name + " benutzt");
        System.out.println(s1.name + " benutzt einen Rechner in " + s1.computer.insel.name);
        */
        /*
        // 10 Rechner erstellen und in CIPInsel cip1 zuweisen
        for (int i = 0; i < 10; i++){
            cip1.computer[i] = new Computer("Dell Optiplex 755 MT");
            cip1.computer[i].insel = cip1;
        }
        // Weisen den Student den ersten Rechner zu und umgekehrt
        s1.computer = cip1.computer[0];
        cip1.computer[0].benutzer = s1;

        // 20 Vorlesungen erstellen und student s1 zuweisen
        for (int i = 0; i < 20; i++ ){
        s1.vorlesungen.add(new Vorlesung("Mathe " + (i+1), (Integer.toString((i%6)+1))));
        }

        // Vorlesungen von student auszugeben
        System.out.println("Student " + s1.name + " has following lectures: ");
        for (Vorlesung i: s1.vorlesungen
             ) {
            System.out.println(i.bezeichnung + " in " + i.semester + " Semester");
        }

        // 5 zufälligfe Vorlesungen von Student's Vorlesungen entfernen
        Random rnd = new Random();

        for (int i = 0; i < 5; i++){
           s1.vorlesungEntfernen(s1.vorlesungen.get(rnd.nextInt(6)));
        }

        // Vorlesungen von student auszugeben
        System.out.println("Student " + s1.name + " has following lectures: ");
        for (Vorlesung i: s1.vorlesungen
        ) {
            System.out.println(i.bezeichnung + " in " + i.semester + " Semester");
        }*/

        
        }
}


