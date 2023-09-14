package E07_Command_Decorator.Decorator;

public class Magier implements Character{
    // Fields
    private int ruestungsWert = 3;
    private int treffPunkte = 8;

    // Constructor


    public Magier() {
    }

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
