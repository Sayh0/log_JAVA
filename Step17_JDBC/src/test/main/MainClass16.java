package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.println("�˻��� ���ϴ� ȸ���� ��ȣ�� �Է��ϼ���(���� : q).");
			String str=scan.nextLine();
			if(str.equals("q")) {
				break;
			}
			//�Է��� ���ڿ��� ������ ��ȯ.
			int num=Integer.parseInt(str);
			System.out.println(num+"�� ȸ�� ���� ��ȸ��");
			
			MemberDao mdao=new MemberDao();
			MemberDto getlist=mdao.getList(num);
			if(getlist!=null) {
				System.out.println("�̸� => "+getlist.getName()+", �ּ� => "+getlist.getAddr());
			} else {
				System.out.println(num+"�� ȸ���� �������� �ʽ��ϴ�.");
			}
		}
		System.out.println("���� ����˴ϴ�.");
	}
}
