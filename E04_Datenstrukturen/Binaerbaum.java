package E04_Datenstrukturen;// This binary tree is implemented using a linked list data structure

public class Binaerbaum <E extends Comparable>{
    // Fields
    private Binaerbaum<E> leftChild;
    private Binaerbaum<E> rightChild;
    private E person;

    // Constructor
    public Binaerbaum(){

    }

    // Methods
    // Getters
    public Binaerbaum<E> getLeftChild() { return this.leftChild; }
    public Binaerbaum<E> getRightChild() { return this.rightChild; }

    public E getPerson(){ return this.person; }

    // Setters
    public void setLeftChild(Binaerbaum leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(Binaerbaum rightChild) {
        this.rightChild = rightChild;
    }
    public void setPerson(E person) { this.person = person; }

    public void hinzufuegen(E p){
        if (this.getPerson() == null){
            this.setPerson(p);
        }
        else if (p.compareTo(this.person) == 0) {
            System.out.println("ID is already in use, please change ID");
        }
        else if (p.compareTo(this.getPerson()) == -1){
            // Adding to left side of tree
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

        // Adding to the right side of tree
        else {
            if (this.getRightChild() != null){
                // there is a right child
                this.getRightChild().hinzufuegen(p);
            }
            else {
                // no right child
                Binaerbaum newTree = new Binaerbaum();
                newTree.setPerson(p);
                this.setRightChild(newTree);
            }

        }
    }

    public E finden(E person){
        // if it is the root node
        if(this.person.compareTo(person) == 0){
            return this.getPerson();
        }

        // it is either of the children
        else if (this.person.compareTo(person) == -1){
         // it is located on the left subtree
            if (this.getLeftChild().person.compareTo(person) == 0){
               return this.getLeftChild().person;
            }
            else{
                // traversing the left subtree
                return this.getLeftChild().finden(person);
            }
        }
        else if (this.person.compareTo(person) == 1) {
            // it is located on the right subtree
            if (this.getRightChild().person.compareTo(person) == 0){
                return this.getRightChild().getPerson();
            }
            else {
                // traversing the right subtree
                return this.getRightChild().finden(person);
            }
        }
        return null;
    }

}
