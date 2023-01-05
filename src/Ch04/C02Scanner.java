package Ch04;

import java.util.Scanner;

public class C02Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);
		
		System.out.print("실수 입력 : ");
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수 값 : " + num2);

		
		/**
		 * nextLine 사용시 주의점
		 * next, nextInt, nextDouble 함수 사용 후 nextLine함수를 사용해서 문자열을 받게 된다면
		 * sc.nextLine을 한번 더 사용해서 읽어들이는 버퍼라인을 초기화한다
		 * => 위의 함수 사용 후 nextLine 입력구간에서 자동으로 버퍼에 남아있던 엔터키에 대한 정보가 입력되므로 엔터가 입력된것으로 인식해버린다
		 */
		sc.nextLine();
		System.out.print("문자열 입력 : ");
		String str1 = sc.nextLine();
		System.out.println("입력된 문자열: " + str1);
		
		sc.close();
		
	}
}
