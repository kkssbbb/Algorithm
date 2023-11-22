import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    /*
 입력
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
  */
//길이가 짧은 것부터
    //길이가 같으면 사전순으로
    //중복단어 하나만 남기고 제거
    /*
    solution
    입력 길이순으로 정렬
    if길이가 같다면 사전순으로 정렬
    중복단어 제거 SET 사용
     * */

    /* Ver.2
    * ㄷㄷ 몰랐는데 TreeSet 자료구조는 기본적으로 요소를 크기순으로 정렬하고 , 크기가 같을 경우에는 사전순으로 정렬 해준다.ㅣ;
    *
    * */


    static void solution() {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String n =  br.readLine();


            TreeSet<String> set = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
            //TreeSet 중복허용x, 요소를 오름차순으로 정렬하는 자료구조
            //Comparator.comparingInt(String::length) 문자열의 길이를 기준으로 정렬
            //.thenComparing(Comparator.naturalOrder()) : 길이가 같은 문자열들에 대해서 사전순으로 으로 정렬
            //.thenComparing 

            String inputL;

            while ((inputL = br.readLine()) != null) {

              set.add(inputL);

            }


            //크기순 정렬 정렬
          //  ArrayList<String> list = new ArrayList<>(set);

            //.sort(list, Comparator.comparingInt(String:: length));

            for (String s:
                    set ) {
                System.out.println(s);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public static void main(String[] args) {
        solution();
    }

}