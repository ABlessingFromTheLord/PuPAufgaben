package E10_Template_Composite.Composite;

import java.util.Date;

public class Testklasse {
    public static void main(String[] args) {
        // QNS In Vorlesung it says Baumstruktur but why are we using an Arraylist in
        // Vorlesung also?
        // what about printing directories within a directory (recusively?)
;
        Directory rootDirectory = new Directory("Root Directory");
        Directory directory1 = new Directory("Directory 1");
        Directory directory2 = new Directory("Directory 2");
        Directory directory3 = new Directory("Directory 3");
        Directory directory4 = new Directory("Directory 4");
        Directory directory5 = new Directory("Directory 5");
        File file1 = new File("File 1", 1);
        File file2 = new File("File 2", 2);
        File file3 = new File("File 3", 3);
        rootDirectory.add(directory1);
        rootDirectory.add(directory2);
        rootDirectory.add(directory3);
        rootDirectory.add(directory4);
        rootDirectory.add(directory5);
        rootDirectory.add(file1);
        rootDirectory.add(file2);
        rootDirectory.add(file3);

        rootDirectory.print();

    }
}
