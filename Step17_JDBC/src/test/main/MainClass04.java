package test.main;

import java.sql.*;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 1번 회원의 정보 수정하기
		 * 
		 */
		int num=1;
		String name="Acorn";
		String addr="GangnamStn";
		
		Connection conn=null; //DB연결객체 담을 지역변수 만듦
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
	        conn=DriverManager.getConnection(url, "scott", "tiger");
	        System.out.println("Oracle DB connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    PreparedStatement pstmt=null;
	    
        try {
        	//전달할 쿼리문.(미완성일 수 있음)
            String sql="UPDATE member"
                    + " SET name=?"
                    + "   , addr=?"
                    + " WHERE num=?";
			pstmt=conn.prepareStatement(sql); //insert update 등의 일을 수행하는 객체.
			// 실행할 sql을 전달을 해 줘야함. 미완성 물음표를 순서대로 값 전달
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.setInt(3, num);
			pstmt.executeUpdate();
			System.out.println("Update complete");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("main method terminated");
	}
}
