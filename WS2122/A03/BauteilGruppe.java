package WS2122.A03;

import java.util.ArrayList;

public class BauteilGruppe implements BauwerkKomponente{
    // Fields
    private String id;

    // Constructor
    public BauteilGruppe(String id) {
        this.id = id;
    }

    // Methods
    public void add(BauwerkKomponente b){

    }

    public void remove(BauwerkKomponente b){

    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public ArrayList<BauwerkKomponente> filterBauwerk(String begriff) {
        return null;
    }
}
