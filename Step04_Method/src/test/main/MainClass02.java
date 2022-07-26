package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {
	public static void main(String[] args) {
		Car car1=null;
		//car1=new Car();
		//package가 달라도 new 를 하려면 생성자에 public 접근지정자를 달아야 함.
		
		//Car 객체의 참조값을 얻어내서 drive()메소드 호출해보기.
		
		MyObject obj=new MyObject();
		car1=obj.getCar();
		car1.drive();
		car1.drive();

		//참조값을 넣어놨기 때문에 얼마든지 여러번 쓸 수 있음.
		//메모리 할당되도 그 메모리를 주소로 참조하는 형식.
		
		
		//같은 내용.
		new MyObject().getCar().drive(); 
		new MyObject().getCar().drive(); 

		// drive()는 리턴타입이 보이드다. 결과물 안 남음.
		// 한번 쓰고 메모리 비워버림. 
		// 따라서 이렇게 한줄로 쓸 경우는 한번 쓰고 끝. 다시 메모리 할당.
	}
}
