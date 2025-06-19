import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Arrays;
class Solution{
    public  static int[] solution(int[] progresses, int[] speeds) {
        /* 
         * progresses [93, 30, 55]	speeds[1, 30, 5]	return[2, 1]
         * 
         * 작업별 배포 가능일 수 계산. - [7 3 9]
         * 
         * 우선순위작업 배포 가능일수 와 후순위 작업 배포가능일수를 비교한다.
         * 우선작업일수 >= 후순위작업일수 면 count++
         * 후순위작업일수가더크다면 count = 1
         * 
         */

         //배포 가능일수 계산
         int[] developmentDays = calculateDevelopMentDays(progresses,speeds);

        Queue<Integer> answer = new ArrayDeque<>();
        //우선순위, 후순위 배포일수 비교
        int n = progresses.length;
        int count = 0;
        int priority = developmentDays[0]; //93
        for(int i =0; i<n; i++){
            if(priority >= developmentDays[i]){ //우선작업일수가 후순위 작업일수보다 크거나 같다면
                count ++;
            }else{
                answer.add(count);
                count = 1;
                priority = developmentDays[i];
            }
        }
        answer.add(count); //마지막작업일수
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] calculateDevelopMentDays(int[] progresses, int[] speeds){
        int[] result = new int[progresses.length];
        int n = progresses.length;
        for(int i=0; i<n; i++){
            result[i] = (int) Math.ceil((100.0-progresses[i])/speeds[i]); //(100 - 30) / 30 = 2.3 (올림) -> 3
        }
        return result;
    }
}