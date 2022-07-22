package test.main;
/*
 *  6. 3항 연산자 테스트(생각보다 많이 쓴단다~)
 */
public class MainClass06 {
   public static void main(String[] args) {
      boolean isWait=false;
      // isWait 이 true 면 "기다려요" 가 대입되고 false 면 "기다리지 않아요" 가 대입된다.
      String result = isWait ? "기다려요" : "기다리지 않아요";
      //isWait는 false였으니까 		true		false 	중에 들어갈 것은 false.
      System.out.println(result); // false.
      // 콜론 양쪽의 데이터 타입은 같아야 한다.
      // 결과값에 붙는 타입은 자바가 지멋대로 붙이는 건가?
      
      //위의 3항 연산자는 아래와 같이 if ~ else 문과 같은 로직이다. 
      String result2=null;
      if(isWait) { result2="기다려요"; }
      else { result2="기다리지 않아요"; }
      System.out.println(result2);   
   }
}