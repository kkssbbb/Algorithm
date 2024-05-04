class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int 양꼬치 = 12000;
        int 음료수 = 2000;
        int service= 0;
        if(n >= 10){
            service = n/10;
            System.out.println(n/10);
            System.out.println(k);
        }
         System.out.println(양꼬치 * n);
        System.out.println(음료수 * k);
        System.out.println(service * 음료수);
        
        answer = 양꼬치 * n + 음료수 * k - service * 음료수; 
        
        
        return answer;
    }
}