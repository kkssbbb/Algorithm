class Solution {
    public int solution(int n) {
        int answer = 0;
		int num = 0;
		// n / 1*n  if%0 ->  share
		for(int i = 1; i<=n; i++){
			
		 	if (n%i == 0){
				answer ++;
			}
			
		}
		
        return answer;
    }
}