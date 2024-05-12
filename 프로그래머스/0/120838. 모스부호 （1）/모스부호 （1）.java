import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] letters = letter.split(" ");
        Map<String,String> morseMap = new HashMap();
        
        StringBuilder sb = new StringBuilder();
        
        morseMap.put(".-","a");
        morseMap.put("-...","b");
        morseMap.put("-.-.","c");
        morseMap.put("-..","d");
        morseMap.put(".","e");
        morseMap.put("..-.","f");
        morseMap.put("--.","g");
        morseMap.put("....","h");
        morseMap.put("..","i");
        morseMap.put(".---","j");
        morseMap.put("-.-","k");
        morseMap.put(".-..","l");
        morseMap.put("--","m");
        morseMap.put("-.","n");
        morseMap.put("---","o");
        morseMap.put(".--.","p");
        morseMap.put("--.-","q");
        morseMap.put(".-.","r");
        morseMap.put("...","s");
        morseMap.put("-","t");
        morseMap.put("..-","u");
        morseMap.put("...-","v");
        morseMap.put(".--","w");
        morseMap.put("-..-","x");
        morseMap.put("-.--","y");
        morseMap.put("--..","z");
        
        for(String l :letters){
            sb.append(morseMap.get(l));
            
        }
        answer = sb.toString();        
        return answer;
    }
}