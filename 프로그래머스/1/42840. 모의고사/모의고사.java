import java.util.Arrays;
import java.util.ArrayList;


class Solution {
    public int[] solution(int[] answers) {
        
        //1. 수포자들 찍기 패턴 파악 및 초기화
        //2. answers 랑 수포자들 번호와 체크
        //3. 맞출때마다 +1 누적 인덱스로 구분
        //4. 누적된 배열에서 최고점 추출
        //5. 동점자 있는지 체크
        //6. 오름차순 정렬 답 리턴
        
        //1
        int[][] peoplePattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        //2. 3. 
        int[] score = new int[3];
        for(int i=0; i<answers.length; i++){
            for(int k=0; k<peoplePattern.length; k++){
                if(answers[i] == peoplePattern[k][i % peoplePattern[k].length]){
                    score[k] += 1;
                }
            }
        }
        
        //4.
        int maxScore = Arrays.stream(score).max().getAsInt(); 
        
        //5.
        ArrayList<Integer> answer = new ArrayList<>();
        
        int index = 0;
        for(int num : score){
            if(maxScore == num){
                answer.add(index+1);
            }  
            index++;
        }
        
        //6.
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}