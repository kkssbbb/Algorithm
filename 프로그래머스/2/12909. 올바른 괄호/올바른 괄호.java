import java.util.Deque;
import java.util.ArrayDeque;
class Solution{
    static boolean  solution(String s) {
        // 빈 문자열 처리
        if(s == null || s.length() == 0) return true;
        boolean answer = false;
        
        //스택 값 초기화
        Deque<Character> deq = new ArrayDeque<>();

        // 첫 문자가 닫힌괄호이거나 마지막 문자가 열린괄호면 false
        if(s.charAt(0) == ')') return false;
        if(s.charAt(s.length() -1) == '(') return false;
        
        //스택에 열린괄호 넣다가 닫힌가로 낳오면 최근의 열린괄호를 pop 한다.
        //그리고 스택에 요소가 있으면 false , 없으면 true 반환.
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                deq.push(s.charAt(i)); //(
            }else if(s.charAt(i) == ')'){
                // 스택이 비어있으면 매칭할 열린괄호가 없으므로 false
                if(deq.isEmpty()) {
                    return false;
                }
                deq.pop();
            }
        }
        // 스택이 비어있으면 모든 괄호가 매칭됨 (true), 아니면 false
        answer = deq.isEmpty();
        
        return answer;
    }
}