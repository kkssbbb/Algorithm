import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
class Solution {
 public  static int[] solution(int[] progresses, int[] speeds) {
        /* 
         progresses = [95, 90, 99, 99, 80, 99]  , speeds = [1, 1, 1, 1, 1, 1]
         * [의사코드]
         * progresses[]의 배포완료기간을 구한다.:complet - progresses[0] 이 speeds[0]을 누적하면서 100과 같아지거나 넘는 순간을 카운팅하여 구한다.
         * complet = [5 10 1 1 20 1]
         * complet에서 pollfirst() 한 값과 이전 값들이 낮은지 비교하면서 낮으면 count하여 count 된값을 List에 추가한다.
         * complet가 비어질때까지 반복한다.
         * return [1, 3, 2]
         * 
         * deploymentDay poll한값이랑 peek 값 비교해서 poll한값이 같거나 크면 peek값을 poll하고 둘다 queue에 add하고 size 체크하고 해당값 List에 add
         *   
         * 5 10 1 1 20 1 -> 
         * 
         */
        //[배포 완료기간 구하기]
        Queue<Integer> deploymentDay = calculateDeploymentDays(progresses, speeds);
        Queue<Integer> queue = new ArrayDeque<>();
       // printQueue(deploymentDay); //739
        LinkedList<Integer> answerList = new LinkedList<>();
        
        //10 1 1  20 1 
        while(!deploymentDay.isEmpty()){
            int first = deploymentDay.poll(); //10
            queue.add(first); //10
            Integer peek = deploymentDay.peek(); //1
            while(peek!=null && first >= peek){
                int poll = deploymentDay.poll();//1
                queue.add(poll);
                peek = deploymentDay.peek();
            }
            answerList.add(queue.size()); //1
            queue.clear();
        }



         int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
        public static Queue<Integer> calculateDeploymentDays(int[] progresses, int[] speeds){
        Queue<Integer> deploymentDays = new ArrayDeque<>(); 
        for(int i =0; i<progresses.length; i++){
            int deploymentDay = 0;
            int progress = progresses[i];
            while(progress < 100){
                progress += speeds[i];
                deploymentDay++;
            }
            deploymentDays.add(deploymentDay);           
        }
        return deploymentDays;
    }
}