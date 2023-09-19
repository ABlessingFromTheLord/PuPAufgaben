package E01_Java;

import E01_Java.Student;

import java.util.*;
public class Vorlesung {
    // Fields
    public String bezeichnung;
    public String semester;
    public ArrayList<Student> studenten =
            new ArrayList<Student>();

    // Constructor
    public Vorlesung(String b, String s) {
        bezeichnung = b;
        semester = s;
    }

    // Methods
    public void studentHinzufuegen(Student s) {
        studenten.add(s);
    }

    public void studentEntfernen(Student s) {
        studenten.remove(s);
    }

    public Student sucheStudent(long matrikel) {
        for(int i = 0; i < studenten.size(); i++) {
            Student s = studenten.get(i);
            if(s.matrikel == matrikel) {
                return s;
            }
        }
        return null;
    }
}