package test.main;

import java.sql.*;

import test.util.DBConnect;

public class MainClass12 {
	public static void main(String[] args) {
		
		int num=2; //������ ȸ���� ��ȣ��� ����
		
		//ȸ�� ������ �����ϰ� ���� ���θ� ���Ϲ޴´�.
		//delete member's data and receive success or failure 
		boolean isSuccess=delete(2);
		//�۾��� ���� ���δ� ���� Ÿ��(������ �Ҹ���Ÿ��)���� ��Ÿ���� ��찡 ����.
		//The success of the operation is often indicated by the return type(usually boolean).
		//�����̳� ���гĿ� ���� �������� �۾��� �����ϴ�.
		//you can optional task depending on success or failure. 
		if(isSuccess) {
			System.out.println("data of member no."+num+" deleted completed.");
		} else {
			System.out.println("data of member no."+num+" deleted failed!");
		}
	}
	
	// ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�. delete member method
	// if you deliver member's number, then delete.
	public static boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0; //�Ʒ����� ���� ���� �ƿ� ������ �ھƳְ� �����Ѵ�.
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
			//���� �� �޼ҵ尡 �������ִ� ��ȭ�� ���� ������ ���������� ��´�.
			//after execute, contain varied row number into local variable that returned by method.
	        updatedRowCount=pstmt.executeUpdate(); // �� ���� �ο찡 ������ -1 �� ����.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//�ݴ� �� ������ ���� �Ųٷ�.
				try {
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (Exception e) {}
		}
		if (updatedRowCount<0) { //�Ʒ��� ����. ������ �ֱ⶧���� �߰��� ������ ���϶����� �޼ҵ尡 ����Ǿ����.
			//���� ��ȭ�� ���� ������ 0���� ũ��
			//�۾� ������ �ǹ��̱� �빮�� true�� ����.
        	return true;
        } else {
        	//�۾��� ���и� false�� ����.
        	return false;
        }
		// �� �� static �̾�� ������ �ȴ�.
		
	}
}
