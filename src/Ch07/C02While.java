package Ch07;

import java.util.Scanner;

public class C02While {
	public static void main(String[] args) {
		/**
		 * 구구단 출력하기 ( 2단 - 9단 )
		 */
		int num1 = 2;
		int num2 = 1;
		while(num1 < 10) {
			while(num2 < 10) {
				System.out.print(num1 + " * " + num2 + " = " + num1*num2 + "   ");
				num2++;
			}
			System.out.println();
			num2 = 1;
			num1++;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("------------ 구구단 9*1 부터 2*9까지 ------------");
		System.out.println();
		
		/**
		 * 구구단 2단부터 9단 출력,
		 * 대신 9단부터 2단으로 내려가기
		 */
		
		int num3 = 9;
		int num4 = 1;
		
		while(num3 > 1) {
			while(num4 <10) {
				System.out.print(num3 + " * " + num4 + " = " + num3*num4 + "  ");
				num4++;
			}
			System.out.println();
			num4 = 1;
			num3--;
		}
		
		System.out.println();
		System.out.println();
		System.out.println("---------- 구구단 9*9 부터 2*1까지 --------------");
		System.out.println();
		
		/**
		 * 구구단 2단부터 9단까지 출력,
		 * 대신 9단부터 2단으로 내려가고 뒤의 곱한 숫자가 9부터 1까지 내려가기
		 */
		
		int num5 = 9;
		int num6 = 9;
		
		while(num5 > 1) {
			while(num6 > 0) {
				System.out.print(num5 + " * " + num6 + " = " + num5*num6 + "   ");
				num6--;
			}
			System.out.println();
			num6 = 9;
			num5--;
		}
		
		
		/**
		 * N단을 입력받아 N단부터 9단까지 출력하기
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println();
		System.out.println("N단을 입력받아 N단부터 9단까지 출력하기");
		System.out.println();
		
		System.out.print("시작할 번호 입력 : ");
		int startNum = sc.nextInt();
		int lastNum = 1;
		while(startNum < 10 ) {
			while(lastNum < 10) {
				System.out.print(startNum + " * " + lastNum + " = " + startNum*lastNum + "   ");
				lastNum++;
			}
			System.out.println();
			lastNum = 1;
			startNum++;
		}
		
		
		/**
		 * N,M단을 입력받아 N단부터 M단까지 출력하기 ( 단, N<M, N<8, M<=9 )
		 */
		
		System.out.println();
		System.out.println();
		System.out.println("N,M단을 입력받아 N단부터 M단까지 출력하기 ( 단, N<M, N<8, M<=9 )");
		System.out.println();
		
		System.out.print("시작할 번호 입력 : ");
		int startNum2 = sc.nextInt();
		System.out.println("끝낼 번호 입력 : ");
		int lastNum2 = sc.nextInt();
		int checkNum = lastNum2;
		while(startNum2 < 10) {
			while(lastNum2 < 10) {
				System.out.print(startNum2 + " * " + lastNum2 + " = " + startNum2*lastNum2 + "   ");
				lastNum2++;
			}
			System.out.println();
			lastNum2 = checkNum;
			startNum2++;
		}
		
		
		
		
	}
}
