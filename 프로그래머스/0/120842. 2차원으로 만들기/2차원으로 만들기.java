class Solution {
    public  int[][] solution(int[] numberList, int n) {
        int[][] result = new int[numberList.length/n][n];
        for (int i = 0; i < numberList.length / n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = numberList[i * n + j];
            }
        }
        return result;
    }
}