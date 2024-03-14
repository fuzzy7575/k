package chap05;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 실습문제 1
         *
         * 1. 길이가 5인 String 배열 선언
         * 2. "딸기", "바나나", "복숭아", "키위", "사과"로 초기화
         * 3. 스캐너로 0부터 4까지의 정수를 입력받아
         * 4. 해당 정수의 인덱스에 있는 과일을 출력
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다."를 출력하세요.
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */

        String[] str = new String[5];
        str = new String[] {"딸기", "바나나", "복숭아", "키위", "사과"};

        Scanner sc = new Scanner(System.in);
        System.out.println("0부터 4까지의 정수를 입력하세요: ");
        int inputNum = sc.nextInt();

        if(inputNum == 0){
            System.out.println(str[0]);
        } else if(inputNum == 1){
            System.out.println(str[1]);
        } else if(inputNum == 2){
            System.out.println(str[2]);
        } else if(inputNum == 3){
            System.out.println(str[3]);
        } else if(inputNum == 4){
            System.out.println(str[4]);
        } else {
            System.out.println("준비된 과일이 없습니다.");
        }

        sc.close();

    }
}
