package chap04;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*실습문제 1

         * 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요. : ");
        int num1 = sc.nextInt();

        int sum = 0;

        for(int i=1; i<=num1; i++) {
            sum += (i % 2 == 0) ? i : 0;
        }
        System.out.println("1부터 " + num1 + "까지 짝수의 합 : " + sum);



        /* 1부터 입력 받은 정수까지의
        * 2의 배수 또는 3의 배수의 합을 출력하세요.
         */

        System.out.println("정수를 입력하세요. : ");
        int num2 = sc.nextInt();

        int sum2 = 0;

        for(int i=1; i<=num2; i++) {
//            System.out.println("F- i: " + i + "sum: " + sum2);
            sum2 += ((i % 2 == 0 ) || (i % 3 == 0 )) ? i : 0;
            System.out.println("i: " + i + ", sum: " + sum2);
        }
        System.out.println("1부터 " + num2 + "까지 2의 배수 또는 3의 배수의 합 : " + sum2);

    }
}
