package test.main;

import java.sql.*;

import test.util.DBConnect;

public class MainClass12 {
	public static void main(String[] args) {
		
		int num=2; //삭제할 회원의 번호라고 가정
		
		//회원 정보를 삭제하고 성공 여부를 리턴받는다.
		//delete member's data and receive success or failure 
		boolean isSuccess=delete(2);
		//작업의 성공 여부는 리턴 타입(보통은 불리언타입)으로 나타내는 경우가 많다.
		//The success of the operation is often indicated by the return type(usually boolean).
		//성공이냐 실패냐에 따라 선택적인 작업이 가능하다.
		//you can optional task depending on success or failure. 
		if(isSuccess) {
			System.out.println("data of member no."+num+" deleted completed.");
		} else {
			System.out.println("data of member no."+num+" deleted failed!");
		}
	}
	
	// 회원 한명의 정보를 삭제하는 메소드. delete member method
	// if you deliver member's number, then delete.
	public static boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0; //아래에서 쓰기 위해 아예 변수로 박아넣고 시작한다.
		try {conn=new DBConnect().getConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        try {
    		String sql="DELETE FROM member"
    				+ " WHERE num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			//execute.
			//실행 후 메소드가 리턴해주는 변화된 행의 개수를 지역변수에 담는다.
			//after execute, contain varied row number into local variable that returned by method.
	        updatedRowCount=pstmt.executeUpdate(); // 더 뱉을 로우가 없으면 -1 값 리턴.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//닫는 건 열었던 순서 거꾸로.
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (Exception e) {}
		}
		if (updatedRowCount<0) { //아래로 뺀다. 리턴이 있기때문에 중간에 있으면 리턴때문에 메소드가 종료되어버림.
			//만일 변화된 행의 개수가 0보다 크면
			//작업 성공의 의미이기 대문에 true를 리턴.
        	return true;
        } else {
        	//작업이 실패면 false를 리턴.
        	return false;
        }
		// 둘 다 static 이어야 실행이 된다.
		
	}
}
