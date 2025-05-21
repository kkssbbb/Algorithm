import java.util.Arrays;
import java.util.ArrayList;

class Solution{
    public static int[] solution(int[] answers) {
        //answers	return
        //[1,2,3,4,5,1,2,3,4,5]	[1]
        //[1,3,2,4,2]	[1,2,3]
        
        //수포자 3인방 찍는 패턴
        int[][] peopleScore = {
            {1, 2, 3, 4, 5},
            { 2, 1, 2, 3, 2, 4, 2, 5, },
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        int scores[] = new int[3];
        for(int i=0; i<answers.length; i++){
            for(int k=0; k<peopleScore.length; k++){
                if(answers[i] == peopleScore[k][i% peopleScore[k].length]){
                    scores[k] += 1;
                }
            }
        }

        //최고점수 추출
        int maxScore =  Arrays.stream(scores).max().getAsInt();

        //동점자 있을시 오름차순 리턴
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for (int score : scores){
            if(maxScore == score){
                list.add(index++ + 1);
            }
        }

        return list.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        int[] input = {1,3,2,4,2};
        int[] answer = solution(input);
        
        System.out.println(Arrays.toString(answer));

    }
}