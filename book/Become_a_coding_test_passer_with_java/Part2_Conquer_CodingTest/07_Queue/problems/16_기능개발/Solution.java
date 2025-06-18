import java.util.Queue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
class Solution{
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
       ArrayList<Integer> answerList = new ArrayList<>();
        
        while(!deploymentDay.isEmpty()){
            int first = deploymentDay.poll();
            queue.add(first); 
            Integer peek = deploymentDay.peek(); 
            while(peek!=null && first >= peek){
                int poll = deploymentDay.poll();
                queue.add(poll);
                peek = deploymentDay.peek();
            }
            answerList.add(queue.size()); 
            queue.clear();
        }


         int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public  static int[] solution2(int[] progresses, int[] speeds) {
        //책 풀이
        /* 
         * progresses = [95, 90, 99, 99, 80, 99]  , speeds = [1, 1, 1, 1, 1, 1] , return = [1,3,2]
         * 배포가능일 = [5 10 1 1 20 1]
         * 
         * [의사코드]
         * 1. 각 작업의 배포 가능일을 구한다.
         * 2. 작업을 진행하며 배포 가능일이 첫 번째 작업일보다 빠른 작업들은 함께 배포한다.
         * 3. 첫 번째 작업의 배포 가능일보다 늦은 작업이 나오면, 2단계와 유사하게 해당 작업의 배포일을 기준으로 뒤의 작업들을 배포한다. 이를 모든 작업이 완료될 때까지 반복한다.
         */

         Queue<Integer> answer = new ArrayDeque<>();
        int n = progresses.length;
        //각 작업의 배포 가능일 계산
        int[] daysLeft = new int[n];
        for(int i=0; i<n; i++){
            daysLeft[i] = (int) Math.ceil((100.0 - progresses[i]) /speeds[i]);
        }

        int count = 0; // 배포될 작업 수 카운트
        int maxDay = daysLeft[0]; //현재 배포될 작업 중 가장 늦게 배포될 작업의 가능일

        for(int i=0; i<n; i++){
            if(daysLeft[i] <= maxDay){ //배포 가능일이 가장 늦은 배포일보다 빠르면
                count++;
            }else{ //배포 예정일이 기준 배포일보다 느리면
            answer.add(count);
            count=1;
            maxDay=daysLeft[i];
        }
        }
        answer.add(count); //마지막으로 카운트된 작업들을 함계 배포
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void printQueue(Queue<Integer> queue){
        for(int i : queue){
            System.out.println(i);
        }
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



    public static void main(String[] args){

        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1}; //5 10 1 1 20 1

        int[] answer = solution(progresses,speeds);
        int[] answer2 = solution2(progresses,speeds);
        System.out.println(Arrays.toString(answer)); // [2,1]
        System.out.println(Arrays.toString(answer2)); // [2,1]
    }
}