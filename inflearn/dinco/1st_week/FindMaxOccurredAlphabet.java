import java.util.ArrayList;
import java.util.HashMap;

public class FindMaxOccurredAlphabet {
    static char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','a','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public static String result(String str){

        ArrayList<String> strList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap();

        for(char s : str.toCharArray()){
            String strChar = String.valueOf(s);
            if(strChar.equals(" ")){
                continue;
            }

            strList.add(strChar);
        }

        for(char alphabet : alphabets){
            
            int count = 0;
            for(String s : strList){
                if(String.valueOf(s).equals(String.valueOf(alphabet))){
                    count++;
                }
            }
            map.put(String.valueOf(alphabet),count);
        }

        System.out.println(map.entrySet());
        String maxKey = map.entrySet().stream()
        .max( (e1,e2) -> e1.getValue().compareTo(e2.getValue()))
        .get()
        .getKey();



        return maxKey;

    }


    public static void main(String[] args) {
        System.out.println("정답 = i 현재 풀이 값 =" + result("hello my name is dingcodingco"));
        System.out.println("정답 = e 현재 풀이 값 =" + result("we love algorithm"));
        System.out.println("정답 = b 현재 풀이 값 =" + result("best of best youtube"));
    }
}
