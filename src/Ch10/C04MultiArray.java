package Ch10;

public class C04MultiArray {
	public static void main(String[] args) {
		int[][] arr1 = {
				{10, 20},
				{30, 40, 50},
				{60, 70, 80, 90},
				{100, 110, 120, 130, 140}
		};
		
		//길이 확인
		System.out.println("arr1의 행의 길이 : " + arr1.length);
		System.out.println("arr1의 0번째 요소 길이 : " + arr1[0].length);
		System.out.println("arr1의 1번째 요소 길이 : " + arr1[1].length);
		System.out.println("arr1의 2번째 요소 길이 : " + arr1[2].length);
		System.out.println("arr1의 3번째 요소 길이 : " + arr1[3].length);
		
		for(int[] ar : arr1) {
			for(int n : ar) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
