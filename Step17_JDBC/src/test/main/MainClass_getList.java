package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass_getList {
	public static void main(String[] args) {
		int num=3;
		MemberDto mdto=new MemberDto();
		
		MemberDao mdao=new MemberDao();
		MemberDto getlist=mdao.getList(num);
		if(getlist!=null) {
			System.out.println(getlist.getNum()+getlist.getName()+"member data print completed");
		} else {
			System.out.println("�߰� ����! update failed!");
		}
		
		//�����̸� "ȸ�� ������ �߰��߽��ϴ�"�� ����Ʈ ���
		//���и� "�߰� ����!" �� �ܼ�â�� ����ϴ� �ڵ� �ۼ�.
		
	}
}

