import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
class Solution{
    //내림차 중복제거
    public static int[] solution(int[] arr){
         Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
         Arrays.sort(result, Collections.reverseOrder());
         int[] answer = Arrays.stream(result).mapToInt(Integer::intValue).toArray();
         return answer;
        }

    public static int[] solution2(int[] arr){
        int[] answer = new int[]{};
        return answer;
    }



    public static void main(String[] args){
        int[] input = {4,2,2,1,3,4};
        int[] answer = solution(input);
        int[] answer2 = solution2(input);

        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(answer2));
    }
}