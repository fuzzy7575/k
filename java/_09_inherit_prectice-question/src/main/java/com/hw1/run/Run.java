package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Person;
import com.hw1.model.dto.Student;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Run {

    public static void main(String[] args) {

        /* 문제 1 */
        // 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
        // 위의 사용데이터 참고하여 3명의 학생 정보 초기화
        // 위의 학생 정보 모두 출력 --> 향상된 for문 이용해서


//        Person person1 = new Person();
//        System.out.println(person1.information());

//        Student student1 = new Student();
//        System.out.println(student1.information());

//        Employee employee1 = new Employee();
//        System.out.println(employee1.information());



        Student[] studentsArr1 = new Student[3];

        studentsArr1[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        studentsArr1[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        studentsArr1[2] = new Student("강개순", 23, 167.2, 45.0, 4, "정보통신공학과");

        for(Student s : studentsArr1) {
            System.out.println(s.information());
        }

//        Student[] studentsArr2 = {
//                new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
//                new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
//                new Student("강개순", 23, 167.2, 45.0, 4, "정보통신공학과")
//        };

//        for(Student s : studentsArr2) {
//            System.out.println(s.information());
//        }


        /* 문제 2 */
        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        // 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
        // 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
        // 한 명씩 추가 될 때마다 카운트함

        // 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
        // 현재 기록된 사원들의 정보를 모두 출력

        Run run = new Run();
        run.insertEmployee();

    }

    public void insertEmployee() {

        System.out.println();
        System.out.println("========== 사원정보 관리 ==========");

        Employee[] employeeArr1 = new Employee[10];

        Scanner sc = new Scanner(System.in);
        int count = 0;
        int i =0;
        String str1 = "y";

        while(true) {
            System.out.println("사원정보를 입력합니다. 순서대로 입력하세요.");
            System.out.print("사원이름를 입력하세요. : ");
            String emp1 = sc.nextLine();
            System.out.print("나이를 입력하세요. : ");
            int emp2 = sc.nextInt();
            System.out.print("신장(키)을 입력하세요. : ");
            double emp3 = sc.nextDouble();
            System.out.print("몸무게를 입력하세요. : ");
            double emp4 = sc.nextDouble();
            System.out.print("급여를 입력하세요. : ");
            int emp5 = sc.nextInt();sc.nextLine();
            System.out.print("부서를 입력하세요. : ");
            String emp6 = sc.nextLine();
            System.out.print("계속 추가 하겠습니까? : ");
            String emp7 = sc.nextLine();

            employeeArr1[i] = new Employee(emp1, emp2, emp3, emp4, emp5, emp6);
            i++;

            if(emp7.compareToIgnoreCase(str1) != 0) {
                break;
            }
        }

        for(Employee e : employeeArr1) {
            if(e != null) {
                System.out.println(e.information());
            }
        }

    }
}
