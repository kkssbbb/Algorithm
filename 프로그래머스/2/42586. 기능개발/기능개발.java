import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        /* 
        progresses: 작업 개발 속도
        speeds: 각 작업의 개발 속도
        제한사항: 뒷 순서 작업이 앞 작업보다 먼저 작업 될시 앞 작업이 개발될때 같이 배포된다.
        return: 각 배포시 몇개의 기능이 배포되는지 리턴
        
        의사코드
        각 작업의 배포일을 구한다.: developmentDays [7,3,9]
        작업순서를 비교한다. 
        progresses 크기만큼 반복
        - 우선순위작업을 큐에 넣는다
        - 큐에 추가된 요소와 developmentDays 요소와 비교하여 함께배포되는 작업을 카운트한다.
        - 카운트된값을 리스트에 넣는다.
        - 리스트를 기본형배열로 바꾸어 답을 리턴한다.
        
        */
        int[] developmentDays = calculateDevelopMentDays(progresses, speeds); // [7 3 9]
        
        Queue<Integer> answer = new ArrayDeque<>();
        int n = progresses.length;
        int count = 0;
        int priority = developmentDays[0]; //7
        for(int i=0; i<n; i++){
            if(priority >= developmentDays[i]){ //7
                count++;
            }else{
                answer.add(count);
                count =1;
                priority = developmentDays[i];
            }
        }
            answer.add(count);
        
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static int[] calculateDevelopMentDays(int[] progresses,int[] speeds){
        int[] result = new int[progresses.length];
        //올림 (100-30)/30 = 2.33.. -> 3
        int index =0;
        for(int num : progresses){
          result[index] = (int) Math.ceil((100.0 - num) / speeds[index]);
          index++;
        }
        return result;
        }
}