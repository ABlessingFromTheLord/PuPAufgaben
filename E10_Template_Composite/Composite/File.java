package E10_Template_Composite.Composite;

public class File implements FileSystemComponent{
    // Fields
    private String name;
    private int size;

    // Constructor
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // Methods
    @Override
    public void print() {

    }

    @Override
    public int getSize() {
        return 0;
    }

}
