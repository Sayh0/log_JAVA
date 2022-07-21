package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main start");
		int kor=95;
		int eng=100;
		
		double avg=(kor+eng)/2.0;
		/*
		 * 정수와 정수를 연산하면 정수만 나온다.
		 * 정확한 실수값을 얻어내기 위해선 연산에 참여하는 숫자중 적어도 하나는 실수가 되어야 함.
		 */
		System.out.println("평균은 "+avg+"점");
	}
}
