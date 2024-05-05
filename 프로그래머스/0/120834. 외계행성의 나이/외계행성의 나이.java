class Solution {
    public String solution(int age) {
        String answer = "";
        String mers962 = "abcdefghij";
        String ageStr = String.valueOf(age);
        char [] mers962s =  mers962.toCharArray();
            
            
        for(char c : ageStr.toCharArray()){
            
             int num = Character.getNumericValue(c);
        
            answer += mers962s[num];
            
        }
        
        return answer;
    }
}