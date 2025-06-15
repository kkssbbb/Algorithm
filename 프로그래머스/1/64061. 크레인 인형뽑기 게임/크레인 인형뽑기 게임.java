import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

class Solution {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        /*
            return: basket에서 터진 인형의 개수
            의사코드
            [초기화]
            2차원배열 board를 list<Stack<Integer>> 로 초기화 : listBasket
            [계산]
            moves의 크기만큼 반복하여 move를 bsket에 push
            - if basket의 제일위의 값이 push하려는 값과 같으면 answer +=2 , basket pop
            [리턴]
            answer  
            
        */
        List<Stack<Integer>> listStackBoard = initListStack(board);
        Stack<Integer> basket = new Stack<>();
        
        for(int i : moves){
            int move = i-1;
            Stack<Integer> stackBoard = listStackBoard.get(move);
            while(!stackBoard.isEmpty()){
                int pop = stackBoard.pop();
                if(pop != 0 ){
                    if(!basket.isEmpty() && pop == basket.peek()){
                        answer +=2;
                        basket.pop();
                    }else{
                        basket.push(pop);
                    }
                    break;
                }
            }
            
        }
        return answer;
    }
        
        
    public static List<Stack<Integer>> initListStack(int[][] board){
        List<Stack<Integer>> ListStack = new ArrayList<>();
        int n = board.length; //열
        int m = board[0].length; //행
        for(int i=0;i<n; i++){
            Stack<Integer> stack = new Stack<>();
            for(int k=m-1; k>=0; k--){
                  stack.push(board[k][i]);
            }
            ListStack.add(stack);
        }
        
        return ListStack;
    }


}




/*
[
[0,0,0,0,0],
[0,0,1,0,3],
[0,2,5,0,1],
[4,2,4,4,2],
[3,5,1,3,1]]
*/