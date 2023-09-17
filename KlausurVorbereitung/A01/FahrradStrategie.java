package KlausurVorbereitung.A01;

import java.util.Arrays;

public class FahrradStrategie implements ReiseStrategie{
    // Fields
    private static final double GESCHWINDIGKEIT = 10.0;

    // Constructor

    public FahrradStrategie() {
    }


    // Methods

    @Override
    public double berechneZeit(Ort[] route) {
        //Arrays.sort(route);
        double totaldistance = 0.0;

        for (int i = 0; i < route.length; i++){
            if (i == route.length-1){
                break;
            }

            double temp = Math.pow(route[i].getX()-route[i+1].getX(), 2) +
                    Math.pow(route[i].getY()-route[i+1].getY(), 2);
            totaldistance += temp;
        }
        return totaldistance / GESCHWINDIGKEIT;
    }
}
