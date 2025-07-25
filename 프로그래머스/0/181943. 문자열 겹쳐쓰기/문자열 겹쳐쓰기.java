class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] myString = my_string.toCharArray();
        char[] overwriteString = overwrite_string.toCharArray();
        
        // for문 인덱스 수정!
        for (int i = 0; i < overwriteString.length; i++) {
            myString[s + i] = overwriteString[i];
        }
        
        return String.valueOf(myString);
    }
}