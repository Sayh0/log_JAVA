package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	//�ƹ��� ���� ���޹��� �ʴ� �⺻ ������.
	public Member() {
		System.out.println("�⺻ �����ڰ� ȣ��Ǿ����ϴ�.");
	}
	
	//�ʵ忡 ������ ���� ���޹޴� ������.
	public Member(int num, String name, String addr) { //������ call.
		this.num=num;
		this.name=name;
		this.addr=addr;
	//�����ڴ� �뵵�� ���� ������ ������ �� ����.
		
		
	
	}
}
