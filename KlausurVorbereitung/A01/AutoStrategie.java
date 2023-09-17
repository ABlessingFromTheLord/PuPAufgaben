package KlausurVorbereitung.A01;

import java.util.ArrayList;
import java.util.Arrays;

public class AutoStrategie implements ReiseStrategie{
    // Fields
    private static final double GESCHWINDIGKEIT = 30.5;
    private ArrayList<Ort> baustellen;

    // Constructor
    public AutoStrategie() {
        baustellen = new ArrayList<Ort>();
    }

    // Methods
    // Getters
    public ArrayList<Ort> getBaustellen() {
        return baustellen;
    }

    // Setters
    public void setBaustellen(ArrayList<Ort> baustellen) {
        this.baustellen = baustellen;
    }

    public void addBaustellen(Ort ort){
        baustellen.add(ort);
    }

    @Override
    public double berechneZeit(Ort[] route) {
        double totaldistance = 0.0;
        //Arrays.sort(route);

        for (int i = 0; i < route.length; i++){
            if (i == route.length-1){
                break;
            }

            else if (baustellen.contains(route[i])){
                double temp = Math.pow(route[i].getX()-route[i+1].getX(), 2) +
                        Math.pow(route[i].getY()-route[i+1].getY(), 2) + (30.5 * 15);

                totaldistance += temp;
            }
            else {
                double temp = Math.pow(route[i].getX()-route[i+1].getX(), 2) +
                        Math.pow(route[i].getY()-route[i+1].getY(), 2);

                totaldistance += temp;
            }
        }

        return  totaldistance / GESCHWINDIGKEIT;
    }
}
