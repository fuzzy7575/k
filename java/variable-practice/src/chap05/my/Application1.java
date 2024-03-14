package chap05.my;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {

        /* 문제 1-1
        * 회원정보 다차원 문자열(String) 배열로 만들기
         */

        String[] arr1 = {"user01", "pass01", "홍길동", "20", "남", "서울 강동구", "0101234567"};
        String[] arr2 = {"user02", "pass02", "강남구", "32", "남", "서울 강남구", "01023234545"};
        String[] arr3 = {"user03", "pass03", "장옥순", "27", "여", "울릉도 울릉읍", "01045674567"};
        String[] arr4 = {"user04", "pass04", "김순자", "33", "여", "제주 애월읍", "01015882222"};

        String[][] arrUser1 = {arr1, arr2, arr3, arr4};

//        System.out.println("arrUser1 : " + Arrays.toString(arrUser1));    //다차원 배열은 Arrays.toString() 출력시 배열 안에 있는 배열을 가리키는 주소값이 차례로 출력됨
        System.out.println("arrUser1 : " + Arrays.deepToString(arrUser1));  //Arrays.deepToString() 메소드를 사용하여 출력


        /* 문제 1-2
         * 주문정보 다차원 문자열(String) 배열로 만들기
         */



        /* 문제 1-3
         * 제품정보 다차원 문자열(String) 배열로 만들기
         */



        /* 문제 1-4
         * 강남구 회원의 회원정보, 주문정보, 주문한 제품의 제품정보 다차원 문자열(String) 배열로 만들기
         */


    }
}
