import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main{

    public static void solution() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {

            String inputN = "";

           String N =  br.readLine();

            TreeSet<Integer> treeSet = new TreeSet<>();

            while ((inputN = br.readLine()) != null) {

                treeSet.add(Integer.parseInt( inputN));
            }

            for (Integer i:
                treeSet ) {
                bw.write(i +"\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        solution();
    }



}