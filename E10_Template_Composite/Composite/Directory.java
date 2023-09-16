package E10_Template_Composite.Composite;

public class Directory implements FileSystemComponent{
    // Fields
    private String name;

    // Constructor
    public Directory(String name) {
        this.name = name;
    }


    // Methods
    @Override
    public void print() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    public void add(FileSystemComponent fileSystemComponent){

    }

    public void remove(FileSystemComponent fileSystemComponent){

    }
}
