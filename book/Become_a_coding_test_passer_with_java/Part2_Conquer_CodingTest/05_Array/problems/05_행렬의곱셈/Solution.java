import java.util.Arrays;
class Solution{
    public static int[][] solution(int[][] arr1,int[][] arr2) {
        //O(N^3)
        /* 
            [232]
            [424]
            [314]

            [543]
            [241]
            [311]
         */
         //3 * 3
        
        //arr1 ,arr2 행과 열의 수 저장
        int r1 = arr1.length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;

        //두 행렬의 곱을 담을 2차원배열  행 x 열
        int[][] matrix = new int[r1][c2];
        int sum = 0;
        for(int i=0; i < r1; i++){
            for(int k=0; k < c2; k++){
                for(int y=0; y < r2; y++){
                    sum += arr1[i][y] * arr2[y][k]; //00 00 | 01 10 | 02 20 -> 00 01 | 01 11 | 02 21
                }
                matrix[i][k] = sum;
                sum = 0;
            }
        }

        return matrix;
    }

    public static void main(String[] args){
        int[][] arr1 = {{2,3,2},{4,2,4},{3,1,4}};
        int[][] arr2 = {{5,4,3},{2,4,1},{3,1,1}};

        int[][] answer = solution(arr1,arr2);
        
        System.out.println(Arrays.deepToString(answer));

    }
}