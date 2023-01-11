package Ch08;

import java.util.Scanner;

public class C07Sum {
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 인자 o , return값 o
	 */
	int sum1( int x, int y ) {
		return x + y;
	}
	
	/**
	 * 인자 o , return x
	 */
	void sum2(int x, int y) {
		System.out.println("sum2메소드의 값 확인 - x : " + x + ", y : " + y);
	}
	
	/**
	 * 인자 x , return o
	 */
	int sum3() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x * y;
	}
	/**
	 * 인자 x , return x
	 */
	void sum4() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println("sum4메소드(나누기)의 값 확인 : " + (x / y));
	}
	
}
