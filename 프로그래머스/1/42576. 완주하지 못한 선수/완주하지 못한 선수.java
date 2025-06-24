import java.util.HashMap;
class Solution {
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

}