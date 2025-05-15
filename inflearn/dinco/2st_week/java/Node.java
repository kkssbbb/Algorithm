public class Node {
    
    private int value;
    private Node  next = null;

    public Node(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node node){
        this.next = node;
    }

}
