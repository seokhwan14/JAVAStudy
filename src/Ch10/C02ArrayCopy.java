package Ch10;

import java.util.Arrays;

/**
 * 배열 복사
 */
public class C02ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = {10,20,30};
		
		//얕은복사(위치값 복사, 값 자체는 복사x)
		int[] arr2 =  arr1;
		
		//복사 후 배열의 0번째 수 재할당
		arr2[0] = 300;
		
		for(int n : arr1) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		//깊은 복사(공간 형성 후 데이터값 복사)
		// 1
		int[] arr3 = new int[3];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = arr1[i];
		}
		
		for(int n : arr3) {
			System.out.println("arr3 : " + n + " ");
		}
		
		
		// 2
		int[] arr4 = Arrays.copyOf(arr1, arr1.length);
		
		for(int n : arr4) {
			System.out.println("arr4 : " + n + " ");
		}
		
		//최종적으로 각 배열의 저장 위치값 확인 후 비교
		System.out.println("arr1 위치 : " + arr1);
		System.out.println("arr2 위치 : " + arr2);
		System.out.println("arr3 위치 : " + arr3);
		System.out.println("arr4 위치 : " + arr4);
		
	}
}
