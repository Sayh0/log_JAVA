package test.main;
/*
 * [�⺻ data type�� ���� data type]
 * byte : Byte
 * short : Short
 * int : Integer
 * long : Long
 * 
 * float : Float
 * double : Double
 * 
 * char : Character
 * boolean : Boolean
 * 
 * -���δ� �⺻������ Ÿ���� ���������� Ÿ���� �ʿ��� ���� �ִ�.
 * -�⺻������ type�� ��ü�� ����(Boxing)�ϴ� �����̴�.
 * -boxing�� unboxing�� �ڵ����� �Ǳ� ������ ���α׷��Ӱ� �Ű� �� �ʿ�� ����.
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main method started.");
		//�⺻ ������ Ÿ��
		int num1=10;
		
		//WrapperClass
		//���� ������ Ÿ��
		Integer num2=10; //�������� new ���� �ʾƵ� ��ü�� �������.�����߳�?
		//num2�� �������� ����, ������ ���� ������ 10�� heap ������ ������
		
		//���������� type������ �⺻������ typeó�� ����� ���� �ֵ�.
		int result=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		//Ÿ���� ����Ÿ�������� �⺻������ Ÿ��ó�� ��� ����
		
		//���ڸ� ���ڷ� �ٲٱ�.
		String strNum="999";
		int result4=Integer.parseInt(strNum); //result4�� 999
		
	}	 
}
