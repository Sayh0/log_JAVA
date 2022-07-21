package test.main;

public class MainClass07 {
	public static void main(String[] args) {
		//지역변수를 미리 만들고 필요한 값을 나중에 넣고 싶으면, 초기값을 대입해 놓는 것이 좋다.
		
		int num1=0; //우선 기본값을 넣어놓으란 뜻. 그래야 변수가 '생성' 되어 있으니까.
		String name1=null;//참조 데이터 type이 담길 수 있는 빈 공간은 null을 대입하면 된다.

		
		//필요시에 값 넣기.
		num1=999;
		name1="피카츄";
	}
}
