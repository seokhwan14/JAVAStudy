package Ch10;


/**
 * 다차원 배열
 * 
 */
public class C03MultiArray {
	public static void main(String[] args) {
		/**
		 * 이차원 배열
		 * 일차원 배열의 배열요소 단위는 자료형 단위이다
		 * 이차원 배열의 배열요소 단위는 일차원 배열이다
		 */
		int[][] arr1 = new int[2][3];
		
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;

		arr1[1][0] = 11;
		arr1[1][1] = 22;
		arr1[1][2] = 33;
		
		System.out.println("행 개수 : " + arr1.length);
		System.out.println("0번 행의 열 개수 : " + arr1[0].length);
		System.out.println("1번 행의 열 개수 : " + arr1[1].length);
		
	}
}
