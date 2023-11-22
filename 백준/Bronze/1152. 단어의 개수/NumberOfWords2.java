import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class NumberOfWords2 {

    public static int wordCounter(String[] inputArr) {

        if (inputArr.length ==1 && inputArr[0].isEmpty()){
                return 0;
        }else {

            return (int) Arrays.stream(inputArr).count();
        }
    }

    public static void solution() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readLine = bufferedReader.readLine();
        bufferedReader.close();

        String[] inputArr = readLine.trim().split(" ");

        int countNum = wordCounter(inputArr);

        System.out.println(countNum);

    }





    public static void main(String[] args) throws IOException {

        solution();

    }




}
