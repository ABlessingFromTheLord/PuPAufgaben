package E07_Command_Decorator.Decorator;

public class TrankDesEisengolems extends TrankEffectDecorator{
    // Fields
    protected Character character;
    protected String bezeichnung;

    // Constructor
    public TrankDesEisengolems(Character c, String bezeichnung) {
        super(c, bezeichnung);
        this.character = c;
        this.bezeichnung = bezeichnung;
    }

    // Methods
    @Override
    public int getRuestungswert() {
        return 2 *(character.getRuestungswert());
    }

    @Override
    public int getTreffpunkte() {
        return character.getTreffpunkte();
    }
}
