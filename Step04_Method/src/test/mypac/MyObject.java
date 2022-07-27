package test.mypac;
/*
 * �޼ҵ� ���� �� ����� ��
 * 1. ����������
 * 2. static or non static
 * 3. return type
 * 4. �޼ҵ��
 * 5. �޼ҵ忡 �����ϴ� �Ķ������ ������ ������ Ÿ��.
 * 
 */
public class MyObject {

	public void walk() {
		/*
		 * public > �� �޼ҵ�� ��𼭴� ���� �����ϴ�.
		 * void > �� �޼ҵ�� � ���� �������� �ʴ´�.
		 * walk > �޼ҵ��
		 * walk() > �� �޼ҵ�� � ���� ���ڷ� ���޹��� �ʴ´�.
		 */
		System.out.println("Let's walk");
	}
	//int type�� �������ִ� �޼ҵ�
	public int getNumber() {
		return 10;
	}
	//String type�� �������ִ� �޼ҵ�
	public String getGreeting() {
		return "Hello there";
	}
	//Car type�� �������ִ� �޼ҵ�
	public Car getCar() {
		return new Car(); 
		//���⼭�� new �� �ȴ�? �ȴ�! ��Ű��mypac �����ϱ�.
		//����Ÿ���� Car��. Car�� ����� ���� �� �� �ְ� �޼ҵ�ȭ.
	}
	//int type�� �޼ҵ��� ���ڷ� ���޹޴� �޼ҵ�
	public void setNum(int num) {
		System.out.println("num : "+num);
	}
	//String type�� �޼ҵ��� ���ڷ� ���޹޴� �޼ҵ�
	public void setName(String name) {
		System.out.println("name : "+name);
	}

	//Radio ��� Ÿ���� �޼ҵ��� ���ڷ� ���޹޴� �޼ҵ�
	public void useRadio(Radio r) {
		r.listenMusic();
	}
	
	//Gun type�� Arrow type�� �޼ҵ��� ���ڷ� ���޹޴� �޼ҵ�
	public void attack(Gun g, Arrow a) {
		System.out.println("�Ѱ� Į�� �����ϱ�");
	}
}
