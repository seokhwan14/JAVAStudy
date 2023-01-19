package Ch10;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
			sum += arr[i];
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합 : " + sum);
		
	}
}
