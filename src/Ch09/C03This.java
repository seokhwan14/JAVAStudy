package Ch09;

/**
 * this : 만들어져 있는 객체의 위치정보 (주소)
 * this를 통해 멤버변수와 매개변수를 구분
 * this를 통해 동일 클래스 내의 다른 매개변수를 가지는 생성자를 호출할 수 있다
 */
class C03Simple {
	int x;
	int y;
	
	C03Simple getThis() {
		return this;
	}
}

public class C03This {
	public static void main(String[] args) {
		
		C03Simple sp1 = new C03Simple();
		
		System.out.println("sp1 : " + sp1);
		System.out.println("sp1 this : " + sp1.getThis());
		
		C03Simple sp2 = new C03Simple();
		
		System.out.println("sp2 : " + sp2);
		System.out.println("sp2 this : " + sp2.getThis());
		
	}
}
