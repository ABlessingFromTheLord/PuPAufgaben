public class Quader {
    // Fields
    private double l;
    private double b;
    private double h;
    private double d;

    // Constructors
    public Quader(double laenge, double breite, double hoehe){
        this.l = laenge;
        this.b = breite;
        this.h = hoehe;
    }
    public Quader(double laenge, double breite, double hoehe, double dichte){
        this.l = laenge;
        this.b = breite;
        this.h = hoehe;
        this.d = dichte;
    }
    public Quader(double laenge){
        this.l = laenge;

        this.d = 1;
        // or set mass equal volume? which is which?
    }

    // Methods
    // Getters
    public double getLaenge() { return this.l; }
    public double getBreite() { return this.b; }
    public double getHoehe() { return this.h; }
    public double getDichte() { return this.d; }

    // Setters
    public void setLaenge(double laenge) { this.l = laenge; }
    public void setBreite(double breite) { this.b = breite; }
    public void setHoehe(double hoehe) { this.h = hoehe; }
    public void setDichte(double dichte) { this.d = dichte; }

    // Methods
    public double berechneVolumen()
    {
        return l * b * h;
    }
    public double berechneOberflaeche()
    {
        return (2 * l * b) + (2 * l * h) + (2 * b * h);
    }
    public double berechneGewicht() { return (this.getDichte() * berechneVolumen()); }

}
