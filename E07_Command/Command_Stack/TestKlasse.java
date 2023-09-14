package E07_Command.Command_Stack;

public class TestKlasse {
    public static void main(String[] args) {
        CommandManager cm = new CommandManager();
        TextEditor te = new TextEditor("Six foot Seven Foot");
        AppendTextCommand appendTextCommand = new AppendTextCommand(te, "Eight Foot bunch");
        cm.executeCommand(appendTextCommand);
        cm.undo();

        // is it to be done like this?
        // command manager only push and pop on stack but should we execute them in
        // its execute and undo methods?
        // using only command manager which calls execute and not
        // executing each command here like appendTextCommand.execute()
        // and appendTextCommand.Undo()?


    }
}
