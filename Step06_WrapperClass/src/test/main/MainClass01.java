package test.main;
/*
 * [기본 data type의 참조 data type]
 * byte : Byte
 * short : Short
 * int : Integer
 * long : Long
 * 
 * float : Float
 * double : Double
 * 
 * char : Character
 * boolean : Boolean
 * 
 * -때로는 기본데이터 타입의 참조데이터 타입이 필요할 때가 있다.
 * -기본데이터 type을 객체에 포장(Boxing)하는 형태이다.
 * -boxing과 unboxing은 자동으로 되기 때문에 프로그래머가 신결 쓸 필요는 없다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main method started.");
		//기본 데이터 타입
		int num1=10;
		
		//WrapperClass
		//참조 데이터 타입
		Integer num2=10; //힙영역에 new 하지 않아도 객체가 만들어짐.어케했노?
		//num2에 참조값이 들어가고, 참조값 따라 가보면 10이 heap 영역에 들어가있음
		
		//참조데이터 type이지만 기본데이터 type처럼 사용할 수가 있따.
		int result=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		//타입은 참조타입이지만 기본데이터 타입처럼 사용 가능
		
		//문자를 숫자로 바꾸기.
		String strNum="999";
		int result4=Integer.parseInt(strNum); //result4는 999
		
	}	 
}
