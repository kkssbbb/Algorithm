class Solution {
    public int solution(int n) {
        int answer = 0;
        int nx = 0;
        int num = 0;
        
       // 2/n = nx; nx == 2의 배수
        // nx 만큼 2곱하여 answer 저장
       
        nx = n/2;
        
        for(int i=0; i<nx; i++){
            
            answer +=  2; //2 4 6 8 10
            num += answer; // 2
        }
        
        return num;
    }
}