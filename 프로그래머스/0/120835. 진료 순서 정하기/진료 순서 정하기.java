import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
               int[] copyEmergency = emergency.clone();
        Arrays.sort(copyEmergency);

      
        List<Integer> list = new ArrayList<>();
        for (int i : copyEmergency) {
            list.add(i);
        }

        Collections.reverse(list);

        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = list.indexOf(emergency[i]) + 1;
        }

        return answer;
    }
}