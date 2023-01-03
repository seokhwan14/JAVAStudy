package Ch02;


/**
 * 진수에 대한 설명
 * 
 *
 */
public class C01 {
	public static void main(String[] args) {
		/**
		 * 문제풀이
		 * 2진수 -> 10진수
		 * 01100010 -> 2 + 32 + 64 = 98
		 * 01010001 -> 1 + 16 + 64 = 81
		 * 01100110 -> 2 + 4 + 32 + 64 = 102
		 * 
		 * 10진수 -> 2진수
		 * 31 -> 11111
		 * 25 -> 11001
		 */
		
		/**
		 * 진법변환 서식문자
		 * %d	: 10
		 * %o	: 8
		 * %x	: 16 - 16진수는 10이상은 A B C D E F 로 표현한다 ex) AD -> 10x16 + 13
		 */
		/**
		 * 10진수
		 */
		System.out.printf("10진수 : %d\n", 173);
		
		/**
		 * 8진수 ( 0 : 8진수를 의미하는 접두사 )
		 */
		System.out.printf("0255의 10진수 : %d\n", 0255);
		
		/**
		 * 16진수 ( 0x : 16진수를 의미하는 접두사 )
		 */
		System.out.printf("0xAD의 10진수 : %d\n", 0xAD);		
		
		/**
		 * 2진수 ( )
		 */
		System.out.printf("0b1111의 10진수 : %d\n", 0b1111);

		System.out.printf("8진수 : %o\n", 173);
		System.out.printf("8진수 : %o\n", 0255);
		System.out.printf("8진수 : %o\n", 0xAD);
		
		System.out.printf("16진수 : %x\n", 173);
		System.out.printf("16진수 : %x\n", 0255);
		System.out.printf("16진수 : %x\n", 0xAD);
		
		
	}

}
