import java.util.Stack;
class Solution
{
    public static int solution(String s)
    {
        //s 길이만큼 반복
        Stack<Character> stack = new Stack<>();
        for(char c :  s.toCharArray()){
            //스택에최근 요소랑 c랑비교 같으면 스택 pop
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else stack.push(c);
            //else 스택이 비어있으면 푸시
        }
        return stack.isEmpty() ? 1 : 0;
    }
}