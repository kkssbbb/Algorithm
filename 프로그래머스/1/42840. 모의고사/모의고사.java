import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] answers) {
        //수포자 패턴 초기화
        //answers[i] 와 수포자들 정답과 모두 비교
        //정답시 score에 점수 가산
        //가장 높은 점수 추출
        //가장높은 점수가 여러명일시 오름차순으로 리턴
        
        int[][] supojas = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int[] score = new int[3];
        for(int i=0; i<answers.length; i++){
            for(int k=0; k<supojas.length; k++){
                if(answers[i] == supojas[k][i % supojas[k].length]){
                    score[k]++;
                }
            }
        }
        
        int maxScore = Arrays.stream(score).max().getAsInt();
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i < score.length; i++){
            if(maxScore == score[i]){
                arr.add(i+1);
            }
        }
        
        Collections.sort(arr);
        
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}