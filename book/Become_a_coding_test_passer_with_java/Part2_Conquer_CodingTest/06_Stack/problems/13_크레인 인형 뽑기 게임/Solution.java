import java.util.Stack;
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
         * 2차원배열 board[i][0]을 하나의 스택에 담는다: stackBoard (단 board[i][m] 중에 값 0은 스택에 넣지 않는다.)
         * 그리고 stackBoard들을 배열 0인덱스는 편의를위해 건너뛰고 1인덱스부터 담는다. : arrStackBoard 
         * 
         * [계산]
         * moves 길이만큼 반복
         * moves[i]의 값이 n 이라면 arrStackBoard[n]의 stack.pop하여 해당 값을  basket.push() 한다.
         * 
         * basket에서 붙어있는 값들을 제거하여 제거 될때 마다 answer += 2를 한다.
         * 그리고 answer 를 리턴한다. 
        */




        return answer;
    }

    public static void main(String[] args){
        
        int[][] board = {
            {0,0,0,0,0},
            {0,0,1,0,3},
            {0,2,5,0,1},
            {4,2,4,4,2},
            {3,5,1,3,1}
        };
        int[] moves = {1,5,3,5,1,2,1,4};
        /* 
         *  {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,5,0,0},
            {0,2,4,0,2},
            {0,5,1,3,1}
         */
        //
        //4311324
        //4311324
        //pop 1
        //peek 1
        int answer = solution(board,moves);

        System.out.println(answer); // 4

    }
}