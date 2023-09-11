package E04_Datenstrukturen;// This binary tree is implemented using a linked list data structure

public class Binaerbaum<E>{
    // Fields
    private Binaerbaum leftChild;
    private Binaerbaum rightChild;
    private E Data;
    private Person person;

    // Constructor
    public Binaerbaum(){

    }

    // Methods
    // Getters
    public Binaerbaum getLeftChild() { return this.leftChild; }
    public Binaerbaum getRightChild() { return this.rightChild; }
    public E getData() { return this.Data; }

    public Person getPerson(){ return this.person; }

    // Setters
    public void setLeftChild(Binaerbaum leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(Binaerbaum rightChild) {
        this.rightChild = rightChild;
    }
    public void setData(E data) {
        this.Data = data;
    }
    public void setPerson(Person person) { this.person = person; }

    public void hinzufuegen(Person p){
        if (this.person.getID() <= p.getID()){
            // Adding to right side of tree
            if (this.getLeftChild() != null){
                // there is a left child tree
                this.getLeftChild().hinzufuegen(p);
            }
            else{
                // there is no left child tree
                // initialise a new tree with the new person and add it as left tree
                Binaerbaum newTree = new Binaerbaum();
                newTree.setPerson(p);
                this.setLeftChild(newTree);
            }
        }

        // Adding to the left side of tree
        else {


        }
    }

    public Person finden(int id){

    }

    //Helper methods
    public boolean hasChildren(Binaerbaum baum){
        if(baum.leftChild != null || baum.rightChild != null) { return true };
        return false;
    }

}
