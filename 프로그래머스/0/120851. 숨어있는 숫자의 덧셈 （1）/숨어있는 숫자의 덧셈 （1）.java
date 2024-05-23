class Solution {
    public int solution(String my_string) {
     int sum =0;
		for(char s : my_string.toCharArray()){
			
			if(Character.isDigit(s)){
				sum += Character.getNumericValue(s);
			}
		}
		
		return sum;
		
	
    }
}