package E07_Command_Decorator.Decorator;

public class Testklasse {
    public static void main(String[] args) {
        // QNS:
        // the interface is not completely implemented in subclasses
        // Waeldlaeufer, Magier and not at all in TrankEffectDecorator
        // just leave them without body?

        Character magier = new TrankDesBarbaren(
                new TrankDesEisengolems(
                        new TrankDerVitalität(new Magier(),
                                "Magier"),
                        "Magier"),
                "Magier");
        System.out.println("Magier hat " + magier.getTreffpunkte() + " Treffpunkte" + " und " +
                " " + magier.getRuestungswert() + " Ruestungspunkte");


        Character waldlaeufer = new TrankDesBarbaren(
                new TrankDesEisengolems(
                        new TrankDerVitalität(new Waldlaeufer(), "Waldlaeufer")
                        , "Waldlaeufer"),
                " Waldlaeufer");
        System.out.println("Waldlaeufer hat " + waldlaeufer.getRuestungswert() + " Ruestungspunte und "
                + waldlaeufer.getTreffpunkte() + " Treffpunkte");

    }
}
