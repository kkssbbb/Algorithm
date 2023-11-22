import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {

    //500엔, 100엔, 50엔, 10엔, 5엔, 1엔
    //1000엔 지불
    //1000엔- 물건 가격 = change
    //change > 큰동전
    // 반복 카운트
    // 카운트 출력
    public static void solution()  {


        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int cost = Integer.parseInt(br.readLine());
            int count = 0;
            int change = 1000 - cost;
            //999

            while (change >= 500) {
                if (change >= 500) {
                    change = change - 500;
                    count++;
                }
            }
            while (change >= 100) {
                if (change >= 100) {
                    change = change - 100;
                    count++;
                }
            }
            while (change >= 50) {
                if (change >= 50) {
                    change = change - 50;
                    count++;
                }

            }
            while (change >= 10) {
                if (change >= 10) {
                    change = change - 10;
                    count++;
                }
            }
            while (change >= 5) {
                if (change >= 5) {
                    change = change - 5;
                    count++;
                }
            }
            while (change >= 1) {
                if (change >= 1) {
                    change = change - 1;
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
        e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        solution();
    }



}
