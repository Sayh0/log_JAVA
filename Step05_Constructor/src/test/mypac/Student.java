package test.mypac;

public class Student {
	/*
	 * 생성자
	 * 1. 클래스명과 동일
	 * 2. 메소드 모양과 유사하지만 return type 없음.
	 * 3. 객채를 생성(new )할 때 호출됨.
	 * 4. 객체를 생성하는 시점에 무언가 준비작업이 필요할 때 유용.
	 * 5. 생성자를 명시적으로 정의하지 않아도 기본 생성자는 있다고 간주.
	 * 
	 */
	//생성자
	public Student() {
		System.out.println("Constructor of Student class called");
	}
}
