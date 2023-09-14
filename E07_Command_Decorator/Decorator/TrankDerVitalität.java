package E07_Command_Decorator.Decorator;

public class TrankDerVitalität extends TrankEffectDecorator{
    // Fields
    private Character character;
    private String bezeichnung;

    // Constructor
    public TrankDerVitalität(Character c, String bezeichnung) {
        super(c, bezeichnung);
        this.character = c;
        this.bezeichnung = bezeichnung;
    }

    // Methods
    @Override
    public int getRuestungswert() {
        return character.getRuestungswert();
    }

    @Override
    public int getTreffpunkte() {
        return (character.getTreffpunkte() + 10);
    }
}
