package test.mypac;

public class Car {
	
	//생성자 (객체 new 할때 호출되는 부분). 물론 접근지정자 부여 가능.
	public Car(){ //클래스명()
		System.out.println("Constructor Car was called");
	}
	//non static method.
	public void drive() {
		System.out.println("let's run");
	}

}
