public class LinkedList{

    private Node head;

    public LinkedList(int value){
        this.head = new Node(value);
    }

    public void append (int value){
        Node cur = this.head;
        
        while (cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(new Node(value));
    }

    public void printAll(){
        Node cur = this.head;
        while (cur != null) {
            System.out.println(cur.getValue());
            cur = cur.getNext();
        } 
    }



    public static void main(String[] args){
        LinkedList list = new LinkedList(5);
        list.append(14);
        list.append(20);
        list.printAll();
    }

}