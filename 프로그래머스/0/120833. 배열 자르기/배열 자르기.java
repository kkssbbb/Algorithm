import java.util.*;
class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};
    
        List<Integer> nums = new LinkedList<>();
        
        for(int i = 0; i<numbers.length; i++){
            
            if( i>=num1 && i <= num2){
            nums.add(numbers[i]);
            }
            
        } 
        
        return nums.stream().mapToInt(i -> i).toArray();
        
    }
}