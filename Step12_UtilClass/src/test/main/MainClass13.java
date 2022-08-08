package test.main;

public class MainClass13 {
	public static void main(String[] args) {
		//외형상 무한루프이지만 특정 조건에서 탈출
		int count=0;
		while(true) {
			count++;
			System.out.println("반복횟수 : "+count);
			if(count==1000) {
				break;
			}
		}
	}
}
