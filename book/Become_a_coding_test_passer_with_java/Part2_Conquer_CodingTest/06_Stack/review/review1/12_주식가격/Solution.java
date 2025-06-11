import java.util.Stack;
class Solution {
    
    public static int[] solution(int[] prices) {
        /*
        시간복잡도 : O(N)
        의사코드
        리턴할 기본형 배열 prices 크기로 초기화
        현재 주식보다 이전주식의 가격이 높으면 이전 주식의 길이를 확정
        이전 주식들을 하나씩 보고 현재 주식 가격보다 큰 주식 가격이 있다면 그 주식의 길이를 확정
        길이를 확정한 주식은 이후 계산에서 제외 [핵심]

        정리
        스택을 이용해서 주식가격의 인덱스를 하나씩 주입한다
        처음 주식가격배열의 처음 인덱스0은 비교 대상이 없으므로 0을 주입한다
        그리고 다음 prices[1] 인덱스 1의 값과 최근 스택의주입한 가격을 비교한다
        prices 크기만큼 반복하다가 최근 stack으로 주입한 price의 값이 prices[n] 보다 가격이 낮아지는 순간이오면
        최근 스택에 주입된 price 값의 기간을 확정지어 answer[] 에 값을 초기화한다,

        반복하다가 스택에는 끝까지 가격이 떨어지지 않는 주식가격의 인덱스가 남게되고 스택을 비우면서 주식이 떨어지지않는 기간을 구한다.

        */
       int[] answer = new int[prices.length];
       Stack<Integer> stack = new Stack<>();
       stack.push(0);

       for(int i=1; i<prices.length; i++){
        while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
            int pop = stack.pop();
            answer[pop] = i - pop;
        }
        stack.push(i);
       }

        while(!stack.isEmpty()){
            int pop = stack.pop();
            answer[pop] = prices.length - 1 - pop;
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