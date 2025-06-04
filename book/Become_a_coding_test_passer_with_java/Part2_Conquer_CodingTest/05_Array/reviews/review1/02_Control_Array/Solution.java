import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
class Solution{

    public static int[] solution(int[] arr){
        // 중복값 제거 , 데이터 내림차순 정렬
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());
        int[] answer = Arrays.stream(result).mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static int[] solution2(int[] arr){
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int n : arr){
            set.add(n);
        }

        int[] answer = new int[set.size()];
        for(int i=0; i < set.size(); i++){
            answer[i] = set.pollFirst();
        }

        return answer;
    }



    public static void main(String[] args){
        int[] input = {4,2,2,1,3,4};
        int[] answer = solution(input);
        int[] answer2 = solution2(input);

        System.out.println(Arrays.toString(answer));
    }
}