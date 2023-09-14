package E07_Command_Decorator.Command_Stack;

public interface EditorCommand {
    public void execute();
    public void undo();
}
