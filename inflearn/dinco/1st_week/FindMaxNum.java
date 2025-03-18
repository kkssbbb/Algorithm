public class FindMaxNum{
    
    
    public static int findMaxNum(int[] arr){
        
        int temp = 0;
        int maxNum = 0;
        for(int num : arr){

            if(num > temp){
                maxNum = num;
                temp = num;
            }
        }



        return maxNum;
    } 
    
    
    
    public static void main(String[] args) {

        int [] test1 = {3, 5, 6, 1, 2, 4};
        int [] test2 = {6, 6, 6};
        int [] test3 = {6, 9, 2, 7, 1888};

        System.out.printf("정답 = 6 / 현재 풀이 값 = %d%n" , findMaxNum(test1));
        System.out.println("정답 = 6 / 현재 풀이 값 = " + findMaxNum(test2));
        System.out.println("정답 = 1888 / 현재 풀이 값 = " + findMaxNum(test3));
    }

    
}