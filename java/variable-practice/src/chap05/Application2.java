package chap05;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 실습문제 2

         * 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 **로 가려서 출력하세요.
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요.(990101-1234567 형식으로 입력) : ");

        String str1 = sc.nextLine();
        String[] strArr1 = new String[str1.length()];

        /* Case 1 */

        System.out.println("/* Case 1 */");
        for(int i=0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(i < 8) {
                strArr1[i] = String.valueOf(ch);
//                System.out.println("i : " + i);
//                System.out.println("strArr1[i] : " + strArr1[i]);
//                System.out.println("strArr1 : " + Arrays.toString(strArr1));
            } else {
                strArr1[i] = "*";
//                System.out.println("i : " + i);
//                System.out.println("strArr1[i] : " + strArr1[i]);
//                System.out.println("strArr1 : " + Arrays.toString(strArr1));
            }
        }
//        System.out.println(Arrays.toString(strArr1));
        for(int i=0; i < str1.length(); i++) {
            System.out.print(strArr1[i]);
        }

        /* Case 2 */

        System.out.println();
        System.out.println("/* Case 2 */");
        for(int i=0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
                strArr1[i] = String.valueOf(ch);
        }

        for(int i=0; i < str1.length(); i++) {
            if(i < 8) {
                System.out.print(strArr1[i]);
            } else {
                System.out.print("*");
            }
        }


    }
}
