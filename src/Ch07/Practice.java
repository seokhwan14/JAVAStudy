package Ch07;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * while문 사용해서
		 * 
		 * 구구단 만들기 2단
		 * 구구단 만들기 N단
		 * 
		 * 1부터 10까지 수 중 4의 배수만 출력
		 * 1부터 N까지 수 중 4의 배수만 출력
		 * 
		 * 1부터 10까지 수 중 3의 배수의 합만 출력
		 * 1부터 N까지 수 중 3의 배수의 합만 출력
		 */
		
		//구구단 - 2단
		int num1 = 2;
		int i = 1;
		while(i <= 9) {
			System.out.println(i + " x " + num1 + " = " + i*num1);
			i++;
		}
		System.out.println("----------------------------------");
		
		//구구단 - N단
		System.out.println("구구단의 종료 숫자를 정해주세요");
		int num2 = sc.nextInt();
		int j = 1;
		int count = 1;
		
		while(count <= num2) {
			j = 1;
			while(j <= 9) {
				System.out.println(count + " x " + j + " = " + j*count);
				j++;
			}
			count++;
		}
		System.out.println("----------------------------------");
		
		// 1부터 10까지 수 중 4의 배수만 출력
		int num3 = 1;
		while(num3 <= 10) {
			if((num3 % 4) == 0) {
				System.out.println("1부터 10까지의 숫자 중 4의 배수 : " + num3);
			}
			num3++;
		}		
		System.out.println("----------------------------------");

		//1부터 N까지 수 중 4의 배수만 출력
		int num4 = 1;
		System.out.println("1부터 4의 배수인지 검증을 할 마지막 숫자를 입력해 주세요.");
		int selectNum = sc.nextInt();
		while(num4 <= selectNum) {
			if((num4%4) == 0) {
				System.out.println("1부터 " + selectNum + "까지의 숫자 중 4의 배수 : " + num4);
			}
			num4++;
		}
		System.out.println("----------------------------------");
		
		//1부터 10까지 수 중 3의 배수의 합만 출력
		int num5 = 1;
		int sum5 = 0;
		while(num5 <= 10 ) {
			if((num5%3)==0) {
				System.out.println("1부터 10까지의 숫자 중 3의 배수 : " + num5);
				sum5 = sum5 + num5;
			}
			num5++;
		}
		System.out.println("3의 배수의 합 : " + sum5);
		System.out.println("----------------------------------");
		
		//1부터 N까지의 수 중 3의 배수의 합만 출력
		System.out.println("3의 배수의 합을 더할 마지막 숫자를 지정해 주세요.");
		int num6 = 1;
		int selectNum2 = sc.nextInt();
		int sum6 = 0;
		while(num6 <= selectNum2) {
			if((num6 % 3) == 0 ) {
				System.out.println("1부터 " + selectNum2 + "까지의 숫자 중 3의 배수 : " + num6);
				sum6 = sum6 + num6;
			}
			num6++;
		}
		System.out.println("1부터 " + selectNum2 + "까지의 숫자 중 3의 배수의 합 : " + sum6);
		
		
		
	}
}
