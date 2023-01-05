package Ch06;

import java.util.Scanner;

public class C01IF {
	public static void main(String[] args) {
		// 1. 단순 IF
		
		Scanner sc = new Scanner(System.in);
//		int age;
//		age = sc.nextInt();
//		System.out.println("나이 : " + age);
//		if(age >= 8 ) {
//			System.out.println("학교에 다닙니다.");
//		}
//		System.out.println("첫번째 if 블럭 종료");
//		
//		if(age < 8 ) {
//			System.out.println("학교에 다니지 않습니다.");
//		}
//		System.out.println("두번째 if 블럭 종료");
//		System.out.println("프로그램 종료");
		
		//다음부분 그냥 같은내용으로 if, else if
		
		//문제 1. 입력받은 수가 짝수인지 홀수인지 확인하는 조건문 작성
		System.out.println(" (1) 숫자 하나를 입력해주세요 ( 짝/홀수 확인 )");
		int num1 = sc.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println(num1 + "은(는) 짝수입니다.");
		}else {
			System.out.println(num1 + "은(는) 홀수입니다.");
		}
		
		
		//문제 2. 정수 하나 입력받아 3의 배수인지 확인
		System.out.println(" (2) 숫자 하나를 입력해주세요 ( 3의 배수 확인 )");
		int num2 = sc.nextInt();
		if(num2 % 3 == 0 ) {
			System.out.println(num2 + "은(는) 3의 배수입니다.");
		}else {
			System.out.println(num2 + "은(는) 3의 배수가 아닙니다.");			
		}
		
		//문제 3. 두수를 입력받아 큰수를 출력
		System.out.println(" (3) 숫자 두가지를 입력해주세요 ( 대소 비교 )");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		if( num3 > num4 ) {
			System.out.println("큰 수는 " + num3 + "입니다.");
		} else if(num3 == num4) {
			System.out.println("두 수 " + num3 + "은(는) 같은 숫자입니다.");
		}
		else {
			System.out.println("큰 수는 " + num4 + "입니다.");
		}
		
		//문제 4. 세수를 입력받아 큰수를 출력
		
		System.out.println(" (4) 숫자 세가지를 입력해주세요. ( 대소 비교 )");
		
		int num5 = sc.nextInt();
		int num6 = sc.nextInt();
		int num7 = sc.nextInt();
		
		
		if(num5 >= num6 && num5 >= num7) {
			System.out.println("세 숫자 중 가장 큰 숫자는 " + num5 + "입니다.");
		}else if ( num6 >= num5 && num6 >= num7 ) {
			System.out.println("세 숫자 중 가장 큰 숫자는 " + num6 + "입니다.");
		}else {
			System.out.println("세 숫자 중 가장 큰 숫자는 " + num7 + "입니다.");
		}
	}
}
