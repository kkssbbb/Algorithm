import java.util.ArrayDeque;
import java.util.Queue;
class ArrayDequeImpI{
    public static void main(String[] args){

        //ArrayDeque
        Queue<Integer> q = new ArrayDeque();
        
        //추가
        q.add(1);
        q.add(2);
        q.add(3);
        //맨 앞 데이터 제거 후 반환
        int first = q.poll();
        System.out.println(first); //1
        //데이터 추가
        q.add(4);
        q.add(5);
        
        //맨앞 데이터 제거 후 반환
        first = q.poll();
        System.out.println(first); //2
        
        
        //덱을 큐저럼 사용 - 덱(Duble Ended Queue): 양끝에서 삽입 삭제를 할 수 있는 큐
        ArrayDeque<Integer> deque = new ArrayDeque();

        //데이터 추가
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        //맨 앞 데이터 제거 후 반환
        int first2 = deque.pollFirst();
        System.out.println(first2);//1
        //데이터 추가
        deque.addLast(4);
        deque.addLast(5);

        //맨 앞 데이터 제거후 반환
        first2 = deque.pollFirst();
        System.out.println(first2);//2
    }

}