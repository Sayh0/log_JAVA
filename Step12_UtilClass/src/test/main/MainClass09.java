package test.main;

import java.util.*;

public class MainClass09 {
	public static void main(String[] args) {
		//자바스크립트에서 키 : 밸류 로 관리하는 것처럼.
		HashMap<String, String> dic=new HashMap<>();
		dic.put("house", "집");
		dic.put("phone", "전화기");
		dic.put("car", "자동차");
		dic.put("pencil", "연필");
		dic.put("eraser", "지우개");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("검색할 단어를 입력하세요 : ");
		String line=scan.nextLine();
		String mean=dic.get(line);
		
		if(mean != null) {
			System.out.println(line+"의 뜻은 \'"+mean+"\'입니다.");
		} else {
			System.out.println(line+" 단어는 목록에 없습니다.");
		}
		
		System.out.println("\n 위아래는 같은 코드입니다. \n");
		
		boolean isHere=dic.containsKey(mean);
		if (isHere) {
			System.out.println(line+"의 뜻은 \'"+mean+"\'입니다.");
		} else {
			System.out.println(line+" 단어는 목록에 없습니다.");
		}
		
		

	}
}
