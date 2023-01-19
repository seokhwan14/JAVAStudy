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

//추상 메소드
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
		
		son2 par = new son2();
		
		par.method2();
	}
}
