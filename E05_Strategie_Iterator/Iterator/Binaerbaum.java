package E05_Strategie_Iterator.Iterator;// This binary tree is implemented using a linked list data structure

import E04_Datenstrukturen.Person;

public class Binaerbaum implements Comparable<Binaerbaum>{
    // Fields
    private Binaerbaum leftChild;
    private Binaerbaum rightChild;
    private Person person;

    // Constructor
    public Binaerbaum(){

    }

    // Methods
    // Getters
    public Binaerbaum getLeftChild() { return this.leftChild; }
    public Binaerbaum getRightChild() { return this.rightChild; }

    public Person getPerson(){ return this.person; }

    // Setters
    public void setLeftChild(Binaerbaum leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(Binaerbaum rightChild) {
        this.rightChild = rightChild;
    }
    public void setPerson(Person person) { this.person = person; }

    public void hinzufuegen(Person p){
        if (this.getPerson() == null){
            this.setPerson(p);
            System.out.println("Succesfully added " + p.getName() + " with ID " + p.getID());
        }
        else if (p.getID() == this.getPerson().getID()) {
            System.out.println("ID is already in use, please change ID");
        }
        else if (p.getID() <= this.getPerson().getID()){
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
                System.out.println("Succesfully added " + p.getName() + " with ID " + p.getID());
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
                System.out.println("Succesfully added " + p.getName() + " with ID " + p.getID());
            }

        }
    }

    public Person finden(int id){
        // if it is the root node
        if(this.getPerson().getID() == id){
            return this.getPerson();
        }

        // it is either of the children
        else if (id <= this.getPerson().getID()){
         // it is located on the left subtree
            if (id == this.getLeftChild().getPerson().getID()){
               return this.getLeftChild().getPerson();
            }
            else{
                // traversing the left subtree
                return this.getLeftChild().finden(id);
            }
        }
        else if (id > this.getPerson().getID()) {
            // it is located on the right subtree
            if (id == this.getRightChild().getPerson().getID()){
                return this.getRightChild().getPerson();
            }
            else {
                // traversing the right subtree
                return this.getRightChild().finden(id);
            }
        }
        return null;
    }

    @Override
    public int compareTo(Binaerbaum o) {
        if (this.getPerson().getID() == o.getPerson().getID()){
            return 0;
        }
        else if (this.getPerson().getID() <= o.getPerson().getID()) {
            return -1;
        }
        else {
            return 1;
        }
    }

    public Iterator<Knoten> createDFSIterator(){
        DFSIterator dsfi = new DFSIterator();
        return null;
    }

    public Iterator<Knoten> createBFSIterator(){
        return null;
    }

}
