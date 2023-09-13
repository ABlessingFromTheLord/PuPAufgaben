package E07_Command.Command_Stack;

import java.util.Stack;

public class CommandManager {
    // Fields
    private Stack<EditorCommand> undoItems;

    // Constructor


    // Methods
    public void executeCommand(EditorCommand cmd){
        undoItems.push(cmd);
    }

    public void undo(){
    undoItems.pop();
    }

}
