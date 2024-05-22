import java.util.*;
class Solution {
   public int[]  solution(String my_string) {
      
		int[] findList = {0,1,2,3,4,5,6,7,8,9};
		
		String[] strArr = my_string.split("");
		int count =0;
		
		List<Integer> numList = new ArrayList<>();
		for(int i=0; i<strArr.length; i++){
		  int num = strArr[i].charAt(0) - '0';
		  
		  for(int j=0; j<findList.length; j++){
				if(num == findList[j]){
					numList.add(num);
				}
		  }
			
		}

		int[] answer = new int[numList.size()];
		
		for(int i = 0; i < numList.size(); i++){
			answer[i] = numList.get(i); 
		}
		Arrays.sort(answer);
		
        return answer;
    }
}