package E07_Command.Command_Stack;

public class TestKlasse {
    public static void main(String[] args) {
        CommandManager cm = new CommandManager();
        TextEditor te = new TextEditor("Six foot Seven Foot");
        AppendTextCommand appendTextCommand = new AppendTextCommand(te, "Eight Foot bunch");
        cm.executeCommand(appendTextCommand);


    }
}
