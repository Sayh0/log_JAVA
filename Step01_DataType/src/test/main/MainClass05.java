package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main method started.");
		//메소드 내부에서 만드는 변수는 지역변수Local Variable이다.
		//자바는 전역변수같은 건 없다! 대신 필드Field가 있다.
		int num1;
		String name1;
		/*
		선언만 되어 있는 상태. 뭔가를 넣어 줘야 생성됨. '생성할 준비'만 되어 있는 상태. 
		디버그모드 가보면 아무것도 안 떠 있을걸.
		자바스크립트에선 선언만 해도 안이 undefined로 채워져 있다. 근데 자바는 안 그럼.
		*/
		
		//int result =10+num1; << 에러. num1은 생성되어 있지 않은 상태.
		//차라리 int num1=10; 처럼 선언과 동시에 초기화하면 모를까.
		//미리 만들어놓고 싶으면 보통 int에 0, String에 null 넣던가 해서 해 둠.
		
		System.out.println("main method terminated.");
	}
}
