import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] people = new int[3];
        
        //[1,2,3,4,5]
        //1,2,3 수포자 문제 찍기 패턴 파악
        int[][] p = {
            {1,2,3,4,5},
            {2,1,2,3,2,4,2,5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        //가장 많이 맞춘사람 찾기
        for(int i = 0; i<answers.length; i++){
            for(int a = 0; a<p.length; a++){
                if(answers[i]==p[a][i % p[a].length]){
                    people[a]++;
                }
            }
        }
        //가장 높은 점수 체크
        int maxScore = Arrays.stream(people).max().getAsInt();
        
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<people.length; i++){
            if(people[i] == maxScore){
                answer.add(i+1);
            }
        }
        
        //가장 많이 맞춘사람 반환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}