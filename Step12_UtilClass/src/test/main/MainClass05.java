package test.main;

import java.util.ArrayList;

public class MainClass05 {
	public static void main(String[] args) {
		ArrayList<Integer> nums=new ArrayList<Integer>();
		/*
		 * AttayList는 기본데이터 type을 저장할 수 없으므로
		 * 기본 데이터 type을 저장하고 싶다면 Wrapper Class를 활용하자.
		 * int > Integer
		 * double > Double
		 * boolean > Boolean 등등
		 */
		
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		//확장 for문 이용해 지정된 정수 순서대로 콘솔창에 출력
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
	}
}
