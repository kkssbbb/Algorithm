import java.util.Arrays;
class Solution{
/* 
 * Arrays.sort() 는 원본 배열을 수정한다.
 * 원본 배열 복사는 clone() 사용
 */
    public static int[] solution(int[] arr){

        int[] tempArr = arr.clone();
        Arrays.sort(tempArr);
        return tempArr;

    }
    

    public static void main(String[] args){
        int[] input = {4,6,7,2,6};
        int[] answer = solution(input);

        System.out.println(Arrays.toString(answer));
    }
}