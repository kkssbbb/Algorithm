import java.util.*;


class Solution {
    public int[] solution(int N, int[] stages) {
        /**
        N : 전체 스테이지 개수 (1 ~ 500)
        stages : 유저가 멈처있는 스테이지 번호들, 배열 (1 ~ N+1)
        실패율 공식 : 스테이지 도달 후 아직 클리어 못한 유저 수 / 스테이지 도달 유저 
        return : 실패율이 높은 시테이지 순으로 (내림차) 스테이지 번호들(int[]) 반환
                , 실패율 같으면 작은번호의 스테이지 먼저오도록(오름차)
                , 스테이지에 도달 유저 없는경우 해당 스테이지 실패율은 0으로 정의 
        */
        
        //스테이지 도달 후 클리어 못한 유저수 구하기
        double[] notClear = new double[N];
        for(int i =1; i<=N; i++){
            for(int stage : stages){
                if(i == stage){ //1 
                    notClear[i-1]++;
                }                
            }
        }
        System.out.println("각 스테이지 도달 후 아직 클리어 못한 유저 수 : "+Arrays.toString(notClear));
        //스테이지 도달 유저 구하기 n >= stage
        double[] arrived = new double[N];
        for(int i =1; i<=N; i++){
            for(int stage : stages){
                if(i <= stage){ //1 
                    arrived[i-1]++;
                }                
            }
        }
        //8,7,4,2,1
        System.out.println("각 스테이지 도달 유저 수 : "+Arrays.toString(arrived));
        //각 스테이지 별 실패율 구하기 notClear[i] / arrived[i]
        //스테이지에 도달 유저 없는경우 해당 스테이지 실패율은 0으로 정의 
        Map<Integer,Double> failRateMap = new HashMap<>();
        for(int i =0; i<N; i++){
            if(arrived[i] == 0){
             failRateMap.put(i+1,0D);   
            }else{
                failRateMap.put(i + 1 , notClear[i] / arrived[i]);
            }
        }
        
        System.out.println("===스테이지별 실패율 리스트===");
        List<Map.Entry<Integer,Double>> entryList = new ArrayList<>(failRateMap.entrySet());
        for(Map.Entry<Integer,Double> d : entryList){
            System.out.println(d);
        }
        //실패율 높은 순으로 스테이지 내림차 정렬하기
        //실패율 같으면 작은 번호 스테이지 오도록 제약조건
        Collections.sort(entryList, (o1,o2) -> {
           if(o1.getValue() == o2.getValue()){
               return o1.getKey()  - o2.getKey();
           }
            return o2.getValue().compareTo(o1.getValue());
        });
         System.out.println("===정렬 후 보기===");
        for(Map.Entry<Integer,Double> d : entryList){
            System.out.println(d);
        }
        int[] answer = new int[N];
        int index = 0;
        for(Map.Entry<Integer,Double> d : entryList){
            answer[index] = (int) d.getKey();
            index ++;
        }
        
        return answer;
    }
}