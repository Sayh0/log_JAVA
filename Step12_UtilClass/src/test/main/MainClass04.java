package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> friends=new ArrayList<>();
		
		for (int i=0;i<3;i++) {
			System.out.print("문자열 입력 : ");
			String line=scan.nextLine();
			friends.add(line);
		}
		for (String tmp:friends) {
			System.out.println(tmp);
		}
	}
}
