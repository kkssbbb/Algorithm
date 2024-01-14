class Solution {
    public int[] solution(long n) {
        String[] a = Long.toString(n).trim().split("");
        int[] answer = new int[a.length];
        int count = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            answer[i] = Integer.parseInt(a[count++]);
        }

        return answer;
    }
}