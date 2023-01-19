package Ch12;

/**
 * 디자인 패턴
 * 모든 프로그램 형식에 일반적으로 적용 가능하도록 정형화 시켜놓은 작업패턴
 * => 제작자들간의 의사소통 수단 중 일부
 * 
 */

/**
 * singleton : 객체 하나를 만들어 두고 이를 공유함,
 */
class Company01 {
	
	int x;
	int y;
	
	private static Company01 instance;
	//생성자
	private Company01() {
		
	}
	//멤버 메소드
	public static Company01 getInstance() {
		if(instance == null) {
			instance = new Company01();
		}
		return instance;
	}
}

public class C03Singleton {
	public static void main(String[] args) {
		/**
		 * 객체 하나로 공유하기에 둘의 주소값은 같다.
		 * 각 변수에 값을 할당해 준 후 비교해보면 동일객체이기 때문에 마지막으로 할당된 값이 저장된다
		 */
		Company01 cp01 = Company01.getInstance();
		Company01 cp02 = Company01.getInstance();
		System.out.println(cp01 == cp02);
		
		cp01.x = 11;
		cp01.y = 22;
		
		cp02.x = 33;
		
		System.out.println(cp01.x + ", " + cp02.x);
		System.out.println(cp01.y + ", " + cp02.y);
	}
}
