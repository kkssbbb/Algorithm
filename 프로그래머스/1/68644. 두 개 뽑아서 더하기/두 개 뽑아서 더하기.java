import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Collections;
class Solution {
    public int[] solution(int[] numbers) {
    
        //numbers 요소를 큐에 초기화한다.
        //큐 맨 앞 요소를 꺼낸다 -> x
        //x 와 나머지 요소들과 더하고 더한값을 ArrayList에 담는다.
        // 큐가 비어질떄까지 반복
        //ArrayList 중복제거, 오름차정렬, int[] 변환 후 리턴 한다.
        
        Queue<Integer> que = Arrays.stream(numbers)
            .boxed()
            .collect(Collectors.toCollection(LinkedList::new));
        
        LinkedList<Integer> result = new LinkedList<>();
        
        while(!que.isEmpty()){
            Integer x = que.poll();
            for(Integer y : que){
                Integer sum = x + y;
                result.add(sum);
            }
        }
        
        Collections.sort(result);
        
        return result.stream().distinct().mapToInt(Integer::intValue).toArray();
    }
        
}
