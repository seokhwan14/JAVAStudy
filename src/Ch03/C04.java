package Ch03;

public class C04 {
	public static void main(String[] args) {
		
		/**
		 * 정수 연산식(int보다 작은 변수자료형 - short, char, byte) int로 자동 형변환
		 */
		byte x = 10;
		byte y = 20;
		
		int result1 = (byte)(x + y);
		System.out.println(result1);

		
		//byte result2 = (x + y);  //컴파일 에러, x,y는 각각 int형 자료로 담아서 처리가 되고
		byte result2 = (byte)(x + y);
		System.out.println(result2);
		
		
		/**
		 * 정수 연산식(int보다 큰 변수자료형 - long ) 
		 */
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
		int result = (int)var1 + (int)var2 + (int)var3;
		
		long result3 = var1 + var2 + var3;
		System.out.println(result3);
		
		/**
		 * 실수 연산식
		 * 큰 타입으로 자동 형변환
		 */
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		double result4 = intvar + flvar + dbvar;	//intvar, flvar 가 각각 double 형으로 형변환된 값
		
		System.out.println(result4);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
