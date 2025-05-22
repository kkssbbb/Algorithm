class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
               int[][] matrix = new int[arr1.length][arr2[0].length];
        int sum = 0;
        for(int i=0; i<arr1.length; i++){
            for(int k=0; k<arr2[0].length; k++){
                for(int y=0; y<arr2.length; y++){
                    sum += arr1[i][y] * arr2[y][k]; //00 00 | 01 10 | 02 20 -> 00 01 | 01 11 | 02 21
                }
                matrix[i][k] = sum;
                sum = 0;
            }
        }

        return matrix;
    }
}