import java.util.Arrays;

class Solution{

    public static int[] solution(int[] arr){
        
        Arrays.sort(arr);
        return arr;
    }



    public static void main(String[] args){
        int[] input = {4,6,7,2,6};
        int[] answer = solution(input);

        System.out.println(Arrays.toString(answer));
    }
}