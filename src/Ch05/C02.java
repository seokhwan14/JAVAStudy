package Ch05;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * 나머지 연산자
 */
public class C02 {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		/** 
		 *  1. 짝홀수 구분
		 *  나머지 값이 1또는 0일 경우를 찾아 짝수, 홀수를 검증
		 */
		System.out.println("1. 짝/홀수 구분) 숫자를 입력해주세요.");
		int num1 = sc.nextInt();
		String result1 = (num1 % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		
		System.out.println(num1 + "은(는) " + result1);
		
		/**
		 * 2. 배수 구분
		 * 
		 */
		System.out.println("2. 배수구분) 더할 숫자 세가지를 입력해주세요.");
		int n1, n2, n3, n4, sum;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		System.out.println("나눌 숫자를 입력해주세요.");
		n4 = sc.nextInt();
		sum = n1 + n2 + n3;
		String result2 = (sum%n4 == 0) ? n4 + "의 배수입니다." : n4 + "의 배수가 아닙니다.";
		 
		System.out.println(n1 + " + " + n2 + " + " + n3 + "의 값은 " + result2);
		
		/**
		 * 3. 수의 범위제한
		 * N % 2 = 0 ~ 1
		 * N % 3 = 0 ~ 2
		 * N % 10 = 0 ~ 9
		 * N % 100 = 0 ~ 99
		 */
		
		// Random 클래스를 받아와 난수를 생성해준다.
		Random rd = new Random();
		
//		while(true) {
//			System.out.println(rd.nextInt(5));
//			//쓰레드 클래스의 sleep메소드를 불러와 0.5초간 멈췄다가 반복하도록 설정
//			//throws InterruptedException을 메인메소드에 붙혀줌
//			Thread.sleep(500);
//		}
		
		// Math.random() 사용하기
		int a = 0;
		while( a != 5 ) {
			a = (int)(Math.random() * 10);
			System.out.println(a);
			Thread.sleep(500);
			if( a == 5) {
				System.out.println("while문 종료.");
			}
		}
		
		
		/**
		 * 4. 자리수
		 */
		int bigNum = 56789;
		System.out.println("오른쪽 끝 1자리 : " + (bigNum % 10));
		System.out.println("오른쪽 끝 2자리 : " + (bigNum % 100));
		System.out.println("오른쪽 끝 3자리 : " + (bigNum % 1000));
		System.out.println("오른쪽 끝 4자리 : " + (bigNum % 10000));
		System.out.println();
		System.out.println("왼쪽 끝 1자리 : " + (bigNum / 10));
		System.out.println("왼쪽 끝 2자리 : " + (bigNum / 100));
		System.out.println("왼쪽 끝 3자리 : " + (bigNum / 1000));
		System.out.println("왼쪽 끝 4자리 : " + (bigNum / 10000));
		
		/**
		 * 문제1.
		 * 정수 하나를 입력받아 거꾸로 저장해 보세요 ( 반복문법 이후 풀어보기 ) %,/ 연산 동시에 사용할 것
		 * 입력할 숫자 : 1234
		 * int reverse = 4321;의 값으로 나오도록
		 * 
		 * 문제2.
		 * 정수값 3개를 입력받은 후 그 합이
		 * 짝수이면서 5의 배수이면 '참입니다' 를 출력, 아닐 경우 '거짓입니다' 출력
		 * 조건식에 %, && 연산자 사용
		 * 삼항연산자를 사용
		 */
		
		//문제 1
		int exam = 1234;
		int reverse;
		
		reverse = exam/1000;
		
		
		//문제 2
		int num01, num02, num03, sum01;
		System.out.println("세가지 숫자를 입력해주세요.");
		num01 = sc.nextInt();
		num02 = sc.nextInt();
		num03 = sc.nextInt();
		
		sum01 = num01 + num02 + num03;
		String result01 = ((sum01 % 5 == 0) && (sum01 % 2 == 0)) ? "참입니다." : "거짓입니다.";
		System.out.println(num01 + " + " + num02 + " + " + num03 + "의 값이 짝수이면서 5의 배수이다 : " + result01);
		
		
	}
}
