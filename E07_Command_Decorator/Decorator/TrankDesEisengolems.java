package E07_Command_Decorator.Decorator;

public class TrankDesEisengolems extends TrankEffectDecorator{
    // Fields
    protected Character c;
    protected String bezeichnung;

    // Constructor
    public TrankDesEisengolems(Character c, String bezeichnung) {
        super(c, bezeichnung);
    }

    // Methods
    @Override
    public int getRuestungswert() {
        return 2 *(c.getRuestungswert());
    }

    @Override
    public int getTreffpunkte() {
        return 0;
    }
}
