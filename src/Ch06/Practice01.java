package Ch06;

import java.util.Scanner;

public class Practice01 {
	public static void main(String[] args) {
		
		/**
		 * 나이별로 요금을 부과하는 else if 문을 만드세요.
		 * 나이는 정수값으로 입력받습니다.
		 * 8세 미만 : 요금 1000원
		 * 14세 미만 : 요금 2000원
		 * 20세 미만 : 요금 2500원
		 * 20세 이상 : 요금 3000원
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요금을 알기위한 나이를 입력해주세요.");
		int age = sc.nextInt();
		
		if(age < 8) {
			System.out.println("8세 미만입니다. 요금은 1000원 입니다.");
		}
		else if(age < 14) {
			System.out.println("14세 미만입니다. 요금은 2000원 입니다.");
		}
		else if(age < 20) {
			System.out.println("20세 미만입니다. 요금은 2500원 입니다.");
		}
		else if(age >= 20) {
			System.out.println("20세 이상입니다. 요금은 3000원 입니다.");
		}
		
	}
}
