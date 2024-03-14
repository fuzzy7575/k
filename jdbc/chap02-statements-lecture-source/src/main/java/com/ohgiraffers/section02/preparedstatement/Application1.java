package com.ohgiraffers.section02.preparedstatement;

import com.ohgiraffers.common.JDBCTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {

    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        ResultSet rset = null;

        try {

            /* Statement와 달리 prepareStatement는 생성당시에 쿼리문을 작성해줘야 한다. */
            pstmt =con.prepareStatement("SELECT EMP_ID, EMP_NAME FROM EMPLOYEE");

            rset = pstmt.executeQuery();

            while(rset.next()) {
                /* next() : ResultSet의 커서 위치를 내리면서 행이 존재하면 true, 존재하지 않으면 false */
                System.out.println(rset.getString("EMP_ID") + "," + rset.getString("EMP_NAME"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            /* 맨 마지막에 열렸던것부터 순서대로 닫아줌 */
            close(rset);
            close(pstmt);
            close(con);
        }
    }

}
