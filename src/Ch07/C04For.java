package Ch07;

import java.util.Scanner;

public class C04For {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("for " + (i + 1) + "  " );
		}
		System.out.println();
		
		/**
		 * 1부터 10까지의 합
		 */
		System.out.println("1부터 10까지의 합");
		int sum01 = 0;
		for (int i = 0; i < 10; i++) {
			sum01 += i;
		}
		System.out.println("1부터 10까지의 합 : " + sum01);
		
		
		/**
		 * 1부터 N까지의 합
		 */
		System.out.println("1부터 num까지의 합, num을 입력해주세요");
		sum01 = 0;
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			sum01 += i;
		}
		System.out.println("1부터 num까지의 합 : " +sum01);
		
		/**
		 * 1부터 M까지의 합
		 */
		System.out.println("1부터 num2까지의 합, num2를 입력해주세요");
		sum01 = 0;
		int num2 = sc.nextInt();
		for (int i = 0; i < num2; i++) {
			sum01 += i;
		}
		System.out.println("1부터 num2까지의 합 : " +sum01);
		
		/**
		 * 2단 출력 ( 구구단 )
		 */
		System.out.println("구구단 중 2단만 출력하기");
		for (int i = 1; i < 10; i++) {
			System.out.print("2 * " + i + " = " + 2*i + "  ");
		}
		System.out.println();
		
		/**
		 * 2-9단 출력 ( 구구단 )
		 */
		System.out.println("구구단 중 2단 ~ 9단만 출력하기");
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "  ");
			}
			System.out.println();
		}
		
		
		/**
		 * 2-N단 출력 (구구단)
		 */
		System.out.print("구구단 중 2단 ~ N단만 출력하기, N을 입력해주세요 : ");
		int num02 = sc.nextInt();
		for (int i = 1; i <= num02; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "  ");
			}
			System.out.println();
		}
		
		/**
		 * N-M단 출력 ( 구구단 )
		 */
		System.out.println("구구단 중 N단 ~ M단만 출력하기");
		System.out.print("N : ");
		int num3 = sc.nextInt();
		System.out.print("M : ");
		int num4 = sc.nextInt();
		
		for (int i = num3; i <= num4; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + " * " + j + " = " + i*j + "  ");
			}
			System.out.println();
		}
		
		/**
		 * 별찍기
		 */
		System.out.print("원하는 높이만큼 정삼각형 별찍기, 높이 : ");
		int high = sc.nextInt();
		for (int i = 0; i < high; i++) {
			for (int j = 0; j < high - i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
