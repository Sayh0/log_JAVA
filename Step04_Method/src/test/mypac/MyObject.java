package test.mypac;
/*
 * 메소드 생성 시 고려할 점
 * 1. 접근지정자
 * 2. static or non static
 * 3. return type
 * 4. 메소드명
 * 5. 메소드에 전달하는 파라미터의 개수와 데이터 타입.
 * 
 */
public class MyObject {

	public void walk() {
		/*
		 * public > 이 메소드는 어디서는 접근 가능하다.
		 * void > 이 메소드는 어떤 값도 리턴하지 않는다.
		 * walk > 메소드명
		 * walk() > 이 메소드는 어떤 값도 인자로 전달받지 않는다.
		 */
		System.out.println("Let's walk");
	}
	//int type을 리턴해주는 메소드
	public int getNumber() {
		return 10;
	}
	//String type을 리턴해주는 메소드
	public String getGreeting() {
		return "Hello there";
	}
	//Car type을 리턴해주는 메소드
	public Car getCar() {
		return new Car(); 
		//여기서는 new 가 된다? 된다! 패키지mypac 같으니까.
		//리턴타입이 Car임. Car의 기능을 끌어 쓸 수 있게 메소드화.
	}
}
