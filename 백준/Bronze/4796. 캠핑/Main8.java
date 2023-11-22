import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main8 {

    public static void solution()  {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int caseNum = 1;
            while (true) {
                String[] input = br.readLine().split(" ");
                int[] inputInt = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

                int l = inputInt[0];
                int p = inputInt[1];
                int v = inputInt[2];

                if (l == 0 || p == 0 || v == 0) {
                    break;
                }

                int share = v / p;
                int remain = v % p;
                int day = l * share;
                int result = day + Math.min(remain, l);

                System.out.println("Case " + caseNum + ": " + result);
                caseNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
