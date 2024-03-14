package com.ohgiraffers.test1;

//import static com.ohgiraffers.test1.TestMethod.Calculator;
import com.ohgiraffers.test1.TestMethod;

public class Application {

    public static void main(String[] args) {

        /* 1 */
        byte b = 127;
        short s = 12345;
        int i = 2000000000;
        long l = 999999999999999999L;
        float f = 0.00000005F;
        double d = 3.141216;

        /* 2 */
        int iNum = 1;
        double dNum = 2.5;

        int typeChange = (int)(iNum + dNum);
        System.out.println("int + double 연산 int 형변환 값은: " + typeChange );

        /* 3 */
        String str = (typeChange > 0) ? "양수" : (typeChange == 0) ? "0" : "음수";
        System.out.println("2번 연산의 결과값은 : " + str + "입니다.");

        /* Calculator 복합 대입 연산 출력 */
        TestMethod.Calculator(6,2) ;

        /* CircleArea 원의 부피 구하기 출력 */
        TestMethod ca = new TestMethod();
        double result = ca.CircleArea(5);
        System.out.println("원의 부피는 : " + result);

        /* TestRandom 출력문 출력 */
//        TestMethod.TestRandom();
        System.out.println(TestMethod.TestRandom());

    }

}
