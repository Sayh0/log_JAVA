package test.main;

import java.util.*;

public class MainClass10 {
	public static void main(String[] args) {
		/*
		 * 회원정보는 숫자int 문자String 으로 구성되어 있기 때문에
		 * value의 generic 은 Object로 지정해야 한다.
		 * 대신 사용법이 조금 불편함(캐스팅이 필요).
		 */
		Map<String, Object> map=new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		//가지고 올때는 Object type이라 num 가져올때 오브젝트 타입으로 못 받는다. 그래서~
		//오브젝트 타입으로 리턴되기 때문에 원래 type으로 캐스팅해버리기
		int num=(int)map.get("num"); //타입캐스팅
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
		
		//해쉬맵은 자바스크립트의 { key: value } 랑 유사~~
		
	}
}
