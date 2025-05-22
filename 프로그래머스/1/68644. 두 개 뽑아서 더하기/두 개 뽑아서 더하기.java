import java.util.TreeSet;

class Solution {
 public int[] solution(int[] numbers) {
        
        //numbers의 서로다른 인덱스 합 , 오름차순, 중복제거
        //[2,1,3,4,1] ,[5,0,2,7]
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int k=i+1; k<numbers.length; k++){
                int sum = numbers[i] + numbers[k];
                set.add(sum);
            }
        }        
        
        //일반배열 변환
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();


        return answer;
 }
}