package E07_Command_Decorator.Decorator;

public abstract class TrankEffectDecorator implements Character{
    // Fields
    protected Character c;
    protected String bezeichnung;

    // Constructor
    public TrankEffectDecorator(Character c, String bezeichnung) {
        this.c = c;
        this.bezeichnung = bezeichnung;
    }

    // Methods

    @Override
    public int getRuestungswert() {
        return 0;
    }

    @Override
    public int getTreffpunkte() {
        return 0;
    }

    @Override
    public int getBeschreibung() {
        return 0;
    }
}
