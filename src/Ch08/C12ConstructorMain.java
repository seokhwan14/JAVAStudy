package Ch08;

class C12Simple {
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
	C12Simple() {
		System.out.println("디폴트 생성자 호출 ! ");
	}
	
	C12Simple(int x) {
		System.out.println("C12Simple(int) 생성자 호출 ! ");
		this.x = x;
		//this는 객체의 위치정보를 담고 있다.
		//객체의 x값을 파라미터로 받은 x값으로 넣어주겠다 ( 생성자 외부에서 만든 int x의 값에다가 생성자에서 파라미터로 받아온 x값을 사용한다는 뜻 )
	}
	
	C12Simple(int x, double y) {
		System.out.println("C12Simple(int, double) 생성자 호출 ! ");
		this.x = x;
		this.y = y;
	}
	
	C12Simple(int x, double y, char z) {
		System.out.println("C12Simple(int, double, char) 생성자 호출 ! ");
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	/**
	 * 기능
	 */
	@Override
	public String toString() {
		return " C12Simple [x = " + x + ", y = " + y + ", z = " + z + ", flag = " + flag + ", name = " + name;
	}
	
	
}




public class C12ConstructorMain {
	public static void main(String[] args) {
		
		C12Simple obj = new C12Simple();
		System.out.println(obj.toString());

		C12Simple obj02 = new C12Simple(12);
		System.out.println(obj02.toString());
		
		C12Simple obj03 = new C12Simple(12, 10.0);
		System.out.println(obj03.toString());

		C12Simple obj04 = new C12Simple(12, 10.0, 'Z');
		System.out.println(obj04.toString());
	}
}
