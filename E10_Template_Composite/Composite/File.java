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
    // Getters
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println("Falename: " + name + ", size: " + this.getSize());
    }

    @Override
    public int getSize() {
        return this.size;
    }

}
