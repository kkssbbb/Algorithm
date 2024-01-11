import java.util.*;

public class Solution {
    public int solution(int n) {
   int answer = 0;

         String num =  Integer.toString(n).trim();
         String[] numArr =num.split("");

        for (String str : numArr) {
            answer += Integer.parseInt(str);
        }


        return answer;
}
}