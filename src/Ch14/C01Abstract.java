package Ch14;

class par1 {
	void method1() {
		
	}
}

class son1 extends par1 {
	void method1() {
		System.out.println("Son1 의 자율적 재정의 된 메소드 ");
	}
}

//추상 클래스 상속관계
abstract class par2 {
	abstract void method2();
}

class son2 extends par2 {
	@Override
	void method2() {
		System.out.println("Son2 의 강제 재정의 된 메소드 ");
	}
}

public class C01Abstract {
	public static void main(String[] args) {
		par1 ob1 = new par1();	//o
		son1 ob2 = new son1();	//o
		
		ob1 = ob2;				//upCasting o
		ob1.method1();			//재정의된 son1 메소드 호출 가능
		
//		par2 ob3 = new par2();		//추상클래스는 객체생성이 불가하다
		son2 ob4 = new son2();		//하위클래스에서 물려받은 추상메소드를 재정의 한다면 객체생성 가능
		par2 ob5 = ob4;				//upcasting o
		ob5.method2();				//재정의된 son2 메소드 호출 가능
		
	}
}
