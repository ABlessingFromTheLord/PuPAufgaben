package E06_Observer;

public class Anzeige implements IChatBeobachter{
    // Fields


    // Constructor
    public Anzeige() {
    }

    // Methods
    @Override
    public void aktualisieren(Nachricht nachricht) {
        System.out.println(" Nachricht würde vom  " + nachricht.getSender()+ " zu " + nachricht.getEmpfaenger()
                + " am " + nachricht.getUhrzeit() + " gesendet");
    }
}
