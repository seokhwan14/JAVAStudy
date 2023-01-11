package Ch08;

public class C07SimpleMethodMain {
	public static void main(String[] args) {
		C07Sum calc = new C07Sum();
		
		
		int r1 = calc.sum1(2, 4);
		System.out.println("sum1메소드의 사용 결과 : " + r1);
		System.out.println();
		System.out.println();
		
		calc.sum2(4, 5);
		System.out.println();
		System.out.println();
		
		System.out.println("곱할 숫자 두가지를 입력해주세요.");
		int r3 = calc.sum3();
		System.out.println("sum3메소드의 사용 결과 : " + r3);
		System.out.println();
		System.out.println();
		
		System.out.println("나눌 숫자 두가지를 입력해주세요. ex) 4,2 입력시 4/2");
		calc.sum4();
		
	}
}
