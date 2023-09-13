package E07_Command.Command_Stack;

public class TextEditor {
    // Fields
    private String text;

    // Constructor

    public TextEditor(String text) {
        this.text = text;
    }


    // Methods
    // Getters
    public String getText() {
        return this.text;
    }

    public void aendereText(String text){
        this.text = text;
        System.out.println("New text is "+ this.text);
    }

}
