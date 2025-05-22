import java.util.*;
class Solution {
        public int[] solution(int N, int[] stages) {

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


}