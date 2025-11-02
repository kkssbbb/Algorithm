import java.util.Scanner;
import java.util.Arrays;
class Main{


  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String[] sInput = sc.nextLine().split(" ");

    int a = Integer.parseInt(sInput[0]);
    int b = Integer.parseInt(sInput[1]);
    
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
  }

}