import java.util.Arrays;
import java.util.TreeSet;

class Solution{
    public static int[] solution(int[] numbers) {

        //[2,1,3,4,1]
        
        //0인덱스부터시작헤 뒤에 인덱스를 각각더한다. 
        //treeSet 자료구조로 오름차순,중복 해결
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        //기본형 배열 전환
        int [] result = set.stream().mapToInt(Integer::intValue).toArray();        

        return result;
    }

    public static void main(String[] args){
        int[] input = {2,1,3,4,1};
        int[] answer = solution(input);
        
        System.out.println(Arrays.toString(answer));
    }
}