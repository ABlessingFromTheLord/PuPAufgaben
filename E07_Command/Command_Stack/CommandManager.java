package E07_Command.Command_Stack;

import java.util.Stack;

public class CommandManager {
    // Fields
    private Stack<EditorCommand> undoItems = new Stack<EditorCommand>();

    // Constructor


    // Methods
    public void executeCommand(EditorCommand cmd){
        cmd.execute();
        undoItems.push(cmd);
        System.out.println("Stack contents: " + undoItems.toString());
    }

    public void undo(){
        undoItems.peek().undo();
        undoItems.pop();
        System.out.println("Stack contents: " + undoItems.toString());
    }

}
