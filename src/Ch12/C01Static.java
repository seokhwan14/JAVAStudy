package Ch12;
/**
 * 자바의 메모리 구조
 * 1. 스택영역
 * 		{}내의 지역변수, {}내에서 생성, 벗어날 시 소멸
 * 
 * 2. 클래스 영역(메소드 영역)
 * 		공유메모리, static변수, 일반메소드, 생성자 메소드
 * 		프로그램 시작과 동시에 생성, 프로그램 종료시 소멸
 * 
 * 3. 힙영역 : 객체저장공간
 * 		new 예약어 사용시 생성, 소멸은 JVM의 가비지컬렉터에 의해 소멸
 */
class Simple {
	static int num1 = 0;
	int num2;
	void showNum() {
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}
}


public class C01Static {
	public static void main(String[] args) {
		
		/**
		 * static으로 사용시 객체생성을 하지 않아도 클래스 자체에서 호출 가능하다
		 */
		Simple.num1 = 23456;
		System.out.println(Simple.num1);
		
		/**
		 * static으로 사용시 다른 객체를 생성하여도 변수의 같은 값을 공유한다
		 */
		Simple sp1 = new Simple();
		Simple sp2 = new Simple();

		sp1.num1 = 1111;
		sp2.num2 = 2222;
		sp2.showNum();
		
		sp2.num1 = 3333;
		sp1.num2 = 4444;
		sp1.showNum();
		
	}
}
