package com.ohgiraffers.section03.delete;

import java.sql.Connection;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 1. 삭제할 메뉴 코드 입력받기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제하실 메뉴의 번호를 입력하세요. : ");
        int menuCode = sc.nextInt();

        /* 2. DeleteController의 deleteMenu() 메소드 호출 */
        DeleteController delCon = new DeleteController();
        int result = delCon.deleteMenu(menuCode);

        /* 3. delete 결과에 따라 성공이면 '메뉴 삭제 성공!' 실패이면 '메뉴 삭제 실패 ㅜㅜ' 출력 */
        if(result > 0) {
            System.out.println("메뉴 삭제 성공!");
        } else {
            System.out.println("메뉴 삭제 실패 ㅜㅜ");
        }
        /* entry key = "deleteMenu" */
    }

}
