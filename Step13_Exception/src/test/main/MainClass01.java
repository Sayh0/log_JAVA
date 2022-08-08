package test.main;

import java.util.*;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		String inputNum=scan.nextLine(); //숫자 형식의 문자열 입력받음. ex)10 20 10.1 ...
		try {
			double num=Double.parseDouble(inputNum); //입력한 문자열을 숫자로 변환
			
			double result=num+100; //입력한 숫자 + 100
			System.out.println("입력 숫자 + 100 : "+result);
		} catch(NumberFormatException nfe) { //nfe는 예외객체의 참조값이 들어감.
			System.out.println("숫자만 입력하세요! ");
			System.out.println(nfe.getMessage());
			//콘솔에 자세한 경고메세지 출력
			nfe.printStackTrace();
		}
		
		
		System.out.println("메소드가 종료됩니다.");
	}
}
