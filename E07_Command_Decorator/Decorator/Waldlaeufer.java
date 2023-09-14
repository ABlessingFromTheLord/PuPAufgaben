package E07_Command_Decorator.Decorator;

public class Waldlaeufer implements Character{
    // Fields
    private int ruestungsWert = 10;
    private int treffPunkte = 20;

    // Constructor


    // Methods
    @Override
    public int getRuestungswert() {
        return this.ruestungsWert;
    }

    @Override
    public int getTreffpunkte() {
        return this.treffPunkte;
    }

    @Override
    public int getBeschreibung() {
        return 0;
    }
}
