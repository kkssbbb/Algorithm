import java.util.Deque;
import java.util.ArrayDeque;
class Solution {
    boolean solution(String s) {
        Deque<Character> q = new ArrayDeque<>();
        
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            q.addLast(c);
        }
        boolean answer = true;
        //count (
        int countA = 0;
        //count )
        int countB = 0;
        for(char c : q){
            if(c =='(') countA++; 
            if(c ==')') countB++;      
        }
        //첫번째 (  && 마지막 ) 확인
        if(!(q.getFirst() == '(' && q.getLast() == ')')) return false;
        
        int countSum = countA + countB;
        if(countSum%2 == 0) answer = true;
        return answer;
    }
}