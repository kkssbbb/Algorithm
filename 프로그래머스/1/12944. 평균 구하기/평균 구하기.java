class Solution {
      static double solution(int[] arr) {

        double answer = 0;

        int arrSize = arr.length;
        double sum = 0;

        for(int num : arr){

            sum += num;

        }
        answer = sum/arrSize;


        return answer;
    }

}