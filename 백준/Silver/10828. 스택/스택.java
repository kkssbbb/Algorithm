import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class Main {


    public static void solution() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

           int testNum = Integer.parseInt(br.readLine());
           String input;
           String[] inputArr = new String[testNum];

           ArrayList<Integer> stack = new ArrayList<>(testNum);

           while ((input = br.readLine() )!= null){

               inputArr = input.split(" ");

               switch (inputArr[0]){


                   case "push":
                       ;
                       int pushNum = Integer.parseInt(inputArr[1]);
                       stack.add(pushNum);
                     //  System.out.println(pushNum);
                       break;
                   case "pop":

                       if (stack.size() > 0) {


                           int removeNum = stack.remove(stack.size() - 1);
                           System.out.println(removeNum);
                       }else {
                           System.out.println(-1);
                       }
                       break;
                   case"size":
                       int stackSize = stack.size();
                       System.out.println(stackSize);
                       ;
                       break;
                   case "empty":
                       if (stack.size() > 0) {
                           System.out.println(0);
                       }else {
                           System.out.println(1);
                       }
                       break;
                   case  "top":
                      if (stack.size() > 0){
                           System.out.println(stack.get(stack.size() - 1));
                       }else {
                       System.out.println(-1);
                   }
                       break;

               }

            }

        } catch (IOException e) {
        }


    }




    public static void main(String[] args) {

        solution();

    }
}