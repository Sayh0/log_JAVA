package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		//member 테이블에 추가할 회원 정보.
		String name="Joodaengee";
		String addr="BongChundong";
		
		//회원 한명의 정보를 MemberDto 객체에 담고
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//메소드를 호출하면서 MemberDto 객체를 전달.
		insert(dto);
		
	}
	
	//회원 한명의 정보를 추가하는 메소드
	public static void insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
	
		try {
			conn=new DBConnect().getConn();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        try {
    		String sql="INSERT INTO member"
 	               + " (num, name, addr)"
 	               + " VALUES(member_seq.NEXTVAL, ?, ?)";
			pstmt=conn.prepareStatement(sql);
	        pstmt.setString(1, dto.getName());
	        pstmt.setString(2, dto.getAddr()); 
	        pstmt.executeUpdate();
	        System.out.println("member Update completed.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//닫는 건 열었던 순서 거꾸로.
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (Exception e) {}
		}
	}
}
