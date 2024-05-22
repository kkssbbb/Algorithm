class Solution {
    public String solution(String my_string) {
        String answer = "";
		String[] replace = {"a","e","i","o","u"};
		
		for(String s : replace){
			my_string = my_string.replaceAll(s,"");
		}
		
		answer = my_string;
        return answer;
    }
}