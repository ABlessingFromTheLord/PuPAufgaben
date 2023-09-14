package E07_Command_Decorator.Decorator;

public class TrankDesBarbaren extends TrankEffectDecorator{
    // Fields
    protected Character character;
    protected String bezeichnung;

    // Constructor
    public TrankDesBarbaren(Character c, String bezeichnung) {
        super(c, bezeichnung);
        this.character = c;
        this.bezeichnung = bezeichnung;
    }

    // Methods
    @Override
    public int getRuestungswert() {
        return (character.getRuestungswert()-5);
    }

    @Override
    public int getTreffpunkte() {
        return (character.getTreffpunkte() + 5);
    }
}
