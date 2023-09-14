package E07_Command_Decorator.Command_Stack;

public class AppendTextCommand implements EditorCommand{
    // Fields
    private String textAlt;
    private String textToAppend;
    private TextEditor textEditor;

    // Constructor


    public AppendTextCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.textAlt = textEditor.getText();
        this.textToAppend = text;
    }

    // Methods
    @Override
    public void execute() {
        this.textEditor.aendereText(textEditor.getText() + " " + this.textToAppend);
    }

    @Override
    public void undo() {
        this.textEditor.aendereText(this.textAlt);
    }

}
