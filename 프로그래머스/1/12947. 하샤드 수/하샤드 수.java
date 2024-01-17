import java.util.*;
class Solution {
    public boolean solution(int x) {
      boolean answer = true;
        //x <= 10000
        //18
        //1+8 = 9; target
        //18%9 =0 -> true else false
        String[] strArr = String.valueOf(x).split("");

        int[] intArr = Arrays.stream(strArr)
                .mapToInt(Integer::parseInt)
                .toArray();
        int target = 0;
        for (int n : intArr) {
            target += n;
        }

        return x % target == 0;
    }
}