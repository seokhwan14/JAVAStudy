package Ch05;

/*
 * 비트 연산자
 */
public class C03 {
	public static void main(String[] args) {
		
		int num1 = 15;		//00000000  00000000  00000000  00001111
		int num2 = 20;		//00000000  00000000  00000000  00010100
		
		//num1과 num2 를 비트연산으로 비교
		//00001111
		//00010100
		//이 구간에서 같은지 다른지를 체크, 1= true, 0= false => 00000100이라는 결과가 나오고 이 값은 4를 의미한다
		int num3 = num1&num2;
		
		//위의 and연산과 같은식으로 or연산, 00011111이라는 값이 나오므로 31
		int num4 = num1|num2;
		
		
		int num5 = num1^num2;
		
		//num1의 보수를 의미
		int num6 = ~num1;
		
		
		System.out.println("AND 비트 연산 결과 : " + num3);
		System.out.println("OR 비트 연산 결과 : " + num4);
		System.out.println("XOR 비트 연산 결과 : " + num5);
		System.out.println("NOT 비트 연산 결과 : " + num6);
	}
}
