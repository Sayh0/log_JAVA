package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject Ŭ������ ���ǵ� 3���Ǹ޼ҵ带 ���ʷ� ȣ���ϴ� �ڵ�.
		
		/*
		 * non static �޼ҵ���� ȣ���ϱ� ���ؼ� �켱
		 * new MyObject()�� �ؼ� ��ü�� ������ �� ��������. ���.
		 */  
		MyObject myObj=new MyObject();
		
	    myObj.walk(); // ȣ���ϰ� ��� ���� ������ �׳� ���ư�.
	    
	    int num=myObj.getNumber();
	    
	    String greet=myObj.getGreeting();
		
	    System.out.println(num); //���Ȯ�ο�
	    System.out.println(greet); //���Ȯ�ο�
	}
}
