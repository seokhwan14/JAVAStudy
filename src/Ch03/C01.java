package Ch03;

public class C01 {
	public static void main(String[] args) {
		
		
		/**
		 * 자동형변환
		 * 데이터 손실이 없는 겨우(데이터 손실을 최소화하는 방향으로 형변환 적용)
		 * ex 범위가 큰공간에 작은범위안의 값이 대입되는 겨우
		 * byte < short < int < long < float < double
		 */
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue = " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("'가'의 유니코드 = " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue = " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue = " + floatValue);
		
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue = " + doubleValue);
		
		
		
	}
}
