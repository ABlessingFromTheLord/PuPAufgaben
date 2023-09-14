package E07_Command_Decorator.Decorator;

public class TrankDerVitalität extends TrankEffectDecorator{
    // Fields
    private Character c;
    private String bezeichnung;

    // Constructor
    public TrankDerVitalität(Character c, String bezeichnung) {
        super(c, bezeichnung);
    }


    // Methods

    @Override
    public int getRuestungswert() {
        return c.getRuestungswert();
    }

    @Override
    public int getTreffpunkte() {
        return (c.getTreffpunkte() + 10);
    }
}
