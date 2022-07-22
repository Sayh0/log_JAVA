package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int num1=5;
		int num2=2;
		// +연산
		int sum=10+1;
		int sum2=num1+num2;
		int sum3=10+num2;
		
		//정수끼리 연산하면 결과는 정수만 나옴.
		int result1=5/3;
		int result2=num1/num2;
		
		//연산결과로 실수값을 얻어내고 싶으면 적어도 하나는 실수여야 함.
		double result3=5/3.0;
		double result4=num1/(double)num2; //정수타입과 더블타입의 연산.
		
		//앞에 있는 수를 뒤에 있는 수로 나눈 나머지 값.
		int result5=num1%num2;
	}
}
