package test.mypac;

public class Car { // 설계도. 붕어빵 틀.
	//필드
	public String name="sonata";

	public Calculator cal=new Calculator(); //객체를 필드로 또 집어넣는 이런 것도 가능하다. 
	// import 안해도 된다. 같은 패키지 안쪽이니까.
	// 이건 좀 어려운 개념이니까 이해 안되면 그냥 넘어가시길.
	
	
	
	
	//기능(메소드)
	public void drive() {
		System.out.println("let's drive");
	}
}
