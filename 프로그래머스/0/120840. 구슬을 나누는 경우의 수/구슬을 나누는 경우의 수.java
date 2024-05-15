class Solution {
   public  int solution(int balls, int share) {
        if (share == 0 || balls == share) {
            return 1;
        }
        if (share > balls / 2) {
            share = balls - share; // C(n, k) == C(n, n-k)
        }
        return getCombination(balls, share);
    }

    public static int getCombination(int n, int k) {
        long result = 1; // 중간 계산 결과를 저장할 변수 (long 타입 사용)

        for (int i = 1; i <= k; i++) {
            result *= (n - (i - 1));
            result /= i;
        }

        return (int) result;
    }
}