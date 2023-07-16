import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;


public class Main {

    public static void solution()  {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int countNum = Integer.parseInt(br.readLine());
            int[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


            int min = Arrays.stream(inputArr).min().getAsInt();
            int max = Arrays.stream(inputArr).max().getAsInt();

            System.out.println(min+" "+max);


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
    public static void main(String[] args) {

        solution();
    }



}
