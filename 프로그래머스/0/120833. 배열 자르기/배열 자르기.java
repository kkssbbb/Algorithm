import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
        //링크드 리스트 생성
        //numbers 크기만큼 반복
        // 배열 져오기
        List<Integer> nums = new ArrayList();
        
        for(int i = 0; i< numbers.length; i++){
            
            if(i>=num1 && i<=num2){
            nums.add(numbers[i]);  
            }
            
        }
        
        answer = nums.stream().mapToInt(i -> i).toArray();
         
        return answer;
    }
}