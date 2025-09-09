import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        //수포자 패턴에 맞게 수포자 각각 패턴을 배열로 초기화한다.
        //answers 와 수포자 번호와 비교한다.
        //수포자각각 맞을대마다 스코어를 +1 식 가산한다.
        //1위 동점자가 있을시 수포자를 오름차순 하여 리턴한다.
        
        int[][] supojas = {
            {1,2,3,4,5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] scores = new int[3];
        
        for(int i = 0; i<answers.length; i++){
            for(int k =0; k<supojas.length; k++){
                if(answers[i] == supojas[k][i % supojas[k].length]){
                    scores[k]++;
                }
            }
        }
        
        int maxScore = Arrays.stream(scores).max().getAsInt();
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i =0; i<scores.length; i++){
            if(maxScore == scores[i]){
                result.add(i+1);
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}