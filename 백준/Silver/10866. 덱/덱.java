import java.io.*;
import java.util.*;

public class Main {

    public static void solution() {

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));) {

            int testNum = Integer.parseInt(bufferedReader.readLine());

            Deque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < testNum; i++) {
                String input = bufferedReader.readLine();
                String[] commandAndNum = input.split(" ");
                String command = commandAndNum[0];

                switch (command) {
                    case "push_front":
                        deque.addFirst(Integer.parseInt(commandAndNum[1]));
                        break;
                    case "push_back":
                        deque.addLast(Integer.parseInt(commandAndNum[1]));
                        break;
                    case "pop_front":
                        if (!deque.isEmpty()) {
                            System.out.println(deque.pollFirst());
                        } else {
                            System.out.println(-1);
                        }
                        break;
                    case "pop_back":
                        if (!deque.isEmpty()) {
                            System.out.println(deque.pollLast());
                        } else {
                            System.out.println(-1);
                        }
                        break;
                    case "size":
                        System.out.println(deque.size());
                        break;
                    case "empty":
                        if (deque.isEmpty()) {
                            System.out.println(1);
                        } else {
                            System.out.println(0);
                        }
                        break;
                    case "front":
                        if (!deque.isEmpty()) {
                            System.out.println(deque.peekFirst());
                        } else {
                            System.out.println(-1);
                        }
                        break;
                    case "back":
                        if (!deque.isEmpty()) {
                            System.out.println(deque.peekLast());
                        } else {
                            System.out.println(-1);
                        }
                        break;

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
