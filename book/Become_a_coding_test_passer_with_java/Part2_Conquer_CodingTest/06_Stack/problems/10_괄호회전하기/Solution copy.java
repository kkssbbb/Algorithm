import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;
class Solution {
    public static int solution(String s) {
        Deque<String> deque = initDeque(s); //데큐 초기화
        int count = 0;

        for(int i=0; i<s.length(); i++){//s 길이만큼 반복
            if(isValidParentheses(deque)){//데큐 괄호 유효성 검사 (유효할시 +1카운트 누적)
                count++;
            }
            deque = rotateDeque(deque);//덱회전
        }
        return count;
    }
    
    // 덱 초기화 (정순 저장)
    static private Deque<String> initDeque(String s){
        Deque<String> deque = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            deque.addLast(String.valueOf(s.charAt(i)));
        }
        return deque;
    }
    // 올바른 괄호 유효성 검사 (스택 활용)
    static private boolean isValidParentheses(Deque<String> deque){
        Stack<String> stack = new Stack<>();
        
        for(String str : deque){
            if("([{".contains(str)){
                stack.push(str);
            }else{
                if(stack.isEmpty()) return false;
                String pop = stack.pop();
                if(!(
                        ("(".equals(pop) && str.equals(")")) ||
                        ("[".equals(pop) && str.equals("]")) ||
                        ("{".equals(pop) && str.equals("}")) 
                    )
                ){return false;}
            }
        }
        return stack.isEmpty();
    }
    // 덱 회전 (첫 요소를 끝으로 이동)
    static private Deque<String> rotateDeque(Deque<String> deque){
        deque.addLast(deque.pollFirst());
        return deque;
    }




    public static void main(String[] args){
        
        String s = "[](){}"; // 3
        String s2 = "}]()[{"; // 2
        String s3 = "[)(]"; // 0
        String s4 = "}}}"; // 0

        System.out.println(solution(s)); 
        System.out.println(solution(s2));
        System.out.println(solution(s3));
        System.out.println(solution(s4));

        //[({
        //])}
    }
}