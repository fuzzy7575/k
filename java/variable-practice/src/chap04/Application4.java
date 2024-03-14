package chap04;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*실습문제 4

         * 열심히 일한 판다가 급여를 계산해 보려고 합니다.
         * 월 급여액과 월 매출액을 입력받아 급여를 산정합니다.
         * 축제 운영 사원은 매출액 대비 보너스율에 명시된 보너스를, 급여 외에 추가로 지급받습니다.
         *
         * 단, 보너스율은 입력 받은 월 매출액에 비례하며,
         * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산합니다.
         *
         * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어 보세요.
         *
         * -- 총 급여 계산식 --
         * 총 급여 = 월 급여  + (매출액 * 보너스율)
         *
         * -- 매출액 대비 보너스율 --
         *   매출액       보너스율
         * 5천만원 이상      5%
         * 3천만원 이상      3%
         * 1천만원 이상      1%
         * 1천만원 미만      0%
         *
         * -- 입력 예시 --
         * 월 급여 입력 : 3000000
         * 매출액 입력 : 20000000
         *
         * -- 출력 예시 --
         * ======================
         * 매출액 : 20000000
         * 보너스율 : 1%
         * 월 급여 : 3000000
         * 보너스 금액 : 200000
         * ======================
         * 총 급여 : 3200000
         * */

        Scanner sc = new Scanner(System.in);

        System.out.println("월 급여액을 입력하세요. : ");
        int num1 = sc.nextInt();
        System.out.println("월 매출액을 입력하세요. : ");
        int num2 = sc.nextInt();

        int bonus = 0;
        int bonusRate = 0;

        if (num2 >= 50000000) {
            bonusRate = 5;
        } else if (num2 >= 30000000 && num2 < 50000000) {
            bonusRate = 3;
        } else if (num2 >= 10000000 && num2 < 30000000) {
            bonusRate = 1;
        } else {
            bonusRate = 0;
        }

        bonus = (num2 * bonusRate) / 100;
        /*
        * bonus = num2 * (bonusRate / 100); 이 정확하지만,
        * 보너스 금액이 0원이 아니면 100원 이상일것 이기에
        * 정수로 계산을 처리하기 위해 식을 변형함
        * */

        System.out.println("======================");
        System.out.println("매출액 : " + num2);
        System.out.println("보너스율 : " + bonusRate + "%");
        System.out.println("월 급여 : " + num1);
        System.out.println("보너스 금액 : " + bonus);
        System.out.println("======================");
        System.out.println("총 급여 : " + (num1 + bonus));
    }
}
