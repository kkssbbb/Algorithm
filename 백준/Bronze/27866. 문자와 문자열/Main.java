import java.io.*;

public class Main {

    public static void solution() throws IOException {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String l1 = br.readLine();
           // System.out.println(l1);
            int l2 = Integer.parseInt(br.readLine());
           // System.out.println(l2);

           String[] sArr =  l1.split("");

           String result = sArr[l2-1];

            System.out.println(result);


            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws IOException {

        solution();

    }


}
