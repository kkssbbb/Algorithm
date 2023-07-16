import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void solution()  {
        // currentTime= 첫줄 입력 현재시각
        // makingTime = 조리시간 분 단위

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            int[] currentTime = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int makingTime = Integer.parseInt(br.readLine());

            int m = currentTime[1] + makingTime;
            int newM = 0;
            int newH = 0;

                newH = (currentTime[0])+(m/60);
                newM =  m%60;

                if (newH>=24){

                    newH = newH%24;
                }
            System.out.println( newH +" "+newM );




        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {

        solution();
    }



}
