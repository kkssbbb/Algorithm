import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void solution() throws IOException {
        // h , m 입력 받음
        // alam 변수 45 넣어줌
        // m - alam (결과가 - 라면 h-1)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int h = Integer.parseInt(inputArr[0]);
        int m = Integer.parseInt( inputArr[1]);
    br.close();

        if (m < 45) {
            h= h-1;

            m = m-45+60;

            if (h<0){
               System.out.println(23+" "+m);
               return;
            }
            System.out.println(h+" "+m);
        }else {
            m= m-45;
            System.out.println(h+" "+m);
        }


    }
    public static void main(String[] args) throws IOException {

        solution();
    }



}
