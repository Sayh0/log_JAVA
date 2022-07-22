//이클립스 아닌 데서 열면 이것도 그냥 텍스트 파일이다. java source file.
package test.main;

public class MainClass01 {
	int global=666;
	public static void main(String[] args) {
		/*
		 *  [ Java 기본 데이터 type ]
		 *  
		 *  1. 숫자형
		 *  
		 *  정수형 : byte, short, int, long
		 *  
		 *  - byte 변수명;  // -128 ~ 127
		 *  - short 변수명;  // -32768 ~ 32767
		 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
		 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
		 *  
		 *  실수형 : float, double
		 *  
		 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
		 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
		 */
		System.out.println("main method started.");
		byte iByte=10;
		short iShort=10;
		int iInt=10000;
		long iLong=10;
		
		int temp=iShort;
		/*
		 * int type 변수에 short type 크기(더 작은 크기)를 대입하는 것은 에러를 발생시키지 않음.
		 * 반대의 경우엔?
		 */
		//byte tmp2=iInt; << 에러 발생.
		byte tmp2=(byte)iInt; //type casting. 표현가능한 범위가 더 넓은 변수에 담긴 내용을 대입하기 위해.
		// ( type ) 은 type casting 연산자.
		//byte type이라고 강제로 인식시킴.대신 표현 가능한 범위에서만 가능하다. int=10000은 byte로 타입캐스팅 ㄴㄴ.  
		//문법상은 맞지만(이클립스는 문법만 잡아줌.) 컴파일 돌려보면 이상한 숫자가 들어갈걸. 이러면 실제에서 개같이멸망.
		
		//실수형 변수 선언 후 값 대입
		float num1=10.1f;
		double num2=10.2d; //d는 생략 가능. 생략해도 double type으로 간주됨.
		double num3=10.3; //d, f를 뭍이지 않으면 double type 으로 간주됨.
		
		double tmp3=num1; //float는 double 보다 작은 크기.
		
		float tmp4=(float)num2;
	}

}
