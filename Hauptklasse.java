public class Hauptklasse {
    public static void main(String[]args){

        /*
        // Hello World
        System.out.println("HalloWelt!");

        // Hauptklasse
        double circleRadius = 7.0;
        double kreisUmfang = 2 * Math.PI * circleRadius;
        double kreisFläche = Math.PI * circleRadius * circleRadius;
        System.out.println("Bei einem Radius von " + circleRadius + "cm beträgt der " +
                "umfang " + kreisUmfang + "cm und due Fläche " + kreisFläche + "cm");
        */

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

        System.out.println("Volumen von q3 ist : " + q3.berechneVolumen() + "m³");
        System.out.println("Laenge, Breite und Hoehe  von q3 :" + q3.getLaenge() + "cm, " +q3.getBreite() + "cm, " + q3.getHoehe() + "cm");
        System.out.println(" Overfläche der Quader sind: " + q1.berechneOberflaeche() + "cm2, " + q2.berechneOberflaeche() + "cm2, " + q3.berechneOberflaeche() + "cm2");
        System.out.println("Dichte der Quader sind: " + q1.berechneGewicht() + "g, " + q2.berechneGewicht() + "g, " + q3.berechneGewicht() + "g");

        }
}


