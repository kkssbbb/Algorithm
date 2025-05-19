import java.util.Arrays;
import java.util.Comparator;

public class Main{

    private static class Node {
        int dest, cost;

        public Node(int dest, int cost){
            this.dest = dest;
            this.cost = cost;
        }

    }


    public static void main(String[] args){
        Node[] nodes = new Node[5];
        nodes[0] = new Node(1, 10);
        nodes[1] = new Node(2, 20);
        nodes[2] = new Node(3, 15);
        nodes[3] = new Node(4, 5);
        nodes[4] = new Node(1, 25);

        Arrays.sort(nodes, (a, b) -> Integer.compare(a.cost, b.cost) );

        Arrays.sort(nodes, new Comparator<Node>() {
            @Override
            public int compare(Node a , Node b){
                return Integer.compare(a.cost, b.cost);
            }
        });

    }
}