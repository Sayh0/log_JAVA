package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

/*
 * MemberDao ��ü�� �̿��ؼ� ȸ�� ��ü�� ��� ������
 * �Ʒ��� ���� �������� ����ϱ�.
 * 
 * ��ȣ => 1, �̸� => XXX, �ּ� => XXX
 * ��ȣ => 2, �̸� => ...
 * 
 */
public class MainClass17 {
	public static void main(String[] args) {
		List<MemberDto> list=new MemberDao().getListAll();
		
		for(int i=0;i<list.size();i++) {
			System.out.println("��ȣ => "+list.get(i).getNum()
					+",\t�̸� => "+list.get(i).getName()
					+",�ּ� => "+list.get(i).getAddr());
		}
	}
}
