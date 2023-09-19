package E05_Strategie_Iterator.Strategie.Iterator;

import java.util.Queue;

public class BFSIterator extends BinaerbaumIterator {
    // Fields
    private Queue<Knoten> zustand;

    // Constructor
    public BFSIterator(){

    }

    // Methods
    // Getters
    public Queue<Knoten> getZustand() {
        return zustand;
    }

    // Setters
    public void setZustand(Queue<Knoten> zustand) {
        this.zustand = zustand;
    }
}
