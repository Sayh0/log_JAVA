package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		//MyObject 클래스에 정의된 3개의메소드를 차례로 호출하는 코드.
		
		/*
		 * non static 메소드들을 호출하기 위해선 우선
		 * new MyObject()를 해서 객체를 생성한 후 참조값에. 찍기.
		 */  
		MyObject myObj=new MyObject();
		
	    myObj.walk(); // 호출하고 담는 값이 없으면 그냥 날아감.
	    
	    int num=myObj.getNumber();
	    
	    String greet=myObj.getGreeting();
		
	    System.out.println(num); //출력확인용
	    System.out.println(greet); //출력확인용
	}
}
