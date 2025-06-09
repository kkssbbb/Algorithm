import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    public int[] solution(int[] prices) {
        //데큐 초기화
        //데큐 에서 첫번째 요소 제거 및 가져온다.
        // 첫번째 요소 N이랑 큐안에 N+i 요소를 비교한다.
        // n <= n+i 일때 count ++;
        //카운트 값 기본형 배열에 삽입
        //데큐 안 요소가 빌때까지 반복
        ArrayDeque<Integer> deque = initDeque(prices);
        int[] answer = new int[deque.size()];

        for(int i : deque){
          //  System.out.println(i);            
        }
        
        int index = 0;
        while(!deque.isEmpty()){
            int first = deque.pollFirst();
            int count = compare(first, deque);
            answer[index] = count;
            index++;
        }
        
        
        return answer;
    }
    
    static ArrayDeque<Integer> initDeque(int[] arr){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i : arr){
            deque.add(i);
        }
        return deque;
    }
    static int compare(int first, ArrayDeque<Integer> deque){
        int count =0;
        for(int num : deque){
                count++;
            if(first > num){
                break;
            }
        }
        return count;
    }
}