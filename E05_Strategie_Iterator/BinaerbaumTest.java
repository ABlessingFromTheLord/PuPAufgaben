package E05_Strategie_Iterator;

import E04_Datenstrukturen.Binaerbaum;
import E04_Datenstrukturen.Person;

public class BinaerbaumTest {
    public static void main(String[]args){
        Person p1 = new Person("Alice", 102);
        Person p2 = new Person("Bob", 57);
        Person p3 = new Person("Diane", 13);
        Person p4 = new Person("Esther", 78);
        Person p5 = new Person("Hannah", 66);
        Person p6 = new Person("Chris", 451);
        Person p7 = new Person("Fritz", 255);
        Person p8 = new Person("Gianni", 900);
        Person p9 = new Person("Irene", 377);


        E04_Datenstrukturen.Binaerbaum baum = new Binaerbaum();
        baum.hinzufuegen(p1);
        baum.hinzufuegen(p2);
        baum.hinzufuegen(p3);
        baum.hinzufuegen(p4);
        baum.hinzufuegen(p5);
        baum.hinzufuegen(p6);
        baum.hinzufuegen(p7);
        baum.hinzufuegen(p8);
        baum.hinzufuegen(p9);

        // tests
        //System.out.println(baum.finden(66).getName());
        //System.out.println(baum.getRightChild().getLeftChild().getRightChild().getPerson().getName());
    }
}
