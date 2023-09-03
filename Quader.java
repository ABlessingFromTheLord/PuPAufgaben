public class Quader {
    // Fields
    private double l;
    private double b;
    private double h;

    // Constructor
    public Quader(double laenge, double breite, double hoehe){
        this.l = laenge;
        this.b = breite;
        this.h = hoehe;
    }

    // Getters
    public double getLaenge() { return this.l; }
    public double getBreite() { return this.b; }
    public double getHoehe() { return this.h; }

    // Setters
    public void setLaenge(double laenge) { this.l = laenge; }
    public void setBreite(double breite) { this.b = breite; }
    public void setHoehe(double hoehe) { this.h = hoehe; }

    // Methods
    public double berechneVolumen()
    {
        return l * b * h;
    }

    public double berechneOberflaeche()
    {
        return (2 * l * b) + (2 * l * h) + (2 * b * h);
    }


}
