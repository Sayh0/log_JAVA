package test.main;

import java.util.*;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 * HashSet 은 set 인터페이스를 구현한 클래스.
		 * -순서가 없음.
		 * -key값도 없음.
		 * -중복 허용 안함.
		 * -어떤 데이터를 묶음(집합)으로 관리하고자 할 때 사용한다.
		 */
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(30);
		// 이렇게 해봐야 중복은 다 제거됨.
		// 순서도 없음. 순서 보장 안 함.
		
		// 문자열도 저장 가능. 역시 중복은 제거됨.
		Set<String> set2=new HashSet<>();
		set2.add("kim");
		set2.add("kim");
		set2.add("park");
		set2.add("lee");
		set2.add("lee");
		
		
		
	}
}
