import java.util.*;
class Solution{
        /*
        실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        N : 전체 스테이지의 개수 
        stages : 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
                  배열안 자연수는 사용자가 현재 도전중인 스테이지, N+1 은 마지막 스테이지 = N번째 까지 클리어했다는 뜻
        return : 실패욜이 높은 스테이지부터 내림차순 정렬 후  return

        제한사항 : 실패율 같은 스테이지있으면 작은 번호의 스테이지가 앞으로
                  스테이지에 도달한 유저가 없는 경우 스테이지 실패율은 0으로 처리

        입출력
            5	[2, 1, 2, 6, 2, 4, 3, 3]  ->	[3,4,2,1,5]
            4	[4,4,4,4,4]  -> 	[4,1,2,3]
         */

        //1 번 스테이지 실패율 : 1/8
        //2 번 스테이지 실패율 : 3/7
        //3 스테이지 의 실패율은? 2/4
        //4번 스테이지 실패율 : 1/2
        //5번 스테이지 실패율 : 0/1
        //6번 스테이지 실패율 : 1/1
    public static int[] solution(int N, int[] stages) {

        //각 스테이지 마다 도달 후 아직 클리어 못한 플레이 수 구하기
        double[] notClearSum = new double[N+2]; // 0인덱스 사용 x -> N+1
        for(int i = 1; i<N+2; i++){
            for(int stage : stages){
                if(i == stage) notClearSum[i]++;
            }
        }
        System.out.println(Arrays.toString(notClearSum));


        //각 스테이지마다 도달한 플레이어 수 구하기 
        double[] arrivedSum = new double[N+2];
        for(int i=1; i<N+2; i++){
            for(int stage : stages){
                if(i <= stage) arrivedSum[i]++;
            }
        }
        System.out.println(Arrays.toString(arrivedSum));
        
        //0번째 인덱스부터 실패율 담기 = 0번째인덱스 == 1 스테이지 실패율
        // 마지막 스테이지 N+1은 제외하고 실패율 계산 
        double[] failRate = new double[N];
        for(int i=1; i<N+1;i++){
            if(arrivedSum[i] == 0) {
                failRate[i-1] = 0; // 스테이지에 도달한 유저가 없는 경우 실패율은 0
            } else {
                failRate[i-1] = notClearSum[i] / arrivedSum[i];
            }
        }
        System.out.println(Arrays.toString(failRate));

        //정렬: 실패율 높은순으로 스테이지 정렬, 동점 스테이지는 숫자가 적은 스테이지가 엎으로
        LinkedHashMap<Integer,Double> stageFailRateMap = new LinkedHashMap<>();
        //map에 각 스테이지 실패율 초기화
        for(int i=1; i<=N; i++){
            stageFailRateMap.put(i,failRate[i-1]);
        }

        for(Map.Entry<Integer,Double> entry : stageFailRateMap.entrySet()){
            System.out.println(entry.getKey() +" : " + entry.getValue());
        }

        //stageFailRateMap 값이 큰순으로 내림차순 정렬
        List<Map.Entry<Integer,Double>> entryList = new ArrayList<>(stageFailRateMap.entrySet());

        // 값(실패율)에 따라 내림차순 정렬, 값이 같으면 키(스테이지 번호)가 작은 것이 앞으로
        Collections.sort(entryList, (o1, o2) -> {
            if (o1.getValue().equals(o2.getValue())) {
                return o1.getKey() - o2.getKey(); // 실패율이 같으면 스테이지 번호 오름차순
            }
            return o2.getValue().compareTo(o1.getValue()); // 실패율 내림차순
        });
        
        // 정렬된 순서대로 스테이지 번호를 배열에 담기
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = entryList.get(i).getKey();
        }



        return answer;
    }





    public static void main(String[] args){

        int[] stages = {2,1,2,6,2,4,3,3};
        int N = 5;

        int[] answer = solution(N, stages);
       System.out.println(Arrays.toString(answer));
        //3 4 2 1 6 5
    }
}