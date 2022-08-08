package test.main;

import java.util.*;

import test.mypac.SleepyException;

public class MainClass05 {
	public static void main(String[] args) {
		Random ran=new Random();
		
		for(int i=0;i<100;i++) {
			int ranNum=ran.nextInt(10); //0-9사이 랜덤한 정수 발생
			if(ranNum==5) { //우연히 랜덤한 정수 5가 나오면 예외 발생시킴
				throw new SleepyException("너무 졸려~"); //throw 예약어와 함께 예외객체 생성 시 예외 발생
			}
			
			System.out.println(i+1+"번째 작업중 . . .");
			
		}
		System.out.println("메인 메소드 종료.");
		
	}
}
