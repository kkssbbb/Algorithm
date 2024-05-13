class Solution {
 public  int solution(int[] dot) {

		int answer = 0;
		boolean[] checkedNum = valid(dot);

		if(checkedNum[0] == true && checkedNum[1] == true ){	
			answer = 1;
		}
		if(checkedNum[0] == false && checkedNum[1] == true ){	
			answer = 2;
		}
		if(checkedNum[0] == true && checkedNum[1] == false ){	
			answer = 4;
		}
		if(checkedNum[0] == false && checkedNum[1] == false ){	
			answer = 3;
		}

		
		return answer;


    }
	
	public static boolean[] valid (int[] dot){
		
		boolean[] valids = new boolean[2];
		int count = 0;
		
		for(int d : dot){
	
			if(d > 0){
			valids[count] = true;
			}else{
			valids[count] = false;
			}
			count ++;
			
		}
		return valids;
		
	}
}