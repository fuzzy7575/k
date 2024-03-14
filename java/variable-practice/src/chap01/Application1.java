package chap01;

public class Application1 {

    public static void main(String[] args) {

        /* 실습문제 1
        정수형 변수 2개를 선언하여,
        각 20과 30으로 초기화 한 후,
        두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요.

        -- 출력 예시 --
        더하기 결과  : 50
        빼기 결과 : -10
        곱하기 결과 : 600
        나누기한 몫 : 0
        나누기한 나머지 : 20
        */

        int inum11 = 20;
        int inum12 = 30;

        System.out.println("더하기 결과  :  " + (inum11 + inum12));
        System.out.println("빼기 결과  :  " + (inum11 - inum12));
        System.out.println("곱하기 결과  :  " + (inum11 * inum12));
        System.out.println("나누기한 몫  :  " + (inum11 / inum12));
        System.out.println("나누기한 나머지  :  " + (inum11 % inum12));



        /* 실습문제 2
        사각형의 넓이와 둘레를 구하여 출력합니다.
        너비 12.5 높이 36.4를 변수에 저장하고,
        넓이와 둘레를 계산한 뒤 변수에 담아 아래와 같이 출력하세요.

        -- 출력 예시 --

        면적 : 455.0
        둘레 : 97.8
        */

        float fnum1 = 12.5f;
        float fnum2 = 36.4f;
        float result11 = fnum1 * fnum2;

        System.out.printf("면적 : %.1f \n",result11);
        System.out.println("면적 :  " + (String.format("%.1f",(fnum1 * fnum2))));
        System.out.println("면적 :  " + (String.format("%.1f",result11)));
        System.out.println("둘레 :  " + ((String.format("%.1f",(fnum1 + fnum2) * 2))));



        /* 실습문제 3
        문자형 변수를 하나 선언하고 'a'를 대입한 후,
        문자 'a'가 가지는 유니코드값을 출력하세요.

        -- 출력 예시 --
        문자 a의 unicode : 97
        */

        char ch = 'a';
        int ich = ch;
        System.out.println("문자 a의 unicode  :  " + (ich));



        /* 실습문제 4
        국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤,
        총점과 평균을 정수 형태로 출력하세요.

        -- 출력 예시 --
        총점 : 201
        평균 : 67
        */

        float fnum11 = 80.5f;
        float fnum12 = 50.6f;
        float fnum13 = 70.8f;

        int result21 = (int) (fnum11 + fnum12 + fnum13);
        int result22 = (int) ((fnum11 + fnum12 + fnum13) / 3);

        System.out.println("총점  :  " + (result21));
        System.out.println("평균  :  " + (result22));

    }
}
