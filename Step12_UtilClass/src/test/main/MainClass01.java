package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>(); //가변 배열 ArrayList.
		// "피카츄', "라이츄", "파이리" 3개의 String type을 저장해 보기.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		//0번방 아이템 불러와 item 이라는 변수에 담기
		String item=names.get(0);
		//1번방 아이템 삭제하기
		names.remove(1);
		//0번방에 "에이콘" 넣기
		names.set(0, "에이콘");
		//저장된 아이템의 갯수(size) 를 size라는 로컬변수에 담기
		int size=names.size();
		//저장된 모든 아이템 삭제
		names.clear();
	}
}
