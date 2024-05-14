import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long goal = sc.nextLong();

        long sum = 0;
        int count = 0;
        
        for (int i = 1; ; i++) {
            sum += i;
            count++;
            
            if (sum > goal) {
                count--; // 합이 goal을 초과하는 경우에는 하나를 빼줘야 함
                break;
            }
        }
        
        System.out.println(count);
    }
}
