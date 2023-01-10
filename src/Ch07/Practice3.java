package Ch07;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/**
		 * for 문을 이용한 별찍기
		 */
		System.out.print("정삼각형을 찍을 높이 설정 : ");
		int num01 = sc.nextInt();
		for (int i = 0; i < num01; i++) {
			for (int j = 0; j < num01 - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/**
		 * for문을 이용한 역 별찍기
		 */
		System.out.print("역 정삼각형을 찍을 높이 설정 : ");
		int num02 = sc.nextInt();
		for (int i = 0; i < num02; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*(num02 - i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
