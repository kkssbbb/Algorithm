class Solution {
	    public int solution(int[] box, int n) {
        int answer = 1;
		
		//{a,b,c} 10 * 8 * 6  = 12 volume
		//dice corner  =  n
		for(int i : box){
			answer *= i/n;
		}
		
		
        return answer;
    }
}