package E10_Template_Composite.Template;

import java.util.ArrayList;
import java.util.List;

public class Aktienkurs {
    // Fields
    private List<Tageskurs> aktienkurs;

    // Constructor
    public Aktienkurs() {
        aktienkurs = new ArrayList<Tageskurs>();
    }

    // Methods
    // Getters
    public List<Tageskurs> getAktienkurs() {
        return this.aktienkurs;
    }
}
