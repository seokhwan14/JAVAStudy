package Ch04;

import java.util.Scanner;

public class C03Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. : ");
		String str1 = sc.nextLine();

		System.out.print(str1 + "님의 나이를 입력해주세요. : ");
		int num1 = sc.nextInt();
		
		sc.nextLine();
		System.out.print(str1 + "님의 주소를 입력해주세요. : ");
		String str2 = sc.nextLine();
		
		System.out.print(str1 + "님의 나이는 " + num1 + "세, 주소는 " + str2 + "입니다.");
		
	}
}
