import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public static int solution(String s) {
        Deque<String> parentheses = initDeque(s);
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (isValidParentheses(parentheses)) count++;
            changeSequence(parentheses); // 회전
        }
        return count;
    }
    
    // 덱 초기화 (정순 저장)
    private static Deque<String> initDeque(String s) {
        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            deque.addLast(String.valueOf(s.charAt(i))); // addLast()로 순서 유지
        }
        return deque;
    }
    
    // 괄호 유효성 검사 (스택 활용)
    private static boolean isValidParentheses(Deque<String> deque) {
        Deque<String> stack = new ArrayDeque<>();
        for (String ch : deque) {
            if ("([{".contains(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                String top = stack.pop();
                if (!((ch.equals(")") && top.equals("(")) 
                    || (ch.equals("]") && top.equals("[")) 
                    || (ch.equals("}") && top.equals("{")))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    // 덱 회전 (첫 요소를 끝으로 이동)
    private static void changeSequence(Deque<String> deque) {
        if (!deque.isEmpty()) {
            deque.addLast(deque.pollFirst());
        }
    }
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
    }
}