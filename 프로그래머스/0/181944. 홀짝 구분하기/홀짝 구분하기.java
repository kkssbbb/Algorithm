import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remain = n %2;
        if(remain == 0){
            System.out.println(n + " is even");    
        }else{
            System.out.println(n + " is odd");    
        }
        
    }
}