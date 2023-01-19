package Ch09;


class C04Simple {
	int x;
	int y;
	
	//2. this 사용 이유 ( 매개변수와 멤버변수의 구별 )
	void setX(int x) {
		this.x = x;
	}
	
	//2. this 사용 이유 ( 동일클래스의 다른 생성자 호출에 사용 )
	C04Simple() {
		x = 10;
		y = 10;
//		this(10,10);
		System.out.println("디폴트 생성자 호출");
	}
	
	C04Simple(int x) {
		this.x = x;
//		this(x,10);
		y = 10;
		System.out.println("int x 생성자 호출");
	}
	
	C04Simple(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("int y 생성자 호출");
	}
	
	
	
}

public class C04This {
	public static void main(String[] args) {
		
		
		C04Simple obj = new C04Simple();
		System.out.println(obj.x + ", " + obj.y);

		C04Simple obj2 = new C04Simple(5);
		System.out.println(obj2.x + ", " + obj2.y);
		
		C04Simple obj3 = new C04Simple(5,6);
		System.out.println(obj3.x + ", " + obj3.y);

	
	}
}
