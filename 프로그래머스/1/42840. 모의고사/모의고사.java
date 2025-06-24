import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public static int[] solution(int[] answers) {
        int[][] peopleAnswer = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] score = new int[3];

        for(int i=0; i<answers.length; i++){
            for(int k=0; k<peopleAnswer.length; k++){
                if(answers[i] == peopleAnswer[k][i % peopleAnswer[k].length]){
                    score[k] += 1; 
                }
            }
        }

        int maxScore = Arrays.stream(score).max().getAsInt();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<score.length; i++){
            if(maxScore == score[i]){
                answer.add(i+1);
            }
        }
        
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}