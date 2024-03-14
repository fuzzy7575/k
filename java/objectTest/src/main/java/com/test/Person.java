package com.test;

import java.util.Scanner;

public class Person {

    /*
    * 사람의 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스) --- 캡슐화
    * */

    private String name;
    private int age;
    private String nationality;
    private Puppy myPuppy;

    Scanner sc = new Scanner(System.in);

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public Person(String name, int age, String nationality, Puppy myPuppy) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.myPuppy = myPuppy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {

        if(nationality == "한국" || nationality == "일본" || nationality == "중국" || nationality == "홍콩" || nationality == "터키") {
            this.nationality = nationality;
        } else {
            System.out.println("잘못 입력하셨습니다, 기본 국가인 한국으로 설정됩니다.");
            this.nationality = "한국";
        }

    }
    public void setNationality2(String nationality) {
        switch (nationality) {
            case "한국" :
                this.nationality = nationality;
                break;
            case "일본" :
                this.nationality = nationality;
                break;
            case "중국" :
                this.nationality = nationality;
                break;
            case "홍콩" :
                this.nationality = nationality;
                break;
            case "터키" :
                this.nationality = nationality;
                break;
            default :
                System.out.println("잘못 입력하셨습니다, 기본 국가인 한국으로 설정됩니다.");
                this.nationality = "한국";
                break;
        }
    }
    public void setNationality3(String nationality) {
        /* String[] 국적배열 만든 후 반복문, 조건문 작성 */
        String[] nationArr = {"한국", "일본", "중국", "홍콩", "터키"};

        for(int i = 0; i < nationArr.length; i++) {
//            System.out.println("nationArr1 는? : " + nationArr[i]);
            if (nationArr[i] == nationality) {
//                System.out.println("nationArr2 는? : " + nationArr[i]);
                this.nationality = nationality;
                System.out.println("국적이 " + nationality + "으로 설정됩니다.");
                return;
            }
        }
        System.out.println("잘못 입력하셨습니다, 기본 국가인 한국으로 설정됩니다.");
        this.nationality = "한국";
    }
    public void setNationality4(String nationality) {
        /* String[] 국적배열 만든 후 반복문, 조건문 작성 */
        String[] nationArr = {"한국", "일본", "중국", "홍콩", "터키"};
        for(int i = 0; i < nationArr.length; i++) {
//            System.out.println("nationArr1 는? : " + nationArr[i]);
            if(nationArr[i].equals(nationality)) {
//                System.out.println("nationArr2 는? : " + nationArr[i]);
                this.nationality = nationality;
                System.out.println("국적이 " + nationality + "으로 설정됩니다.");
                return;
            }
        }
        System.out.println("잘못 입력하셨습니다, 기본 국가인 한국으로 설정됩니다.");
        this.nationality = "한국";

    }
    public void setNationality5(String nationality) {
        /* String[] 국적배열 만든 후 반복문, 조건문 작성 */
        String[] nationArr = {"한국", "일본", "중국", "홍콩", "터키"};
        for(String s : nationArr) {
//            System.out.println("s1 는? : " + s);
//            if(nationality.equals(s)) {

            if(s.equals(nationality)) {
//                System.out.println("s2 는? : " + s);
                this.nationality = nationality;
                return;

            }
        }
        System.out.println("잘못 입력하셨습니다, 기본 국가인 한국으로 설정됩니다.");
        this.nationality = "한국";

    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setMyPuppy(Puppy myPuppy) {
        this.myPuppy = myPuppy;
    }

    public Puppy getMyPuppy() {
        return myPuppy;
    }



    public void adoptDog() {
        /*
        * 강아지 이름을 입력받고,
        * 입력받은 이름을 속성으로 강아지 객체 생성하여
        * 이 사람의 강아지로 설정
        * */

//        Scanner sc = new Scanner(System.in);
        System.out.println("강아지 이름을 입력하세요. : ");
        String puppyName = sc.nextLine();

//        myPuppy.setName(puppyName);

//        setMyPuppy(new Puppy(puppyName));

        this.myPuppy = new Puppy(puppyName);

        System.out.println("강아지 이름은? : " + (myPuppy.getName()));

    }

    public void teachDog(String[] ability) {
        /* 내 강아지의 재주를 설정 */

        this.myPuppy.learnAblity(ability);

    }

    public void orderToDog() {
        /*
        * 1. void 메소드 출력
        * 2. String으로 변경하여 출력
        *    출력예시) 뽀삐는 앉아!를 할 수 있어요 :) or 뽀삐는 짖어!를 배우지 않았어요.
        * 3. boolean으로 변경하여 출력
        *    출력예시) 뽀삐는 앉아!를 배웠어요!! or 짖어!를 할 수 없어요. */

        //강아지에게 재주를 시키면 어떤 재주를 시킬지 입력받는다. (=Person의 메소드 호출)
        System.out.println("강아지에게 시킬 재주를 입력하세요. : ");
        String order = sc.nextLine();

        //입력받은 재주를 강아지가 하도록 시킨다. (=Person의 메소드 동작 내용)

        /* 1. void 메소드 출력 */
        System.out.println("===== 1 =====");
        this.myPuppy.doSomeThingVoid(order);

        /* 2. String으로 변경하여 출력 */
        String result1 = this.myPuppy.doSomeThingString(order);
        System.out.println("===== 2 =====");
        System.out.println(result1);

        /* 3. boolean으로 변경하여 출력 */
        boolean result2 = this.myPuppy.doSomeThingBoolean(order);
        String name2 = myPuppy.getName();
        System.out.println("===== 3 =====");
        if(result2) {
            System.out.println(name2 + "는 " + order + "를 배웠어요!! :) ");
        } else {
            System.out.println(name2 + "는 " + order + "를 못한다 말이다~!! :( ");
        }

    }

}
