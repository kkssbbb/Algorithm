class Solution {
public static String solution(String my_string, int n) {
			String answer = "";
			StringBuffer sb = new StringBuffer();
				
			
			for(int i=0; i<my_string.length(); i++){

						
				for(int y=0; y<n; y++){
					
					sb.append(my_string.charAt(i));
	
				}
			}
			answer = sb.toString();
            return answer;
		
		}
}