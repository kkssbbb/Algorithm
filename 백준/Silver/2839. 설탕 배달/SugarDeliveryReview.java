import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDeliveryReview {

    //봉지 3 ,5

    public static int EnvelopeCountCalculator(int sugarWeight) {
        int count = 0;

        while (true) {
            if (sugarWeight % 5 == 0) {
                 count += sugarWeight / 5;
                 break;
            } else if (sugarWeight < 0) {
                count = -1;
                break;
            }
            sugarWeight = sugarWeight - 3;

            count++;
        }
        return  count;
    }

    public static int solution() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sugarWeight = Integer.parseInt(bufferedReader.readLine());

        return EnvelopeCountCalculator(sugarWeight);



    }


    public static void main(String[] args) throws IOException {

        System.out.println(solution());
    }




}
