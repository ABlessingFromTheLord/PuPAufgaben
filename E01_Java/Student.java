package E01_Java;

import java.util.ArrayList;

public class Student {
    // Fields
    public String name;
    public  long matrikel;
    public Computer computer;
    public ArrayList<Vorlesung> vorlesungen = new ArrayList<Vorlesung>();

    // Constructor
    public Student(String n, long m){
        name = n;
        matrikel = m;
    }

    // Methods
    public void vorlesungHinzufuegen(Vorlesung vorlesung){
        vorlesungen.add(vorlesung);
    }

    public void vorlesungEntfernen(Vorlesung vorlesung){
        vorlesungen.remove(vorlesung);
    }
}
