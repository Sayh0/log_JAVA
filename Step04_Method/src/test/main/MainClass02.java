package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		Car car1=null;
		//car1=new Car();
		//package�� �޶� new �� �Ϸ��� �����ڿ� public ���������ڸ� �޾ƾ� ��.
		
		//Car ��ü�� �������� ���� drive()�޼ҵ� ȣ���غ���.
		
		MyObject obj=new MyObject();
		car1=obj.getCar();
		car1.drive();
		car1.drive();

		//�������� �־���� ������ �󸶵��� ������ �� �� ����.
		//�޸� �Ҵ�ǵ� �� �޸𸮸� �ּҷ� �����ϴ� ����.
		
		
		//���� ����.
		new MyObject().getCar().drive(); 
		new MyObject().getCar().drive(); 

		// drive()�� ����Ÿ���� ���̵��. ����� �� ����.
		// �ѹ� ���� �޸� �������. 
		// ���� �̷��� ���ٷ� �� ���� �ѹ� ���� ��. �ٽ� �޸� �Ҵ�.
	}
}
