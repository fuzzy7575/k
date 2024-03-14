package com.test;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {

        /*
        * 1. 사람생성(이름, 나이는 생성과 동시에 초기화 해야함)
        * */

        Person p1 = new Person("김씨", 49);

        /*
        * 2. 1에서 만든 사람의 국적 설정
        * (한국, 일본, 중국, 홍콩, 터키 중 하나만 가능 / 만약 다른 국가를 입력했다면 '한국' 자동 설정)
        * */

        System.out.println("====================1");
        p1.setNationality("일본");
        String nation1 = p1.getNationality();
        System.out.println("국적은 ? : " + nation1 );
        System.out.println();

        System.out.println("====================2");
        p1.setNationality2("콩고");
        String nation2 = p1.getNationality();
        System.out.println("국적은 ? : " + nation2 );
        System.out.println();

        System.out.println("====================3");
        p1.setNationality3("일본");
        String nation3 = p1.getNationality();
        System.out.println("국적은 ? : " + nation3 );
        System.out.println();

        System.out.println("====================4");
        p1.setNationality4("중국");
        String nation4 = p1.getNationality();
        System.out.println("국적은 ? : " + nation4 );
        System.out.println();

        System.out.println("====================5");
        p1.setNationality5("홍콩");
        String nation5 = p1.getNationality();
        System.out.println("국적은 ? : " + nation5 );
        System.out.println();

        /*
        * 3. 강아지 입양 -> 사람이 할 수 있는 일 (= Person의 메소드를 호출해서
        * 단, 강아지는 반드시 이름이 있어야 함(강아지 입력 스캐너로 받기)
        * */

        p1.adoptDog();

        /*
        * 4. 강아지에게 재주 가르치기 -> 사람이 할 수 있는 일
        * (=Person의 매개변수가 있는 메소드를 호출해서 dog의 ability 추가
        * */

        String[] teachingAbility = new String[] {"앉아", "빵!!", "기다려"};

        String puppyName = p1.getMyPuppy().getName();
        System.out.println("========== " + puppyName + "의 재주 ==========");

        p1.teachDog(teachingAbility);

        String[] skillArr = p1.getMyPuppy().getSkill();

//        System.out.println("skillArr" + Arrays.toString(skillArr));
        for(int i = 0; i <  skillArr.length;i++) {
            System.out.println(puppyName + "의 " + (i+1) + "번째 재주는 ? : " + skillArr[i] );
        }

        /*
        * 5.강아지에게 재주 시키기 -> 사람이 할 수 있는 일 (= Person의 메소드)
        *   1) 강아지에게 재주를 시키면 어떤 재주를 시킬지 입력받는다. (=Person의 메소드 호출)
        *   2) 입력받은 재주를 강아지가 하도록 시킨다. (=Person의 메소드 동작 내용)
        *   3) 강아지는 할 수 있는 재주면 해당 재주를 출력하고,
        *      그렇지 않으면 '아직 못배운 재주에요'를 출력한다. (=Dog의 메소드 동작 내용)
        * */

        p1.orderToDog();

    }

}
