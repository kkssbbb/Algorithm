import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main12 {

    public static void solution() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt( br.readLine());

        String result = "";

        result = (input>=90)?"A" : (input>=80)?"B" : (input>=70)?"C": (input>=60)?"D":"F";

        System.out.println(result);

    }
    public static void main(String[] args) throws IOException {

        solution();
    }



}
