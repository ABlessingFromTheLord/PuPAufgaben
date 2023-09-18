package WS2122.A03;

import java.util.ArrayList;

public class Bauteil implements BauwerkKomponente{
    // Fields
    private String id;

    // Constructor
    public Bauteil(String id) {
        this.id = id;
    }

    // Methods
    @Override
    public String getID() {
        return null;
    }

    @Override
    public ArrayList<BauwerkKomponente> filterBauwerk(String begriff) {
        return null;
    }
}
