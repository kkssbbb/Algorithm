import java.util.Scanner;
import java.util.Arrays;

class Main{

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[] nArr = new int[n];
    for(int i=0; i<n; i++){
      nArr[i] = sc.nextInt();
    }

    int m = sc.nextInt();

    int[] mArr = new int[m];
    for(int i = 0; i<m; i++){
      mArr[i] = sc.nextInt();
    }

    //정렬
    Arrays.sort(nArr);
  

    int[] answer = new int[m];
    
    int i = 0;
    for(int num : mArr){
      if( binarySearch(nArr,num) ){
        answer[i] = 1;
      }else{
        answer[i] = 0;
      }
      i = i + 1;
    }

    for(int a : answer){
       System.out.println(a);
    }
   }

  public static boolean binarySearch(int[] arr, int target) {

    int left = 0;
    int right = arr.length - 1;

    while(left <= right){
      
      int mid = (left + right) / 2;

      if(arr[mid] == target){
        return true;
      }

      if(arr[mid] < target){
        left = mid + 1;
      }else{
        right = mid - 1;
      }


    }

    return false;

  }

  
}