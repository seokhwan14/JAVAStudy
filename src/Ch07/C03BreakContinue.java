package Ch07;

import java.util.Scanner;

public class C03BreakContinue {
	public static void main(String[] args) {
		
		/**
		 * break 가장 가까이에 있는 반복문 벗어날때 사용
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int sum = 0;
		while(true) {
			System.out.print("더할 숫자를 입력해주세요. : ");
			n = sc.nextInt();
			if(n==-1) {
				break;
			}
			
			sum += n;
			System.out.println("지금까지 더한 숫자의 합 : " + sum);
		}
		System.out.println("SUM = " + sum);
		
	}
}
