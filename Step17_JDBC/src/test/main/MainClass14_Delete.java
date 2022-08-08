package test.main;

import java.util.Scanner;

import test.dao.MemberDao;

public class MainClass14_Delete {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("input data number want to delete.");
		int num=scan.nextInt();
		
		boolean isSuccses=new MemberDao().delete(num);
		if(isSuccses) {
			System.out.println("member data delete completed.");
		} else {
			System.out.println("delete failed!");
		}
		
	}
}
