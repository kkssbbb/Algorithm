import java.util.Scanner;

public class Solution {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    StringBuffer sb = new StringBuffer();
    String star = "*";
    for (int i=1; i<=num; i++){
        sb.append(star);
        System.out.println(sb.toString());
    }

}

}