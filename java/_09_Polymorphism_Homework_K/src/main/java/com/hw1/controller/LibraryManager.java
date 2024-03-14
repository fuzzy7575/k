package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;

public class LibraryManager {

    private Member mem = new Member() ;
    private Book[] bList = new Book[5];

    {
        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

    }

    public void setMem(Member mem) {
        this.mem = mem;
        System.out.println("멤버 객체 생성 : " + mem.toString());
    }

    public void setbList(Book[] bList) {
        this.bList = bList;
    }

    public Member getMem() {
        return mem;
    }

    public Book[] getbList() {
        return bList;
    }

    public void insertMember(Member mem) {
        setMem(mem);
    }

    public Member myInfo() {

        System.out.println("===== 마이페이지 =====");
        System.out.println(mem.toString());
        System.out.println("====================");
        System.out.println();

//        String result = getMem().toString();
//        return result;

        return getMem();
    }

    public Book[] selectAll() {
        return getbList();
    }

    public Book[] searchBook(String keyword) {
// 검색 결과를 담아줄 새로운 Book 객체 배열 생성
// 검색 결과 도서 목록이 최대 5개일 수 있으니 임의로 크기 5 할당
// for문을 이용하여 bList 도서 목록들의 도서명과 전달받은 keyword 비교
// 전달받은 keyword를 포함하고 있으면  HINT : String 클래스의 contains() 참고
// 검색결과의 도서목록에 담기  HINT : count 이용
// 해당 검색결과의 도서목록 주소 값 리턴
        
        Book[] bookArr = new Book[5];
        for(int i = 0; i < bList.length; i++) {

            if(bList[i].getTitle().contains(keyword)) {
                bookArr[i] = bList[i];
            }
        }
        return bookArr;



    }

    public int rentBook(int index) {
// int result = 0;
// 전달 받은 index의 bList 객체가 만화책을 참조하고 있고
// 해당 만화책의 제한 나이와 회원의 나이를 비교하여 회원 나이가 적을 경우
// result를 1로 초기화  나이제한으로 대여 불가
// 전달 받은 index의 bList 객체가 요리책을 참조하고 있고
// 해당 요리책의 쿠폰유무가 “유”일 경우
// 회원의 couponCount 1 증가 처리 후
// result를 2로 초기화  성공적으로 대여 완료, 요리학원 쿠폰 발급
// result 값 리턴

        int result = 0;
        int j = index;

        if((bList[j] instanceof AniBook) && (((AniBook)bList[j]).getAccessAge() > mem.getAge())) {
            result = 1;
        } else if((bList[j] instanceof CookBook) && (((CookBook)bList[j]).isCoupon() == true)) {
            int couponCount = mem.getCouponCount();
//            System.out.println("couponCount111 : " + couponCount);
            mem.setCouponCount(++couponCount);
//            System.out.println("couponCount222 : " + couponCount);
            result = 2;
        }

        return result;

    }

/*

실습문제 chap09 풀이에서

필드에 대입하는 값이 배열, 객체배열일 경우

다형성
상속 시 부모의 클래스 형으로 자식의 클래스 객체를 생성한 경우
1. 부모의 클래스의 메소드를 override 해서 사용
2. 자식의 메소드를 사용 할 수 없다.
   자식의 메소드를 사용하기 위해서는 자식의 클래스로 형변환.

Book b = new CookBook;
b.isCoupon() // 사용 불가
((CookBook)b.isCoupon() // 사용가능

Book b = new AniBook;
b.getAccessAge() // 사용 불가
((AniBook)b.getAccessAge() // 사용가능

------------------------------------------------------------------------------------------------

캡슐화, 객체배열, 다형성을 각각 배웠는데
실습문제 처럼 한번에 적용되는 경우에 대한 이해가 필요합니다.

예) 캡슐화의 일반적인 필드 입출력과 객체배열, 다형성을 적용 한 경우의 필드 입출력의 차이
특히, 많이 어려워 하는 부분은 아래와 같은 차이에서 발생되는 접근 경로의 차이 때문인거 같습니다.

캡슐화를 배울 경우에는
Application -> Class
와 같이 단일 경로이기 때문에
캡슐화가 안된 클래스 필드에 접근하기 위해서는 레퍼런스명.필드명 으로 접근
캡슐화가 된 클래스 필드에 접근하기 위해서는 Class의 getter, setter 메소드를 실행해서 접근

실습문제에서는
run/Application -> view/LibraryMenu -> controller/LibraryManager -> model.dto/Book -> model.dto/AniBook
와 같이 경로가 복잡해지기 때문에
각각의 상황에 따라 필드에 접근하는 차이점에 대한 이해가 필요합니다.

*/




}
