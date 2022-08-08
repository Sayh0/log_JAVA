package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * run 했을 때 member테이블에서 1번 회원의 정보 삭제.
		 */
		int num=4;

		
		Connection conn=null; //DB연결객체 담을 지역변수 만듦
		//커넥션을 얻어오는 이 부분은 매번 쓰일거야. 미리 만들어놓는게 낫지 않을까?
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
	        conn=DriverManager.getConnection(url, "scott", "tiger"); //커넥션 객체 참조값 얻어오기.
	        System.out.println("Oracle DB connected");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	    PreparedStatement pstmt=null;
	    
        try {
        	//전달할 쿼리문.(미완성일 수 있음)
            String sql="DELETE FROM member"
            		+ " WHERE num=?";

			pstmt=conn.prepareStatement(sql); //insert update delete 일을 수행하는 객체. 여기 패턴은 3개가 똑같다.
			// 실행할 sql을 전달을 해 줘야함. 미완성 물음표를 순서대로 값 전달
			//? 에 바인딩(연결)할 내용이 잇으면 연결.
			pstmt.setInt(1, num);
			pstmt.executeUpdate(); //실행. select 문은 호출하는 메소드가 다르다!!! executeQuery다!! 결과를 가져와야되니까!!
			System.out.println("Update complete");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("main method terminated");
	}
}
