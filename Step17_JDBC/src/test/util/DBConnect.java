package test.util;

import java.sql.*;

//목적 : Connection conn=new DBConnect()/
//		getConn(); 로 언제든지 꺼낼 수 있게.

public class DBConnect {
	//field
	Connection conn;
	
	//constructor
	public DBConnect() {
		 try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver"); //ojdbc 드라이버를 로딩한다는 뜻.드라이버가 있어야 돌아가겠지.
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB connect complete");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}
	
	//Connection 객체를 리턴해 주는 메소드.
	public Connection getConn() {
		
		return conn;
	}
}
