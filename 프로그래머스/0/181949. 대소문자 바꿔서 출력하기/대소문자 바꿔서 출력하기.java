import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        /**
        문자열을 하나씩 소문자인지 대문자인지 비교한다
        대문자이면 소문자로, 소문자이면 대문자로 바꿔준다.
        */
        String answer = changeCharCase(a);
        System.out.println(answer);
    }
    
    public static String changeCharCase(String str){
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(Character.toLowerCase(c));
            }    
        }
        return sb.toString();
    }
    
}