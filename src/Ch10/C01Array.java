package Ch10;

import java.util.Iterator;
import java.util.Scanner;

/**
 * 기본자료형 + 참조변수 + 배열의 크기
 * int		 number		 [100]
 */
public class C01Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] ar1 = new int[3];
		ar1[0] = sc.nextInt();
		ar1[1] = sc.nextInt();
		ar1[2] = sc.nextInt();
		
		
		
		System.out.println("길이 : " + ar1.length);
		for (int i = 0; i < ar1.length; i++) {
			System.out.println("ar1[" + i + "] : " + ar1[i]);
		}
		
		for(int num : ar1) {
			System.out.println(num);
		}
		
		double[] ar2 = {10.5, 11.4, 15.3, 33.5};
		System.out.println("길이 : " + ar2.length);
		
		for(double num : ar2) {
			System.out.println(num);
		}
		
		
		/**
		 * 문제
		 * 5칸 int형 배열 생성 후 각각 키보드 부터 값을 받아 순서대로 저장한 다음
		 * 배열에 있는 모든 요소안의 숫자 합을 출력해보세요
		 */
		int[] arr = new int[5];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr 배열에 들어갈 숫자를 입력해주세요 " + (i+1) + "번  ");
			arr[i] = sc.nextInt();
			sum = arr[i] + sum;
		}
		System.out.println("arr 배열의 숫자 합 : " + sum);
		
		
	}


}
