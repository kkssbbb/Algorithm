

import java.io.*;

public class Main6 {

    public static void solution() throws IOException {

        //테스트 케이스 갯수를 첫줄에 입력받는다.
        //테스트 케이스 갯수데로 반복문을 돌린다.
        //다음 줄 입력을 받는다.
        //split을 사용해 반복 수와 문자를 나눈다.
        //반복한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        //System.out.println(T);

        for (int i = 0; i < T; i++) {
            StringBuilder sb = new StringBuilder();
            String[] input =  br.readLine().split(" ");

            int r = 0;
            String s = "";

            r = Integer.parseInt(input[0]);
            s = input[1];

            String[] sArr =  s.split("");

            for (int j = 0; j < sArr.length; j++) {
                for(int k =0; k< r; k++) {
                    sb.append(sArr[j]);

                }
            }
            System.out.println(sb.toString());


        }
        br.close();




    }

    public static void main(String[] args) throws IOException {

        solution();

    }


}
