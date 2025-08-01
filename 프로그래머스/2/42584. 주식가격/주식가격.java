import java.util.Stack;
class Solution {
    
    public static int[] solution(int[] prices) {
        //리턴 배열 크기 초기화
        int n = prices.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                int j = stack.pop();
                answer[j] = i-j;
            }
            stack.push(i);
        }
        
        while(!stack.isEmpty()){
            int j = stack.pop();
            answer[j] = n - 1 - j;
        }
        return answer;
    }
}