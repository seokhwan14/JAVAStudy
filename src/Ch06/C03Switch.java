package Ch06;

import java.util.Scanner;

public class C03Switch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/**
		 * Switch문을 사용하는 경우,
		 * 메뉴를 고르는 등의 단순작업에 사용하기 편하다
		 * (주의) Switch문의 Break를 사용하지 않으면 조건에 맞는 구간부터 아래의 조건들을 모두 다 실행하게 된다.
		 */
		System.out.println("등수를 입력해 주세요.");
		int ranking = sc.nextInt();
		char medalColor;
		
		switch (ranking) {
		case 1:
			medalColor = 'G';
			System.out.println("메달 색상 : G");
			break;
		case 2:
			medalColor = 'S';
			System.out.println("메달 색상 : S");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달 색상 : B");
			break;
		case 4:
			medalColor = 'C';
			System.out.println("메달 색상 : C");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달 색상 : C");
			break;
		}
		System.out.println(ranking + "등에게 주어지는 메달 색상은 " + medalColor + "입니다.");
		
		
	}
}
