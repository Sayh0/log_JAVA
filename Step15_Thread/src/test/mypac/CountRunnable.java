package test.mypac;
/*
 * 새로운 스레드 만드는 방법 2
 * 1. Runnable 인터페이스를 구현한 클래스 정의
 * 2. run()메소드를 강제 오버라이드
 * 3. Thread 클래스로 객체 생성하면서 해당 클래스로 만든 객체를 생성자의 인자로 전달.
 * 4. Thread 클래스로 만든 객체의 start()메소드 호출해서 스레드 시작.
 * 
 */
public class CountRunnable implements Runnable {

	@Override
	public void run() {
		//run 메소드 안쪽이 새로운 작업 단위.
		  int count=0;
		  while(true) {
		     try {
		        Thread.sleep(1000);
		     } catch (InterruptedException e) {
		        e.printStackTrace();
		     }
		     count++;
		     System.out.println("현재 카운트:"+count);
		     if(count==10) {
		        break;
		     }
		  }
	}

}
