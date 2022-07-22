package test.main;
/*
 * JAVA 에서 기본 데이터 type 8개를 제외한 나머지는 모두 참조 데이터 type이다.
 * 
 * 참조 데이터 type 객체는 heap 영역(사물함 영역)에 만들어진다.
 * 모든 객체는 저장소(필드)와 기능(메소드)로 구성되어 있을 수 있다.
 * 어떤 저장소와 어떤 기능은 가지게 될 지는 해당type의 객체가 어떻게 설계되었냐에 따라 다르다. 
 * 
 * (중요!!!!)참조값에 . 을 찍으면 저장소를 참조하거나 기능을 사용할 수 있다.
 * == 유식하게 말하면, 참조값에 . 을 사용하면 필드를 참조하거나 메소드를 호출할 수 있다.
 * 클래스명에 찍을 수도 있는데, 이건 좀 나중에 하고.
 * 메소드 호출은 javascript에서 함수 호출과 유사하다.
 * 자바에서 메소드는 단독으로 존재할 수 없고, 객체와 함께 사물함에 들어간다. 
 * 
 * >> 메소드를 자바스크립트처럼 변수에 담을 수 없다는 뜻.
 * 
 * let f = function(){};
 * f() 
 * 
 * 이런 식이 안된다 이말이야.
 */

public class MainClass08 {
	public static void main(String[] args) {
		String str="abcde12345";
		int result=str.length();
		/*
		 * . 찍으면 나오는 수많은 기능들. 
		 * 그중 length()는 길이 반환. 
		 * int는 리턴된 값의 타입을 나타냄. 
		 * 이거 보고 대입할 결과값의 데이터타입 쓰면 되겠지.
		 */
		char result2=str.charAt(5); //5번 인덱스(5번째글자) 를 출력. 
		//이런 것처럼 괄호 안에 필요한 값(인자argument)을 전달할 때도 있음.
		// cahrAt(int index):char - String 
		// ㄴ>int를 인자로 전달, char 타입을 리턴. string 클래스.
		String result3=str.toUpperCase(); //이제 뭔지 알겠지?
		
		System.out.println(result); // 10 출력.
		System.out.println(result2);// 1 출력.
		System.out.println(result3);// ABCDE12345 출력.
		
		//1.
		String str2=str.toUpperCase();
		//2.
		String greet="Hello! mimi, Bye! mimi";
		String greet2=greet.replace('i','a');
		
		//3.
		//3-1.
		String message="My name is Kimgura";
		boolean isStart=message.startsWith("My");
		//3-2.
		int index=message.indexOf("i");
		System.out.println(index);
		
	}
}
