package E07_Command_Decorator.Decorator;

public abstract class TrankEffectDecorator implements Character{
    // Fields
    protected Character character;
    protected String bezeichnung;

    // Constructor
    public TrankEffectDecorator(Character Character, String Bezeichnung) {
        character = Character;
        bezeichnung = Bezeichnung;
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
