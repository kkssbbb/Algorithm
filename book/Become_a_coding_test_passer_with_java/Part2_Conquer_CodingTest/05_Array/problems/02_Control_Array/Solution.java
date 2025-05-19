import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;
class Solution{
    //문제: 배열의 중복값을 제거하고 배열 데이터를 내림차순으로 정렬해서 반환
    public static int[] solution1(int[] arr){
        //스트림 사용
        //중복제거 distinct() 는 내부적으로 Set을 이용하여 중복제거를 하기때문에 시간복잡도는 O(N) 이다
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        //내림차순 정렬 대부분의 정렬알고리즘(퀵정렬,병합정렬)은 O(NlogN) 이다
        Arrays.sort(result, Collections.reverseOrder());
        //기본 배열로 번환하여 리턴
        int [] answer = Arrays.stream(result).mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static int[] solution2(int[] arr){
        //반복문 사용
        //중복값제거 
        //내림차순 정렬
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for(int num : arr){
            set.add(num);
        }

        int[] result = new int[set.size()];

        for(int i=0; i < result.length; i++){
            result[i] = set.pollFirst();
        }

        return result;
    }
    

    public static void main(String[] args){
        int[] input = {4,2,2,1,3,4};
        int[] answer = solution1(input);
        int[] answer2 = solution2(input);

        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(answer2));
    }
}