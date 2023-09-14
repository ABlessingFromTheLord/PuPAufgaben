package E_08_Adapter_Facade_Proxy.Facade;

public class Parser {
    // Fields
    private Scanner scanner;

    // Constructor
    public Parser(Scanner scanner) {
        this.scanner = scanner;
    }

    // Methods
    // Getters
    public Scanner getScanner() {
        return this.scanner;
    }

    public void parse(String sourceFile){
        System.out.println("Parsing file " + sourceFile);
    }
}
