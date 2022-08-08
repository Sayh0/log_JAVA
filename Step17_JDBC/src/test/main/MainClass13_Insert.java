package test.main;

import test.dao.MemberDao;
import test.dao.MemberDao_mywork;
import test.dto.MemberDto;

public class MainClass13_Insert {
	public static void main(String[] args) {
		String name="Hamburger";
		String addr="McDonald";
		MemberDto mdto=new MemberDto();
		mdto.setName(name);
		mdto.setAddr(addr);
		
		MemberDao mdao=new MemberDao();
		boolean isSuccess=mdao.insert(mdto);
		if(isSuccess) {
			System.out.println("ȸ�� ������ �߰��߽��ϴ�. member data update completed");
		} else {
			System.out.println("�߰� ����! update failed!");
		}
		
		//�� ȸ�������� MemberDao ��ü�� �̿��Ͽ� DB�� �����ϰ�
		//�����̸� "ȸ�� ������ �߰��߽��ϴ�"
		//���и� "�߰� ����!" �� �ܼ�â�� ����ϴ� �ڵ� �ۼ�.
		
	}
}
