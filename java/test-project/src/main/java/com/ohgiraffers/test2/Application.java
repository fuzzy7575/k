package com.ohgiraffers.test2;

import com.ohgiraffers.test1.TestMethod;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        /* 1 */
        TestMethod.Calculator(2,4);


        /* 2 */
        TestMethod tm = new TestMethod();

        Scanner sc = new Scanner(System.in);

        System.out.println("=====원의 부피 계산기=====");
        System.out.println("원의 반지름을 입력하세요.");
//        sc.nextInt();
        double inputNum = sc.nextDouble();
        double resultNum = tm.CircleArea(inputNum);

        System.out.println("원의 부피는 " + resultNum +"입니다.");
//        System.out.println("원의 부피는 " + (tm.CircleArea(inputNum)) +"입니다.");

        System.out.println("=====원의 부피 계산기=====");


        /* 3 */
        String rt = TestMethod.TestRandom();
        System.out.println(rt);






    }
}
