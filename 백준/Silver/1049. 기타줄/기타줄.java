import java.util.*;

public class Main {
    public static void main(String[] args) {

        //끊어진 기타줄개수 n 기타줄브랜드 m
        //패키지가격 낱개 가결을 입력 받는다.
        //입력받은 가격과 입력받을 가격을 비교해 최서 값이면 변수를 다시 초기화 한다.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int packagePay = sc.nextInt();;
        int eachPay =sc.nextInt();;

        //최소 가격 구하기
        for (int i = 0; i < m-1; i++) {
           int tempPackagePay = sc.nextInt();
           int tempEachPay = sc.nextInt();

           if(packagePay > tempPackagePay){
               packagePay = tempPackagePay;
           }

            if(eachPay > tempEachPay){
                eachPay = tempEachPay;
            }

        }

        //패키지가격 최소값 , 낱개최소값, 패키자와낱개 같이한 최소값 구해서 제일적은 값 리턴

        //패키지만
        int pay=0;
        //n/6, n%6
        pay = packagePay * (n/6);
        if(n%6 >0){
            pay+=packagePay;
        }

        //낱개만
        if(eachPay * n< pay){
            pay = eachPay * n;
        }

        //패키지 낱개 합쳐서
        int packageEachSum = 0;
        packageEachSum = packagePay * (n/6); //20
        packageEachSum += eachPay * (n%6); //
        //패키지 최소값구하기

        if(packageEachSum < pay){
            pay = packageEachSum;
        }

        System.out.println(pay);
    }


}
