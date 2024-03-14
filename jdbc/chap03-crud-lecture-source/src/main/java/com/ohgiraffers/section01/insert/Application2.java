package com.ohgiraffers.section01.insert;

import com.ohgiraffers.model.dto.MenuDTO;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 1. 메뉴의 이름, 가격, 카테고리 코드, 판매여부를 입력 받기 (Scanner 이용) */

        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴의 이름을 입력하세요. : ");
        String menuName = sc.nextLine();
        System.out.print("메뉴의 가격을 입력하세요.(숫자) : ");
        int menuPrice = sc.nextInt();sc.nextLine();
        System.out.print("카테고리 코드를 입력하세요.(숫자) : ");
        int categoryCode = sc.nextInt();sc.nextLine();
        System.out.print("판매여부를 입력하세요.(Y,N) : ");
        String orderableStatus = sc.nextLine().toUpperCase();

        System.out.println("추가할 메뉴는 : " + menuName + "," + menuPrice + "," + categoryCode + "," + orderableStatus);

        /* MenuDTO 객체를 생성하여 입력받은 값으로 setting */

        MenuDTO newMenu = new MenuDTO();

        newMenu.setMenuName(menuName);
        newMenu.setMenuPrice(menuPrice);
        newMenu.setCategoryCode(categoryCode);
        newMenu.setOrderableStatus(orderableStatus);

        /* InsertController의 insertMenu() 메소드 호출 */

        InsertController insCon = new InsertController();
        int result = insCon.insertMenu(newMenu);

        /* insert 결과에 따라서 성공이면 '메뉴 등록 성공!', 실패이면 '메뉴 등록 실패!' 출력 */

        if(result > 0) {
            System.out.println("메뉴 등록 성공!");
        } else {
            System.out.println("메뉴 등록 실패 ㅠㅠ");
        }

    }

}
