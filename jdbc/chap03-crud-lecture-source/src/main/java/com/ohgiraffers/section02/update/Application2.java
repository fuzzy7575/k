package com.ohgiraffers.section02.update;

import com.ohgiraffers.model.dto.MenuDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {

    public static void main(String[] args) {

        /* 1. 변경할 메뉴 코드, 이름, 가격을 입력받기 */

        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 메뉴의 번호를 입력하세요. : ");
        int menuCode = sc.nextInt();sc.nextLine();
        System.out.print("메뉴 이름을 뭐로 변경하시겠습니까? : ");
        String menuName = sc.nextLine();
        System.out.print("가격은 얼마로 하시겠습니까? : ");
        int menuPrice = sc.nextInt();

        /* 2. MenuDTO 객체를 생성하여 입력받은 값으로 setting */

        MenuDTO changeMenu = new MenuDTO();
        changeMenu.setMenuName(menuName);
        changeMenu.setMenuPrice(menuPrice);
        changeMenu.setMenuCode(menuCode);

        /* 3. UpdateController의 updateMenu() 메소드 호출 */
        UpdateController upCon = new UpdateController();
        int result = upCon.updateMenu(changeMenu);

        /* 4. update 결과에 따라 성공, 실패 메세지 출력 */
        if(result > 0) {
            System.out.println("메뉴 수정 성공!");
        } else {
            System.out.println("메뉴 수정 실패 ㅠㅠ");
        }

    }

}
