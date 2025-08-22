import java.util.Arrays;

class Main{

    public static int[] solution(int[] arr){
        Arrays.sort(arr);
        return arr;
    }



    public static void main(String[] args){
        int[] input = {4,2,4,5};
        int[] answer = solution(input);
        System.out.println(Arrays.toString(answer));
    }
}