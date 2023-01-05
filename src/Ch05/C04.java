package Ch05;

/**
 * shift연산자
 */
public class C04 {
public static void main(String[] args) {
		
		int num1 = 15;		//00000000  00000000  00000000  00001111
		int num2 = 20;		//00000000  00000000  00000000  00010100
		
		//Shift는 위치를 옮겨주는 역할이다.
		//num2를 왼쪽으로 2칸 밀어주기에 00111100 => 80이라는 값이 나온다. 간단하게 생각하면 2의2승을 곱해준것.
		int num3 = num2<<2;
		//num2를 오른쪽으로 2칸 밀어주는 값, 2의 -2승을 곱해준것 => 5라는 결과가 나온다.
		int num4 = num2>>2;
		
		System.out.println("<<Shift 연산결과 : " + num3);
		System.out.println(">>Shift 연산결과 : " + num4);
	}
}
