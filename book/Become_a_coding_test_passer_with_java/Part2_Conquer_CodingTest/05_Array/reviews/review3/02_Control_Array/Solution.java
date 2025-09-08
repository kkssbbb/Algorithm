import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Solution {

        public static int[] solution(int[] input){
            //중복 제거, 내림차순
            Integer[] temp = Arrays.stream(input).boxed().distinct().toArray(Integer[]::new);
            Arrays.sort(temp, Collections.reverseOrder());
            int[] answer = Arrays.stream(temp).mapToInt(Integer::intValue).toArray();
            return answer;
        }
        public static int[] solution2(int[] input){

            TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
            
            for(int i : input){
                set.add(i);
            }

            int[] answer = new int[set.size()];
            int size = set.size();
            for(int i = 0; i<size; i++){
                answer[i] = set.pollFirst();
            }

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
