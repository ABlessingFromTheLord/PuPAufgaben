package E05_Strategie_Iterator;

public class Betriebssystem {
    // Fields
    private Strategie strategie;

    // Constructor
    public Betriebssystem(Strategie strategie){
        this.strategie = strategie;
    }

    // Methods
    // Getters
    public Strategie getStrategie() {
        return strategie;
    }

    // Setters
    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }

    @Override
    public String toString(){
        return strategie.getOS();
    }
}
