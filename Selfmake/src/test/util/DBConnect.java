package test.util;

import java.sql.*;

public class DBConnect {
	
	Connection conn;
	
	public DBConnect() {
		 try {
	         //����Ŭ ����̹� �ε�
	         Class.forName("oracle.jdbc.driver.OracleDriver"); 
	         //������ DB �� ���� @�������ּ�:port��ȣ:db�̸�
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //���� ��й�ȣ�� �̿��ؼ� Connection ��ü�� ������ ������
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //���ܰ� �߻����� �ʰ� ������� ��������� �������� ���� �����̴�.
	         System.out.println("Oracle DB connect complete");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	}
	
	//Connection ��ü�� ������ �ִ� �޼ҵ�.
	public Connection getConn() {return conn;}
}
