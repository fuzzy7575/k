package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private BookManager bm;
    Scanner sc = new Scanner(System.in);

    public BookMenu() { }

    public void mainMenu() {
        /*
        *** 도서 관리 프로그램 ***
        1. 새 도서 추가 // addBook (inputBook()이 리턴한 객체) 실행
        2. 도서정보 정렬 후 출력 // printBookList() 실행
         =>인자로 selectSortedBook()하여 리턴받은 리스트 객체사용
        3. 도서 삭제 // deleteBook (inputBookNo()이 리턴한 도서 번호) 실행
        4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
         => 결과가 있는경우 해당 도서를 출력하고,
            결과가 없는 경우 “조회한 도서가 목록에 없습니다.”

        5. 전체 출력 // displayAll() 실행
         => 비어있을 경우 “출력결과가 없습니다.”
            비어있지 않은 경우 전체 출력
        6. 끝내기 // main()으로 리턴
        메뉴 번호 선택 : >> 입력 받음
        // 메뉴 화면 반복 실행 처리
        // 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행
        */

        Boolean loop = true;
        while (loop) {

            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2.도서정보 정렬 후 출력");
            System.out.println("3.도서 삭제");
            System.out.println("4.도서 검색 출력");
            System.out.println("5.전체 출력");
            System.out.println("6.끝내기");

            System.out.print("메뉴를 선택하세요.(메뉴 번호 숫자 입력) : ");
            int choiceMenu = sc.nextInt();sc.nextLine();

            switch(choiceMenu) {
                case 1 :
                    bm.addBook(inputBook());
                    break;
                case 2 :
                    bm.printBookList(selectSortedBook());
                    break;
                case 3 :
                    bm.delete(inputBookNo());
                    break;
                case 4 :
                    bm.searchBook(inputBookTitle());
                    break;
                case 5 :
                    bm.displayAll();
                    break;
                case 6 :
                    System.out.println("종료합니다.");
                    loop = false;
                    break;
                default:
                    System.out.println("잘못 입력 하였습니다.");
                    return;
            }

        }


    }

    public BookDTO inputBook() {

        // "도서 제목 : " >> 입력 받음
        // "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
        // "도서 저자 : " >> 입력 받음
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴

        System.out.print("도서 번호를 입력하세요. : ");
        int bNo = sc.nextInt();sc.nextLine();
        System.out.print("도서 제목을 입력하세요. : ");
        String title = sc.nextLine();
        System.out.print("도서 장르를 입력하세요. : ");
        int category = sc.nextInt();sc.nextLine();
        System.out.print("도서 저자를 입력하세요. : ");
        String author = sc.nextLine();

        BookDTO ibArr = new BookDTO(bNo,category, title, author);
        return ibArr;

    }

    public int inputBookNo() {
        System.out.print("삭제할 도서 번호를 입력하세요. : ");
        int bNo = sc.nextInt();sc.nextLine();
        return bNo;
    }

    public String inputBookTitle() {
        System.out.print("검색할 도서 제목을 입력하세요. : ");
        String title = sc.nextLine();
        return title;
    }

    public List<BookDTO> selectSortedBook() {
        // 도서 정렬방식을 정수로 입력받아서
        // 1. 도서번호(ISBN)으로 오름차순정렬
        // 2. 도서번호(ISBN)으로 내림차순정렬
        // 3. 책 제목으로 오름차순 정렬
        // 4. 책 제목으로 내림차순 정렬
        //BookManager 객체의 sortedBookList() 메소드를 이용하여 출력

        System.out.print("1. 도서번호(ISBN)으로 오름차순정렬");
        System.out.print("2. 도서번호(ISBN)으로 내림차순정렬");
        System.out.print("3. 책 제목으로 오름차순 정렬");
        System.out.print("4. 책 제목으로 내림차순 정렬");

        System.out.print("정렬방식을 입력하세요.(숫자) : ");
        int type = sc.nextInt();sc.nextLine();

        List<BookDTO> result = bm.sortedBookList(type);

        return result;

    }


}
