package Ch07;

import java.util.Scanner;

public class C01While {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		/**
		 * 탈출용 변수 지정
		 * 탈출을 위한 조건식 설정
		 * 조건식이 만족되면 true값이 false가 되어 탈출
		 */
		int count = 0;
		
		while(count < 4) {
			System.out.println("가나다라마바사");
			count ++;
		}
		/**
		 * 1부터 9까지의 합
		 */
		int count2 = 0;
		int i = 1;
		
		while(count2 < 10) {
			
			i = count2 + i;
			count2++;
			System.out.println(i);
		}
		
		/**
		 * 문제) 1부터 N까지의 합 구하기
		 */
		System.out.println("1부터 더하기를 시작하여 마무리할 숫자를 지정해 주세요.");
		int count3 = 1;
		int n = sc.nextInt();
		int sum1 = 0;
		while(count3 <= n) {
			sum1 = count3 + sum1;
			System.out.println(sum1);
			count3++;
		}
		
		
		/**
		 * 문제2) n3부터 m3까지의 합, 단 m3은(는) n3보다 커야함
		 */
		System.out.println("더하기를 시작할 숫자를 지정해주세요.");
		int n3 = sc.nextInt();
		System.out.println("더하기를 종료할 숫자를 지정해주세요.");
		int m3 = sc.nextInt();
		int sum3 = 0;
		
		/**
		 * Swap -> 기존의 조건식에서 n3, m3의 값을 거꾸로 바꿔주고 싶을때 사용
		 * 뭐... 자주 쓰겠냐만은
		 */
//		if(n3 > m3 ) {
//			int tmp = n3;
//			n3 = m3;
//			m3 = tmp;
//		}
		
		
		
		while(n3 < m3) {
			
			sum3 = sum3 + n3;
			System.out.println(n3 + "부터 " + m3 + "까지 더하는 중... 값 : " + sum3);
			n3++;
		}
		
	}
}
