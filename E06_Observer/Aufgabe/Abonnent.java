package E06_Observer.Aufgabe;

import E06_Observer.Beispiel.IAbonnent;
import E06_Observer.Beispiel.Zeitung;

public class Abonnent implements IAbonnent {
    // Fields
    private String Namen;

    // Constructor
    public Abonnent(String namen){
        this.Namen = namen;
    }

    // Methods
    // Getters
    public String getNamen() { return this.Namen; }

    // Setters
    public void setNamen(String namen) { this.Namen = namen; }

    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println(this.Namen + " hat die Zeitung " +
                zeitung.getTitel() + " am " + zeitung.getDatum() + " erhalten.");
    }
}
