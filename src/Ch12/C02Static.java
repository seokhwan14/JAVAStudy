package Ch12;

class Simple2 {
	int n1;
	static int n2;
	
	void function01() {
		n1 = 10;
		n2 = 20;
	}
	
	static void function02() {
		//n1의 값을 할당하려 하면 문제가 발생한다, 이는 static이 아니기 때문
		//=> 객체를 생성하지 않으면 만들수가 없다
		
//		n1 = 10;
		n2 = 20;
		int num = 10;
	}
}


public class C02Static {
	public static void main(String[] args) {
		
		Simple2.function02();
		System.out.println(Simple2.n2);
		
		
	}
}
