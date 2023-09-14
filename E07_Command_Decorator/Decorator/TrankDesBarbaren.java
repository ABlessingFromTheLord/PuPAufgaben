package E07_Command_Decorator.Decorator;

public class TrankDesBarbaren extends TrankEffectDecorator{
    // Fields
    protected Character c;
    protected String bezeichnung;

    // Constructor
    public TrankDesBarbaren(Character c, String bezeichnung) {
        super(c, bezeichnung);
    }

    // Methods
    @Override
    public int getRuestungswert() {
        return (c.getRuestungswert()-5);
    }

    @Override
    public int getTreffpunkte() {
        return (c.getTreffpunkte() + 5);
    }
}
