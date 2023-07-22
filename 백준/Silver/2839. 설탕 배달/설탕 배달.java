import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    //bucketA = 3
    //bucketB = 5

    public static void solution() {

        int count = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {


            int n = Integer.parseInt(br.readLine());

            while (true) {
                if (n % 5 == 0) {
                    System.out.println(n / 5 + count);
                    break;
                } else if (n < 0) {
                    System.out.println(-1);
                    break;
                }
                n= n-3;
                count++;
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void main(String[] args) {

        solution();
    }
}