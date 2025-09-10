import java.util.HashMap;
class Solution {
    public int[] solution(int N, int[] stages) {
        
        
        //각 스태이지별 도전자수 구하기
        int[] players = new int[N+2];
        for(int stage : stages){
            players[stage] += 1;
        }
        
        //스테이지별 실패한 사용자 수 계산
        HashMap<Integer,Double> failRateMap = new HashMap<>();
        double total = stages.length;
        
        //각 스테이지 순회하며, 실패율 계산
        for(int i=1; i<=N; i++){
            // 스테이지 0 이라면 해당 스테이지는 실패율 0
            if(0 == players[i]){
                failRateMap.put(i,0.);
            }else{ //실패율 계산
                failRateMap.put(i, players[i] / total);
                total -= players[i];
            }
        }
        
        //실패율이 같으면 스테이지번호 기준으로 오름차
        return failRateMap.entrySet()
            .stream()
            .sorted((o1,o2) ->
                   o1.getValue().equals(o2.getValue())
                    ?Integer.compare(o1.getKey(),o2.getKey())
                    :Double.compare(o2.getValue(),o1.getValue())
                   )
            .mapToInt(HashMap.Entry::getKey)
            .toArray();
    }
}

