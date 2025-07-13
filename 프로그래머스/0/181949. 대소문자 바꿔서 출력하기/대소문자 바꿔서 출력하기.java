import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        /**
        입력받은 문자를 하나씩 대분자인지 소문자인지 구분한다.
        소문자이면 대문자로, 대문자이면 소문자로 바꾼다
        그리고 다시 하나의 문자열로 만든다.
        */
        StringBuilder sb = new StringBuilder();
        for(char c : a.toCharArray()){
            if(Character.isUpperCase(c)){
                sb.append( Character.toLowerCase(c));
            }else{
                sb.append(Character.toUpperCase(c));
            }
        }
System.out.println(sb);
    }
}