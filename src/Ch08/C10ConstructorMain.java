package Ch08;

class C10Simple {
	/**
	 * 속성
	 */
	int x;
	int y;
	
	/**
	 * 생성자
	 */
	C10Simple() {
		System.out.println("디폴트 생성자 호출!");
		/**
		 * 디폴트 생성자 호출 시 
		 * int -> 0
		 * double -> 0.0
		 * char -> 
		 * boolean -> false
		 * Object -> null
		 */
		/**
		 * 만약 디폴트값이 아닌 따로 할당을 해준다면 생성자 호출 시 할당된 값이 저장되어 있다
		 */
		x = 10;
		y = 20;
	}
	
	/**
	 * 기능
	 */
	
	
}




public class C10ConstructorMain {
	public static void main(String[] args) {
		
		/**
		 * 생성자 메소드
		 * 객체에 필요한 공간형성 + 초기값 설정
		 * 클래스명과 동일한 이름을 지정
		 * 매개변수를 가질수도 있다
		 * 반환자료형은 지정 X
		 * 객체 생성시에 호출되는 메소드 (1회만 호출)
		 * 생성자를 명시하지 않은 경우( 코드삽입 x )는 컴파일러에 의해 기본 생성자가 주입된다.(Default 생성자)
		 */
		
		
		C10Simple obj = new C10Simple();
		
		System.out.println("X : " + obj.x + ", Y : " + obj.y);
		
	}
}
