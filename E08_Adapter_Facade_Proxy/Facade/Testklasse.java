package E08_Adapter_Facade_Proxy.Facade;

public class Testklasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        Parser parser = new Parser(scanner);
        Assembler assembler = new Assembler();
        Linker linker = new Linker();

        Compiler cmp = new Compiler(parser, assembler, linker);
        cmp.compile("SourceFile");

        // QNS: the constructors aren't specified, is it right to instantiate them like this?

    }
}
