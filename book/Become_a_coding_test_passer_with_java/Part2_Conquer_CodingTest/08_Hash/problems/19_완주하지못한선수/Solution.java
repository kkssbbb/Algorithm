import java.util.HashMap;
public class Solution {
    /* 
    ["mislav", "stanko", "mislav", "ana"] participant = 마라톤에 참가한 선수들의 이름이 담긴 배열 
    ["stanko", "ana", "mislav"] completion = 완주한 선수들의 이름이 담긴 배열
    "mislav" return = 완주하지 못한 선수의 이름을 리턴 
    
    제한
    - 완주하지 못한 사람은 단 한명
    - 
    의사코드
    participant 를 해시맵으로 초기화한다 기본값은 1 로 초기화
    complet 에서 participant 이름이 있으면 각각 +1 누적한다. 
    해시맵에서 값이 홀수 인 키를 찾아서 리턴한다.

    */
    public static String solution(String[] participant, String[] completion) {

        HashMap<String,Integer> map = new HashMap<>();
        //참가자 1로 추기화
        for(String name : participant){
            int count = map.getOrDefault(name,0);//name 없으면 0 반환
            map.put(name,count + 1); 
        }

        //완주자 -1 카운팅 -> 1인사람이 완주 못한사람
        for(String name : completion){
            int count = map.getOrDefault(name,0);//name 없으면 0 반환
            map.put(name,count - 1); 
        }
        String answer = "";

        for(String name : map.keySet()){
            if(map.get(name) == 1){

                return answer = name;
            }
        }
        
        answer = "모두완주";
        return answer;
    }

    public static void main(String[] args){
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"}; 

        System.out.println(solution(participant,completion)); // [1,3,2]
    }

}
