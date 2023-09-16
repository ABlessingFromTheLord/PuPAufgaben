package E10_Template_Composite.Composite;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Directory implements FileSystemComponent{
    // Fields
    private String name;
    private ArrayList<FileSystemComponent> directoryFiles;

    // Constructor
    public Directory(String name) {
        this.name = name;
        directoryFiles = new ArrayList<FileSystemComponent>();
    }


    // Methods
    // Getters
    public ArrayList<FileSystemComponent> getDirectoryFiles() {
        return directoryFiles;
    }

    @Override
    public void print() {
        for (FileSystemComponent fsc: directoryFiles) {
            // It is purely a directory
            if (fsc instanceof Directory && (!(fsc instanceof File))){
                System.out.println("Directory name: " +  this.name + ", Size: " + directoryFiles.size());
                fsc.print();
            }
            // It is purely a file
            else if (fsc instanceof File && (!(fsc instanceof Directory))){
                fsc.print();
            }
            // Invalid data type
            else {
                System.out.println("Invalid data type");
            }
        }
    }

    @Override
    public int getSize() {
        return directoryFiles.size();
    }

    public void add(FileSystemComponent fileSystemComponent){
        directoryFiles.add(fileSystemComponent);
    }

    public void remove(FileSystemComponent fileSystemComponent){
        directoryFiles.remove(fileSystemComponent);
    }
}
