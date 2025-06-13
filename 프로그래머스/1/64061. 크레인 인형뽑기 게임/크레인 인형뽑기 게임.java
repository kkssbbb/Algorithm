import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
class Solution {
 public static int solution(int[][] board, int[] moves) {
        /* 
            board = N * M , 바구니 크기 = N * M
            0은 빈칸 1~100은 각기다른 모양의 인형의미
         * 같은 모양에 인형을 쌓으면 두인형은 사라진다.
         * 바구니는모든 인형이 들어 갈만큼의 크기이다.
         * return : 크레인을 모두 작동시킨 후 사라진 인형의 개수 반환
         */
        /*  
         * 의사코드
         * [초기화]
         * 답리턴 int 형 변수 초기화 : answer
         * 인형을 담을 바구니로담을 스택을 초기화한다 : basket
         * 2차원배열 board[i][0]을 하나의 스택에 담는다
         * 그리고 stackBoard들을  List 에 담는다  
         * 
         * [계산]
         * moves 길이만큼 반복
         * moves[i]의 값이 n 이라면 arrStackBoard[n]의 stack.pop하여 해당 값을  basket.push() 한다.
         * 
         * basket에서 바구니가 비어있지않고 맨위 인형과 같으면 제거
         * basket에서 붙어있는 값들을 제거하여 제거 될때 마다 answer += 2를 한다.
         * 그리고 answer 를 리턴한다. 
        */
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        List<Stack<Integer>> stackListBoard = boardToStackList(board);
        printStackListBoard(stackListBoard);
        //04240103
        for(int move : moves){
            move-= 1; //편의를 위해 값을 1줄임
            System.out.println("move : " + move);
            Stack<Integer> stack = stackListBoard.get(move);
            while(!stack.isEmpty()){
                int pop = stack.pop();
                if(pop !=0){
                    //바구니가 비어있지않고, 스택맨위 인형과 같으면 제거하고 answer +2, 아니면 바구니에 푸시
                    if(!basket.isEmpty() && basket.peek() == pop){
                        basket.pop();
                        answer +=2;
                    }else{
                        basket.push(pop);
                    }
                    break;
                }
            }
        }

        //
        for(int i : basket){
            System.out.println("basket : " + i);
        }

        return answer;
    }
    public static void printStackListBoard(List<Stack<Integer>> stackListBoard){
        for(int i = 0; i< stackListBoard.size(); i++){
            System.out.println("stack"+i + "=" +stackListBoard.get(i));
        }
    }
    public static List<Stack<Integer>> boardToStackList(int[][] board){
        int n= board.length; // 행 개수
        int m= board[0].length; //열 개수

        List<Stack<Integer>> stackListBoard = new ArrayList<>();

        for (int col =0; col<m; col++){
            Stack<Integer> stack = new Stack<>();
            for(int row=n-1; row>=0; row--){ //
                System.out.println("row : " +row);
                stack.push(board[row][col]);
            }
            stackListBoard.add(stack);
        }

        return stackListBoard;
    }
}