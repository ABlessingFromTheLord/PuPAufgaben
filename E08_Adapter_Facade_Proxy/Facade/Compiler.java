package E08_Adapter_Facade_Proxy.Facade;

public class Compiler {
    // Fields
    private Parser parser;
    private Assembler assembler;
    private Linker linker;

    // Constructor
    public Compiler(Parser parser, Assembler assembler, Linker linker) {
        this.parser = parser;
        this.assembler = assembler;
        this.linker = linker;
    }

    // Methods
    public void compile(String sourceFile){
        System.out.println("Compiling file " + sourceFile);

        // Facade
        parser.parse(sourceFile);
        parser.getScanner().scan(sourceFile);
        compileInternal(sourceFile);
        assembler.assemble(sourceFile);
        linker.link(sourceFile);
    }

    public void compileInternal(String sourceFile){
        System.out.println("Compiling internally file " + sourceFile);
    }

}
