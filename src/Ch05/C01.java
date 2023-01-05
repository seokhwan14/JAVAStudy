package Ch05;

import java.util.Scanner;

public class C01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/**
		 * 1. 산술 연산자
		 * 		( + - * / % )
		 * 2. 대입 연산자
		 * 3. 복합 대입 연산자
		 * 4. 비교 연산자(중요)
		 * 5. 논리 연산자(중요)
		 * 6. 증감 연산자
		 * 7. 삼항 연산자
		 */
		
		// 1. 산술 연산자
		int a = 10, b = 20, c;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("b / a = " + (b / a));	//나누기
		System.out.println("a % b = " + (a % b));	//나눈 후 나머지 -> 짝/홀수 구분, 배수구분, 자리수제한, 끝자리구하기 등에 사용된다
		System.out.println("-a = " + -a);
		
//		// 2. 대입 연산자
//		// 예제 : 두 정수를 입력받아 두수의 합 / 곱 / 차를 출력하는 프로그램을 만듭니다.
//		System.out.print("1. 입력받을 수 : ");
//		int num1 = sc.nextInt();
//		System.out.print("2. 입력받을 수 : ");
//		int num2 =sc.nextInt();
//		System.out.println("두 수의 합 : " + (num1 + num2));
//		System.out.println("두 수의 곱 : " + (num1 * num2));
//		System.out.println("두 수의 차 : " + (num1 - num2));
		
		
		// 3. 복합대입연산자 (선택)
		int d = 10;
		d += 10;
		d -= 5;
		d *= 3;
		System.out.println("d= " + d);
		
		
		// 4. 비교 연산자 ( true or false )
		int e = 10;
		int f = 20;
		System.out.println("E == F : " + (e == f));
		System.out.println("E > F : " + (e > f));
		System.out.println("E < F : " + (e < f));
		System.out.println("E >= F : " + (e >= f));
		System.out.println("E <= F : " + (e <= f));
		System.out.println("E != F : " + (e != f));
		
		
		// 5. 논리 연산자
		/**
		 * And 연산 && : 모든 조건식이  true 이어야만 true값 반환
		 * Or 연산 || : 조건식 중 하나라도 true라면 true값 반환
		 * ! : true일때 false값, false일때 true값 반환
		 */
		System.out.println("true AND true = " + (true && true));
		System.out.println("true AND false = " + (true && false));
		System.out.println("true OR false = " + (true || false));
		System.out.println("!true = " + (!true));
		
		// 6. 증감 연산자
		//++a(--a) : 전치 연산자 : 먼저 값 1 증가(1감소) 이후 다른 연산자 처리
		//a++(a--) : 후치 연산자 : 다른 연산자 처리 후 1증가(1감소)
		
		int num1 = 10, num2 = 10, num3, num4;
		
		num3 = --num1;
		num4 = num1--;
		System.out.println("num1, num2, num3, num4 = " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
		
		
		// 7. 삼항 연산자
		// (조건식)? 참인경우 실행코드 : 거짓인경우 실행코드;
		
		int kor = 85;
		int eng = 60;
		//국어점수와 영어점수가 각 80점 이상이면 true, true 값일 경우 A를, false값일 경우 B를 반환
		char grade = (kor > 80 && eng > 80) ? 'A' : 'B';
		System.out.println(grade + "등급입니다.");
		
		
		
		
		
		
		
		
		
	}
}
