package test.mypac;

public class Calculator {
	//필드를 만들어보자.
	//(참고)자바엔 전역변수 개념이 없다!!! 전역변수 비스~~무리한게 있지만 전역변수는 없 다!
	public String brand="xiaomi";
	
	
	//계산하는 기능
	//메소드를 만들어보자.
	public void exec() {
		// void는 리턴이 없기 때문에 현재 void다.
		// 여기센 반환시킬 값의 데이터 타입을 적으면 되겠다.
		System.out.println("Calculator is cool");
	}
	public void plus() {
		System.out.println("Plus is cool");
	}
	
	
}
