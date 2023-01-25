package Ch17;


/**
 * throws, throw
 */
public class C04Throws {
	/**
	 * Class 내부에서 사용하려면 ( main에서 ) static을 붙여줘야 사용 가능
	 */
	
//	static이 없어서 컴파일 에러
//	public  void Ex1() {
//		
//	}

	public static void Ex1() {
		try {
			throw new NullPointerException("Ex1의 예외처리1");
		} catch (Exception e) {
			System.out.println("Ex1의 예외처리2");
		}
		System.out.println("Ex1의 실행 코드 영역");
	}


	public static void Ex2() throws Exception {
		throw new NullPointerException("Ex2의 예외처리");
	}
	
	public static void main(String[] args) {
		
		Ex1();
		
		
		try {
			Ex2();
		} catch (Exception e){
			System.out.println("Ex2 예외처리2");
		}

	
	}
}
