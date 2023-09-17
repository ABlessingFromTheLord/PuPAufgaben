package KlausurVorbereitung.A01;

public class Ort {
    // Fields
    private String Namen;
    private double X;
    private double Y;

    // Constructor
    public Ort(String namen, double x, double y) {
        Namen = namen;
        X = x;
        Y = y;
    }

    // Getters
    public String getNamen() {
        return Namen;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    // Setters
    public void setNamen(String namen) {
        Namen = namen;
    }

    public void setX(double x) {
        X = x;
    }

    public void setY(double y) {
        Y = y;
    }

    // Methods


}
