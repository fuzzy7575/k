package chap06;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("학생의 이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("학생의 학년을 정수로 입력하세요.");
        int grade = sc.nextInt();
        System.out.println("학생의 반을 정수로 입력하세요.");
        int classroom = sc.nextInt();
        System.out.println("학생의 키를 실수로 입력하세요.");
        double height = sc.nextDouble();
        System.out.println("학생의 성별을 한개의 문자로 입력하세요.");
        char gender = sc.next().charAt(0);

        StudentVO svo = new StudentVO(grade, classroom, name, height, gender);
        System.out.println("======================");
//        System.out.println(svo.printInformation());
        svo.printInformation();
        System.out.println("======================");
    }
}
