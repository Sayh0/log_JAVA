package test.main;

import test.mypac.Calculator; //1. 다른 패키지에 있는 클래스를 사용을 위해 끌어오자. 

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 만일 프로그래밍의 목적이 '계산'이라면?
		 * 
		 * 	- 계산 기능을 수행할 수 있는 객체가 필요함.
		 * 	- 계산 기능을 수행할 수 있는 객체를 생성해서 heap 영역에 올려놓고
		 * 	  참조값을 이용해서 계산을 해야 한다.
		 * 
		 * 해야 할 일
		 * 	1. 객체를 생성하는 데 필요한 클래스 import.
		 * 	2. 객체를 생성.
		 * 	3. 필요할 때 객체의 기능 호출.
		 */
		
		System.out.println("Calculator started");
		Calculator cal=new Calculator(); //2. 객체 생성 예약어는 new이다. 함수같지만 함수는 아님.
		/*
		 * new Calculator() 를 담을 지역변수가 필요함. cal이라고 해보자.
		 * 데이터 타입은? 클래스명을 사용한다. 붕어빵 틀 이름이 Calculator잖아!
		 * 데이터 타입은 '사용설명서'의 역할도 겸비한다. 명시된 클래스 안에 있는 기능 씁니다~ 의미.
		 * 붕어빵 틀로 붕어빵 cal을 하나 찍었다!
		 * 진짜 값이 들어가는 건 아니다. 사물함(heap영역)의 주소값이 들어가지. 이건 전에 배웠지? 
		 */
		//메소드(기능)
		cal.exec(); //3. 쓰고싶은 계산 기능을 이제 불러오면 오케이~
		cal.plus();
		// return type이 void 인건 반환되는게 아무것도 없는 것. 콜하고 마는 메소드다.
		// 긍까 앞에 리턴값의 데이터타입을 붙이는 짓은 바보바보바보다.
		
		//필드(저장소)
		String a=cal.brand; //필드명이 브랜드, 타입은 스트링.
		//Calculator 객체의 brand 필드를 참조하여 참조된 값을 변수에 대입하기.
		
		
		System.out.println(a); // xiaomi 출력.
	}

}
