package test.main;

import java.util.*;

public class MainClass15 {
	public static void main(String[] args) {
		//random 숫자를 얻어내는 random 객체
		Random ran=new Random();
		
		int a=ran.nextInt(); // int 범위 내에서 랜덤정수 얻어내기
		
		int b=ran.nextInt(10); // 정해진 범위 내에서 핸덤한 정수 얻어내기 0-9
		
		int c=ran.nextInt(20); // 0-19
		
		int d=ran.nextInt(15)+1; // 1-15 0-14+1
	}
}
