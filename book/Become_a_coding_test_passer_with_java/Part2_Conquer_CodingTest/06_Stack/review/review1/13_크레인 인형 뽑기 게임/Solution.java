import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
class Solution {
    
   public static int solution(int[][] board, int[] moves) {
    /*
     * 
     * 의사코드
     * [초기화]
     * 값을 리턴할 int형변수초기화 : answer
     * stack 으로 바구니 초기화 : basket
     * board[n][m] 을 List[m]인덱스에 stack[board[n][m]] 값이 들어갈수 있도록 초기화 : ListStackBoard
     * ex: board의[n][0] 의 값들이 List(0)에 stack[34000]으로 들어갈 수 있도록 초기화
     * 
     * [계산]
     * moves크기만큼 요소하나씩 꺼네서 반복 :for(int i: moves)
     * - int move = i-1;
     * -- stack이 비어있지않고 stack의 최근 요소와 pop된 요소가 같으면
     * ---answer +2
     * ---최근 요소 pop
     * --else
     * ---basket.push
     * -break
     * [리턴]
     * answer
     */
    //[초기화]
    int answer = 0;
    Stack<Integer> basket = new Stack<>();
    List<Stack<Integer>> ListStackBoard =  boardToListStack(board);
    printListStackBoard(ListStackBoard);

    //[계산]
    for(int i : moves){
        int move = i-1; //move가 1일때 ListStackBoard 에서 0번째인덱스를 조회하기 위해서 i-1
        Stack<Integer> stack = ListStackBoard.get(move);
        while(!stack.isEmpty()){
            int pop = stack.pop();
            if(pop !=0){
                if(!basket.isEmpty() && basket.peek() == pop){
                    answer += 2;
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
   public static List<Stack<Integer>> boardToListStack(int[][] board){
    List<Stack<Integer>> ListStackBoard = new ArrayList<>();
    int n = board.length;//행 크기
    int m = board[0].length; //열 크기

    for(int i= 0; i<n; i++){
        Stack<Integer> stack = new Stack<>();
        for(int k=n-1; k>=0; k--){
            stack.push(board[k][i]);
        }
        ListStackBoard.add(stack);
    }

    return ListStackBoard;
   }

   public static void printListStackBoard(List<Stack<Integer>> boardToListStack){
    int index = 0;
    for(Stack<Integer> stack : boardToListStack){
        System.out.println("stack"+ index +stack.toString());
        index ++;
    }
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

        //4311324
        int answer = solution(board,moves);

        System.out.println(answer); // 4

    }
}