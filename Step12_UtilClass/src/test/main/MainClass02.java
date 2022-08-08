package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("피카츄");
		names.add("라이츄");
		names.add("파이리");
		names.add("꼬부기");
		names.add("버터플");
		
		for(int i=0;i<names.size();i++) {
			String tmp=names.get(i);
			System.out.println(i+1+" 번째 친구 : "+tmp);
		}
	}
}
