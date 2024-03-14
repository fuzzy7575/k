package com.ohgiraffers.test1;

public class TestMethod {

    /* 1 */

    public static void Calculator(int number1, int number2) {

        int num1 = number1;
        int num2 = number2;

        System.out.println("두 수를 더한 값은 " + (num1 += num2) + "입니다.");

        num1 = number1;
        System.out.println("첫번째 수에서 두번째 수를 뺀 값은 " +(num1 -= num2) + "입니다.");

        num1 = number1;
        System.out.println("두 수를 곱한 값은 " + (num1 *= num2) + "입니다.");

        num1 = number1;
        System.out.println("첫번째 수를 두번째 수로 나눈 값의 몫은 " + (num1 /= num2) + "입니다.");

        num1 = number1;
        System.out.println("첫번째 수를 두번째 수로 나눈 값의 나머지는 " + (num1 %= num2) + "입니다.");

    }

    public double CircleArea (double num1) {
        final double PI = 3.14;
        // 부피를 구하는 공식 :  원주율 * 반지름 * 반지름
        double result = PI * num1 * num1;
        return result;
    }

    public static String TestRandom () {
        int rand = (int)((Math.random() * 9 )+ 1);
        String result = "생성된 난수의 값은 : " + rand + "입니다.";
        return result;
    }
}
