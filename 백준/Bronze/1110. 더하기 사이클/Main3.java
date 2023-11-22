import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(1);
            return;
        }
        int copyN = n;
        int newN = 0;
        int count = 0;

        while( newN != n) {
            newN = copyN;
            count ++;

            if (n < 10) {
                n = n*10 + n;
            }else {
                n = (n%10)*10+((n/10)+(n%10))%10;
            }
        }
        System.out.println(count);

    }



}
