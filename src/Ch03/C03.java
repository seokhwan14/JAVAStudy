package Ch03;

public class C03 {
	public static void main(String[] args) {
		int num1 = 129;
		int num2 = 130;
		byte ch1 = (byte)num1;
		byte ch2 = (byte)num2;
		
		//음수로 나오는 이유 : -부호값으로 인식하기 때문, 이처럼 결과값이 다르게 나온다
		System.out.printf("%d\n", (int)ch1);
		System.out.printf("%d\n", (int)ch2);
	}
}
