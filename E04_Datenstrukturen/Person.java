package E04_Datenstrukturen;

public class Person implements Comparable<Person>{
    // Fields
    private String N;
    private int id;

    // Constructor
    public Person(String Name, int ID){
        this.N = Name;
        this.id = ID;
    }

    // Methods
    // Getters
    public String getName() {
        return this.N;
    }

    public int getID() {
        return this.id;
    }

    // Setters
    public void setName(String Name) {
        this.N = Name;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getID() == o.getID()){
            return 0;
        }
        else if (this.getID() <= o.getID()) {
            return -1;
        }
        else {
            return 1;
        }
    }
}
