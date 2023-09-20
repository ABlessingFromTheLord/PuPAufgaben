package E05_Strategie_Iterator.Iterator;

import java.util.Stack;

public class DFSIterator extends BinaerbaumIterator{
    // Fields
    private Stack<Knoten> zustand;

    // Constructor
    public DFSIterator(){

    }

    // Methods
    // Getters
    public Stack<Knoten> getZustand() {
        return zustand;
    }

    // Setters
    public void setZustand(Stack<Knoten> zustand) {
        this.zustand = zustand;
    }
}
