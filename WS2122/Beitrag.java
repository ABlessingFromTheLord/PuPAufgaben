package WS2122;

public class Beitrag implements IBeitrag{
    // Fields
    private String name;
    public String inhalt;

    // Constructor
    public Beitrag(String name, String inhalt) {
        this.name = name;
        this.inhalt = inhalt;
    }

    // Methods
    @Override
    public String getNutzname() {
        return this.name;
    }

    @Override
    public String getInhalt() {
        return this.inhalt;
    }

}
