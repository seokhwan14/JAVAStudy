package Ch07;

import java.util.Scanner;

public class Practice2 {
	public static void main(String[] args) {
		
		/**
		 *  ***** 5줄
		 */
		int num1 = 1;
		while(num1 <= 5) {
			System.out.println("*****");
			num1++;
		}

		System.out.println();
		System.out.println();
		
		/**
		 *  * ~ ****
		 */
		int num2 = 1;
		int num3 = 1;
		while(num2 <= 4) {
			while(num3 <= num2) {
				System.out.print("*");
				num3++;
			}
			System.out.println();
			num3 = 1;
			num2++;
		}
		
		System.out.println();
		System.out.println();
		
		/**
		 *  **** ~ *
		 */
		int num4 = 1;
		int num5 = 4;
		while(num4 <= 4) {
			while(num5 >= num4) {
				System.out.print("*");
				num5--;
			}
			System.out.println();
			num5 = 4;
			num4++;
		}
		
		System.out.println();
		System.out.println();
		
		/**
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 */
		int num01 = 1;
		int num02 = 1;
		while(num01 <= 4) {
			while((num02) <= (4-num01)) {
				System.out.print(" ");
				num02++;
			}
			num02 = 1;
			while(num02 <= num01) {
				System.out.print("*");
				num02++;
			}
			num02 = 1;
			while(num02 < num01) {
				System.out.print("*");
				num02++;
			}
			System.out.println();
			num02 = 1;
			num01++;
		}
		
		System.out.println();
		System.out.println();

		/**
		 * 	*******
		 * 	 *****
		 * 	  ***
		 * 	   *
		 */
		
		num01 = 1;
		num02 = 4;
		
		while(num01 <= 4) {
			while(num02 > (5-num01)) {
				System.out.print(" ");
				num02--;
			}
			num02 = 4;
			while(num02 >= num01) {
				System.out.print("*");
				num02--;
			}
			num02 = 4;
			while(num02 > num01) {
				System.out.print("*");
				num02--;
			}
			System.out.println();
			num02 = 4;
			num01++;
		}

		System.out.println();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		/**
		 * 높이만큼의 직삼각형별이 출력되도록 합니다
		 */
		System.out.print("직삼각형 별의 높이를 지정해주세요 : ");
		int high = sc.nextInt();
		int num10 = 1;
		int num20 = 1;
		while(num10 <= high) {
			while(num20 <= num10) {
				System.out.print("*");
				num20++;
			}
			num20 = 1;
			System.out.println();
			num10++;
			
		}
		
		System.out.println();
		System.out.println();
		
		/**
		 * 높이만큼의 직삼각형 별이 출력되도록 합니다 (reverse)
		 */
		System.out.print("직삼각형 별의 높이를 지정해주세요 (reverse)");
		int high2 = sc.nextInt();
		num10 = 1;
		num20 = high2;
		while(num10 <= high) {
			while(num20 >= num10) {
				System.out.print("*");
				num20--;
			}
			System.out.println();
			num20 = high2;
			num10++;
		}
		
		/**
		 *     *
		 *    ***
		 *   *****
		 *  *******
		 */
		num01 = 1;
		num02 = 1;
		while(num01 <= 4) {
			while((num02) <= (4-num01)) {
				System.out.print(" ");
				num02++;
			}
			num02 = 1;
			while(num02 <= (2*num01 - 1)) {
				System.out.print("*");
				num02++;
			}
			
			System.out.println();
			num02 = 1;
			num01++;
		}
		
		
		
		
	}
}
