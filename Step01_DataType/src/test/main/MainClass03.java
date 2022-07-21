package test.main;
/*
 * [JAVA 기본 데이터 Type]
 * 2. 논리형 (boolean)
 * 
 * - true, false 두가지 값 중 하나
 * - true, false 를 직접 쓰거나 비교연산 혹은 논리연산 결과로 얻어낼 수 있음.
 * - 참과 거짓을 나타내는 dataType. 
 */
public class MainClass03 {
	// run 했을 때 실행의 흐름이 시작되는 특별한 main 메소드(기본 메소드)
	public static void main(String[] args) {
		boolean isRun=true; //논리형 변수 선언
		if(isRun) {
			System.out.println("run"); //true니까.
		}
		
		boolean isGreater=10>1; //비교연산 결과로 얻은 boolean 값 담기
		boolean result=true||false; //논리연산 결과로 얻은 boolean 값(true) 담기
		//아 참고로 ||는 OR임. 둘중 하나라도 TRUE 면 TRUE.
		
		//한번 선언한 변수는 재선언 불가능.
		//boolean result=true||false; << 이런 거 못함
		result=false; //변수에 다른 값은 대입 가능(단, 동일type인 경우만)
		//다른 type 값은 변수에 담을 수 없음.
		//result=10; << 이런거.
	}

}