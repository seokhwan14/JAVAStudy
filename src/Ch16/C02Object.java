package Ch16;

class Simple {
	int x;
	int y;
	Simple(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Object클래스의 equals 메소드를 오버라이딩으로 재정의 후
	 * 내부의 x값, y값만을 비교하여 값이 일치하는지를 확인하도록 만들었다.
	 * 오버라이딩 하지않고 객체끼리만 비교한다면 다 다른 주소값을 가지기 때문에
	 * equals 메소드 사용시 false값이 나올것
	 */
	@Override
	public boolean equals(Object obj) {		//Object obj = ob2;, Upcasting
		if(obj instanceof Simple ) {
			Simple down = (Simple)obj;
			return (this.x == down.x) && (this.y == down.y);
		}else {
			return false;
		}
	}
}


public class C02Object {
	public static void main(String[] args) {
		
		Simple ob1 = new Simple(10, 20);
		Simple ob2 = new Simple(30, 40);
		Simple ob3 = new Simple(10, 20);
		
		System.out.println("ob1과 ob2의 비교 : " + ob1.equals(ob2));
		System.out.println("ob1과 ob3의 비교 : " + ob1.equals(ob3));
		System.out.println("ob2과 ob3의 비교 : " + ob2.equals(ob3));
		
	}
}
