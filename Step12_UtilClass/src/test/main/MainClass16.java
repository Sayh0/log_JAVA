package test.main;

import java.util.*;

public class MainClass16 {
	public static void main(String[] args) {
		HashSet<Integer> type=new HashSet<Integer>();
		Random ran=new Random();
		int b=ran.nextInt(10);
		
		while(type.size()<6) {
			int tmp=ran.nextInt(45)+1;
			type.add(tmp);
		}
		System.out.println(type);
		
		Iterator<Integer> iter= type.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
