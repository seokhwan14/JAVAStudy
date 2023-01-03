package Ch03;

public class C02 {
	public static void main(String[] args) {
		/*
		 * 강제 형변환
		 * 좁은 범위공간에 큰값을 넣으려고 하는 경우
		 * 기본적으로 불가능하기 때문에 강제로 자료형을 바꾸어 전달한다
		 * 데이터 손실의 염려가 있다
		 */
		
		int intValue = 44032;
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int)longValue;
		System.out.println(intValue);
		
		//데이터 손실
		double doubleValue = 3.14;
		intValue = (int)doubleValue;
		System.out.println(intValue);	//실수형인 3.14의 값 중 소수부분이 날라감
		
		/**
		 * 결국 캐스팅 하지 않으면 에러가 날뿐 아니라 강제 형변환시 데이터 손실이 일어난다
		 */
		
		
		/**
		 * char vs short
		 * char와 short의 사이즈는 2byte( 16bit )로 동일하지만 다른 결과값을 나타낸다
		 * 자료형이 일치하지 않고 char는 0 ~ 65532까지
		 * short는 -32768 ~ 32767 
		 * 
		 */
		char ch = '가';
		short ch2 = (short)ch;
		System.out.printf("%d %d\n", (int)ch, ch2);
		
		
	}
}
