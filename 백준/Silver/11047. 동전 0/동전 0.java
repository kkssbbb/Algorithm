import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main{


    /*
     * N = 동전 종류
     * K = 합
     *
     *
10 4200
1
5
10
50
100
500
1000
5000
10000
50000
     * */
    public static void solution() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String[] nk = br.readLine().split(" ");
            int n = Integer.parseInt(nk[0]); //동전 종류 수
            int k = Integer.parseInt(nk[1]); //맞춰야하는 값

            String input;
            ArrayList<Integer> inputArr = new ArrayList<>();

            while ((input = br.readLine()) != null) {

                inputArr.add(Integer.parseInt(input));

            }



            // 리스트 크기체크
           // System.out.println(inputArr.size());

            //Collections를 사용해서 뒤집기 , 리스트 역순 반복 테스트
            Collections.reverse(inputArr);

            //
            int count = 0;
            for (int i = 0; i < n; i++) {
                int coinValue = inputArr.get(i);
                if (k >= coinValue) {
                    int numCoins = k / coinValue;
                    count += numCoins;
                    k -= numCoins * coinValue;
                }
            }

            System.out.println(count);


        } catch (IOException e) {

        }


    }



    public static void main(String[] args) {

   solution();
    }



}