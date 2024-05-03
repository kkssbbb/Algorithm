class Solution {
    public String solution(String my_string, String letter) {
StringBuffer sb = new StringBuffer();

		for(char i : my_string.toCharArray()){

			String s = i+"";
			if(!s.equals(letter)){

				sb.append(s);
			}

		}

		return sb.toString();
    }
}