import java.util.Deque;
import java.util.ArrayDeque;
class Solution{
    static String  solution(int dicimal) {
        //return : 10진수 받아 2진수 변환
        //dicimal 1이상 10억 미만 자연수
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        while(dicimal > 0){
            int remainder = dicimal % 2;
            stack.push(remainder);
            dicimal = dicimal/2;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }





    public static void main(String[] args){

        int s = 10; // 1010
        int s2 = 27; //11011
        int s3 = 12345; //11000000111001

        String answer = solution(s);
        System.out.println(answer); 
        String answer2 = solution(s2);
        System.out.println(answer2);
        String answer3 = solution(s3);
        System.out.println(answer3);
    }
}