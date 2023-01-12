package Ch08;

class C11Simple {
	/**
	 * 속성
	 */
	int x;
	double y;
	char z;
	boolean flag;
	String name;
	
	/**
	 * 생성자
	 */
	C11Simple() {
		System.out.println("디폴트 생성자 호출 ! ");
	}
	
	/**
	 * 기능
	 */
	@Override
	public String toString() {
		return " C11Simple [x = " + x + ", y = " + y + ", z = " + z + ", flag = " + flag + ", name = " + name;
	}
}




public class C11ConstructorMain {
	public static void main(String[] args) {
		
		C11Simple obj = new C11Simple();
		System.out.println(obj.toString());
	}
}
