package test.main;
/*
 *  3. 비교연산자 테스트
 *     비교연산의 결과는 boolean type 을 리턴해준다. 
 *  ==, !=, >, >=, <, <= 
 */
public class MainClass03 {
   public static void main(String[] args) {
      
      boolean result1 = 10 == 10; //true
      boolean result2 = 10 != 10; //false
      boolean result3 = 10 > 100; //false;
      boolean result4 = 10 >= 10; //true
      boolean result5 = 10 < 100; //true
      boolean result6 = 10 <= 10; //true   
      
      // String type 변수 name 에 null 대입하기 
      String name=null;
      int size=name.length();
      /*
	      System.out.println((size));
	      NullPonterException 에러. 참조값이 비어있는데 사용하려고 했기 때문.
	      이거 되게 흔한 에러. 왜 참조값이 안 들어있는지 우리는 이제 찾아야 한다.
	      문법상 오류(스트링에 달린 렝스 쓰는데 불만 없제?)는 없기 때문에 컴파일에러는 안남. 
	      그러나 런타임 시에 오류가 발생.
      */
      
      // null 인지 아닌지 비교가 가능하다 (즉 java 에서 null 값은 비교가 가능)
      boolean result7 = name == null; //true
      boolean result8 = name != null; //false
      
   }
}

