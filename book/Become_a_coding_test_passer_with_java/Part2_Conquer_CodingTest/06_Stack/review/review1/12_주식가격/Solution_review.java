import java.util.Stack;

class Solution {
    
    public static int[] solution(int[] prices) {
        /*
        의사코드
        [초기화]
        답 리턴 : answer[] prices 크기만큼 초기화
        주식기간 계산 스택초기화 : stack
        [계산]
        반복 prices 크기만큼
        - price 의 인덱스번호를 stack에 push 하다가 push하려는 값이 stack.peek() 값보다 작다면
        --해당값의 주식 유지기간 확정(넣을려는 인덱스번호 - pop 되는 인덱스 번호) 그리고 이전 값들 중에 작은 값이 있는지 확인 
        --작은값이 있다면 peek 인덱스번호 - 해단인덱스번호
        --그리고 stack 인덱스가 남아있다면 끝까지 가격이 떨어지지 않은 번호이고 주식유지기간확정
        //[0134]
        //[??1?]
        
        [리턴]
        */
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] > prices[i]){
                //확정
                int pop = stack.pop();
                answer[pop] = i - pop; 
            }
            stack.push(i);
        }


        while(!stack.isEmpty()){
            int length = prices.length - 1;
            int pop = stack.pop();
            answer[pop] = length - pop;
        }
         

        return answer;
    }

    public static void main(String[] args){
        
        int[] input = new int[]{1,2,3,2,3}; //4,3,1,1,0
        
        int[] answer = solution(input);
        for(int i : answer){
            System.out.println(i);
        }

    }
}