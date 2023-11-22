import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM {
    public static void main(String[] args) {

        //n = 대기줄 인원
        //p = i번 사람이 돈 인출하는데 걸리는 시간
        // answer = 각 사람의 인출시간 총 합

        /*
        * 1 2 3 3 4
        *
        * //최소값을 구하는 거니까
        * //pi 가 가장 적은 순으로 정렬
        * // 각 인출시간 구하고
        * // 다 합하면 answer== piSum 도출
        * */

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))

        {
            int n = Integer.parseInt(br.readLine());
            int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

   //         System.out.println(n);

            int [] sortedInput =  Arrays.stream(input).sorted().toArray();

            int pi = 0;
            int piSum = 0;

            for (int num: sortedInput
                 ) {
                //System.out.println(num);
                pi+= num;
                piSum += pi;
            }

            System.out.println(piSum);



        }catch (IOException e) {

            e.printStackTrace();
        }




    }
}