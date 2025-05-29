import java.util.Stack;
class Solution {

    public static int solution(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && c == stack.peek()){ //스택이 비어있지않고, c랑 stack.pop 이랑 같으면 버림
                stack.pop();
            }else{ // 아니면 스택에 푸시
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }


    public static void main(String[] args){
        
        //String s = "baabaa"; // 1
        String s = "baabaa"; // 1
        String s2 = "cdcd"; // 0

        System.out.println(solution(s)); 
        System.out.println(solution(s2));
    }
}